import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum exz implements aug {
   a("bitmap", exx.a.a),
   b("ttf", eyb.a),
   c("space", emb.a.a),
   d("unihex", eyc.b.a),
   e("reference", eya.a);

   public static final Codec<exz> f = aug.a(exz::values);
   private final String g;
   private final MapCodec<? extends exy> h;

   private exz(String $$0, MapCodec<? extends exy> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends exy> a() {
      return this.h;
   }
}
