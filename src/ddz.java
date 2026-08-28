public record ddz<T extends ddu<?>>(alf<ddu<?>> b, T c) {
   public static final yw<wj, ddz<?>> a = yw.a(alf.b(mg.bu), ddz::a, ddu.b, ddz::b, ddz::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ddz<?> $$1 && this.b == $$1.b) {
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

   public alf<ddu<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
