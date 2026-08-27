import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fjc implements ayx {
   a("bitmap", fiz.a.a),
   b("ttf", fje.a),
   c("space", ewx.a.a),
   d("unihex", fjf.b.a),
   e("reference", fjd.a);

   public static final Codec<fjc> f = ayx.a(fjc::values);
   private final String g;
   private final MapCodec<? extends fjb> h;

   private fjc(String $$0, MapCodec<? extends fjb> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fjb> a() {
      return this.h;
   }
}
