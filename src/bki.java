import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bki {
   bkh a();

   static <T> bki.b<T> a(T $$0, int $$1) {
      return new bki.b<>($$0, bkh.a($$1));
   }

   public static class a implements bki {
      private final bkh a;

      public a(int $$0) {
         this.a = bkh.a($$0);
      }

      public a(bkh $$0) {
         this.a = $$0;
      }

      @Override
      public bkh a() {
         return this.a;
      }
   }

   public static class b<T> implements bki {
      private final T a;
      private final bkh b;

      b(T $$0, bkh $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bkh a() {
         return this.b;
      }

      public static <E> Codec<bki.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bki.b::b), bkh.a.fieldOf("weight").forGetter(bki.b::a)).apply($$1, bki.b::new)
         );
      }
   }
}
