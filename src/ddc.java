import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddc extends ddb {
   public static final MapCodec<ddc> h = b(ddc::new);
   public static final dkj i = dat.aE;
   public static final dkg j = ddb.d;

   @Override
   public MapCodec<ddc> a() {
      return h;
   }

   protected ddc(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ic.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return dfy.h($$0);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return cxa.cq.a($$0, $$1, $$2);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return cxa.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = cxa.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
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
   protected boolean a(ctx $$0, hx $$1, djp $$2) {
      ic $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return cxa.cq.a($$0, $$1);
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return cxa.cq.a($$0, $$1);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(i, j);
   }
}
