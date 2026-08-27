import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bmr {
   bmq a();

   static <T> bmr.b<T> a(T $$0, int $$1) {
      return new bmr.b<>($$0, bmq.a($$1));
   }

   public static class a implements bmr {
      private final bmq a;

      public a(int $$0) {
         this.a = bmq.a($$0);
      }

      public a(bmq $$0) {
         this.a = $$0;
      }

      @Override
      public bmq a() {
         return this.a;
      }
   }

   public static class b<T> implements bmr {
      private final T a;
      private final bmq b;

      b(T $$0, bmq $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bmq a() {
         return this.b;
      }

      public static <E> Codec<bmr.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bmr.b::b), bmq.a.fieldOf("weight").forGetter(bmr.b::a)).apply($$1, bmr.b::new)
         );
      }
   }
}
