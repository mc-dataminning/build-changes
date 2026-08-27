import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface ffj {
   Codec<ffj> a = apr.a(ffj.a::values).dispatch(ffj::a, ffj.a::a);

   ffj.a a();

   public static enum a implements apr {
      a("player", () -> ffk.a.b),
      b("system", () -> ffk.b.b);

      private final String c;
      private final Supplier<Codec<? extends ffj>> d;

      private a(String $$0, Supplier<Codec<? extends ffj>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends ffj> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
