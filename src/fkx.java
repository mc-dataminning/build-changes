import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fkx implements azc {
   a("bitmap", fku.a.a),
   b("ttf", fkz.a),
   c("space", eyt.a.a),
   d("unihex", fla.b.a),
   e("reference", fky.a);

   public static final Codec<fkx> f = azc.a(fkx::values);
   private final String g;
   private final MapCodec<? extends fkw> h;

   private fkx(final String $$0, final MapCodec<? extends fkw> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fkw> a() {
      return this.h;
   }
}
