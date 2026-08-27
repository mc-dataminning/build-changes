import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eeb extends edx {
   public static final int a = 0;
   public static final Codec<eeb> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egg.a.fieldOf("count").forGetter($$0x -> $$0x.c), arb.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eeb::new)
   );
   private final egf c;
   private final int d;

   eeb(List<efk> $$0, egf $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public edz b() {
      return eea.i;
   }

   @Override
   public Set<eet<?>> a() {
      return Sets.union(ImmutableSet.of(eew.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      bil $$2 = $$1.c(eew.d);
      if ($$2 instanceof bjb) {
         int $$3 = cnl.h((bjb)$$2);
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

   public static eeb.a a(egf $$0) {
      return new eeb.a($$0);
   }

   public static class a extends edx.a<eeb.a> {
      private final egf a;
      private int b = 0;

      public a(egf $$0) {
         this.a = $$0;
      }

      protected eeb.a a() {
         return this;
      }

      public eeb.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public edy b() {
         return new eeb(this.g(), this.a, this.b);
      }
   }
}
