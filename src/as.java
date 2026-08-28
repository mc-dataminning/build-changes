import com.mojang.serialization.Codec;

public interface as<T extends at> {
   void a(all var1, as.a<T> var2);

   void b(all var1, as.a<T> var2);

   void a(all var1);

   Codec<T> a();

   default aq<T> a(T $$0) {
      return new aq<>(this, $$0);
   }

   public static record a<T extends at>(T a, ai b, String c) {
      public void a(all $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
