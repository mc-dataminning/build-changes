import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fam extends fau {
   public static final int a = 0;
   public static final MapCodec<fam> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dfq.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fdn.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fam::new)
   );
   private final je<dfq> c;
   private final fdm d;
   private final int e;

   fam(List<fcq> $$0, je<dfq> $$1, fdm $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public faw<fam> b() {
      return fax.m;
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(ImmutableSet.of(fcb.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      bwf $$2 = $$1.c(fcb.d);
      if ($$2 instanceof bxe $$3) {
         int $$4 = dfs.a(this.c, $$3);
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

   public static fam.a a(jg.a $$0, fdm $$1) {
      jg.b<dfq> $$2 = $$0.e(mg.aR);
      return new fam.a($$2.b(dfv.s), $$1);
   }

   public static class a extends fau.a<fam.a> {
      private final je<dfq> a;
      private final fdm b;
      private int c = 0;

      public a(je<dfq> $$0, fdm $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected fam.a a() {
         return this;
      }

      public fam.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fav b() {
         return new fam(this.g(), this.a, this.b, this.c);
      }
   }
}
