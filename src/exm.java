import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum exm implements aub {
   a("bitmap", exk.a.a),
   b("ttf", exo.a),
   c("space", elp.a.a),
   d("unihex", exp.b.a),
   e("reference", exn.a);

   public static final Codec<exm> f = aub.a(exm::values);
   private final String g;
   private final MapCodec<? extends exl> h;

   private exm(String $$0, MapCodec<? extends exl> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends exl> a() {
      return this.h;
   }
}
