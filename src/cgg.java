public abstract class cgg extends clf {
   protected cgg(bqb<? extends cgg> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public cgg.a r() {
      return cgg.a.a;
   }

   @Override
   public boolean c(bqo $$0) {
      return $$0 instanceof cjb && $$0.p_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bpv $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ai().a(avf.z) ? false : this.cg() == null && $$0.cg() == null;
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

   protected class b extends byd {
      public b(clf $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cgg.this.gC();
      }
   }
}
