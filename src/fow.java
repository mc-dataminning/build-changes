import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fow {
   Codec<fow> a = avl.a(fow.a::values).dispatch(fow::a, fow.a::a);

   fow.a a();

   public static enum a implements avl {
      a("player", () -> fox.a.b),
      b("system", () -> fox.b.b);

      private final String c;
      private final Supplier<Codec<? extends fow>> d;

      private a(String $$0, Supplier<Codec<? extends fow>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fow> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
