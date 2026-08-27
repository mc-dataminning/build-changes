import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eeg extends eec {
   public static final int a = 0;
   public static final Codec<eeg> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egl.a.fieldOf("count").forGetter($$0x -> $$0x.c), arg.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eeg::new)
   );
   private final egk c;
   private final int d;

   eeg(List<efp> $$0, egk $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eee b() {
      return eef.i;
   }

   @Override
   public Set<eey<?>> a() {
      return Sets.union(ImmutableSet.of(efb.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      biq $$2 = $$1.c(efb.d);
      if ($$2 instanceof bjg) {
         int $$3 = cnq.h((bjg)$$2);
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

   public static eeg.a a(egk $$0) {
      return new eeg.a($$0);
   }

   public static class a extends eec.a<eeg.a> {
      private final egk a;
      private int b = 0;

      public a(egk $$0) {
         this.a = $$0;
      }

      protected eeg.a a() {
         return this;
      }

      public eeg.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eed b() {
         return new eeg(this.g(), this.a, this.b);
      }
   }
}
