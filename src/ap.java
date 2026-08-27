import com.mojang.serialization.Codec;

public interface ap<T extends aq> {
   void a(ahl var1, ap.a<T> var2);

   void b(ahl var1, ap.a<T> var2);

   void a(ahl var1);

   Codec<T> a();

   default an<T> a(T $$0) {
      return new an<>(this, $$0);
   }

   public static record a<T extends aq>(T a, af b, String c) {
      public void a(ahl $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
