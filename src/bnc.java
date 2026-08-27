import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bnc {
   bnb a();

   static <T> bnc.b<T> a(T $$0, int $$1) {
      return new bnc.b<>($$0, bnb.a($$1));
   }

   public static class a implements bnc {
      private final bnb a;

      public a(int $$0) {
         this.a = bnb.a($$0);
      }

      public a(bnb $$0) {
         this.a = $$0;
      }

      @Override
      public bnb a() {
         return this.a;
      }
   }

   public static class b<T> implements bnc {
      private final T a;
      private final bnb b;

      b(T $$0, bnb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bnb a() {
         return this.b;
      }

      public static <E> Codec<bnc.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bnc.b::b), bnb.a.fieldOf("weight").forGetter(bnc.b::a)).apply($$1, bnc.b::new)
         );
      }
   }
}
