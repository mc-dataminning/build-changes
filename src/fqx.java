import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fqx {
   Codec<fqx> a = axc.a(fqx.a::values).dispatch(fqx::a, fqx.a::a);

   fqx.a a();

   public static enum a implements axc {
      a("player", () -> fqy.a.b),
      b("system", () -> fqy.b.b);

      private final String c;
      private final Supplier<Codec<? extends fqx>> d;

      private a(String $$0, Supplier<Codec<? extends fqx>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fqx> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
