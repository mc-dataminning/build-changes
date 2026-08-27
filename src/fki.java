import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fki {
   Codec<fki> a = atr.a(fki.a::values).dispatch(fki::a, fki.a::a);

   fki.a a();

   public static enum a implements atr {
      a("player", () -> fkj.a.b),
      b("system", () -> fkj.b.b);

      private final String c;
      private final Supplier<Codec<? extends fki>> d;

      private a(String $$0, Supplier<Codec<? extends fki>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fki> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
