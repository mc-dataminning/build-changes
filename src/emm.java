import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class emm extends emi {
   public static final int a = 0;
   public static final Codec<emm> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eor.a.fieldOf("count").forGetter($$0x -> $$0x.c), awe.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, emm::new)
   );
   private final eoq c;
   private final int d;

   emm(List<env> $$0, eoq $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public emk b() {
      return eml.i;
   }

   @Override
   public Set<ene<?>> a() {
      return Sets.union(ImmutableSet.of(enh.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      box $$2 = $$1.c(enh.d);
      if ($$2 instanceof bpp) {
         int $$3 = cux.h((bpp)$$2);
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

   public static emm.a a(eoq $$0) {
      return new emm.a($$0);
   }

   public static class a extends emi.a<emm.a> {
      private final eoq a;
      private int b = 0;

      public a(eoq $$0) {
         this.a = $$0;
      }

      protected emm.a a() {
         return this;
      }

      public emm.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public emj b() {
         return new emm(this.g(), this.a, this.b);
      }
   }
}
