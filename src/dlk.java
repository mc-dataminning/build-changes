import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlk extends dlj {
   public static final MapCodec<dlk> h = b(dlk::new);
   public static final dtb i = djb.aE;
   public static final dsy j = dlj.d;

   @Override
   public MapCodec<dlk> a() {
      return h;
   }

   protected dlk(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, jf.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return doh.m($$0);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return doh.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfh.a.o() : $$0;
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = dfh.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(j)) {
         jf $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(le.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dcd $$0, ja $$1, dsh $$2) {
      jf $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(i, j);
   }
}
