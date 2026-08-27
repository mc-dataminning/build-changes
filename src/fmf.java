import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fmf {
   Codec<fmf> a = auk.a(fmf.a::values).dispatch(fmf::a, fmf.a::a);

   fmf.a a();

   public static enum a implements auk {
      a("player", () -> fmg.a.b),
      b("system", () -> fmg.b.b);

      private final String c;
      private final Supplier<Codec<? extends fmf>> d;

      private a(String $$0, Supplier<Codec<? extends fmf>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fmf> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
