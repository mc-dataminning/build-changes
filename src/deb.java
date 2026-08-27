import com.mojang.serialization.MapCodec;

public class deb extends dij {
   public static final MapCodec<deb> a = b(deb::new);

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   protected deb(dpx.d $$0) {
      super(0.3125F, $$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
      );
   }

   @Override
   public dpy a(cvl $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static dpy a(cza $$0, im $$1, dpy $$2) {
      dpy $$3 = $$0.a_($$1.d());
      dpy $$4 = $$0.a_($$1.c());
      dpy $$5 = $$0.a_($$1.e());
      dpy $$6 = $$0.a_($$1.h());
      dpy $$7 = $$0.a_($$1.f());
      dpy $$8 = $$0.a_($$1.g());
      dcv $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dcx.kv) || $$3.a(dcx.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dcx.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dcx.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dcx.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dcx.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dcx.kv)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dcx.kv) || $$1 == ir.a && $$2.a(dcx.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      dpy $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ir $$5 : ir.c.a) {
         im $$6 = $$2.a($$5);
         dpy $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dpy $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dcx.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dcx.fz);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
