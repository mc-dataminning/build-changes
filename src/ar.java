import com.mojang.serialization.Codec;

public interface ar<T extends as> {
   void a(alq var1, ar.a<T> var2);

   void b(alq var1, ar.a<T> var2);

   void a(alq var1);

   Codec<T> a();

   default ap<T> a(T $$0) {
      return new ap<>(this, $$0);
   }

   public static record a<T extends as>(T a, ah b, String c) {
      public void a(alq $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
