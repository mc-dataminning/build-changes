import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dno extends dff {
   public static final MapCodec<dno> a = b(dno::new);
   public static final dsy b = dsx.B;

   @Override
   public MapCodec<dno> a() {
      return a;
   }

   public dno(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dsh a(dcd $$0, ja $$1, dsh $$2, cmh $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcd $$0, ja $$1, dbv $$2) {
      if (!$$0.B) {
         cis $$3 = new cis($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dcd $$0, ja $$1) {
      a($$0, $$1, null);
   }

   private static void a(dcd $$0, ja $$1, @Nullable bsy $$2) {
      if (!$$0.B) {
         cis $$3 = new cis($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), avf.zy, avg.e, 1.0F, 1.0F);
         $$0.a($$2, dxa.I, $$1);
      }
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if (!$$0.a(cud.os) && !$$0.a(cud.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfh.a.o(), 11);
         ctv $$7 = $$0.g();
         if (!$$4.f()) {
            if ($$0.a(cud.os)) {
               $$0.a(1, $$4, bsy.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(avp.c.b($$7));
         return bqf.a($$2.B);
      }
   }

   @Override
   protected void a(dcd $$0, dsh $$1, evv $$2, cmz $$3) {
      if (!$$0.B) {
         ja $$4 = $$2.a();
         bsd $$5 = $$3.s();
         if ($$3.bQ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bsy ? (bsy)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dbv $$0) {
      return false;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }
}
