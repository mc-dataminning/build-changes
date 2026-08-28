import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evh extends evp {
   public static final int a = 0;
   public static final MapCodec<evh> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dbs.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  eyk.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, evh::new)
   );
   private final jq<dbs> c;
   private final eyj d;
   private final int e;

   evh(List<exn> $$0, jq<dbs> $$1, eyj $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public evr<evh> b() {
      return evs.m;
   }

   @Override
   public Set<ewv<?>> a() {
      return Sets.union(ImmutableSet.of(ewy.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      bue $$2 = $$1.c(ewy.d);
      if ($$2 instanceof bva $$3) {
         int $$4 = dbu.a(this.c, $$3);
         if ($$4 == 0) {
            return $$0;
         }

         float $$5 = (float)$$4 * this.d.b($$1);
         $$0.g(Math.round($$5));
         if (this.c()) {
            $$0.f(this.e);
         }
      }

      return $$0;
   }

   public static evh.a a(js.a $$0, eyj $$1) {
      js.b<dbs> $$2 = $$0.d(lz.aM);
      return new evh.a($$2.b(dbx.s), $$1);
   }

   public static class a extends evp.a<evh.a> {
      private final jq<dbs> a;
      private final eyj b;
      private int c = 0;

      public a(jq<dbs> $$0, eyj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected evh.a a() {
         return this;
      }

      public evh.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public evq b() {
         return new evh(this.g(), this.a, this.b, this.c);
      }
   }
}
