import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class elh extends elk {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<elh> a = RecordCodecBuilder.create($$0 -> a($$0).and(ajc.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, elh::new));
   private final ajc c;

   private elh(List<emx> $$0, ajc $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public elm b() {
      return eln.B;
   }

   @Override
   public void a(ekh $$0) {
      eka<ell> $$1 = new eka<>(ekd.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cpq a(cpq $$0, ejy $$1) {
      ell $$2 = $$1.a().getElement(ekd.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         ejy.c<?> $$3 = ejy.a($$2);
         if ($$1.b($$3)) {
            cpq var5;
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

   public static elk.a<?> a(ajc $$0) {
      return a($$1 -> new elh($$1, $$0));
   }
}
