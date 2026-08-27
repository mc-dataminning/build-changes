import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum evp implements asp {
   a("bitmap", evn.a.a),
   b("ttf", evr.a),
   c("space", eju.a.a),
   d("unihex", evs.b.a),
   e("reference", evq.a);

   public static final Codec<evp> f = asp.a(evp::values);
   private final String g;
   private final MapCodec<? extends evo> h;

   private evp(String $$0, MapCodec<? extends evo> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends evo> a() {
      return this.h;
   }
}
