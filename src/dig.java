import com.mojang.serialization.MapCodec;

public class dig extends dey {
   public static final MapCodec<dig> b = b(dig::new);
   public static final dqp c = dqo.w;

   @Override
   public MapCodec<dig> a() {
      return b;
   }

   public dig(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ir.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(czv $$0, im $$1) {
      if (!$$0.x_() && !$$0.O().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(czu $$0, im $$1, dpy $$2) {
      ir $$3 = $$2.c(a);
      im $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.O().a($$2, this)) {
            dpy $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.O().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
