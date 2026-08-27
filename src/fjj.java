import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fjj {
   Codec<fjj> a = asu.a(fjj.a::values).dispatch(fjj::a, fjj.a::a);

   fjj.a a();

   public static enum a implements asu {
      a("player", () -> fjk.a.b),
      b("system", () -> fjk.b.b);

      private final String c;
      private final Supplier<Codec<? extends fjj>> d;

      private a(String $$0, Supplier<Codec<? extends fjj>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fjj> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
