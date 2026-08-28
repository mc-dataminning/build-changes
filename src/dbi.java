public record dbi<T extends dbd<?>>(aku<dbd<?>> b, T c) {
   public static final yn<wa, dbi<?>> a = yn.a(aku.b(mc.bk), dbi::a, dbd.b, dbi::b, dbi::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbi<?> $$1 && this.b == $$1.b) {
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

   public aku<dbd<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
