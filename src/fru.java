import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fru {
   Codec<fru> a = axg.a(fru.a::values).dispatch(fru::a, fru.a::a);

   fru.a a();

   public static enum a implements axg {
      a("player", () -> frv.a.b),
      b("system", () -> frv.b.b);

      private final String c;
      private final Supplier<Codec<? extends fru>> d;

      private a(String $$0, Supplier<Codec<? extends fru>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fru> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
