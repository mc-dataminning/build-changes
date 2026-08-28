import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dec {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dec.a a(dei... $$0) {
      return new dec.a(List.of($$0));
   }

   static dec.b a(dej... $$0) {
      return new dec.b(List.of($$0));
   }

   static dec.c a(dek... $$0) {
      return new dec.c(List.of($$0));
   }

   public static record a(List<dei> d) implements dei {
      public static final MapCodec<dec.a> a = dec.a(dei.b, dec.a::new, dec.a::b);

      @Override
      public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
         for (dei $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dec.a> a() {
         return a;
      }

      public List<dei> b() {
         return this.d;
      }
   }

   public static record b(List<dej> b) implements dej {
      public static final MapCodec<dec.b> a = dec.a(dej.c, dec.b::new, dec.b::b);

      @Override
      public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4, boolean $$5) {
         for (dej $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(ddq $$0, bva $$1, fbx $$2, int $$3) {
         for (dej $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dec.b> a() {
         return a;
      }
   }

   public static record c(List<dek> c) implements dek {
      public static final MapCodec<dec.c> a = dec.a(dek.b, dec.c::new, dec.c::b);

      @Override
      public float a(int $$0, azh $$1, float $$2) {
         for (dek $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dec.c> a() {
         return a;
      }

      public List<dek> b() {
         return this.c;
      }
   }
}
