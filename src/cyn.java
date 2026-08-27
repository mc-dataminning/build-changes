import com.mojang.serialization.MapCodec;

public class cyn extends dah implements daz {
   public static final MapCodec<cyn> b = b(cyn::new);
   public static final dgs c = dgr.C;
   public static final dgs d = dgr.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<cyn> a() {
      return b;
   }

   public cyn(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ebf.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(c) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dgb $$0, cqz $$1, ht $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dgb $$0, cqz $$1, ht $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dlk.a.b, $$2.u(), $$2.w()) - 1) {
         atb.a($$0.c(a).o(), $$1, $$2, 0.125, js.aN, bhm.a(1, 2));
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      if ($$0.Y() && $$3 instanceof ceb && ((ceb)$$3).I()) {
         ht $$4 = $$2.a();
         if ($$0.g($$4)) {
            bki $$5 = bjx.ai.a($$0);
            if ($$5 != null) {
               $$5.d(eif.c($$4.c()));
               bjt $$6 = $$3.v();
               $$5.b($$6 instanceof alr ? (alr)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aqd.xW, aqe.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }
}
