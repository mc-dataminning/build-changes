import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fae extends fam {
   public static final int a = 0;
   public static final MapCodec<fae> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dfl.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fdf.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fae::new)
   );
   private final je<dfl> c;
   private final fde d;
   private final int e;

   fae(List<fci> $$0, je<dfl> $$1, fde $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fao<fae> b() {
      return fap.m;
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(ImmutableSet.of(fbt.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      bwd $$2 = $$1.c(fbt.d);
      if ($$2 instanceof bxc $$3) {
         int $$4 = dfn.a(this.c, $$3);
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

   public static fae.a a(jg.a $$0, fde $$1) {
      jg.b<dfl> $$2 = $$0.e(mg.aQ);
      return new fae.a($$2.b(dfq.s), $$1);
   }

   public static class a extends fam.a<fae.a> {
      private final je<dfl> a;
      private final fde b;
      private int c = 0;

      public a(je<dfl> $$0, fde $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected fae.a a() {
         return this;
      }

      public fae.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fan b() {
         return new fae(this.g(), this.a, this.b, this.c);
      }
   }
}
