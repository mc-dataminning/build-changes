public interface dq {
   <T> il<T> a(aix<? extends iv<T>> var1);

   static dq a(final il.b $$0, final cjs $$1) {
      return new dq() {
         @Override
         public <T> il<T> a(aix<? extends iv<T>> $$0x) {
            return $$0.b($$0).a($$1);
         }
      };
   }

   static dq.a a(final iw $$0, final cjs $$1) {
      return new dq.a() {
         dq.b c = dq.b.b;

         @Override
         public void a(dq.b $$0x) {
            this.c = $$0;
         }

         @Override
         public <T> il<T> a(aix<? extends iv<T>> $$0x) {
            iv<T> $$1 = $$0.d($$0);
            final il.c<T> $$2 = $$1.p();
            final il.c<T> $$3 = $$1.u();
            il.c<T> $$4 = new il.c.a<T>() {
               @Override
               protected il.c<T> a() {
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

   public interface a extends dq {
      void a(dq.b var1);
   }

   public static enum b {
      a,
      b;
   }
}
