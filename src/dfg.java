public record dfg<T extends dfb<?>>(alq<dfb<?>> b, T c) {
   public static final ze<wp, dfg<?>> a = ze.a(alq.b(mi.bv), dfg::a, dfb.c, dfg::b, dfg::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dfg<?> $$1 && this.b == $$1.b) {
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

   public alq<dfb<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
