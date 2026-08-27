import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ete extends eta {
   public static final int a = 0;
   public static final Codec<ete> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(evr.a.fieldOf("count").forGetter($$0x -> $$0x.c), axu.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, ete::new)
   );
   private final evq c;
   private final int d;

   ete(List<euu> $$0, evq $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public etc b() {
      return etd.l;
   }

   @Override
   public Set<eud<?>> a() {
      return Sets.union(ImmutableSet.of(eug.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      brv $$2 = $$1.c(eug.d);
      if ($$2 instanceof bso) {
         int $$3 = dae.h((bso)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.G() > this.d) {
            $$0.e(this.d);
         }
      }

      return $$0;
   }

   public static ete.a a(evq $$0) {
      return new ete.a($$0);
   }

   public static class a extends eta.a<ete.a> {
      private final evq a;
      private int b = 0;

      public a(evq $$0) {
         this.a = $$0;
      }

      protected ete.a a() {
         return this;
      }

      public ete.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public etb b() {
         return new ete(this.g(), this.a, this.b);
      }
   }
}
