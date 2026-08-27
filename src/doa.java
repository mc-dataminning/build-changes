import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doa extends dfc {
   public static final MapCodec<doa> a = b(doa::new);
   public static final dtt b = dts.B;

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dtc a(dca $$0, ir $$1, dtc $$2, cly $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dca $$0, ir $$1, dbs $$2) {
      if (!$$0.C) {
         cih $$3 = new cih($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.r();
         $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dca $$0, ir $$1) {
      a($$0, $$1, null);
   }

   private static void a(dca $$0, ir $$1, @Nullable bso $$2) {
      if (!$$0.C) {
         cih $$3 = new cih($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dz(), $$3.dB(), $$3.dF(), avo.zT, avq.e, 1.0F, 1.0F);
         $$0.a($$2, dxv.I, $$1);
      }
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if (!$$0.a(cuk.pI) && !$$0.a(cuk.vz)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfe.a.n(), 11);
         cuc $$7 = $$0.f();
         if (!$$4.f()) {
            if ($$0.a(cuk.pI)) {
               $$0.a(1, $$4, bso.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(avz.c.b($$7));
         return bqc.a($$2.C);
      }
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      if (!$$0.C) {
         ir $$4 = $$2.a();
         brv $$5 = $$3.t();
         if ($$3.bV() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bso ? (bso)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbs $$0) {
      return false;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }
}
