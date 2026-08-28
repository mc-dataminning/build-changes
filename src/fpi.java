import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fpi implements bai {
   a("bitmap", fpf.a.a),
   b("ttf", fpk.a),
   c("space", fcs.a.a),
   d("unihex", fpl.b.a),
   e("reference", fpj.a);

   public static final Codec<fpi> f = bai.a(fpi::values);
   private final String g;
   private final MapCodec<? extends fph> h;

   private fpi(final String $$0, final MapCodec<? extends fph> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fph> a() {
      return this.h;
   }
}
