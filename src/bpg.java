import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bpg {
   bpf a();

   static <T> bpg.b<T> a(T $$0, int $$1) {
      return new bpg.b<>($$0, bpf.a($$1));
   }

   public static class a implements bpg {
      private final bpf a;

      public a(int $$0) {
         this.a = bpf.a($$0);
      }

      public a(bpf $$0) {
         this.a = $$0;
      }

      @Override
      public bpf a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bpf b) implements bpg {
      @Override
      public bpf a() {
         return this.b;
      }

      public static <E> Codec<bpg.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bpg.b::b), bpf.a.fieldOf("weight").forGetter(bpg.b::c)).apply($$1, bpg.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bpf c() {
         return this.b;
      }
   }
}
