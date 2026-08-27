import com.mojang.serialization.MapCodec;

public class czh extends dbb implements dbt {
   public static final MapCodec<czh> b = b(czh::new);
   public static final dhn c = dhm.C;
   public static final dhn d = dhm.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<czh> a() {
      return b;
   }

   public czh(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ech.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(c) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dgw $$0, crs $$1, ht $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dgw $$0, crs $$1, ht $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dmf.a.b, $$2.u(), $$2.w()) - 1) {
         atl.a($$0.c(a).o(), $$1, $$2, 0.125, js.aO, bib.a(1, 2));
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
      if ($$0.Y() && $$3 instanceof ceq && ((ceq)$$3).I()) {
         ht $$4 = $$2.a();
         if ($$0.g($$4)) {
            bkx $$5 = bkm.ai.a($$0);
            if ($$5 != null) {
               $$5.d(eji.c($$4.c()));
               bki $$6 = $$3.v();
               $$5.b($$6 instanceof amb ? (amb)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aqn.xY, aqo.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }
}
