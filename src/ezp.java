import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ezp(aly<ezy> b) implements ezy {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ezp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aly.a(mb.bi).fieldOf("name").forGetter(ezp::c)).apply($$0, ezp::new));

   @Override
   public ezz b() {
      return faa.p;
   }

   @Override
   public void a(ewv $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         ezy.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(ewp $$0) {
      ezy $$1 = $$0.a().c(this.b).map(jq.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         ewp.c<?> $$2 = ewp.a($$1);
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

   public static ezy.a a(aly<ezy> $$0) {
      return () -> new ezp($$0);
   }

   public aly<ezy> c() {
      return this.b;
   }
}
