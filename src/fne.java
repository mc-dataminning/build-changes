import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fne implements azy {
   a("bitmap", fnb.a.a),
   b("ttf", fng.a),
   c("space", faq.a.a),
   d("unihex", fnh.b.a),
   e("reference", fnf.a);

   public static final Codec<fne> f = azy.a(fne::values);
   private final String g;
   private final MapCodec<? extends fnd> h;

   private fne(final String $$0, final MapCodec<? extends fnd> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fnd> a() {
      return this.h;
   }
}
