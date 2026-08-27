import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fih implements ayt {
   a("bitmap", fie.a.a),
   b("ttf", fij.a),
   c("space", ewc.a.a),
   d("unihex", fik.b.a),
   e("reference", fii.a);

   public static final Codec<fih> f = ayt.a(fih::values);
   private final String g;
   private final MapCodec<? extends fig> h;

   private fih(String $$0, MapCodec<? extends fig> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fig> a() {
      return this.h;
   }
}
