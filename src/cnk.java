public abstract class cnk extends cst {
   protected cnk(bwo<? extends cnk> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
   }

   public cnk.a j() {
      return cnk.a.a;
   }

   @Override
   public boolean c(bxe $$0) {
      return $$0 instanceof cqj && $$0.n_() ? false : super.c($$0);
   }

   @Override
   protected boolean t(bwf $$0) {
      if (super.t($$0)) {
         return true;
      } else {
         return !$$0.aq().a(axf.z) ? false : this.cr() == null && $$0.cr() == null;
      }
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;
   }

   protected class b extends ces {
      public b(final cst $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && cnk.this.gF();
      }
   }
}
