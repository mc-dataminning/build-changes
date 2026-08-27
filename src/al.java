import com.google.gson.JsonObject;

public interface al<T extends am> {
   aer a();

   void a(aez var1, al.a<T> var2);

   void b(aez var1, al.a<T> var2);

   void a(aez var1);

   T a(JsonObject var1, be var2);

   public static class a<T extends am> {
      private final T a;
      private final ae b;
      private final String c;

      public a(T $$0, ae $$1, String $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public T a() {
         return this.a;
      }

      public void a(aez $$0) {
         $$0.a(this.b, this.c);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            al.a<?> $$1 = (al.a<?>)$$0;
            if (!this.a.equals($$1.a)) {
               return false;
            } else {
               return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
            }
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }
   }
}
