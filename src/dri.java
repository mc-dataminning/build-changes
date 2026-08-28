import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dri extends dlu {
   public static final MapCodec<dri> a = b(dri::new);
   public static final eam<eap> b = eae.bi;
   public static final eaf c = eae.A;
   public static final eao d = eae.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dri> a() {
      return a;
   }

   public dri(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, eap.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dzo a(dis $$0, iu $$1, dzo $$2) {
      eap $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         eap $$4 = $$0.a_($$1.e()).E();
         eap $$5 = $$4.e() ? eap.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dzo a(dcl $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      boolean $$8 = $$4.o() == ja.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bwa $$0, dzo $$1, dip $$2, iu $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, eeo.H, $$3);
      }
   }

   @Override
   protected bty a(cys $$0, dzo $$1, dip $$2, iu $$3, cqs $$4, btx $$5, fds $$6) {
      return (bty)($$0.a(axi.bw) && $$6.c() == ja.b ? bty.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awv.ag);
      }

      return bty.a;
   }

   @Override
   protected void a_(dzo $$0, dip $$1, iu $$2, cqs $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awv.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dzo $$0, dip $$1, iu $$2, int $$3, int $$4) {
      eap $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lx.ad, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      je<awk> $$10;
      if ($$5.d()) {
         ale $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = je.a(awk.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awm.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private ale a(dip $$0, iu $$1) {
      return $$0.c_($$1.d()) instanceof dyd $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }
}
