import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fel implements axq {
   a("bitmap", fei.a.a),
   b("ttf", fen.a),
   c("space", esg.a.a),
   d("unihex", feo.b.a),
   e("reference", fem.a);

   public static final Codec<fel> f = axq.a(fel::values);
   private final String g;
   private final MapCodec<? extends fek> h;

   private fel(String $$0, MapCodec<? extends fek> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fek> a() {
      return this.h;
   }
}
