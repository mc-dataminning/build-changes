import javax.annotation.Nullable;

public class cps extends cre {
   public cps(cre.a $$0) {
      super($$0);
   }

   @Nullable
   public static ik a(cyx $$0) {
      return $$0.D_().j() ? ik.a($$0.ae(), $$0.U()) : null;
   }

   @Override
   public boolean d_(crj $$0) {
      return $$0.b(jp.I) || super.d_($$0);
   }

   @Override
   public void a(crj $$0, cyx $$1, bpv $$2, int $$3, boolean $$4) {
      if ($$1 instanceof aps $$5) {
         cuc $$6 = $$0.a(jp.I);
         if ($$6 != null && $$6.a($$5)) {
            $$0.c(jp.I);
         }
      }
   }

   @Override
   public boa a(cuq $$0) {
      ib $$1 = $$0.a();
      cyx $$2 = $$0.q();
      if (!$$2.a_($$1).a(dca.pq)) {
         return super.a($$0);
      } else {
         $$2.a(null, $$1, aum.nY, aun.h, 1.0F, 1.0F);
         cjt $$3 = $$0.o();
         crj $$4 = $$0.n();
         boolean $$5 = !$$3.fM() && $$4.G() == 1;
         cuc $$6 = new cuc(ik.a($$2.ae(), $$1), true);
         if ($$5) {
            $$4.b(jp.I, $$6);
         } else {
            crj $$7 = $$4.a(crm.qR, 1);
            $$4.a(1, $$3);
            $$7.b(jp.I, $$6);
            if (!$$3.fZ().e($$7)) {
               $$3.a($$7, false);
            }
         }

         return boa.a($$2.B);
      }
   }

   @Override
   public String i(crj $$0) {
      return $$0.b(jp.I) ? "item.minecraft.lodestone_compass" : super.i($$0);
   }
}
