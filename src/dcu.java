import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcu extends dct {
   public static final MapCodec<dcu> h = b(dcu::new);
   public static final dkb i = dal.aE;
   public static final djy j = dct.d;

   @Override
   public MapCodec<dcu> a() {
      return h;
   }

   protected dcu(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ic.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return dfq.h($$0);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return cws.cq.a($$0, $$1, $$2);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return cws.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = cws.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$0.c(j)) {
         ic $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jr.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(ctp $$0, hx $$1, djh $$2) {
      ic $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return cws.cq.a($$0, $$1);
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return cws.cq.a($$0, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(i, j);
   }
}
