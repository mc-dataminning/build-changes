import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fkj implements azu {
   a("bitmap", fkg.a.a),
   b("ttf", fkl.a),
   c("space", eyf.a.a),
   d("unihex", fkm.b.a),
   e("reference", fkk.a);

   public static final Codec<fkj> f = azu.a(fkj::values);
   private final String g;
   private final MapCodec<? extends fki> h;

   private fkj(final String $$0, final MapCodec<? extends fki> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fki> a() {
      return this.h;
   }
}
