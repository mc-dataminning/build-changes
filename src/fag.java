import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fag implements avk {
   a("bitmap", fae.a.a),
   b("ttf", fai.a),
   c("space", eog.a.a),
   d("unihex", faj.b.a),
   e("reference", fah.a);

   public static final Codec<fag> f = avk.a(fag::values);
   private final String g;
   private final MapCodec<? extends faf> h;

   private fag(String $$0, MapCodec<? extends faf> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends faf> a() {
      return this.h;
   }
}
