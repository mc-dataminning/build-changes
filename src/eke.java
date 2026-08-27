import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eke extends ekh {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eke> a = RecordCodecBuilder.create($$0 -> a($$0).and(aiy.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eke::new));
   private final aiy c;

   private eke(List<elu> $$0, aiy $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public ekj b() {
      return ekk.B;
   }

   @Override
   public void a(eje $$0) {
      eix<eki> $$1 = new eix<>(eja.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected coz a(coz $$0, eiv $$1) {
      eki $$2 = $$1.a().getElement(eja.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         eiv.c<?> $$3 = eiv.a($$2);
         if ($$1.b($$3)) {
            coz var5;
            try {
               var5 = $$2.apply($$0, $$1);
            } finally {
               $$1.c($$3);
            }

            return var5;
         } else {
            b.warn("Detected infinite loop in loot tables");
            return $$0;
         }
      }
   }

   public static ekh.a<?> a(aiy $$0) {
      return a($$1 -> new eke($$1, $$0));
   }
}
