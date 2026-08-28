import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fru implements azu {
   a("bitmap", frr.a.a),
   b("ttf", frw.a),
   c("space", fdt.a.a),
   d("unihex", frx.b.a),
   e("reference", frv.a);

   public static final Codec<fru> f = azu.a(fru::values);
   private final String g;
   private final MapCodec<? extends frt> h;

   private fru(final String $$0, final MapCodec<? extends frt> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends frt> a() {
      return this.h;
   }
}
