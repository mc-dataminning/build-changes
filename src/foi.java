import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface foi {
   Codec<foi> a = avj.a(foi.a::values).dispatch(foi::a, foi.a::a);

   foi.a a();

   public static enum a implements avj {
      a("player", () -> foj.a.b),
      b("system", () -> foj.b.b);

      private final String c;
      private final Supplier<Codec<? extends foi>> d;

      private a(String $$0, Supplier<Codec<? extends foi>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends foi> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
