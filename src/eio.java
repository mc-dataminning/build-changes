import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eio extends eir {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eio> a = RecordCodecBuilder.create($$0 -> a($$0).and(ahh.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, eio::new));
   private final ahh c;

   private eio(List<eke> $$0, ahh $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eit b() {
      return eiu.B;
   }

   @Override
   public void a(eho $$0) {
      ehh<eis> $$1 = new ehh<>(ehk.b, this.c);
      if ($$0.a($$1)) {
         $$0.b("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.a().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.b("Unknown function table called " + this.c));
      }
   }

   @Override
   protected cng a(cng $$0, ehf $$1) {
      eis $$2 = $$1.a().getElement(ehk.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         ehf.c<?> $$3 = ehf.a($$2);
         if ($$1.b($$3)) {
            cng var5;
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

   public static eir.a<?> a(ahh $$0) {
      return a($$1 -> new eio($$1, $$0));
   }
}
