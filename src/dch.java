import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dch {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dch.a a(dcn... $$0) {
      return new dch.a(List.of($$0));
   }

   static dch.b a(dco... $$0) {
      return new dch.b(List.of($$0));
   }

   static dch.c a(dcp... $$0) {
      return new dch.c(List.of($$0));
   }

   public static record a(List<dcn> d) implements dcn {
      public static final MapCodec<dch.a> a = dch.a(dcn.b, dch.a::new, dch.a::b);

      @Override
      public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
         for (dcn $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dch.a> a() {
         return a;
      }

      public List<dcn> b() {
         return this.d;
      }
   }

   public static record b(List<dco> b) implements dco {
      public static final MapCodec<dch.b> a = dch.a(dco.c, dch.b::new, dch.b::b);

      @Override
      public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4, boolean $$5) {
         for (dco $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dbv $$0, bui $$1, ezr $$2, int $$3) {
         for (dco $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dch.b> a() {
         return a;
      }
   }

   public static record c(List<dcp> c) implements dcp {
      public static final MapCodec<dch.c> a = dch.a(dcp.b, dch.c::new, dch.c::b);

      @Override
      public float a(int $$0, azv $$1, float $$2) {
         for (dcp $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dch.c> a() {
         return a;
      }

      public List<dcp> b() {
         return this.c;
      }
   }
}
