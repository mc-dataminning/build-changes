import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fjd implements ayz {
   a("bitmap", fja.a.a),
   b("ttf", fjf.a),
   c("space", ewz.a.a),
   d("unihex", fjg.b.a),
   e("reference", fje.a);

   public static final Codec<fjd> f = ayz.a(fjd::values);
   private final String g;
   private final MapCodec<? extends fjc> h;

   private fjd(String $$0, MapCodec<? extends fjc> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fjc> a() {
      return this.h;
   }
}
