import com.mojang.serialization.MapCodec;

public class cxp extends czj implements dab {
   public static final MapCodec<cxp> b = b(cxp::new);
   public static final dfu c = dft.C;
   public static final dfu d = dft.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<cxp> a() {
      return b;
   }

   public cxp(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ha.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eah.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(c) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dfd $$0, cqb $$1, gw $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dfd $$0, cqb $$1, gw $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dkm.a.b, $$2.u(), $$2.w()) - 1) {
         ase.a($$0.c(a).o(), $$1, $$2, 0.125, iv.aN, bgp.a(1, 2));
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      if ($$0.Y() && $$3 instanceof cde && ((cde)$$3).I()) {
         gw $$4 = $$2.a();
         if ($$0.g($$4)) {
            bjl $$5 = bja.ai.a($$0);
            if ($$5 != null) {
               $$5.d(ehh.c($$4.c()));
               biw $$6 = $$3.v();
               $$5.b($$6 instanceof aku ? (aku)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, apg.xU, aph.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }
}
