import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbm extends fbu {
   public static final int a = 0;
   public static final MapCodec<fbm> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dgl.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fen.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fbm::new)
   );
   private final jf<dgl> c;
   private final fem d;
   private final int e;

   fbm(List<fdq> $$0, jf<dgl> $$1, fem $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fbw<fbm> b() {
      return fbx.m;
   }

   @Override
   public Set<baz<?>> a() {
      return Sets.union(ImmutableSet.of(fdb.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      bwt $$2 = $$1.c(fdb.d);
      if ($$2 instanceof bxu $$3) {
         int $$4 = dgn.a(this.c, $$3);
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

   public static fbm.a a(jh.a $$0, fem $$1) {
      jh.b<dgl> $$2 = $$0.e(mh.aR);
      return new fbm.a($$2.b(dgq.s), $$1);
   }

   public static class a extends fbu.a<fbm.a> {
      private final jf<dgl> a;
      private final fem b;
      private int c = 0;

      public a(jf<dgl> $$0, fem $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected fbm.a a() {
         return this;
      }

      public fbm.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fbv b() {
         return new fbm(this.g(), this.a, this.b, this.c);
      }
   }
}
