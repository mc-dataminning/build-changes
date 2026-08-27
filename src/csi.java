import javax.annotation.Nullable;

public class csi extends csd implements csh {
   public csi(dfd.d $$0) {
      super($$0);
   }

   @Override
   public cho a() {
      return cho.a;
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.o, dcl::a);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.a;
      } else {
         dcq $$6 = $$1.c_($$2);
         if ($$6 instanceof dcl) {
            $$3.a((dcl)$$6);
            $$3.a(apj.ab);
         }

         return bgt.b;
      }
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof dcl) {
            ((dcl)$$5).a($$4.y());
         }
      }
   }
}
