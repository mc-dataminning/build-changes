import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eps extends epo {
   public static final int a = 0;
   public static final Codec<eps> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esd.a.fieldOf("count").forGetter($$0x -> $$0x.c), axe.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eps::new)
   );
   private final esc c;
   private final int d;

   eps(List<erh> $$0, esc $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public epq b() {
      return epr.j;
   }

   @Override
   public Set<eqq<?>> a() {
      return Sets.union(ImmutableSet.of(eqt.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      bql $$2 = $$1.c(eqt.d);
      if ($$2 instanceof bre) {
         int $$3 = cxo.h((bre)$$2);
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

   public static eps.a a(esc $$0) {
      return new eps.a($$0);
   }

   public static class a extends epo.a<eps.a> {
      private final esc a;
      private int b = 0;

      public a(esc $$0) {
         this.a = $$0;
      }

      protected eps.a a() {
         return this;
      }

      public eps.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public epp b() {
         return new eps(this.g(), this.a, this.b);
      }
   }
}
