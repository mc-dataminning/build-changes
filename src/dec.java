import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dec extends dgr implements dcy {
   public static final MapCodec<dec> a = b(dec::new);
   public static final int b = 2;
   public static final dqy c = dqo.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ety[] m = new ety[]{
      dcv.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dcv.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dcv.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ety[] n = new ety[]{
      dcv.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dcv.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dcv.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ety[] o = new ety[]{
      dcv.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dcv.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dcv.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ety[] F = new ety[]{
      dcv.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dcv.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dcv.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public dec(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ir.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      dpy $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(avo.z);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      int $$4 = $$0.c(c);
      switch ((ir)$$0.c(aE)) {
         case d:
            return F[$$4];
         case c:
         default:
            return o[$$4];
         case e:
            return n[$$4];
         case f:
            return m[$$4];
      }
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = this.n();
      czx $$2 = $$0.q();
      im $$3 = $$0.a();

      for (ir $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aE, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
