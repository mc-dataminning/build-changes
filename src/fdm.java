import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fdm implements axg {
   a("bitmap", fdj.a.a),
   b("ttf", fdo.a),
   c("space", eri.a.a),
   d("unihex", fdp.b.a),
   e("reference", fdn.a);

   public static final Codec<fdm> f = axg.a(fdm::values);
   private final String g;
   private final MapCodec<? extends fdl> h;

   private fdm(String $$0, MapCodec<? extends fdl> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fdl> a() {
      return this.h;
   }
}
