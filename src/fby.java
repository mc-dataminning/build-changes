import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fby extends fcg {
   public static final int a = 0;
   public static final MapCodec<fby> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dgx.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fez.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fby::new)
   );
   private final jg<dgx> c;
   private final fey d;
   private final int e;

   fby(List<fec> $$0, jg<dgx> $$1, fey $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fci<fby> b() {
      return fcj.m;
   }

   @Override
   public Set<bbk<?>> a() {
      return Sets.union(ImmutableSet.of(fdn.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      bxe $$2 = $$1.c(fdn.d);
      if ($$2 instanceof byf $$3) {
         int $$4 = dgz.a(this.c, $$3);
         if ($$4 == 0) {
            return $$0;
         }

         float $$5 = (float)$$4 * this.d.b($$1);
         $$0.g(Math.round($$5));
         if (this.c()) {
            $$0.f(this.e);
         }
      }

      return $$0;
   }

   public static fby.a a(ji.a $$0, fey $$1) {
      ji.b<dgx> $$2 = $$0.e(mi.aR);
      return new fby.a($$2.b(dhc.s), $$1);
   }

   public static class a extends fcg.a<fby.a> {
      private final jg<dgx> a;
      private final fey b;
      private int c = 0;

      public a(jg<dgx> $$0, fey $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected fby.a a() {
         return this;
      }

      public fby.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fch b() {
         return new fby(this.g(), this.a, this.b, this.c);
      }
   }
}
