import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bfm {
   bfl a();

   static <T> bfm.b<T> a(T $$0, int $$1) {
      return new bfm.b<>($$0, bfl.a($$1));
   }

   public static class a implements bfm {
      private final bfl a;

      public a(int $$0) {
         this.a = bfl.a($$0);
      }

      public a(bfl $$0) {
         this.a = $$0;
      }

      @Override
      public bfl a() {
         return this.a;
      }
   }

   public static class b<T> implements bfm {
      private final T a;
      private final bfl b;

      b(T $$0, bfl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bfl a() {
         return this.b;
      }

      public static <E> Codec<bfm.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bfm.b::b), bfl.a.fieldOf("weight").forGetter(bfm.b::a)).apply($$1, bfm.b::new)
         );
      }
   }
}
