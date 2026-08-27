import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fln {
   Codec<fln> a = aub.a(fln.a::values).dispatch(fln::a, fln.a::a);

   fln.a a();

   public static enum a implements aub {
      a("player", () -> flo.a.b),
      b("system", () -> flo.b.b);

      private final String c;
      private final Supplier<Codec<? extends fln>> d;

      private a(String $$0, Supplier<Codec<? extends fln>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fln> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
