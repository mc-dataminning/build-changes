public abstract class cji extends coh {
   protected cji(bsw<? extends cji> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public cji.a s() {
      return cji.a.a;
   }

   @Override
   public boolean c(btl $$0) {
      return $$0 instanceof cmd && $$0.o_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bsq $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.am().a(awh.z) ? false : this.ck() == null && $$0.ck() == null;
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

   protected class b extends cbc {
      public b(final coh $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && cji.this.gD();
      }
   }
}
