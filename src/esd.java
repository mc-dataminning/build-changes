import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record esd(akl<esl> b) implements esl {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akl.a(lf.aW).fieldOf("name").forGetter(esd::c)).apply($$0, esd::new));

   @Override
   public esm b() {
      return esn.r;
   }

   @Override
   public void a(epl $$0) {
      if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         esl.super.a($$0);
         $$0.a()
            .a(lf.aW, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(epf $$0) {
      esl $$1 = $$0.a().a(lf.aW, this.b).map(ix.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         epf.c<?> $$2 = epf.a($$1);
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

   public static esl.a a(akl<esl> $$0) {
      return () -> new esd($$0);
   }

   public akl<esl> c() {
      return this.b;
   }
}
