import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esa extends erw {
   public static final int a = 0;
   public static final MapCodec<esa> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euq.a.fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.d)))
            .apply($$0, esa::new)
   );
   private final eup c;
   private final int d;

   esa(List<etu> $$0, eup $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ery<esa> b() {
      return erz.m;
   }

   @Override
   public Set<etd<?>> a() {
      return Sets.union(ImmutableSet.of(etg.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      bsw $$2 = $$1.c(etg.d);
      if ($$2 instanceof btr) {
         int $$3 = dad.h((btr)$$2);
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

   public static esa.a a(eup $$0) {
      return new esa.a($$0);
   }

   public static class a extends erw.a<esa.a> {
      private final eup a;
      private int b = 0;

      public a(eup $$0) {
         this.a = $$0;
      }

      protected esa.a a() {
         return this;
      }

      public esa.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public erx b() {
         return new esa(this.g(), this.a, this.b);
      }
   }
}
