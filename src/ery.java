import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum ery implements apr {
   a("bitmap", erw.a.a),
   b("ttf", esa.a),
   c("space", ego.a.a),
   d("unihex", esb.b.a),
   e("reference", erz.a);

   public static final Codec<ery> f = apr.a(ery::values);
   private final String g;
   private final MapCodec<? extends erx> h;

   private ery(String $$0, MapCodec<? extends erx> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends erx> a() {
      return this.h;
   }
}
