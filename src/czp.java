import com.mojang.serialization.MapCodec;

public abstract class czp extends daa implements dha {
   protected static final eqk a = daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eqk b = daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dnq c = dnp.C;
   private final boolean d;

   public static boolean a(cwz $$0, ib $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dmz $$0) {
      return $$0.a(aun.N) && $$0.b() instanceof czp;
   }

   protected czp(boolean $$0, dmy.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends czp> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      dod $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dmz a(dmz $$0, cwz $$1, ib $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dod $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ib $$0, cwz $$1, dod $$2) {
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

   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3) {
   }

   protected dmz a(cwz $$0, ib $$1, dmz $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dod $$4 = $$2.c(this.c());
         return new dfz($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
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
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eio.c;
      dmz $$3 = super.o();
      ih $$4 = $$0.g();
      boolean $$5 = $$4 == ih.f || $$4 == ih.e;
      return $$3.a(this.c(), $$5 ? dod.b : dod.a).a(c, Boolean.valueOf($$2));
   }

   public abstract doc<dod> c();

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(c) ? eio.c.a(false) : super.c_($$0);
   }
}
