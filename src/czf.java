import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czf extends cze {
   public static final MapCodec<czf> h = b(czf::new);
   public static final dfx i = cww.aE;
   public static final dfu j = cze.d;

   @Override
   public MapCodec<czf> a() {
      return h;
   }

   protected czf(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ha.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return dbz.h($$0);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return cte.cq.a($$0, $$1, $$2);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return cte.cq.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = cte.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(j)) {
         ha $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ip.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cqb $$0, gw $$1, dfd $$2) {
      ha $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return cte.cq.a($$0, $$1);
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return cte.cq.a($$0, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(i, j);
   }
}
