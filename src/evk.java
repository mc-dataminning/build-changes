import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum evk implements ask {
   a("bitmap", evi.a.a),
   b("ttf", evm.a),
   c("space", ejp.a.a),
   d("unihex", evn.b.a),
   e("reference", evl.a);

   public static final Codec<evk> f = ask.a(evk::values);
   private final String g;
   private final MapCodec<? extends evj> h;

   private evk(String $$0, MapCodec<? extends evj> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends evj> a() {
      return this.h;
   }
}
