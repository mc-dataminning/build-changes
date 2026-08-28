import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fkv implements azc {
   a("bitmap", fks.a.a),
   b("ttf", fkx.a),
   c("space", eyr.a.a),
   d("unihex", fky.b.a),
   e("reference", fkw.a);

   public static final Codec<fkv> f = azc.a(fkv::values);
   private final String g;
   private final MapCodec<? extends fku> h;

   private fkv(final String $$0, final MapCodec<? extends fku> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fku> a() {
      return this.h;
   }
}
