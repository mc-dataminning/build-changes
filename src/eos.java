import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eos extends eoo {
   public static final int a = 0;
   public static final Codec<eos> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eqy.a.fieldOf("count").forGetter($$0x -> $$0x.c), aws.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eos::new)
   );
   private final eqx c;
   private final int d;

   eos(List<eqc> $$0, eqx $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eoq b() {
      return eor.j;
   }

   @Override
   public Set<epl<?>> a() {
      return Sets.union(ImmutableSet.of(epo.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      bpv $$2 = $$1.c(epo.d);
      if ($$2 instanceof bqo) {
         int $$3 = cwr.h((bqo)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.f(Math.round($$4));
         if (this.c() && $$0.G() > this.d) {
            $$0.e(this.d);
         }
      }

      return $$0;
   }

   public static eos.a a(eqx $$0) {
      return new eos.a($$0);
   }

   public static class a extends eoo.a<eos.a> {
      private final eqx a;
      private int b = 0;

      public a(eqx $$0) {
         this.a = $$0;
      }

      protected eos.a a() {
         return this;
      }

      public eos.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eop b() {
         return new eos(this.g(), this.a, this.b);
      }
   }
}
