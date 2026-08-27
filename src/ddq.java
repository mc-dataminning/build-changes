import com.mojang.serialization.MapCodec;

public class ddq extends dbo {
   public static final MapCodec<ddq> d = b(ddq::new);
   private static final float e = 0.05F;
   private static final float f = 0.1F;

   @Override
   public MapCodec<ddq> a() {
      return d;
   }

   public ddq(dpx.d $$0) {
      super($$0, js.c);
   }

   @Override
   public boolean d(dpy $$0) {
      return false;
   }

   protected static boolean a(czu $$0, dat.c $$1) {
      if ($$1 == dat.c.b) {
         return $$0.E_().i() < 0.05F;
      } else {
         return $$1 == dat.c.c ? $$0.E_().i() < 0.1F : false;
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, dat.c $$3) {
      if (a($$1, $$3)) {
         if ($$3 == dat.c.b) {
            $$1.b($$2, dcx.fu.n());
            $$1.a(null, dur.c, $$2);
         } else if ($$3 == dat.c.c) {
            $$1.b($$2, dcx.fw.n());
            $$1.a(null, dur.c, $$2);
         }
      }
   }

   @Override
   protected boolean a(elq $$0) {
      return true;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, elq $$3) {
      if ($$3 == els.c) {
         dpy $$4 = dcx.fu.n();
         $$1.b($$2, $$4);
         $$1.a(dur.c, $$2, dur.a.a($$4));
         $$1.c(1047, $$2, 0);
      } else if ($$3 == els.e) {
         dpy $$5 = dcx.fv.n();
         $$1.b($$2, $$5);
         $$1.a(dur.c, $$2, dur.a.a($$5));
         $$1.c(1046, $$2, 0);
      }
   }
}
