import com.mojang.serialization.MapCodec;

public class dte extends dpb {
   public static final MapCodec<dte> a = b(dte::new);
   private static final fgm[] b = dne.a(7, $$0 -> dne.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dte> a() {
      return a;
   }

   public dte(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected djy d() {
      return dae.vq;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return b[this.h($$0)];
   }
}
