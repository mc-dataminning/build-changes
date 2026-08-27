import javax.annotation.Nullable;

public class cwq extends csd {
   public static final dfv a = dfu.n;

   protected cwq(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      qu $$5 = cgt.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(a, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$0.c(a) && $$1.c_($$2) instanceof ddq $$6) {
         $$6.i();
         return bgt.a($$1.B);
      } else {
         return bgt.d;
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddq $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddq($$0, $$1);
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      if ($$1.c_($$2) instanceof ddq $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddq $$3 && $$3.aq_().d() instanceof cjs $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return $$1.c(a) ? a($$2, dcs.e, ddq::a) : null;
   }
}
