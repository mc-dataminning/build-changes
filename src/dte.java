import com.mojang.serialization.MapCodec;

public class dte extends djm {
   public static final MapCodec<dte> a = b(dte::new);

   @Override
   public MapCodec<dte> a() {
      return a;
   }

   public dte(dww.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      fba $$4 = new fba(0.25, 0.05F, 0.25);
      if ($$3 instanceof bvg $$5 && $$5.b(btr.K)) {
         $$4 = new fba(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
