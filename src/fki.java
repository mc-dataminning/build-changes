import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fki implements azu {
   a("bitmap", fkf.a.a),
   b("ttf", fkk.a),
   c("space", eye.a.a),
   d("unihex", fkl.b.a),
   e("reference", fkj.a);

   public static final Codec<fki> f = azu.a(fki::values);
   private final String g;
   private final MapCodec<? extends fkh> h;

   private fki(final String $$0, final MapCodec<? extends fkh> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fkh> a() {
      return this.h;
   }
}
