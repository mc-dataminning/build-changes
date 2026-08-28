import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum frx implements azv {
   a("bitmap", fru.a.a),
   b("ttf", frz.a),
   c("space", fdv.a.a),
   d("unihex", fsa.b.a),
   e("reference", fry.a);

   public static final Codec<frx> f = azv.a(frx::values);
   private final String g;
   private final MapCodec<? extends frw> h;

   private frx(final String $$0, final MapCodec<? extends frw> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends frw> a() {
      return this.h;
   }
}
