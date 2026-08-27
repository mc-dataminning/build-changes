import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class elo extends elk {
   public static final int a = 0;
   public static final Codec<elo> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ent.a.fieldOf("count").forGetter($$0x -> $$0x.c), avu.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, elo::new)
   );
   private final ens c;
   private final int d;

   elo(List<emx> $$0, ens $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public elm b() {
      return eln.i;
   }

   @Override
   public Set<emg<?>> a() {
      return Sets.union(ImmutableSet.of(emj.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      bof $$2 = $$1.c(emj.d);
      if ($$2 instanceof box) {
         int $$3 = cua.h((box)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.M() > this.d) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static elo.a a(ens $$0) {
      return new elo.a($$0);
   }

   public static class a extends elk.a<elo.a> {
      private final ens a;
      private int b = 0;

      public a(ens $$0) {
         this.a = $$0;
      }

      protected elo.a a() {
         return this;
      }

      public elo.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public ell b() {
         return new elo(this.g(), this.a, this.b);
      }
   }
}
