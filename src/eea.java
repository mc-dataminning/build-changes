import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eea extends edw {
   public static final int a = 0;
   public static final Codec<eea> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egf.a.fieldOf("count").forGetter($$0x -> $$0x.c), arj.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eea::new)
   );
   private final ege c;
   private final int d;

   eea(List<efj> $$0, ege $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public edy b() {
      return edz.i;
   }

   @Override
   public Set<ees<?>> a() {
      return Sets.union(ImmutableSet.of(eev.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      biw $$2 = $$1.c(eev.d);
      if ($$2 instanceof bjm) {
         int $$3 = cnw.h((bjm)$$2);
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

   public static eea.a a(ege $$0) {
      return new eea.a($$0);
   }

   public static class a extends edw.a<eea.a> {
      private final ege a;
      private int b = 0;

      public a(ege $$0) {
         this.a = $$0;
      }

      protected eea.a a() {
         return this;
      }

      public eea.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public edx b() {
         return new eea(this.g(), this.a, this.b);
      }
   }
}
