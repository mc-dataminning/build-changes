import javax.annotation.Nullable;

public abstract class crz extends csk {
   protected static final ehy a = csk.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ehy b = csk.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eha c = new eha(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   private final dfn d;

   protected crz(dex.d $$0, dfn $$1) {
      super($$0.a($$1.d()));
      this.d = $$1;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int a() {
      return 20;
   }

   @Override
   public boolean a(dey $$0) {
      return true;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == hb.a && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, hb.b);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable big $$0, cpk $$1, gv $$2, dey $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dey $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.i(), aov.e);
         $$1.a($$0, dji.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.j(), aov.e);
         $$1.a($$0, dji.a, $$2);
      }

      if ($$7) {
         $$1.a(new gv($$2), this, this.a());
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cpk $$0, gv $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$3 == hb.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   protected static int a(cpk $$0, eha $$1, Class<? extends big> $$2) {
      return $$0.a($$2, $$1, bij.f.and($$0x -> !$$0x.d_())).size();
   }

   protected abstract int b(cpk var1, gv var2);

   protected abstract int g(dey var1);

   protected abstract dey a(dey var1, int var2);
}
