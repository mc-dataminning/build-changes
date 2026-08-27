import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fjp {
   Codec<fjp> a = asr.a(fjp.a::values).dispatch(fjp::a, fjp.a::a);

   fjp.a a();

   public static enum a implements asr {
      a("player", () -> fjq.a.b),
      b("system", () -> fjq.b.b);

      private final String c;
      private final Supplier<Codec<? extends fjp>> d;

      private a(String $$0, Supplier<Codec<? extends fjp>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fjp> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
