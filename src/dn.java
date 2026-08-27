public interface dn {
   <T> hg<T> a(aev<? extends hq<T>> var1);

   static dn a(final hg.b $$0, final cec $$1) {
      return new dn() {
         @Override
         public <T> hg<T> a(aev<? extends hq<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dn.a a(final hr $$0, final cec $$1) {
      return new dn.a() {
         dn.b c = dn.b.b;

         @Override
         public void a(dn.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> hg<T> a(aev<? extends hq<T>> $$0x) {
            hq<T> $$1 = $$0.d($$0);
            final hg.c<T> $$2 = $$1.p();
            final hg.c<T> $$3 = $$1.u();
            hg.c<T> $$4 = new hg.c.a<T>() {
               @Override
               protected hg.c<T> a() {
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
