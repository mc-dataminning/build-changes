import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum frk implements bba {
   a("bitmap", frh.a.a),
   b("ttf", frm.a),
   c("space", fet.a.a),
   d("unihex", frn.b.a),
   e("reference", frl.a);

   public static final Codec<frk> f = bba.a(frk::values);
   private final String g;
   private final MapCodec<? extends frj> h;

   private frk(final String $$0, final MapCodec<? extends frj> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends frj> a() {
      return this.h;
   }
}
