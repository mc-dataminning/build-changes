import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fcq implements axc {
   a("bitmap", fcn.a.a),
   b("ttf", fcs.a),
   c("space", eqm.a.a),
   d("unihex", fct.b.a),
   e("reference", fcr.a);

   public static final Codec<fcq> f = axc.a(fcq::values);
   private final String g;
   private final MapCodec<? extends fcp> h;

   private fcq(String $$0, MapCodec<? extends fcp> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fcp> a() {
      return this.h;
   }
}
