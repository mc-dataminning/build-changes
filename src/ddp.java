import com.mojang.serialization.MapCodec;

public abstract class ddp extends dea implements dlb {
   protected static final evf a = dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final evf b = dea.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dru c = drt.C;
   private final boolean d;

   public static boolean a(daz $$0, io $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(drd $$0) {
      return $$0.a(avx.N) && $$0.b() instanceof ddp;
   }

   protected ddp(boolean $$0, drc.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddp> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      dsh $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected drd a(drd $$0, daz $$1, io $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dsh $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(io $$0, daz $$1, dsh $$2) {
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

   protected void a(drd $$0, daz $$1, io $$2, dea $$3) {
   }

   protected drd a(daz $$0, io $$1, drd $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dsh $$4 = $$2.c(this.c());
         return new dka($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
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
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emx.c;
      drd $$3 = super.n();
      it $$4 = $$0.g();
      boolean $$5 = $$4 == it.f || $$4 == it.e;
      return $$3.a(this.c(), $$5 ? dsh.b : dsh.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dsg<dsh> c();

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(c) ? emx.c.a(false) : super.b_($$0);
   }
}
