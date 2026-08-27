import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eil extends eih {
   public static final int a = 0;
   public static final Codec<eil> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekq.a.fieldOf("count").forGetter($$0x -> $$0x.c), atv.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eil::new)
   );
   private final ekp c;
   private final int d;

   eil(List<eju> $$0, ekp $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eij b() {
      return eik.i;
   }

   @Override
   public Set<ejd<?>> a() {
      return Sets.union(ImmutableSet.of(ejg.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      blu $$2 = $$1.c(ejg.d);
      if ($$2 instanceof bmk) {
         int $$3 = crk.h((bmk)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.L() > this.d) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static eil.a a(ekp $$0) {
      return new eil.a($$0);
   }

   public static class a extends eih.a<eil.a> {
      private final ekp a;
      private int b = 0;

      public a(ekp $$0) {
         this.a = $$0;
      }

      protected eil.a a() {
         return this;
      }

      public eil.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eii b() {
         return new eil(this.g(), this.a, this.b);
      }
   }
}
