import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record ezo(aly<ezx> b) implements ezx {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<ezo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aly.a(mb.bi).fieldOf("name").forGetter(ezo::c)).apply($$0, ezo::new));

   @Override
   public ezy b() {
      return ezz.p;
   }

   @Override
   public void a(ewu $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         ezx.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(ewo $$0) {
      ezx $$1 = $$0.a().c(this.b).map(jq.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         ewo.c<?> $$2 = ewo.a($$1);
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

   public static ezx.a a(aly<ezx> $$0) {
      return () -> new ezo($$0);
   }

   public aly<ezx> c() {
      return this.b;
   }
}
