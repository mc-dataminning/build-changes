import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fkg implements azt {
   a("bitmap", fkd.a.a),
   b("ttf", fki.a),
   c("space", eyc.a.a),
   d("unihex", fkj.b.a),
   e("reference", fkh.a);

   public static final Codec<fkg> f = azt.a(fkg::values);
   private final String g;
   private final MapCodec<? extends fkf> h;

   private fkg(final String $$0, final MapCodec<? extends fkf> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fkf> a() {
      return this.h;
   }
}
