import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fjn {
   Codec<fjn> a = asp.a(fjn.a::values).dispatch(fjn::a, fjn.a::a);

   fjn.a a();

   public static enum a implements asp {
      a("player", () -> fjo.a.b),
      b("system", () -> fjo.b.b);

      private final String c;
      private final Supplier<Codec<? extends fjn>> d;

      private a(String $$0, Supplier<Codec<? extends fjn>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fjn> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
