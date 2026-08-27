import com.mojang.serialization.MapCodec;

public class dga extends dgt {
   public static final MapCodec<dga> a = b(dga::new);
   public static final int b = 3;
   public static final dqy c = dqo.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dga(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         im.a $$4 = new im.a();

         for (ir $$5 : ir.values()) {
            $$4.a($$2, $$5);
            dpy $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, axw.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, axw.a($$3, 20, 40));
      }
   }

   private boolean e(dpy $$0, czu $$1, im $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cza $$0, im $$1, int $$2) {
      int $$3 = 0;
      im.a $$4 = new im.a();

      for (ir $$5 : ir.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return csd.i;
   }
}
