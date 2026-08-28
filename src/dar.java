public record dar<T extends dap<?>>(ali b, T c) {
   public static final zg<wt, dar<?>> a = zg.a(ali.b, dar::a, dap.i, dar::b, dar::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dar<?> $$1 && this.b.equals($$1.b)) {
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

   public ali a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
