import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fsu implements azv {
   a("bitmap", fsr.a.a),
   b("ttf", fsw.a),
   c("space", fes.a.a),
   d("unihex", fsx.b.a),
   e("reference", fsv.a);

   public static final Codec<fsu> f = azv.a(fsu::values);
   private final String g;
   private final MapCodec<? extends fst> h;

   private fsu(final String $$0, final MapCodec<? extends fst> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fst> a() {
      return this.h;
   }
}
