import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum ezh implements aut {
   a("bitmap", ezf.a.a),
   b("ttf", ezj.a),
   c("space", eni.a.a),
   d("unihex", ezk.b.a),
   e("reference", ezi.a);

   public static final Codec<ezh> f = aut.a(ezh::values);
   private final String g;
   private final MapCodec<? extends ezg> h;

   private ezh(String $$0, MapCodec<? extends ezg> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends ezg> a() {
      return this.h;
   }
}
