import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record eys(aku<ezb> b) implements ezb {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a(mc.bi).fieldOf("name").forGetter(eys::c)).apply($$0, eys::new));

   @Override
   public ezc b() {
      return ezd.p;
   }

   @Override
   public void a(evy $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         ezb.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(evs $$0) {
      ezb $$1 = $$0.a().c(this.b).map(jr.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         evs.c<?> $$2 = evs.a($$1);
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

   public static ezb.a a(aku<ezb> $$0) {
      return () -> new eys($$0);
   }

   public aku<ezb> c() {
      return this.b;
   }
}
