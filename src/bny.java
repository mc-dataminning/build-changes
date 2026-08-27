import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bny {
   bnx a();

   static <T> bny.b<T> a(T $$0, int $$1) {
      return new bny.b<>($$0, bnx.a($$1));
   }

   public static class a implements bny {
      private final bnx a;

      public a(int $$0) {
         this.a = bnx.a($$0);
      }

      public a(bnx $$0) {
         this.a = $$0;
      }

      @Override
      public bnx a() {
         return this.a;
      }
   }

   public static class b<T> implements bny {
      private final T a;
      private final bnx b;

      b(T $$0, bnx $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bnx a() {
         return this.b;
      }

      public static <E> Codec<bny.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bny.b::b), bnx.a.fieldOf("weight").forGetter(bny.b::a)).apply($$1, bny.b::new)
         );
      }
   }
}
