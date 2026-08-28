import com.mojang.serialization.MapCodec;

public class djo extends dli implements dma {
   public static final MapCodec<djo> b = b(djo::new);
   public static final dst c = dss.C;
   public static final dst d = dss.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<djo> a() {
      return b;
   }

   public djo(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enw.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(c) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dsc $$0, dby $$1, iz $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dsc $$0, dby $$1, iz $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$1.ac() && (long)$$1.z.a(200) <= $$1.Z() % 200L && $$2.v() == $$1.a(dxu.a.b, $$2.u(), $$2.w()) - 1) {
         azd.a($$0.c(a).o(), $$1, $$2, 0.125, li.aT, bqf.a(1, 2));
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
      if ($$0.ac() && $$3 instanceof coc && ((coc)$$3).K()) {
         iz $$4 = $$2.a();
         if ($$0.h($$4)) {
            bto $$5 = bta.am.a($$0);
            if ($$5 != null) {
               $$5.e(evr.c($$4.c()));
               bsu $$6 = $$3.s();
               $$5.b($$6 instanceof arg ? (arg)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, awa.zE, awb.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }
}
