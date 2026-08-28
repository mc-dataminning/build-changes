import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fno implements azz {
   a("bitmap", fnl.a.a),
   b("ttf", fnq.a),
   c("space", fbf.a.a),
   d("unihex", fnr.b.a),
   e("reference", fnp.a);

   public static final Codec<fno> f = azz.a(fno::values);
   private final String g;
   private final MapCodec<? extends fnn> h;

   private fno(final String $$0, final MapCodec<? extends fnn> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fnn> a() {
      return this.h;
   }
}
