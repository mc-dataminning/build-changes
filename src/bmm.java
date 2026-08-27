import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bmm {
   bml a();

   static <T> bmm.b<T> a(T $$0, int $$1) {
      return new bmm.b<>($$0, bml.a($$1));
   }

   public static class a implements bmm {
      private final bml a;

      public a(int $$0) {
         this.a = bml.a($$0);
      }

      public a(bml $$0) {
         this.a = $$0;
      }

      @Override
      public bml a() {
         return this.a;
      }
   }

   public static class b<T> implements bmm {
      private final T a;
      private final bml b;

      b(T $$0, bml $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bml a() {
         return this.b;
      }

      public static <E> Codec<bmm.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bmm.b::b), bml.a.fieldOf("weight").forGetter(bmm.b::a)).apply($$1, bmm.b::new)
         );
      }
   }
}
