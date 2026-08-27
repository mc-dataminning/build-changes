import com.mojang.serialization.MapCodec;

public abstract class deq extends dfc implements dmr {
   protected static final exn a = dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final exn b = dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dtt c = dts.C;
   private final boolean d;

   public static boolean a(dca $$0, ir $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dtc $$0) {
      return $$0.a(awe.N) && $$0.b() instanceof deq;
   }

   protected deq(boolean $$0, dtb.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends deq> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      dug $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dtc a(dtc $$0, dca $$1, ir $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dug $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ir $$0, dca $$1, dug $$2) {
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

   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3) {
   }

   protected dtc a(dca $$0, ir $$1, dtc $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dug $$4 = $$2.c(this.c());
         return new dlq($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
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
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epf.c;
      dtc $$3 = super.n();
      iw $$4 = $$0.g();
      boolean $$5 = $$4 == iw.f || $$4 == iw.e;
      return $$3.a(this.c(), $$5 ? dug.b : dug.a).a(c, Boolean.valueOf($$2));
   }

   public abstract duf<dug> c();

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }
}
