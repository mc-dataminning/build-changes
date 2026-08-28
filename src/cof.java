public abstract class cof extends cto {
   protected cof(bxc<? extends cof> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
   }

   public cof.a j() {
      return cof.a.a;
   }

   @Override
   public boolean c(bxu $$0) {
      return $$0 instanceof cre && $$0.n_() ? false : super.c($$0);
   }

   @Override
   protected boolean t(bwt $$0) {
      if (super.t($$0)) {
         return true;
      } else {
         return !$$0.an().a(axh.z) ? false : this.cq() == null && $$0.cq() == null;
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

   protected class b extends cfi {
      public b(final cto $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && cof.this.gI();
      }
   }
}
