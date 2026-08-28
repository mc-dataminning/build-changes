import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ery extends eru {
   public static final int a = 0;
   public static final MapCodec<ery> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euo.a.fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.d)))
            .apply($$0, ery::new)
   );
   private final eun c;
   private final int d;

   ery(List<ets> $$0, eun $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public erw<ery> b() {
      return erx.m;
   }

   @Override
   public Set<etb<?>> a() {
      return Sets.union(ImmutableSet.of(ete.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      bsu $$2 = $$1.c(ete.d);
      if ($$2 instanceof btp) {
         int $$3 = dab.h((btp)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c()) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static ery.a a(eun $$0) {
      return new ery.a($$0);
   }

   public static class a extends eru.a<ery.a> {
      private final eun a;
      private int b = 0;

      public a(eun $$0) {
         this.a = $$0;
      }

      protected ery.a a() {
         return this;
      }

      public ery.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public erv b() {
         return new ery(this.g(), this.a, this.b);
      }
   }
}
