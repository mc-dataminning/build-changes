import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum evr implements asr {
   a("bitmap", evp.a.a),
   b("ttf", evt.a),
   c("space", ejw.a.a),
   d("unihex", evu.b.a),
   e("reference", evs.a);

   public static final Codec<evr> f = asr.a(evr::values);
   private final String g;
   private final MapCodec<? extends evq> h;

   private evr(String $$0, MapCodec<? extends evq> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends evq> a() {
      return this.h;
   }
}
