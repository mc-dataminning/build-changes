import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class efu extends efx {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<efu> a = RecordCodecBuilder.create($$0 -> a($$0).and(agg.a.fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, efu::new));
   private final agg c;

   private efu(List<ehk> $$0, agg $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public efz b() {
      return ega.B;
   }

   @Override
   public void a(eeu $$0) {
      een<efy> $$1 = new een<>(eeq.b, this.c);
      if ($$0.a($$1)) {
         $$0.a("Function " + this.c + " is recursively called");
      } else {
         super.a($$0);
         $$0.b().getElementOptional($$1).ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.c + "}", $$1)), () -> $$0.a("Unknown function table called " + this.c));
      }
   }

   @Override
   protected clb a(clb $$0, eel $$1) {
      efy $$2 = $$1.a().getElement(eeq.b, this.c);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c);
         return $$0;
      } else {
         eel.c<?> $$3 = eel.a($$2);
         if ($$1.b($$3)) {
            clb var5;
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

   public static efx.a<?> a(agg $$0) {
      return a($$1 -> new efu($$1, $$0));
   }
}
