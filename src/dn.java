public interface dn {
   <T> ij<T> a(ahf<? extends it<T>> var1);

   static dn a(final ij.b $$0, final chr $$1) {
      return new dn() {
         @Override
         public <T> ij<T> a(ahf<? extends it<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dn.a a(final iu $$0, final chr $$1) {
      return new dn.a() {
         dn.b c = dn.b.b;

         @Override
         public void a(dn.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> ij<T> a(ahf<? extends it<T>> $$0x) {
            it<T> $$1 = $$0.d($$0);
            final ij.c<T> $$2 = $$1.p();
            final ij.c<T> $$3 = $$1.u();
            ij.c<T> $$4 = new ij.c.a<T>() {
               @Override
               protected ij.c<T> a() {
                  return switch (c) {
                     case b -> $$2;
                     case a -> $$3;
                  };
               }
            };
            return $$4.a($$1);
         }
      };
   }

   public interface a extends dn {
      void a(dn.b var1);
   }

   public static enum b {
      a,
      b;
   }
}
