import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fry implements azv {
   a("bitmap", frv.a.a),
   b("ttf", fsa.a),
   c("space", fdw.a.a),
   d("unihex", fsb.b.a),
   e("reference", frz.a);

   public static final Codec<fry> f = azv.a(fry::values);
   private final String g;
   private final MapCodec<? extends frx> h;

   private fry(final String $$0, final MapCodec<? extends frx> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends frx> a() {
      return this.h;
   }
}
