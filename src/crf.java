import javax.annotation.Nullable;

public abstract class crf extends crx {
   public static final dfs a = cwd.aC;
   public static final dfp b = dfo.r;

   protected crf(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         this.a($$1, $$2, $$3);
         return bgo.b;
      }
   }

   protected abstract void a(cpk var1, gv var2, cbl var3);

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.g().g());
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof dbz) {
            ((dbz)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof dbz) {
            if ($$1 instanceof aki) {
               bgk.a($$1, $$2, (dbz)$$5);
               ((dbz)$$5).a((aki)$$1, ehf.b($$2));
            }

            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return cec.a($$1.c_($$2));
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dck> dcl<T> a(cpk $$0, dcm<T> $$1, dcm<? extends dbz> $$2) {
      return $$0.B ? null : a($$1, $$2, dbz::a);
   }
}
