import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eei extends eee {
   public static final int a = 0;
   public static final Codec<eei> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egn.a.fieldOf("count").forGetter($$0x -> $$0x.c), arh.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eei::new)
   );
   private final egm c;
   private final int d;

   eei(List<efr> $$0, egm $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eeg b() {
      return eeh.i;
   }

   @Override
   public Set<efa<?>> a() {
      return Sets.union(ImmutableSet.of(efd.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      bis $$2 = $$1.c(efd.d);
      if ($$2 instanceof bji) {
         int $$3 = cns.h((bji)$$2);
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

   public static eei.a a(egm $$0) {
      return new eei.a($$0);
   }

   public static class a extends eee.a<eei.a> {
      private final egm a;
      private int b = 0;

      public a(egm $$0) {
         this.a = $$0;
      }

      protected eei.a a() {
         return this;
      }

      public eei.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eef b() {
         return new eei(this.g(), this.a, this.b);
      }
   }
}
