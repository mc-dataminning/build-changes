import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fma {
   Codec<fma> a = aug.a(fma.a::values).dispatch(fma::a, fma.a::a);

   fma.a a();

   public static enum a implements aug {
      a("player", () -> fmb.a.b),
      b("system", () -> fmb.b.b);

      private final String c;
      private final Supplier<Codec<? extends fma>> d;

      private a(String $$0, Supplier<Codec<? extends fma>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fma> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
