import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fnk {
   Codec<fnk> a = aut.a(fnk.a::values).dispatch(fnk::a, fnk.a::a);

   fnk.a a();

   public static enum a implements aut {
      a("player", () -> fnl.a.b),
      b("system", () -> fnl.b.b);

      private final String c;
      private final Supplier<Codec<? extends fnk>> d;

      private a(String $$0, Supplier<Codec<? extends fnk>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fnk> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
