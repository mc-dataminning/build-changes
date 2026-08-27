public abstract class cgy extends clx {
   protected cgy(bqr<? extends cgy> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public cgy.a r() {
      return cgy.a.a;
   }

   @Override
   public boolean c(bre $$0) {
      return $$0 instanceof cjt && $$0.p_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bql $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.ai().a(avr.z) ? false : this.ch() == null && $$0.ch() == null;
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

   protected class b extends byt {
      public b(clx $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && cgy.this.gE();
      }
   }
}
