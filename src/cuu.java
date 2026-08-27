import com.mojang.serialization.MapCodec;

public abstract class cuu extends cvf implements dcf {
   protected static final eks a = cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eks b = cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final die c = did.C;
   private final boolean d;

   public static boolean a(csf $$0, hx $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dhn $$0) {
      return $$0.a(ark.N) && $$0.b() instanceof cuu;
   }

   protected cuu(boolean $$0, dhm.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cuu> a();

   public boolean b() {
      return this.d;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      dir $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dhn a(dhn $$0, csf $$1, hx $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dir $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(hx $$0, csf $$1, dir $$2) {
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

   protected void a(dhn $$0, csf $$1, hx $$2, cvf $$3) {
   }

   protected dhn a(csf $$0, hx $$1, dhn $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dir $$4 = $$2.c(this.c());
         return new dbe($$0, $$1, $$2).a($$0.B($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
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
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ecy.c;
      dhn $$3 = super.o();
      ib $$4 = $$0.g();
      boolean $$5 = $$4 == ib.f || $$4 == ib.e;
      return $$3.a(this.c(), $$5 ? dir.b : dir.a).a(c, Boolean.valueOf($$2));
   }

   public abstract diq<dir> c();

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }
}
