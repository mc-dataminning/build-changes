import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dmd {
   public static final MapCodec<dme> h = b(dme::new);
   public static final dtw i = dju.aE;
   public static final dtt j = dmd.d;

   @Override
   public MapCodec<dme> a() {
      return h;
   }

   protected dme(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ji.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return dpb.m($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return dpb.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dga.a.o() : $$0;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = dga.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(j)) {
         ji $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lh.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dcw $$0, jd $$1, dtc $$2) {
      ji $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(i, j);
   }
}
