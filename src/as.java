import com.mojang.serialization.Codec;

public interface as<T extends at> {
   void a(alo var1, as.a<T> var2);

   void b(alo var1, as.a<T> var2);

   void a(alo var1);

   Codec<T> a();

   default aq<T> a(T $$0) {
      return new aq<>(this, $$0);
   }

   public static record a<T extends at>(T a, ai b, String c) {
      public void a(alo $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
