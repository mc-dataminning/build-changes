import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fji {
   Codec<fji> a = ask.a(fji.a::values).dispatch(fji::a, fji.a::a);

   fji.a a();

   public static enum a implements ask {
      a("player", () -> fjj.a.b),
      b("system", () -> fjj.b.b);

      private final String c;
      private final Supplier<Codec<? extends fji>> d;

      private a(String $$0, Supplier<Codec<? extends fji>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fji> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
