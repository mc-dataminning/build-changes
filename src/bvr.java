import com.mojang.serialization.Codec;

public enum bvr implements bax {
   a("hurt", awy.uZ),
   b("thorns", awy.uZ),
   c("drowning", awy.va),
   d("burning", awy.vc),
   e("poking", awy.vd),
   f("freezing", awy.vb);

   public static final Codec<bvr> g = bax.a(bvr::values);
   private final String h;
   private final awx i;

   private bvr(final String $$0, final awx $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awx a() {
      return this.i;
   }
}
