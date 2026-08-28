import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;

public interface dbh {
   static <T, A extends T> MapCodec<A> a(Codec<T> $$0, Function<List<T>, A> $$1, Function<A, List<T>> $$2) {
      return RecordCodecBuilder.mapCodec($$3 -> $$3.group($$0.listOf().fieldOf("effects").forGetter($$2)).apply($$3, $$1));
   }

   static dbh.a a(dbn... $$0) {
      return new dbh.a(List.of($$0));
   }

   static dbh.b a(dbo... $$0) {
      return new dbh.b(List.of($$0));
   }

   static dbh.c a(dbp... $$0) {
      return new dbh.c(List.of($$0));
   }

   public static record a(List<dbn> d) implements dbn {
      public static final MapCodec<dbh.a> a = dbh.a(dbn.b, dbh.a::new, dbh.a::b);

      @Override
      public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
         for (dbn $$5 : this.d) {
            $$5.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public MapCodec<dbh.a> a() {
         return a;
      }

      public List<dbn> b() {
         return this.d;
      }
   }

   public static record b(List<dbo> b) implements dbo {
      public static final MapCodec<dbh.b> a = dbh.a(dbo.c, dbh.b::new, dbh.b::b);

      @Override
      public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4, boolean $$5) {
         for (dbo $$6 : this.b) {
            $$6.a($$0, $$1, $$2, $$3, $$4, $$5);
         }
      }

      @Override
      public void a(dav $$0, btj $$1, eye $$2, int $$3) {
         for (dbo $$4 : this.b) {
            $$4.a($$0, $$1, $$2, $$3);
         }
      }

      @Override
      public MapCodec<dbh.b> a() {
         return a;
      }
   }

   public static record c(List<dbp> c) implements dbp {
      public static final MapCodec<dbh.c> a = dbh.a(dbp.b, dbh.c::new, dbh.c::b);

      @Override
      public float a(int $$0, azk $$1, float $$2) {
         for (dbp $$3 : this.c) {
            $$2 = $$3.a($$0, $$1, $$2);
         }

         return $$2;
      }

      @Override
      public MapCodec<dbh.c> a() {
         return a;
      }

      public List<dbp> b() {
         return this.c;
      }
   }
}
