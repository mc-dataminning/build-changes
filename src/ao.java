import com.google.gson.JsonObject;

public interface ao<T extends ap> {
   void a(agu var1, ao.a<T> var2);

   void b(agu var1, ao.a<T> var2);

   void a(agu var1);

   T a(JsonObject var1, bg var2);

   default am<T> a(T $$0) {
      return new am<>(this, $$0);
   }

   public static record a<T extends ap>(T a, af b, String c) {
      public void a(agu $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
