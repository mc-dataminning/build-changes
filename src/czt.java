import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface czt {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static czt.a a(czz... $$0) {
      return new czt.a(List.of($$0));
   }

   static czt.b a(daa... $$0) {
      return new czt.b(List.of($$0));
   }

   static czt.c a(dab... $$0) {
      return new czt.c(List.of($$0));
   }

   public static record a(List<czz> d) implements czz {
      public static final MapCodec<czt.a> a = czt.a(czz.b, czt.a::new, czt.a::b);

      @Override
      public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
         for (czz $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<czt.a> a() {
         return a;
      }

      public List<czz> b() {
         return this.d;
      }
   }

   public static record b(List<daa> b) implements daa {
      public static final MapCodec<czt.b> a = czt.a(daa.c, czt.b::new, czt.b::b);

      @Override
      public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4, boolean $$5) {
         for (daa $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(czi $$0, bsd $$1, evz $$2, int $$3) {
         for (daa $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<czt.b> a() {
         return a;
      }
   }

   public static record c(List<dab> c) implements dab {
      public static final MapCodec<czt.c> a = czt.a(dab.b, czt.c::new, czt.c::b);

      @Override
      public float a(cua $$0, int $$1, aym $$2, float $$3) {
         for (dab $$4 : this.c) {
            $$3 = $$4.a($$0, $$1, $$2, $$3);
         }

         return $$3;
      }

      @Override
      public MapCodec<czt.c> a() {
         return a;
      }

      public List<dab> b() {
         return this.c;
      }
   }
}
