import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fgs implements aye {
   a("bitmap", fgp.a.a),
   b("ttf", fgu.a),
   c("space", eun.a.a),
   d("unihex", fgv.b.a),
   e("reference", fgt.a);

   public static final Codec<fgs> f = aye.a(fgs::values);
   private final String g;
   private final MapCodec<? extends fgr> h;

   private fgs(String $$0, MapCodec<? extends fgr> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fgr> a() {
      return this.h;
   }
}
