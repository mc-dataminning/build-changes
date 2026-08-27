import com.mojang.serialization.MapCodec;

public abstract class cwn extends cwy implements ddy {
   protected static final emv a = cwy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final emv b = cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dkg c = dkf.C;
   private final boolean d;

   public static boolean a(ctx $$0, hx $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(djp $$0) {
      return $$0.a(asi.N) && $$0.b() instanceof cwn;
   }

   protected cwn(boolean $$0, djo.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cwn> a();

   public boolean b() {
      return this.d;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      dkt $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return c($$1, $$2.d());
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected djp a(djp $$0, ctx $$1, hx $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dkt $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(hx $$0, ctx $$1, dkt $$2) {
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

   protected void a(djp $$0, ctx $$1, hx $$2, cwy $$3) {
   }

   protected djp a(ctx $$0, hx $$1, djp $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dkt $$4 = $$2.c(this.c());
         return new dcx($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
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
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == efa.c;
      djp $$3 = super.o();
      ic $$4 = $$0.g();
      boolean $$5 = $$4 == ic.f || $$4 == ic.e;
      return $$3.a(this.c(), $$5 ? dkt.b : dkt.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dks<dkt> c();

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(false) : super.c_($$0);
   }
}
