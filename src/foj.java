import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface foj {
   Codec<foj> a = avk.a(foj.a::values).dispatch(foj::a, foj.a::a);

   foj.a a();

   public static enum a implements avk {
      a("player", () -> fok.a.b),
      b("system", () -> fok.b.b);

      private final String c;
      private final Supplier<Codec<? extends foj>> d;

      private a(String $$0, Supplier<Codec<? extends foj>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends foj> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
