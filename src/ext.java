import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ext extends eyb {
   public static final int a = 0;
   public static final MapCodec<ext> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ddy.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fau.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ext::new)
   );
   private final jq<ddy> c;
   private final fat d;
   private final int e;

   ext(List<ezx> $$0, jq<ddy> $$1, fat $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eyd<ext> b() {
      return eye.m;
   }

   @Override
   public Set<bbn<?>> a() {
      return Sets.union(ImmutableSet.of(ezi.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      bvj $$2 = $$1.c(ezi.d);
      if ($$2 instanceof bwf $$3) {
         int $$4 = dea.a(this.c, $$3);
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

   public static ext.a a(js.a $$0, fat $$1) {
      js.b<ddy> $$2 = $$0.d(mb.aO);
      return new ext.a($$2.b(ded.s), $$1);
   }

   public static class a extends eyb.a<ext.a> {
      private final jq<ddy> a;
      private final fat b;
      private int c = 0;

      public a(jq<ddy> $$0, fat $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected ext.a a() {
         return this;
      }

      public ext.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public eyc b() {
         return new ext(this.g(), this.a, this.b, this.c);
      }
   }
}
