import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fiy {
   Codec<fiy> a = ash.a(fiy.a::values).dispatch(fiy::a, fiy.a::a);

   fiy.a a();

   public static enum a implements ash {
      a("player", () -> fiz.a.b),
      b("system", () -> fiz.b.b);

      private final String c;
      private final Supplier<Codec<? extends fiy>> d;

      private a(String $$0, Supplier<Codec<? extends fiy>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fiy> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
