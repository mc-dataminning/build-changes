import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doi extends dfy {
   public static final MapCodec<doi> a = b(doi::new);
   public static final dtt b = dts.B;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcw $$0, jd $$1, dco $$2) {
      if (!$$0.B) {
         cji $$3 = new cji($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.t();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(dcw $$0, jd $$1) {
      a($$0, $$1, null);
   }

   private static void a(dcw $$0, jd $$1, @Nullable btn $$2) {
      if (!$$0.B) {
         cji $$3 = new cji($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), avp.zy, avq.e, 1.0F, 1.0F);
         $$0.a($$2, dxz.I, $$1);
      }
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      if (!$$0.a(cut.os) && !$$0.a(cut.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dga.a.o(), 11);
         cul $$7 = $$0.g();
         if ($$0.a(cut.os)) {
            $$0.a(1, $$4, btn.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(avz.c.b($$7));
         return bqt.a($$2.B);
      }
   }

   @Override
   protected void a(dcw $$0, dtc $$1, eww $$2, cnp $$3) {
      if (!$$0.B) {
         jd $$4 = $$2.a();
         bsr $$5 = $$3.s();
         if ($$3.bR() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof btn ? (btn)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dco $$0) {
      return false;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }
}
