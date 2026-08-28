import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ezs extends faa {
   public static final int a = 0;
   public static final MapCodec<ezs> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dff.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fct.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ezs::new)
   );
   private final je<dff> c;
   private final fcs d;
   private final int e;

   ezs(List<fbw> $$0, je<dff> $$1, fcs $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fac<ezs> b() {
      return fad.m;
   }

   @Override
   public Set<bav<?>> a() {
      return Sets.union(ImmutableSet.of(fbh.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      bwa $$2 = $$1.c(fbh.d);
      if ($$2 instanceof bwz $$3) {
         int $$4 = dfh.a(this.c, $$3);
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

   public static ezs.a a(jg.a $$0, fcs $$1) {
      jg.b<dff> $$2 = $$0.e(mg.aP);
      return new ezs.a($$2.b(dfk.s), $$1);
   }

   public static class a extends faa.a<ezs.a> {
      private final je<dff> a;
      private final fcs b;
      private int c = 0;

      public a(je<dff> $$0, fcs $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected ezs.a a() {
         return this;
      }

      public ezs.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fab b() {
         return new ezs(this.g(), this.a, this.b, this.c);
      }
   }
}
