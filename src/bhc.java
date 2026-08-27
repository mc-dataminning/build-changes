import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bhc {
   bhb a();

   static <T> bhc.b<T> a(T $$0, int $$1) {
      return new bhc.b<>($$0, bhb.a($$1));
   }

   public static class a implements bhc {
      private final bhb a;

      public a(int $$0) {
         this.a = bhb.a($$0);
      }

      public a(bhb $$0) {
         this.a = $$0;
      }

      @Override
      public bhb a() {
         return this.a;
      }
   }

   public static class b<T> implements bhc {
      private final T a;
      private final bhb b;

      b(T $$0, bhb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bhb a() {
         return this.b;
      }

      public static <E> Codec<bhc.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bhc.b::b), bhb.a.fieldOf("weight").forGetter(bhc.b::a)).apply($$1, bhc.b::new)
         );
      }
   }
}
