import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum evf implements ash {
   a("bitmap", evd.a.a),
   b("ttf", evh.a),
   c("space", ejl.a.a),
   d("unihex", evi.b.a),
   e("reference", evg.a);

   public static final Codec<evf> f = ash.a(evf::values);
   private final String g;
   private final MapCodec<? extends eve> h;

   private evf(String $$0, MapCodec<? extends eve> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends eve> a() {
      return this.h;
   }
}
