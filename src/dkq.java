import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkq extends dfc {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final dua<dud> b = dts.bf;
   public static final dtt c = dts.w;
   public static final duc d = dts.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dud.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dtc b(dcb $$0, ir $$1, dtc $$2) {
      dud $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dud $$4 = $$0.a_($$1.d()).A();
         dud $$5 = $$4.e() ? dud.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      boolean $$6 = $$1.o() == iw.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable brv $$0, dtc $$1, dca $$2, ir $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dxv.H, $$3);
      }
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      return $$0.a(awm.bh) && $$6.b() == iw.b ? bqc.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avz.ah);
         return bqa.b;
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, cly $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avz.ag);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dtc $$0, dca $$1, ir $$2, int $$3, int $$4) {
      dud $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lb.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ja<avn> $$10;
      if ($$5.d()) {
         akt $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ja.a(avn.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avq.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private akt a(dca $$0, ir $$1) {
      return $$0.c_($$1.c()) instanceof drt $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d);
   }
}
