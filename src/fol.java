import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fol implements bag {
   a("bitmap", foi.a.a),
   b("ttf", fon.a),
   c("space", fcc.a.a),
   d("unihex", foo.b.a),
   e("reference", fom.a);

   public static final Codec<fol> f = bag.a(fol::values);
   private final String g;
   private final MapCodec<? extends fok> h;

   private fol(final String $$0, final MapCodec<? extends fok> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fok> a() {
      return this.h;
   }
}
