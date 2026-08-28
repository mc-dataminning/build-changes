import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface ddl {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static ddl.a a(ddr... $$0) {
      return new ddl.a(List.of($$0));
   }

   static ddl.b a(dds... $$0) {
      return new ddl.b(List.of($$0));
   }

   static ddl.c a(ddt... $$0) {
      return new ddl.c(List.of($$0));
   }

   public static record a(List<ddr> d) implements ddr {
      public static final MapCodec<ddl.a> a = ddl.a(ddr.b, ddl.a::new, ddl.a::b);

      @Override
      public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
         for (ddr $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<ddl.a> a() {
         return a;
      }

      public List<ddr> b() {
         return this.d;
      }
   }

   public static record b(List<dds> b) implements dds {
      public static final MapCodec<ddl.b> a = ddl.a(dds.c, ddl.b::new, ddl.b::b);

      @Override
      public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4, boolean $$5) {
         for (dds $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dcz $$0, bum $$1, fbb $$2, int $$3) {
         for (dds $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<ddl.b> a() {
         return a;
      }
   }

   public static record c(List<ddt> c) implements ddt {
      public static final MapCodec<ddl.c> a = ddl.a(ddt.b, ddl.c::new, ddl.c::b);

      @Override
      public float a(int $$0, azh $$1, float $$2) {
         for (ddt $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<ddl.c> a() {
         return a;
      }

      public List<ddt> b() {
         return this.c;
      }
   }
}
