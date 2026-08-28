public abstract class cjj extends coi {
   protected cjj(bsz<? extends cjj> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public cjj.a s() {
      return cjj.a.a;
   }

   @Override
   public boolean c(bto $$0) {
      return $$0 instanceof cme && $$0.p_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bst $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ak().a(aws.z) ? false : this.cj() == null && $$0.cj() == null;
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

   protected class b extends cbe {
      public b(final coi $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cjj.this.gH();
      }
   }
}
