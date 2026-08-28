import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bpe {
   bpd a();

   static <T> bpe.b<T> a(T $$0, int $$1) {
      return new bpe.b<>($$0, bpd.a($$1));
   }

   public static class a implements bpe {
      private final bpd a;

      public a(int $$0) {
         this.a = bpd.a($$0);
      }

      public a(bpd $$0) {
         this.a = $$0;
      }

      @Override
      public bpd a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bpd b) implements bpe {
      @Override
      public bpd a() {
         return this.b;
      }

      public static <E> Codec<bpe.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bpe.b::b), bpd.a.fieldOf("weight").forGetter(bpe.b::c)).apply($$1, bpe.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bpd c() {
         return this.b;
      }
   }
}
