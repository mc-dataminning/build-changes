import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bgn {
   bgm a();

   static <T> bgn.b<T> a(T $$0, int $$1) {
      return new bgn.b<>($$0, bgm.a($$1));
   }

   public static class a implements bgn {
      private final bgm a;

      public a(int $$0) {
         this.a = bgm.a($$0);
      }

      public a(bgm $$0) {
         this.a = $$0;
      }

      @Override
      public bgm a() {
         return this.a;
      }
   }

   public static class b<T> implements bgn {
      private final T a;
      private final bgm b;

      b(T $$0, bgm $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bgm a() {
         return this.b;
      }

      public static <E> Codec<bgn.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bgn.b::b), bgm.a.fieldOf("weight").forGetter(bgn.b::a)).apply($$1, bgn.b::new)
         );
      }
   }
}
