import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eyr(aku<eza> b) implements eza {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eyr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a(mc.bi).fieldOf("name").forGetter(eyr::c)).apply($$0, eyr::new));

   @Override
   public ezb b() {
      return ezc.p;
   }

   @Override
   public void a(evx $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         eza.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(evr $$0) {
      eza $$1 = $$0.a().c(this.b).map(jr.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         evr.c<?> $$2 = evr.a($$1);
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

   public static eza.a a(aku<eza> $$0) {
      return () -> new eyr($$0);
   }

   public aku<eza> c() {
      return this.b;
   }
}
