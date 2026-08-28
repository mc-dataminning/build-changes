import com.mojang.serialization.Codec;

public interface at<T extends au> {
   void a(alq var1, at.a<T> var2);

   void b(alq var1, at.a<T> var2);

   void a(alq var1);

   Codec<T> a();

   default ar<T> a(T $$0) {
      return new ar<>(this, $$0);
   }

   public static record a<T extends au>(T a, aj b, String c) {
      public void a(alq $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
