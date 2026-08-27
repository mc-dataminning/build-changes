import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum flq implements azg {
   a("bitmap", fln.a.a),
   b("ttf", fls.a),
   c("space", ezh.a.a),
   d("unihex", flt.b.a),
   e("reference", flr.a);

   public static final Codec<flq> f = azg.a(flq::values);
   private final String g;
   private final MapCodec<? extends flp> h;

   private flq(String $$0, MapCodec<? extends flp> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends flp> a() {
      return this.h;
   }
}
