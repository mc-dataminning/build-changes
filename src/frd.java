import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum frd implements baq {
   a("bitmap", fra.a.a),
   b("ttf", frf.a),
   c("space", fem.a.a),
   d("unihex", frg.b.a),
   e("reference", fre.a);

   public static final Codec<frd> f = baq.a(frd::values);
   private final String g;
   private final MapCodec<? extends frc> h;

   private frd(final String $$0, final MapCodec<? extends frc> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends frc> a() {
      return this.h;
   }
}
