import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum flj implements azj {
   a("bitmap", flg.a.a),
   b("ttf", fll.a),
   c("space", ezi.a.a),
   d("unihex", flm.b.a),
   e("reference", flk.a);

   public static final Codec<flj> f = azj.a(flj::values);
   private final String g;
   private final MapCodec<? extends fli> h;

   private flj(final String $$0, final MapCodec<? extends fli> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fli> a() {
      return this.h;
   }
}
