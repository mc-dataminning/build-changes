import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fcj implements axc {
   a("bitmap", fcg.a.a),
   b("ttf", fcl.a),
   c("space", eqf.a.a),
   d("unihex", fcm.b.a),
   e("reference", fck.a);

   public static final Codec<fcj> f = axc.a(fcj::values);
   private final String g;
   private final MapCodec<? extends fci> h;

   private fcj(String $$0, MapCodec<? extends fci> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fci> a() {
      return this.h;
   }
}
