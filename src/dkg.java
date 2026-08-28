import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkg extends dex {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final dsy<dtb> b = dsq.bf;
   public static final dsr c = dsq.w;
   public static final dta d = dsq.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dkg> a() {
      return a;
   }

   public dkg(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtb.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dsa b(dbx $$0, iz $$1, dsa $$2) {
      dtb $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dtb $$4 = $$0.a_($$1.d()).A();
         dtb $$5 = $$4.e() ? dtb.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dsa a(cxy $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      boolean $$6 = $$1.o() == je.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bss $$0, dsa $$1, dbw $$2, iz $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dwt.H, $$3);
      }
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      return $$0.a(awx.bg) && $$6.b() == je.b ? bqu.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awj.ag);
         return bqs.c;
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, cmv $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awj.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dsa $$0, dbw $$1, iz $$2, int $$3, int $$4) {
      dtb $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(li.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ji<avy> $$10;
      if ($$5.d()) {
         ale $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ji.a(avy.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awa.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ale a(dbw $$0, iz $$1) {
      return $$0.c_($$1.c()) instanceof dqr $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c, d);
   }
}
