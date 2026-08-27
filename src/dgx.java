import com.mojang.serialization.MapCodec;

public class dgx extends dcv implements dfn, dgd {
   public static final MapCodec<dgx> a = b(dgx::new);
   public static final dqw<it> b = dqo.T;

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   protected dgx(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.k));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dpy a(cvl $$0) {
      ir $$1 = $$0.k();
      ir $$2;
      if ($$1.o() == ir.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ir.b;
      }

      return this.n().a(b, it.a($$1, $$2));
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dod($$0, $$1);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      dnd $$5 = $$1.c_($$2);
      if ($$5 instanceof dod && $$3.gx()) {
         $$3.a((dod)$$5);
         return boq.a($$1.B);
      } else {
         return boq.d;
      }
   }

   public static boolean a(ekg.c $$0, ekg.c $$1) {
      ir $$2 = m($$0.b());
      ir $$3 = m($$1.b());
      ir $$4 = n($$0.b());
      ir $$5 = n($$1.b());
      dod.a $$6 = dod.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? dod.a.b : dod.a.a);
      boolean $$7 = $$6 == dod.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ir m(dpy $$0) {
      return $$0.c(b).a();
   }

   public static ir n(dpy $$0) {
      return $$0.c(b).b();
   }
}
