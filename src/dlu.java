import com.mojang.serialization.MapCodec;

public class dlu extends dmr implements dmu {
   public static final MapCodec<dlu> a = b(dlu::new);
   private static final ffw b = dmr.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.e()).a(axc.ax);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmt.a.m();
      } else {
         return $$4 == jb.b && $$6.a(dmt.nF) ? dmt.nF.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(czr.ej);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      this.a($$0, $$2);
   }

   protected void a(djm $$0, iv $$1) {
      $$0.a($$1.d(), dmt.nF.m().b(dlv.c, ebf.b), 3);
   }
}
