import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fkp implements ayz {
   a("bitmap", fkm.a.a),
   b("ttf", fkr.a),
   c("space", eyl.a.a),
   d("unihex", fks.b.a),
   e("reference", fkq.a);

   public static final Codec<fkp> f = ayz.a(fkp::values);
   private final String g;
   private final MapCodec<? extends fko> h;

   private fkp(final String $$0, final MapCodec<? extends fko> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fko> a() {
      return this.h;
   }
}
