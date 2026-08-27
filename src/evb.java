import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum evb implements asf {
   a("bitmap", euz.a.a),
   b("ttf", evd.a),
   c("space", ejm.a.a),
   d("unihex", eve.b.a),
   e("reference", evc.a);

   public static final Codec<evb> f = asf.a(evb::values);
   private final String g;
   private final MapCodec<? extends eva> h;

   private evb(String $$0, MapCodec<? extends eva> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends eva> a() {
      return this.h;
   }
}
