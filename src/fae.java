import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fae implements avj {
   a("bitmap", fac.a.a),
   b("ttf", fag.a),
   c("space", eoe.a.a),
   d("unihex", fah.b.a),
   e("reference", faf.a);

   public static final Codec<fae> f = avj.a(fae::values);
   private final String g;
   private final MapCodec<? extends fad> h;

   private fae(String $$0, MapCodec<? extends fad> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fad> a() {
      return this.h;
   }
}
