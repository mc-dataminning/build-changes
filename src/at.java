import com.mojang.serialization.Codec;

public interface at<T extends au> {
   void a(als var1, at.a<T> var2);

   void b(als var1, at.a<T> var2);

   void a(als var1);

   Codec<T> a();

   default ar<T> a(T $$0) {
      return new ar<>(this, $$0);
   }

   public static record a<T extends au>(T a, aj b, String c) {
      public void a(als $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
