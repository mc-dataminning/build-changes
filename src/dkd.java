import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends deu {
   public static final MapCodec<dkd> a = b(dkd::new);
   public static final dsv<dsy> b = dsn.bf;
   public static final dso c = dsn.w;
   public static final dsx d = dsn.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsy.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private drx b(dbu $$0, iz $$1, drx $$2) {
      dsy $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dsy $$4 = $$0.a_($$1.d()).A();
         dsy $$5 = $$4.e() ? dsy.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public drx a(cxv $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      boolean $$6 = $$1.o() == je.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsp $$0, drx $$1, dbt $$2, iz $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dwq.H, $$3);
      }
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      return $$0.a(awu.bg) && $$6.b() == je.b ? bqr.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awg.ag);
         return bqp.c;
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, cms $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awg.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(drx $$0, dbt $$1, iz $$2, int $$3, int $$4) {
      dsy $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lj.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ji<avv> $$10;
      if ($$5.d()) {
         alb $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ji.a(avv.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avx.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private alb a(dbt $$0, iz $$1) {
      return $$0.c_($$1.c()) instanceof dqo $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c, d);
   }
}
