import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exm extends exu {
   public static final int a = 0;
   public static final MapCodec<exm> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ddr.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fap.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, exm::new)
   );
   private final jq<ddr> c;
   private final fao d;
   private final int e;

   exm(List<ezs> $$0, jq<ddr> $$1, fao $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exw<exm> b() {
      return exx.m;
   }

   @Override
   public Set<eza<?>> a() {
      return Sets.union(ImmutableSet.of(ezd.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      bvf $$2 = $$1.c(ezd.d);
      if ($$2 instanceof bwb $$3) {
         int $$4 = ddt.a(this.c, $$3);
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

   public static exm.a a(js.a $$0, fao $$1) {
      js.b<ddr> $$2 = $$0.d(mb.aN);
      return new exm.a($$2.b(ddw.s), $$1);
   }

   public static class a extends exu.a<exm.a> {
      private final jq<ddr> a;
      private final fao b;
      private int c = 0;

      public a(jq<ddr> $$0, fao $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected exm.a a() {
         return this;
      }

      public exm.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public exv b() {
         return new exm(this.g(), this.a, this.b, this.c);
      }
   }
}
