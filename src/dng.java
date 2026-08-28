import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends dex {
   public static final MapCodec<dng> a = b(dng::new);
   public static final dsr b = dsq.B;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(drz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dsa a(dbw $$0, iz $$1, dsa $$2, cmv $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbw $$0, iz $$1, dbo $$2) {
      if (!$$0.B) {
         cjg $$3 = new cjg($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dbw $$0, iz $$1) {
      a($$0, $$1, null);
   }

   private static void a(dbw $$0, iz $$1, @Nullable btn $$2) {
      if (!$$0.B) {
         cjg $$3 = new cjg($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), avz.zv, awa.e, 1.0F, 1.0F);
         $$0.a($$2, dwt.I, $$1);
      }
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if (!$$0.a(cuq.os) && !$$0.a(cuq.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dez.a.o(), 11);
         cui $$7 = $$0.g();
         if (!$$4.f()) {
            if ($$0.a(cuq.os)) {
               $$0.a(1, $$4, btn.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(awj.c.b($$7));
         return bqu.a($$2.B);
      }
   }

   @Override
   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         bss $$5 = $$3.s();
         if ($$3.bQ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btn ? (btn)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbo $$0) {
      return false;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }
}
