import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqa extends epw {
   public static final int a = 0;
   public static final Codec<eqa> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esm.a.fieldOf("count").forGetter($$0x -> $$0x.c), axh.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eqa::new)
   );
   private final esl c;
   private final int d;

   eqa(List<erq> $$0, esl $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public epy b() {
      return epz.l;
   }

   @Override
   public Set<eqz<?>> a() {
      return Sets.union(ImmutableSet.of(erc.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      brh $$2 = $$1.c(erc.d);
      if ($$2 instanceof bsa) {
         int $$3 = cyh.h((bsa)$$2);
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

   public static eqa.a a(esl $$0) {
      return new eqa.a($$0);
   }

   public static class a extends epw.a<eqa.a> {
      private final esl a;
      private int b = 0;

      public a(esl $$0) {
         this.a = $$0;
      }

      protected eqa.a a() {
         return this;
      }

      public eqa.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public epx b() {
         return new eqa(this.g(), this.a, this.b);
      }
   }
}
