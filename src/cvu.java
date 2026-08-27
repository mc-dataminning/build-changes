public record cvu<T extends cvs<?>>(ajv b, T c) {
   public static final yg<vt, cvu<?>> a = yg.a(ajv.b, cvu::a, cvs.i, cvu::b, cvu::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cvu<?> $$1 && this.b.equals($$1.b)) {
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

   public ajv a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
