import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fod implements baf {
   a("bitmap", foa.a.a),
   b("ttf", fof.a),
   c("space", fbu.a.a),
   d("unihex", fog.b.a),
   e("reference", foe.a);

   public static final Codec<fod> f = baf.a(fod::values);
   private final String g;
   private final MapCodec<? extends foc> h;

   private fod(final String $$0, final MapCodec<? extends foc> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends foc> a() {
      return this.h;
   }
}
