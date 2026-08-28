import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dbx {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dbx.a a(dcd... $$0) {
      return new dbx.a(List.of($$0));
   }

   static dbx.b a(dce... $$0) {
      return new dbx.b(List.of($$0));
   }

   static dbx.c a(dcf... $$0) {
      return new dbx.c(List.of($$0));
   }

   public static record a(List<dcd> d) implements dcd {
      public static final MapCodec<dbx.a> a = dbx.a(dcd.b, dbx.a::new, dbx.a::b);

      @Override
      public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
         for (dcd $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dbx.a> a() {
         return a;
      }

      public List<dcd> b() {
         return this.d;
      }
   }

   public static record b(List<dce> b) implements dce {
      public static final MapCodec<dbx.b> a = dbx.a(dce.c, dbx.b::new, dbx.b::b);

      @Override
      public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4, boolean $$5) {
         for (dce $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dbl $$0, btz $$1, ezh $$2, int $$3) {
         for (dce $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dbx.b> a() {
         return a;
      }
   }

   public static record c(List<dcf> c) implements dcf {
      public static final MapCodec<dbx.c> a = dbx.a(dcf.b, dbx.c::new, dbx.c::b);

      @Override
      public float a(int $$0, azr $$1, float $$2) {
         for (dcf $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dbx.c> a() {
         return a;
      }

      public List<dcf> b() {
         return this.c;
      }
   }
}
