import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fqp {
   Codec<fqp> a = axc.a(fqp.a::values).dispatch(fqp::a, fqp.a::a);

   fqp.a a();

   public static enum a implements axc {
      a("player", () -> fqq.a.b),
      b("system", () -> fqq.b.b);

      private final String c;
      private final Supplier<Codec<? extends fqp>> d;

      private a(String $$0, Supplier<Codec<? extends fqp>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fqp> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
