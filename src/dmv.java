public enum dmv {
   a {
      @Override
      public boolean a(drx $$0, daz $$1, iz $$2, je $$3) {
         return deu.a($$0.l($$1, $$2), $$3);
      }
   },
   b {
      private final int d = 1;
      private final ewf e = deu.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0);

      @Override
      public boolean a(drx $$0, daz $$1, iz $$2, je $$3) {
         return !ewc.c($$0.l($$1, $$2).a($$3), this.e, evq.c);
      }
   },
   c {
      private final int d = 2;
      private final ewf e = ewc.a(ewc.b(), deu.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0), evq.e);

      @Override
      public boolean a(drx $$0, daz $$1, iz $$2, je $$3) {
         return !ewc.c($$0.l($$1, $$2).a($$3), this.e, evq.c);
      }
   };

   public abstract boolean a(drx var1, daz var2, iz var3, je var4);
}
