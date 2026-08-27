import com.mojang.serialization.MapCodec;

public class dej extends dcv {
   public static final MapCodec<dej> a = b(dej::new);
   public static final dqp b = dqo.w;
   public static final dqp c = dqo.r;

   @Override
   protected MapCodec<? extends dej> a() {
      return a;
   }

   public dej(dpx.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof aqe $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if ($$1 instanceof aqe $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dpy $$0, aqe $$1, im $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dpy $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? auz.fB : auz.fC, ava.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
