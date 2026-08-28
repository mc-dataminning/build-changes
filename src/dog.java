import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dog extends dfw {
   public static final MapCodec<dog> a = b(dog::new);
   public static final dtr b = dtq.B;

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(dsz.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dta a(dcu $$0, jd $$1, dta $$2, cmv $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcu $$0, jd $$1, dcm $$2) {
      if (!$$0.B) {
         cjg $$3 = new cjg($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.t();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dcu $$0, jd $$1) {
      a($$0, $$1, null);
   }

   private static void a(dcu $$0, jd $$1, @Nullable btl $$2) {
      if (!$$0.B) {
         cjg $$3 = new cjg($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dv(), $$3.dx(), $$3.dB(), avo.zy, avp.e, 1.0F, 1.0F);
         $$0.a($$2, dxw.I, $$1);
      }
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if (!$$0.a(cur.os) && !$$0.a(cur.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dfy.a.o(), 11);
         cuj $$7 = $$0.g();
         if ($$0.a(cur.os)) {
            $$0.a(1, $$4, btl.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(avy.c.b($$7));
         return bqs.a($$2.B);
      }
   }

   @Override
   protected void a(dcu $$0, dta $$1, ews $$2, cnn $$3) {
      if (!$$0.B) {
         jd $$4 = $$2.a();
         bsq $$5 = $$3.s();
         if ($$3.bR() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btl ? (btl)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dcm $$0) {
      return false;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }
}
