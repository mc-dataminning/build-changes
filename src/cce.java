import javax.annotation.Nullable;

public class cce extends caw {
   public cce(bkz<? extends cce> $$0, csf $$1) {
      super($$0, $$1);
      this.a(edi.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bP.a(3, new btz<>(this, cco.class, true));
      super.B();
   }

   @Override
   protected aqu y() {
      return aqv.AU;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.AW;
   }

   @Override
   protected aqu n_() {
      return aqv.AV;
   }

   @Override
   aqu w() {
      return aqv.AX;
   }

   @Override
   protected void a(bjt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof caz $$4 && $$4.gg()) {
         $$4.gh();
         this.a((cse)clr.ue);
      }
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      this.a(bla.a, new clo(clr.oN));
   }

   @Override
   protected void b(atw $$0, biz $$1) {
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      bme $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bmr.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 2.1F;
   }

   @Override
   protected float l(bkv $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(bkv $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bll) {
            ((bll)$$0).b(new bki(bkk.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cef b(clo $$0, float $$1) {
      cef $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bki $$0) {
      return $$0.c() == bkk.t ? false : super.c($$0);
   }
}
