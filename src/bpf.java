import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bpf {
   bpe a();

   static <T> bpf.b<T> a(T $$0, int $$1) {
      return new bpf.b<>($$0, bpe.a($$1));
   }

   public static class a implements bpf {
      private final bpe a;

      public a(int $$0) {
         this.a = bpe.a($$0);
      }

      public a(bpe $$0) {
         this.a = $$0;
      }

      @Override
      public bpe a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bpe b) implements bpf {
      @Override
      public bpe a() {
         return this.b;
      }

      public static <E> Codec<bpf.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bpf.b::b), bpe.a.fieldOf("weight").forGetter(bpf.b::c)).apply($$1, bpf.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bpe c() {
         return this.b;
      }
   }
}
