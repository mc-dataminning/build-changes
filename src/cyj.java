import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyj extends ctm {
   public static final MapCodec<cyj> a = b(cyj::new);
   public static final dgv b = cxu.aE;
   public static final dgs c = dgr.w;
   public static final dgs d = dgr.o;
   public static final eiy e = cua.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eiy f = cua.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eiy g = eiv.a(e, f);
   public static final eiy h = cua.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eiy i = eiv.a(g, h);
   public static final eiy j = eiv.a(
      cua.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cua.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cua.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eiy k = eiv.a(
      cua.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cua.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cua.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eiy l = eiv.a(
      cua.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cua.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cua.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eiy m = eiv.a(
      cua.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cua.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cua.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<cyj> a() {
      return a;
   }

   protected cyj(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public eiy f(dgb $$0, cqf $$1, ht $$2) {
      return g;
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public dgb a(cmr $$0) {
      cqz $$1 = $$0.q();
      ckj $$2 = $$0.n();
      ccx $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gp()) {
         rt $$5 = cic.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return i;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      switch ((hx)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dey($$0, $$1);
   }

   public static boolean a(@Nullable bjt $$0, cqz $$1, ht $$2, dgb $$3, ckj $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bjt $$0, cqz $$1, ht $$2, dgb $$3, ckj $$4) {
      if ($$1.c_($$2) instanceof dey $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, aqd.cf, aqe.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bjt $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      dgb $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dkl.c, $$2, dkl.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cqz $$0, ht $$1, dgb $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cqz $$0, ht $$1, dgb $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cqz $$0, ht $$1, dgb $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dgb $$0, cqz $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dey $$4) {
         hx $$5 = $$0.c(b);
         ckj $$6 = $$4.c().p();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         bzq $$9 = new bzq($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.t();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$3 == hx.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      if ($$0.c(d)) {
         ddx $$3 = $$1.c_($$2);
         if ($$3 instanceof dey) {
            return ((dey)$$3).i();
         }
      }

      return 0;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bib.a($$1.B);
      } else {
         ckj $$6 = $$3.b($$4);
         return !$$6.b() && !$$6.a(ara.au) ? bib.b : bib.d;
      }
   }

   @Nullable
   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cqz $$0, ht $$1, ccx $$2) {
      ddx $$3 = $$0.c_($$1);
      if ($$3 instanceof dey) {
         $$2.a((dey)$$3);
         $$2.a(aqn.au);
      }
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
