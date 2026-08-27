public abstract class chu extends cmt {
   protected chu(brn<? extends chu> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public chu.a r() {
      return chu.a.a;
   }

   @Override
   public boolean c(bsa $$0) {
      return $$0 instanceof ckp && $$0.p_() ? false : super.c($$0);
   }

   @Override
   public boolean s(brh $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ai().a(avu.z) ? false : this.ch() == null && $$0.ch() == null;
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

   protected class b extends bzp {
      public b(cmt $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && chu.this.gE();
      }
   }
}
