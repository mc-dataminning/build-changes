import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eey extends eeu {
   public static final int a = 0;
   public static final Codec<eey> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ehd.a.fieldOf("count").forGetter($$0x -> $$0x.c), asg.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eey::new)
   );
   private final ehc c;
   private final int d;

   eey(List<egh> $$0, ehc $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eew b() {
      return eex.i;
   }

   @Override
   public Set<efq<?>> a() {
      return Sets.union(ImmutableSet.of(eft.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      bjt $$2 = $$1.c(eft.d);
      if ($$2 instanceof bkj) {
         int $$3 = cov.h((bkj)$$2);
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

   public static eey.a a(ehc $$0) {
      return new eey.a($$0);
   }

   public static class a extends eeu.a<eey.a> {
      private final ehc a;
      private int b = 0;

      public a(ehc $$0) {
         this.a = $$0;
      }

      protected eey.a a() {
         return this;
      }

      public eey.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eev b() {
         return new eey(this.g(), this.a, this.b);
      }
   }
}
