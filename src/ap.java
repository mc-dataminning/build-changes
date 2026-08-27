import com.mojang.serialization.Codec;

public interface ap<T extends aq> {
   void a(ajk var1, ap.a<T> var2);

   void b(ajk var1, ap.a<T> var2);

   void a(ajk var1);

   Codec<T> a();

   default an<T> a(T $$0) {
      return new an<>(this, $$0);
   }

   public static record a<T extends aq>(T a, af b, String c) {
      public void a(ajk $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
