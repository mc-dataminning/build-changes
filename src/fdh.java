import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fdh(alh<fdq> b) implements fdq {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fdh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alh.a(mh.bt).fieldOf("name").forGetter(fdh::c)).apply($$0, fdh::new));

   @Override
   public fdr b() {
      return fds.p;
   }

   @Override
   public void a(fan $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         fdq.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(fah $$0) {
      fdq $$1 = $$0.a().c(this.b).map(jf.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         fah.c<?> $$2 = fah.a($$1);
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

   public static fdq.a a(alh<fdq> $$0) {
      return () -> new fdh($$0);
   }

   public alh<fdq> c() {
      return this.b;
   }
}
