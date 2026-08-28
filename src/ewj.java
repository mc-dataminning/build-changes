import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ewj(alb<ews> b) implements ews {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ewj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.a(lv.bf).fieldOf("name").forGetter(ewj::c)).apply($$0, ewj::new));

   @Override
   public ewt b() {
      return ewu.p;
   }

   @Override
   public void a(etn $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         ews.super.a($$0);
         $$0.a()
            .a(lv.bf, this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eth $$0) {
      ews $$1 = $$0.a().a(lv.bf, this.b).map(jn.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eth.c<?> $$2 = eth.a($$1);
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

   public static ews.a a(alb<ews> $$0) {
      return () -> new ewj($$0);
   }

   public alb<ews> c() {
      return this.b;
   }
}
