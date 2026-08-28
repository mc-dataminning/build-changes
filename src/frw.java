import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum frw implements azv {
   a("bitmap", frt.a.a),
   b("ttf", fry.a),
   c("space", fdu.a.a),
   d("unihex", frz.b.a),
   e("reference", frx.a);

   public static final Codec<frw> f = azv.a(frw::values);
   private final String g;
   private final MapCodec<? extends frv> h;

   private frw(final String $$0, final MapCodec<? extends frv> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends frv> a() {
      return this.h;
   }
}
