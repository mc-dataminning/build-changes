public record dcj<T extends dce<?>>(aly<dce<?>> b, T c) {
   public static final zt<xg, dcj<?>> a = zt.a(aly.b(mb.bk), dcj::a, dce.b, dcj::b, dcj::new);

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dcj<?> $$1 && this.b == $$1.b) {
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

   public aly<dce<?>> a() {
      return this.b;
   }

   public T b() {
      return this.c;
   }
}
