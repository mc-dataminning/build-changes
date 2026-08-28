import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fns implements bab {
   a("bitmap", fnp.a.a),
   b("ttf", fnu.a),
   c("space", fbj.a.a),
   d("unihex", fnv.b.a),
   e("reference", fnt.a);

   public static final Codec<fns> f = bab.a(fns::values);
   private final String g;
   private final MapCodec<? extends fnr> h;

   private fns(final String $$0, final MapCodec<? extends fnr> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fnr> a() {
      return this.h;
   }
}
