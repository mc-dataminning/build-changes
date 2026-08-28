import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fri implements bba {
   a("bitmap", frf.a.a),
   b("ttf", frk.a),
   c("space", fer.a.a),
   d("unihex", frl.b.a),
   e("reference", frj.a);

   public static final Codec<fri> f = bba.a(fri::values);
   private final String g;
   private final MapCodec<? extends frh> h;

   private fri(final String $$0, final MapCodec<? extends frh> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends frh> a() {
      return this.h;
   }
}
