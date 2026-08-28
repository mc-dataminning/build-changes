import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fal(alc<fau> b) implements fau {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fal> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alc.a(me.bp).fieldOf("name").forGetter(fal::c)).apply($$0, fal::new));

   @Override
   public fav b() {
      return faw.p;
   }

   @Override
   public void a(exr $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         fau.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(exl $$0) {
      fau $$1 = $$0.a().c(this.b).map(js.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         exl.c<?> $$2 = exl.a($$1);
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

   public static fau.a a(alc<fau> $$0) {
      return () -> new fal($$0);
   }

   public alc<fau> c() {
      return this.b;
   }
}
