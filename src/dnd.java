import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnd extends deu {
   public static final MapCodec<dnd> a = b(dnd::new);
   public static final dso b = dsn.B;

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(drw.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbt $$0, iz $$1, dbl $$2) {
      if (!$$0.B) {
         cjd $$3 = new cjd($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dbt $$0, iz $$1) {
      a($$0, $$1, null);
   }

   private static void a(dbt $$0, iz $$1, @Nullable btk $$2) {
      if (!$$0.B) {
         cjd $$3 = new cjd($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), avw.zv, avx.e, 1.0F, 1.0F);
         $$0.a($$2, dwq.I, $$1);
      }
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if (!$$0.a(cun.os) && !$$0.a(cun.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dew.a.n(), 11);
         cuf $$7 = $$0.g();
         if (!$$4.f()) {
            if ($$0.a(cun.os)) {
               $$0.a(1, $$4, btk.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(awg.c.b($$7));
         return bqr.a($$2.B);
      }
   }

   @Override
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         bsp $$5 = $$3.s();
         if ($$3.bQ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btk ? (btk)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbl $$0) {
      return false;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }
}
