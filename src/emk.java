import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class emk extends emg {
   public static final int a = 0;
   public static final Codec<emk> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eop.a.fieldOf("count").forGetter($$0x -> $$0x.c), awe.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, emk::new)
   );
   private final eoo c;
   private final int d;

   emk(List<ent> $$0, eoo $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public emi b() {
      return emj.i;
   }

   @Override
   public Set<enc<?>> a() {
      return Sets.union(ImmutableSet.of(enf.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      bow $$2 = $$1.c(enf.d);
      if ($$2 instanceof bpo) {
         int $$3 = cuv.h((bpo)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.M() > this.d) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static emk.a a(eoo $$0) {
      return new emk.a($$0);
   }

   public static class a extends emg.a<emk.a> {
      private final eoo a;
      private int b = 0;

      public a(eoo $$0) {
         this.a = $$0;
      }

      protected emk.a a() {
         return this;
      }

      public emk.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public emh b() {
         return new emk(this.g(), this.a, this.b);
      }
   }
}
