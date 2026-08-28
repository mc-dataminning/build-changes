import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fkc implements azp {
   a("bitmap", fjz.a.a),
   b("ttf", fke.a),
   c("space", exy.a.a),
   d("unihex", fkf.b.a),
   e("reference", fkd.a);

   public static final Codec<fkc> f = azp.a(fkc::values);
   private final String g;
   private final MapCodec<? extends fkb> h;

   private fkc(final String $$0, final MapCodec<? extends fkb> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fkb> a() {
      return this.h;
   }
}
