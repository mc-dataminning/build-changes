import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fob {
   Codec<fob> a = ave.a(fob.a::values).dispatch(fob::a, fob.a::a);

   fob.a a();

   public static enum a implements ave {
      a("player", () -> foc.a.b),
      b("system", () -> foc.b.b);

      private final String c;
      private final Supplier<Codec<? extends fob>> d;

      private a(String $$0, Supplier<Codec<? extends fob>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fob> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
