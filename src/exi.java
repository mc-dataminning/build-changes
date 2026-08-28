import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record exi(alk<exr> b) implements exr {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<exi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alk.a(ma.bf).fieldOf("name").forGetter(exi::c)).apply($$0, exi::new));

   @Override
   public exs b() {
      return ext.p;
   }

   @Override
   public void a(eum $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else if ($$0.a(this.b)) {
         $$0.b("Condition " + this.b.a() + " is recursively called");
      } else {
         exr.super.a($$0);
         $$0.a()
            .c(this.b)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.b.a() + "}", this.b)), () -> $$0.b("Unknown condition table called " + this.b.a()));
      }
   }

   public boolean a(eug $$0) {
      exr $$1 = $$0.a().c(this.b).map(jq.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         eug.c<?> $$2 = eug.a($$1);
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

   public static exr.a a(alk<exr> $$0) {
      return () -> new exi($$0);
   }

   public alk<exr> c() {
      return this.b;
   }
}
