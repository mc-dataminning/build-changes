import com.mojang.serialization.MapCodec;

public class dli extends dmf implements dmi {
   public static final MapCodec<dli> a = b(dli::new);
   private static final ffk b = dmf.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   public dli(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.e()).a(axc.ax);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmh.a.m();
      } else {
         return $$4 == ja.b && $$6.a(dmh.nF) ? dmh.nF.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(czh.ej);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      this.a($$0, $$2);
   }

   protected void a(dja $$0, iu $$1) {
      $$0.a($$1.d(), dmh.nF.m().b(dlj.c, eat.b), 3);
   }
}
