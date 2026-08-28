public record ddu<T extends ddp<?>>(alf<ddp<?>> b, T c) {
   public static final yw<wj, ddu<?>> a = yw.a(alf.b(mg.bt), ddu::a, ddp.b, ddu::b, ddu::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ddu<?> $$1 && this.b == $$1.b) {
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

   public alf<ddp<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
