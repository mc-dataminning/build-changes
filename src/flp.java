import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum flp implements azk {
   a("bitmap", flm.a.a),
   b("ttf", flr.a),
   c("space", ezo.a.a),
   d("unihex", fls.b.a),
   e("reference", flq.a);

   public static final Codec<flp> f = azk.a(flp::values);
   private final String g;
   private final MapCodec<? extends flo> h;

   private flp(final String $$0, final MapCodec<? extends flo> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends flo> a() {
      return this.h;
   }
}
