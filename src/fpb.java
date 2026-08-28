import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fpb implements baj {
   a("bitmap", foy.a.a),
   b("ttf", fpd.a),
   c("space", fcl.a.a),
   d("unihex", fpe.b.a),
   e("reference", fpc.a);

   public static final Codec<fpb> f = baj.a(fpb::values);
   private final String g;
   private final MapCodec<? extends fpa> h;

   private fpb(final String $$0, final MapCodec<? extends fpa> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fpa> a() {
      return this.h;
   }
}
