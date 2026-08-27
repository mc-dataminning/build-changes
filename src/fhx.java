import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public enum fhx implements ayq {
   a("bitmap", fhu.a.a),
   b("ttf", fhz.a),
   c("space", evs.a.a),
   d("unihex", fia.b.a),
   e("reference", fhy.a);

   public static final Codec<fhx> f = ayq.a(fhx::values);
   private final String g;
   private final MapCodec<? extends fhw> h;

   private fhx(String $$0, MapCodec<? extends fhw> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public String c() {
      return this.g;
   }

   public MapCodec<? extends fhw> a() {
      return this.h;
   }
}
