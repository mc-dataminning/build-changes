import com.mojang.serialization.MapCodec;

public class dny extends dpb {
   public static final MapCodec<dny> a = b(dny::new);
   private static final fgm[] b = dne.a(7, $$0 -> dne.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected djy d() {
      return dae.vp;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b[this.h($$0)];
   }
}
