import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dfw {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dfw.a a(dgc... $$0) {
      return new dfw.a(List.of($$0));
   }

   static dfw.b a(dgd... $$0) {
      return new dfw.b(List.of($$0));
   }

   static dfw.c a(dge... $$0) {
      return new dfw.c(List.of($$0));
   }

   public static record a(List<dgc> d) implements dgc {
      public static final MapCodec<dfw.a> a = dfw.a(dgc.b, dfw.a::new, dfw.a::b);

      @Override
      public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
         for (dgc $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dfw.a> a() {
         return a;
      }

      public List<dgc> b() {
         return this.d;
      }
   }

   public static record b(List<dgd> b) implements dgd {
      public static final MapCodec<dfw.b> a = dfw.a(dgd.c, dfw.b::new, dfw.b::b);

      @Override
      public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4, boolean $$5) {
         for (dgd $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dfk $$0, bwd $$1, fei $$2, int $$3) {
         for (dgd $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dfw.b> a() {
         return a;
      }
   }

   public static record c(List<dge> c) implements dge {
      public static final MapCodec<dfw.c> a = dfw.a(dge.b, dfw.c::new, dfw.c::b);

      @Override
      public float a(int $$0, azv $$1, float $$2) {
         for (dge $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dfw.c> a() {
         return a;
      }

      public List<dge> b() {
         return this.c;
      }
   }
}
