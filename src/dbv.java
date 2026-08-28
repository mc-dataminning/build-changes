import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dbv {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dbv.a a(dcb... $$0) {
      return new dbv.a(List.of($$0));
   }

   static dbv.b a(dcc... $$0) {
      return new dbv.b(List.of($$0));
   }

   static dbv.c a(dcd... $$0) {
      return new dbv.c(List.of($$0));
   }

   public static record a(List<dcb> d) implements dcb {
      public static final MapCodec<dbv.a> a = dbv.a(dcb.b, dbv.a::new, dbv.a::b);

      @Override
      public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
         for (dcb $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dbv.a> a() {
         return a;
      }

      public List<dcb> b() {
         return this.d;
      }
   }

   public static record b(List<dcc> b) implements dcc {
      public static final MapCodec<dbv.b> a = dbv.a(dcc.c, dbv.b::new, dbv.b::b);

      @Override
      public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4, boolean $$5) {
         for (dcc $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dbj $$0, bto $$1, eys $$2, int $$3) {
         for (dcc $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dbv.b> a() {
         return a;
      }
   }

   public static record c(List<dcd> c) implements dcd {
      public static final MapCodec<dbv.c> a = dbv.a(dcd.b, dbv.c::new, dbv.c::b);

      @Override
      public float a(int $$0, azl $$1, float $$2) {
         for (dcd $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dbv.c> a() {
         return a;
      }

      public List<dcd> b() {
         return this.c;
      }
   }
}
