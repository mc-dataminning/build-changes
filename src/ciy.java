public abstract class ciy extends cnx {
   protected ciy(bsn<? extends ciy> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
   }

   public ciy.a s() {
      return ciy.a.a;
   }

   @Override
   public boolean c(btc $$0) {
      return $$0 instanceof clt && $$0.o_() ? false : super.c($$0);
   }

   @Override
   public boolean s(bsh $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return !$$0.am().a(awa.z) ? false : this.cl() == null && $$0.cl() == null;
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

   protected class b extends cas {
      public b(final cnx $$1) {
         super($$1, false);
      }

      @Override
      public boolean a() {
         return super.a() && ciy.this.gE();
      }
   }
}
