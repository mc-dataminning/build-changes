import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ezi(alo<ezr> b) implements ezr {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ezi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alo.a(mb.bi).fieldOf("name").forGetter(ezi::c)).apply($$0, ezi::new));

   @Override
   public ezs b() {
      return ezt.p;
   }

   @Override
   public void a(ewo $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         ezr.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(ewi $$0) {
      ezr $$1 = $$0.a().c(this.b).map(jq.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         ewi.c<?> $$2 = ewi.a($$1);
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

   public static ezr.a a(alo<ezr> $$0) {
      return () -> new ezi($$0);
   }

   public alo<ezr> c() {
      return this.b;
   }
}
