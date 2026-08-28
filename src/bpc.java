import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bpc {
   bpb a();

   static <T> bpc.b<T> a(T $$0, int $$1) {
      return new bpc.b<>($$0, bpb.a($$1));
   }

   public static class a implements bpc {
      private final bpb a;

      public a(int $$0) {
         this.a = bpb.a($$0);
      }

      public a(bpb $$0) {
         this.a = $$0;
      }

      @Override
      public bpb a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bpb b) implements bpc {
      @Override
      public bpb a() {
         return this.b;
      }

      public static <E> Codec<bpc.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bpc.b::b), bpb.a.fieldOf("weight").forGetter(bpc.b::c)).apply($$1, bpc.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bpb c() {
         return this.b;
      }
   }
}
