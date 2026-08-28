import com.mojang.serialization.Codec;

public interface aq<T extends ar> {
   void a(alk var1, aq.a<T> var2);

   void b(alk var1, aq.a<T> var2);

   void a(alk var1);

   Codec<T> a();

   default ao<T> a(T $$0) {
      return new ao<>(this, $$0);
   }

   public static record a<T extends ar>(T a, ag b, String c) {
      public void a(alk $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
