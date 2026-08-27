import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmj extends dea {
   public static final MapCodec<dmj> a = b(dmj::new);
   public static final dru b = drt.B;

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(drc.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(daz $$0, io $$1, dar $$2) {
      if (!$$0.B) {
         cij $$3 = new cij($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.u();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(daz $$0, io $$1) {
      a($$0, $$1, null);
   }

   private static void a(daz $$0, io $$1, @Nullable bsq $$2) {
      if (!$$0.B) {
         cij $$3 = new cij($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.du(), $$3.dw(), $$3.dA(), avi.zv, avj.e, 1.0F, 1.0F);
         $$0.a($$2, dvw.I, $$1);
      }
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if (!$$0.a(ctt.os) && !$$0.a(ctt.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dec.a.n(), 11);
         ctl $$7 = $$0.g();
         if (!$$4.f()) {
            if ($$0.a(ctt.os)) {
               $$0.a(1, $$4, bsq.d($$5));
            } else {
               $$0.h(1);
            }
         }

         $$4.b(avs.c.b($$7));
         return bpy.a($$2.B);
      }
   }

   @Override
   protected void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
      if (!$$0.B) {
         io $$4 = $$2.a();
         brw $$5 = $$3.s();
         if ($$3.bQ() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bsq ? (bsq)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(dar $$0) {
      return false;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }
}
