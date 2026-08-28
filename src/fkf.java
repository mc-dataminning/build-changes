import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fkf implements azs {
   a("bitmap", fkc.a.a),
   b("ttf", fkh.a),
   c("space", eyb.a.a),
   d("unihex", fki.b.a),
   e("reference", fkg.a);

   public static final Codec<fkf> f = azs.a(fkf::values);
   private final String g;
   private final MapCodec<? extends fke> h;

   private fkf(final String $$0, final MapCodec<? extends fke> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fke> a() {
      return this.h;
   }
}
