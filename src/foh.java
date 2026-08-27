import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface foh {
   Codec<foh> a = avj.a(foh.a::values).dispatch(foh::a, foh.a::a);

   foh.a a();

   public static enum a implements avj {
      a("player", () -> foi.a.b),
      b("system", () -> foi.b.b);

      private final String c;
      private final Supplier<Codec<? extends foh>> d;

      private a(String $$0, Supplier<Codec<? extends foh>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends foh> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
