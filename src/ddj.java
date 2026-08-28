import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface ddj {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static ddj.a a(ddp... $$0) {
      return new ddj.a(List.of($$0));
   }

   static ddj.b a(ddq... $$0) {
      return new ddj.b(List.of($$0));
   }

   static ddj.c a(ddr... $$0) {
      return new ddj.c(List.of($$0));
   }

   public static record a(List<ddp> d) implements ddp {
      public static final MapCodec<ddj.a> a = ddj.a(ddp.b, ddj.a::new, ddj.a::b);

      @Override
      public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
         for (ddp $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<ddj.a> a() {
         return a;
      }

      public List<ddp> b() {
         return this.d;
      }
   }

   public static record b(List<ddq> b) implements ddq {
      public static final MapCodec<ddj.b> a = ddj.a(ddq.c, ddj.b::new, ddj.b::b);

      @Override
      public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4, boolean $$5) {
         for (ddq $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dcx $$0, buk $$1, faz $$2, int $$3) {
         for (ddq $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<ddj.b> a() {
         return a;
      }
   }

   public static record c(List<ddr> c) implements ddr {
      public static final MapCodec<ddj.c> a = ddj.a(ddr.b, ddj.c::new, ddj.c::b);

      @Override
      public float a(int $$0, azh $$1, float $$2) {
         for (ddr $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<ddj.c> a() {
         return a;
      }

      public List<ddr> b() {
         return this.c;
      }
   }
}
