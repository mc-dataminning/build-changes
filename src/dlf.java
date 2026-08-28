import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlf extends dle {
   public static final MapCodec<dlf> h = b(dlf::new);
   public static final dsx i = diw.aE;
   public static final dsu j = dle.d;

   @Override
   public MapCodec<dlf> a() {
      return h;
   }

   protected dlf(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return doc.m($$0);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return doc.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfc.a.o() : $$0;
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = dfc.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$0.c(j)) {
         je $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(ld.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dbz $$0, iz $$1, dsd $$2) {
      je $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(i, j);
   }
}
