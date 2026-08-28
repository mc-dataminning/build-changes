import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnk extends dfb {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final dsv b = dsu.B;

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dse a(dca $$0, iz $$1, dse $$2, cmz $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dca $$0, iz $$1, dbs $$2) {
      if (!$$0.B) {
         cjk $$3 = new cjk($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dca $$0, iz $$1) {
      a($$0, $$1, null);
   }

   private static void a(dca $$0, iz $$1, @Nullable btr $$2) {
      if (!$$0.B) {
         cjk $$3 = new cjk($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), awa.zv, awb.e, 1.0F, 1.0F);
         $$0.a($$2, dwx.I, $$1);
      }
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if (!$$0.a(cuu.os) && !$$0.a(cuu.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfd.a.o(), 11);
         cum $$7 = $$0.g();
         if (!$$4.f()) {
            if ($$0.a(cuu.os)) {
               $$0.a(1, $$4, btr.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(awk.c.b($$7));
         return bqy.a($$2.B);
      }
   }

   @Override
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         bsw $$5 = $$3.s();
         if ($$3.bQ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btr ? (btr)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbs $$0) {
      return false;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }
}
