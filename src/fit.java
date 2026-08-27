import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fit {
   Codec<fit> a = asf.a(fit.a::values).dispatch(fit::a, fit.a::a);

   fit.a a();

   public static enum a implements asf {
      a("player", () -> fiu.a.b),
      b("system", () -> fiu.b.b);

      private final String c;
      private final Supplier<Codec<? extends fit>> d;

      private a(String $$0, Supplier<Codec<? extends fit>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fit> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
