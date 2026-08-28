import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dgl {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dgl.a a(dgr... $$0) {
      return new dgl.a(List.of($$0));
   }

   static dgl.b a(dgs... $$0) {
      return new dgl.b(List.of($$0));
   }

   static dgl.c a(dgt... $$0) {
      return new dgl.c(List.of($$0));
   }

   public static record a(List<dgr> d) implements dgr {
      public static final MapCodec<dgl.a> a = dgl.a(dgr.b, dgl.a::new, dgl.a::b);

      @Override
      public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
         for (dgr $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dgl.a> a() {
         return a;
      }

      public List<dgr> b() {
         return this.d;
      }
   }

   public static record b(List<dgs> b) implements dgs {
      public static final MapCodec<dgl.b> a = dgl.a(dgs.c, dgl.b::new, dgl.b::b);

      @Override
      public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4, boolean $$5) {
         for (dgs $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dfz $$0, bwi $$1, ffc $$2, int $$3) {
         for (dgs $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dgl.b> a() {
         return a;
      }
   }

   public static record c(List<dgt> c) implements dgt {
      public static final MapCodec<dgl.c> a = dgl.a(dgt.b, dgl.c::new, dgl.c::b);

      @Override
      public float a(int $$0, azv $$1, float $$2) {
         for (dgt $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dgl.c> a() {
         return a;
      }

      public List<dgt> b() {
         return this.c;
      }
   }
}
