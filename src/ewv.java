import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewv extends exd {
   public static final int a = 0;
   public static final MapCodec<ewv> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dcy.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  ezw.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ewv::new)
   );
   private final jr<dcy> c;
   private final ezv d;
   private final int e;

   ewv(List<eyz> $$0, jr<dcy> $$1, ezv $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exf<ewv> b() {
      return exg.m;
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(ImmutableSet.of(eyk.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      buk $$2 = $$1.c(eyk.d);
      if ($$2 instanceof bvg $$3) {
         int $$4 = dda.a(this.c, $$3);
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

   public static ewv.a a(jt.a $$0, ezv $$1) {
      jt.b<dcy> $$2 = $$0.d(mc.aO);
      return new ewv.a($$2.b(ddd.s), $$1);
   }

   public static class a extends exd.a<ewv.a> {
      private final jr<dcy> a;
      private final ezv b;
      private int c = 0;

      public a(jr<dcy> $$0, ezv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected ewv.a a() {
         return this;
      }

      public ewv.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public exe b() {
         return new ewv(this.g(), this.a, this.b, this.c);
      }
   }
}
