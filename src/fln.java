import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fln implements azk {
   a("bitmap", flk.a.a),
   b("ttf", flp.a),
   c("space", ezm.a.a),
   d("unihex", flq.b.a),
   e("reference", flo.a);

   public static final Codec<fln> f = azk.a(fln::values);
   private final String g;
   private final MapCodec<? extends flm> h;

   private fln(final String $$0, final MapCodec<? extends flm> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends flm> a() {
      return this.h;
   }
}
