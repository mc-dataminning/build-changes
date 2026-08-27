import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dle extends dcv {
   public static final MapCodec<dle> a = b(dle::new);
   public static final dqp b = dqo.B;

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      if (!$$0.x_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(czu $$0, im $$1, czm $$2) {
      if (!$$0.B) {
         cgw $$3 = new cgw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.f());
         int $$4 = $$3.r();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(czu $$0, im $$1) {
      a($$0, $$1, null);
   }

   private static void a(czu $$0, im $$1, @Nullable bre $$2) {
      if (!$$0.B) {
         cgw $$3 = new cgw($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.ds(), $$3.du(), $$3.dy(), auz.zj, ava.e, 1.0F, 1.0F);
         $$0.a($$2, dur.I, $$1);
      }
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if (!$$0.a(csg.os) && !$$0.a(csg.tX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dcx.a.n(), 11);
         cry $$7 = $$0.f();
         if (!$$4.f()) {
            if ($$0.a(csg.os)) {
               $$0.a(1, $$4, bre.d($$5));
            } else {
               $$0.g(1);
            }
         }

         $$4.b(avj.c.b($$7));
         return bos.a($$2.B);
      }
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      if (!$$0.B) {
         im $$4 = $$2.a();
         bql $$5 = $$3.u();
         if ($$3.bO() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bre ? (bre)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(czm $$0) {
      return false;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }
}
