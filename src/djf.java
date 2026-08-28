import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends deg {
   public static final MapCodec<djf> a = b(djf::new);
   public static final dsr b = diq.aE;
   public static final dso c = dsn.w;
   public static final dso d = dsn.o;
   public static final ewf e = deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ewf f = deu.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ewf g = ewc.a(e, f);
   public static final ewf h = deu.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ewf i = ewc.a(g, h);
   public static final ewf j = ewc.a(
      deu.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), deu.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), deu.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ewf k = ewc.a(
      deu.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), deu.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), deu.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ewf l = ewc.a(
      deu.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), deu.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), deu.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ewf m = ewc.a(
      deu.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), deu.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), deu.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   protected djf(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   protected ewf f(drx $$0, daz $$1, iz $$2) {
      return g;
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   public drx a(cxv $$0) {
      dbt $$1 = $$0.q();
      cuk $$2 = $$0.n();
      cms $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cwz $$5 = $$2.a(km.N, cwz.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return i;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      switch ((je)$$0.c(b)) {
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
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqe($$0, $$1);
   }

   public static boolean a(@Nullable bsp $$0, dbt $$1, iz $$2, drx $$3, cuk $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bsp $$0, dbt $$1, iz $$2, drx $$3, cuk $$4) {
      if ($$1.c_($$2) instanceof dqe $$6) {
         $$6.b($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avw.cz, avx.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bsp $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      drx $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dwq.c, $$2, dwq.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dbt $$0, iz $$1, drx $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dbt $$0, iz $$1, drx $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dbt $$0, iz $$1, drx $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
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

   private void d(drx $$0, dbt $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqe $$4) {
         je $$5 = $$0.c(b);
         cuk $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cjc $$9 = new cjc($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$3 == je.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      if ($$0.c(d)) {
         dpc $$3 = $$1.c_($$2);
         if ($$3 instanceof dqe) {
            return ((dqe)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$1.c(d)) {
         return bqr.d;
      } else if ($$0.a(awu.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqr.a($$2.B) : bqr.e;
      } else {
         return $$0.e() && $$5 == bqo.a ? bqr.e : bqr.d;
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqp.a($$1.B);
      } else {
         return bqp.c;
      }
   }

   @Nullable
   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dbt $$0, iz $$1, cms $$2) {
      dpc $$3 = $$0.c_($$1);
      if ($$3 instanceof dqe) {
         $$2.a((dqe)$$3);
         $$2.a(awg.au);
      }
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
