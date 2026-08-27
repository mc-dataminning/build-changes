public interface dn {
   <T> ih<T> a(ags<? extends ir<T>> var1);

   static dn a(final ih.b $$0, final chb $$1) {
      return new dn() {
         @Override
         public <T> ih<T> a(ags<? extends ir<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dn.a a(final is $$0, final chb $$1) {
      return new dn.a() {
         dn.b c = dn.b.b;

         @Override
         public void a(dn.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> ih<T> a(ags<? extends ir<T>> $$0x) {
            ir<T> $$1 = $$0.d($$0);
            final ih.c<T> $$2 = $$1.p();
            final ih.c<T> $$3 = $$1.u();
            ih.c<T> $$4 = new ih.c.a<T>() {
               @Override
               protected ih.c<T> a() {
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
