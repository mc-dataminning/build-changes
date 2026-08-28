import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum frj implements bba {
   a("bitmap", frg.a.a),
   b("ttf", frl.a),
   c("space", fes.a.a),
   d("unihex", frm.b.a),
   e("reference", frk.a);

   public static final Codec<frj> f = bba.a(frj::values);
   private final String g;
   private final MapCodec<? extends fri> h;

   private frj(final String $$0, final MapCodec<? extends fri> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fri> a() {
      return this.h;
   }
}
