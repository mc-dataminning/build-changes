public interface dn {
   <T> hi<T> a(aew<? extends ht<T>> var1);

   static dn a(final hi.b $$0, final cec $$1) {
      return new dn() {
         @Override
         public <T> hi<T> a(aew<? extends ht<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dn.a a(final hu $$0, final cec $$1) {
      return new dn.a() {
         dn.b c = dn.b.b;

         @Override
         public void a(dn.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> hi<T> a(aew<? extends ht<T>> $$0x) {
            ht<T> $$1 = $$0.d($$0);
            final hi.c<T> $$2 = $$1.p();
            final hi.c<T> $$3 = $$1.u();
            hi.c<T> $$4 = new hi.c.a<T>() {
               @Override
               protected hi.c<T> a() {
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
