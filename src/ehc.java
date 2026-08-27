import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ehc(agg b) implements ehk {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<ehc> a = RecordCodecBuilder.create($$0 -> $$0.group(agg.a.fieldOf("name").forGetter(ehc::c)).apply($$0, ehc::new));

   @Override
   public ehl b() {
      return ehm.q;
   }

   @Override
   public void a(eeu $$0) {
      een<ehk> $$1 = new een<>(eeq.a, this.b);
      if ($$0.a($$1)) {
         $$0.a("Condition " + this.b + " is recursively called");
      } else {
         ehk.super.a($$0);
         $$0.b()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.a("Unknown condition table called " + this.b));
      }
   }

   public boolean a(eel $$0) {
      ehk $$1 = $$0.a().getElement(eeq.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         eel.c<?> $$2 = eel.a($$1);
         if ($$0.b($$2)) {
            boolean var4;
            try {
               var4 = $$1.test($$0);
            } finally {
               $$0.c($$2);
            }

            return var4;
         } else {
            c.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   public static ehk.a a(agg $$0) {
      return () -> new ehc($$0);
   }

   public agg c() {
      return this.b;
   }
}
