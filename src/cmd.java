public abstract class cmd extends crk {
   protected cmd(bvq<? extends cmd> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
   }

   public cmd.a m() {
      return cmd.a.a;
   }

   @Override
   public boolean c(bwf $$0) {
      return $$0 instanceof cpd && $$0.e_() ? false : super.c($$0);
   }

   @Override
   protected boolean t(bvj $$0) {
      if (super.t($$0)) {
         return true;
      } else {
         return !$$0.aq().a(axy.z) ? false : this.cr() == null && $$0.cr() == null;
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

   protected class b extends cdv {
      public b(final crk $$1) {
         super($$1, false);
      }

      @Override
      public boolean b() {
         return super.b() && cmd.this.gC();
      }
   }
}
