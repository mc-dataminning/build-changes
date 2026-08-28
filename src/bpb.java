import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bpb {
   bpa a();

   static <T> bpb.b<T> a(T $$0, int $$1) {
      return new bpb.b<>($$0, bpa.a($$1));
   }

   public static class a implements bpb {
      private final bpa a;

      public a(int $$0) {
         this.a = bpa.a($$0);
      }

      public a(bpa $$0) {
         this.a = $$0;
      }

      @Override
      public bpa a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bpa b) implements bpb {
      @Override
      public bpa a() {
         return this.b;
      }

      public static <E> Codec<bpb.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bpb.b::b), bpa.a.fieldOf("weight").forGetter(bpb.b::c)).apply($$1, bpb.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bpa c() {
         return this.b;
      }
   }
}
