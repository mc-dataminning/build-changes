import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fdj(alj<fds> b) implements fds {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fdj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alj.a(mi.bt).fieldOf("name").forGetter(fdj::c)).apply($$0, fdj::new));

   @Override
   public fdt b() {
      return fdu.p;
   }

   @Override
   public void a(fap $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         fds.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(faj $$0) {
      fds $$1 = $$0.a().c(this.b).map(jg.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         faj.c<?> $$2 = faj.a($$1);
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

   public static fds.a a(alj<fds> $$0) {
      return () -> new fdj($$0);
   }

   public alj<fds> c() {
      return this.b;
   }
}
