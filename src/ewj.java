import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum ewj implements atr {
   a("bitmap", ewh.a.a),
   b("ttf", ewl.a),
   c("space", ekm.a.a),
   d("unihex", ewm.b.a),
   e("reference", ewk.a);

   public static final Codec<ewj> f = atr.a(ewj::values);
   private final String g;
   private final MapCodec<? extends ewi> h;

   private ewj(String $$0, MapCodec<? extends ewi> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends ewi> a() {
      return this.h;
   }
}
