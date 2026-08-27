import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum faf implements avj {
   a("bitmap", fad.a.a),
   b("ttf", fah.a),
   c("space", eof.a.a),
   d("unihex", fai.b.a),
   e("reference", fag.a);

   public static final Codec<faf> f = avj.a(faf::values);
   private final String g;
   private final MapCodec<? extends fae> h;

   private faf(String $$0, MapCodec<? extends fae> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fae> a() {
      return this.h;
   }
}
