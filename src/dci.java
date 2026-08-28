public record dci<T extends dcd<?>>(aly<dcd<?>> b, T c) {
   public static final zt<xg, dci<?>> a = zt.a(aly.b(mb.bk), dci::a, dcd.b, dci::b, dci::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dci<?> $$1 && this.b == $$1.b) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   @Override
   public String toString() {
      return this.b.toString();
   }

   public aly<dcd<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
