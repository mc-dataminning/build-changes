public abstract class cfg extends cke {
   protected cfg(bpc<? extends cfg> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public cfg.a r() {
      return cfg.a.a;
   }

   @Override
   public boolean c(bpo $$0) {
      return $$0 instanceof cia && $$0.o_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bow $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ai().a(auq.z) ? false : this.cg() == null && $$0.cg() == null;
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

   protected class b extends bxd {
      public b(cke $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cfg.this.gC();
      }
   }
}
