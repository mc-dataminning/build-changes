import com.mojang.serialization.Codec;
import java.util.function.Supplier;

public interface fsw {
   Codec<fsw> a = axq.a(fsw.a::values).dispatch(fsw::a, fsw.a::a);

   fsw.a a();

   public static enum a implements axq {
      a("player", () -> fsx.a.b),
      b("system", () -> fsx.b.b);

      private final String c;
      private final Supplier<Codec<? extends fsw>> d;

      private a(String $$0, Supplier<Codec<? extends fsw>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private Codec<? extends fsw> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
