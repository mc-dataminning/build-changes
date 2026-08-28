import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dni extends dez {
   public static final MapCodec<dni> a = b(dni::new);
   public static final dst b = dss.B;

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   public dni(dsb.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dby $$0, iz $$1, dbq $$2) {
      if (!$$0.B) {
         cji $$3 = new cji($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dby $$0, iz $$1) {
      a($$0, $$1, null);
   }

   private static void a(dby $$0, iz $$1, @Nullable btp $$2) {
      if (!$$0.B) {
         cji $$3 = new cji($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), awa.zv, awb.e, 1.0F, 1.0F);
         $$0.a($$2, dwv.I, $$1);
      }
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if (!$$0.a(cus.os) && !$$0.a(cus.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfb.a.o(), 11);
         cuk $$7 = $$0.g();
         if (!$$4.f()) {
            if ($$0.a(cus.os)) {
               $$0.a(1, $$4, btp.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(awk.c.b($$7));
         return bqw.a($$2.B);
      }
   }

   @Override
   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         bsu $$5 = $$3.s();
         if ($$3.bQ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btp ? (btp)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbq $$0) {
      return false;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }
}
