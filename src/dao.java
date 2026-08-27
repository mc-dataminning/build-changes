import javax.annotation.Nullable;

public class dao extends csq {
   private static final ti c = ti.c("container.stonecutter");
   public static final dfy a = cwj.aC;
   protected static final eib b = csq.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public dao(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c));
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apj.ay);
         return bgt.b;
      }
   }

   @Nullable
   @Override
   public bgw b(dfe $$0, cpq $$1, gw $$2) {
      return new bhb(($$2x, $$3, $$4) -> new cgc($$2x, $$3, cer.a($$1, $$2)), c);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
