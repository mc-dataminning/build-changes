import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fej implements axq {
   a("bitmap", feg.a.a),
   b("ttf", fel.a),
   c("space", ese.a.a),
   d("unihex", fem.b.a),
   e("reference", fek.a);

   public static final Codec<fej> f = axq.a(fej::values);
   private final String g;
   private final MapCodec<? extends fei> h;

   private fej(String $$0, MapCodec<? extends fei> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fei> a() {
      return this.h;
   }
}
