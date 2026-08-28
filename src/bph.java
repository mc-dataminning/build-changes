import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bph {
   bpg a();

   static <T> bph.b<T> a(T $$0, int $$1) {
      return new bph.b<>($$0, bpg.a($$1));
   }

   public static class a implements bph {
      private final bpg a;

      public a(int $$0) {
         this.a = bpg.a($$0);
      }

      public a(bpg $$0) {
         this.a = $$0;
      }

      @Override
      public bpg a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bpg b) implements bph {
      @Override
      public bpg a() {
         return this.b;
      }

      public static <E> Codec<bph.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bph.b::b), bpg.a.fieldOf("weight").forGetter(bph.b::c)).apply($$1, bph.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bpg c() {
         return this.b;
      }
   }
}
