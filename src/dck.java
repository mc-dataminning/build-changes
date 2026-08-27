import com.mojang.serialization.MapCodec;

public abstract class dck extends dcv implements djw {
   protected static final ety a = dcv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ety b = dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dqp c = dqo.C;
   private final boolean d;

   public static boolean a(czu $$0, im $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dpy $$0) {
      return $$0.a(avo.N) && $$0.b() instanceof dck;
   }

   protected dck(boolean $$0, dpx.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dck> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      drc $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dpy a(dpy $$0, czu $$1, im $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         drc $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(im $$0, czu $$1, drc $$2) {
      if (!c($$1, $$0.d())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.h());
            case d:
               return !c($$1, $$0.g());
            case e:
               return !c($$1, $$0.e());
            case f:
               return !c($$1, $$0.f());
            default:
               return false;
         }
      }
   }

   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3) {
   }

   protected dpy a(czu $$0, im $$1, dpy $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         drc $$4 = $$2.c(this.c());
         return new div($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.c(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == els.c;
      dpy $$3 = super.n();
      ir $$4 = $$0.g();
      boolean $$5 = $$4 == ir.f || $$4 == ir.e;
      return $$3.a(this.c(), $$5 ? drc.b : drc.a).a(c, Boolean.valueOf($$2));
   }

   public abstract drb<drc> c();

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(false) : super.c_($$0);
   }
}
