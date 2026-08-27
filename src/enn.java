import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record enn(ajh b) implements env {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<enn> a = RecordCodecBuilder.create($$0 -> $$0.group(ajh.a.fieldOf("name").forGetter(enn::c)).apply($$0, enn::new));

   @Override
   public enw b() {
      return enx.q;
   }

   @Override
   public void a(elf $$0) {
      eky<env> $$1 = new eky<>(elb.a, this.b);
      if ($$0.a($$1)) {
         $$0.b("Condition " + this.b + " is recursively called");
      } else {
         env.super.a($$0);
         $$0.a()
            .getElementOptional($$1)
            .ifPresentOrElse($$2 -> $$2.a($$0.a(".{" + this.b + "}", $$1)), () -> $$0.b("Unknown condition table called " + this.b));
      }
   }

   public boolean a(ekw $$0) {
      env $$1 = $$0.a().getElement(elb.a, this.b);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b);
         return false;
      } else {
         ekw.c<?> $$2 = ekw.a($$1);
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

   public static env.a a(ajh $$0) {
      return () -> new enn($$0);
   }

   public ajh c() {
      return this.b;
   }
}
