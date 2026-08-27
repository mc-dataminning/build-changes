import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fjd {
   Codec<fjd> a = ash.a(fjd.a::values).dispatch(fjd::a, fjd.a::a);

   fjd.a a();

   public static enum a implements ash {
      a("player", () -> fje.a.b),
      b("system", () -> fje.b.b);

      private final String c;
      private final Supplier<Codec<? extends fjd>> d;

      private a(String $$0, Supplier<Codec<? extends fjd>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fjd> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
