import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fat extends fbb {
   public static final int a = 0;
   public static final MapCodec<fat> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dfx.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fdu.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fat::new)
   );
   private final jf<dfx> c;
   private final fdt d;
   private final int e;

   fat(List<fcx> $$0, jf<dfx> $$1, fdt $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fbd<fat> b() {
      return fbe.m;
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(ImmutableSet.of(fci.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      bwi $$2 = $$1.c(fci.d);
      if ($$2 instanceof bxj $$3) {
         int $$4 = dfz.a(this.c, $$3);
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

   public static fat.a a(jh.a $$0, fdt $$1) {
      jh.b<dfx> $$2 = $$0.e(mh.aR);
      return new fat.a($$2.b(dgc.s), $$1);
   }

   public static class a extends fbb.a<fat.a> {
      private final jf<dfx> a;
      private final fdt b;
      private int c = 0;

      public a(jf<dfx> $$0, fdt $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected fat.a a() {
         return this;
      }

      public fat.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fbc b() {
         return new fat(this.g(), this.a, this.b, this.c);
      }
   }
}
