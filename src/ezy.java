import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum ezy implements ave {
   a("bitmap", ezw.a.a),
   b("ttf", faa.a),
   c("space", eny.a.a),
   d("unihex", fab.b.a),
   e("reference", ezz.a);

   public static final Codec<ezy> f = ave.a(ezy::values);
   private final String g;
   private final MapCodec<? extends ezx> h;

   private ezy(String $$0, MapCodec<? extends ezx> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends ezx> a() {
      return this.h;
   }
}
