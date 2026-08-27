import com.mojang.serialization.MapCodec;

public class deo extends dgi implements dha {
   public static final MapCodec<deo> b = b(deo::new);
   public static final dnq c = dnp.C;
   public static final dnq d = dnp.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<deo> a() {
      return b;
   }

   public deo(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eio.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dmz $$0, cwz $$1, ib $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dmz $$0, cwz $$1, ib $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$1.aa() && (long)$$1.z.a(200) <= $$1.X() % 200L && $$2.v() == $$1.a(dsm.a.b, $$2.u(), $$2.w()) - 1) {
         awz.a($$0.c(a).o(), $$1, $$2, 0.125, kc.aR, bmn.a(1, 2));
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
      if ($$0.aa() && $$3 instanceof cjx && ((cjx)$$3).J()) {
         ib $$4 = $$2.a();
         if ($$0.h($$4)) {
            bpn $$5 = bpc.al.a($$0);
            if ($$5 != null) {
               $$5.e(epr.c($$4.c()));
               bow $$6 = $$3.af_();
               $$5.b($$6 instanceof apg ? (apg)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aty.zd, atz.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }
}
