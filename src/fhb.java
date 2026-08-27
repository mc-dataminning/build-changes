import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fhb implements ayg {
   a("bitmap", fgy.a.a),
   b("ttf", fhd.a),
   c("space", euw.a.a),
   d("unihex", fhe.b.a),
   e("reference", fhc.a);

   public static final Codec<fhb> f = ayg.a(fhb::values);
   private final String g;
   private final MapCodec<? extends fha> h;

   private fhb(String $$0, MapCodec<? extends fha> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fha> a() {
      return this.h;
   }
}
