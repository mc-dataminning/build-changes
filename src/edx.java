import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edx extends edt {
   public static final int a = 0;
   public static final Codec<edx> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egc.a.fieldOf("count").forGetter($$0x -> $$0x.c), aqy.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, edx::new)
   );
   private final egb c;
   private final int d;

   edx(List<efg> $$0, egb $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public edv b() {
      return edw.i;
   }

   @Override
   public Set<eep<?>> a() {
      return Sets.union(ImmutableSet.of(ees.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      bii $$2 = $$1.c(ees.d);
      if ($$2 instanceof biy) {
         int $$3 = cnh.h((biy)$$2);
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

   public static edx.a a(egb $$0) {
      return new edx.a($$0);
   }

   public static class a extends edt.a<edx.a> {
      private final egb a;
      private int b = 0;

      public a(egb $$0) {
         this.a = $$0;
      }

      protected edx.a a() {
         return this;
      }

      public edx.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public edu b() {
         return new edx(this.g(), this.a, this.b);
      }
   }
}
