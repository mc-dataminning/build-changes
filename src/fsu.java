import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fsu {
   Codec<fsu> a = axq.a(fsu.a::values).dispatch(fsu::a, fsu.a::a);

   fsu.a a();

   public static enum a implements axq {
      a("player", () -> fsv.a.b),
      b("system", () -> fsv.b.b);

      private final String c;
      private final Supplier<Codec<? extends fsu>> d;

      private a(String $$0, Supplier<Codec<? extends fsu>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fsu> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
