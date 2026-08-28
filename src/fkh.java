import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fkh implements azu {
   a("bitmap", fke.a.a),
   b("ttf", fkj.a),
   c("space", eyd.a.a),
   d("unihex", fkk.b.a),
   e("reference", fki.a);

   public static final Codec<fkh> f = azu.a(fkh::values);
   private final String g;
   private final MapCodec<? extends fkg> h;

   private fkh(final String $$0, final MapCodec<? extends fkg> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fkg> a() {
      return this.h;
   }
}
