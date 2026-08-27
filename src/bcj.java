import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bcj {
   bci a();

   static <T> bcj.b<T> a(T $$0, int $$1) {
      return new bcj.b<>($$0, bci.a($$1));
   }

   public static class a implements bcj {
      private final bci a;

      public a(int $$0) {
         this.a = bci.a($$0);
      }

      public a(bci $$0) {
         this.a = $$0;
      }

      @Override
      public bci a() {
         return this.a;
      }
   }

   public static class b<T> implements bcj {
      private final T a;
      private final bci b;

      b(T $$0, bci $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bci a() {
         return this.b;
      }

      public static <E> Codec<bcj.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bcj.b::b), bci.a.fieldOf("weight").forGetter(bcj.b::a)).apply($$1, bcj.b::new)
         );
      }
   }
}
