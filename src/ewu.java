import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewu extends exc {
   public static final int a = 0;
   public static final MapCodec<ewu> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dcx.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  ezv.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ewu::new)
   );
   private final jr<dcx> c;
   private final ezu d;
   private final int e;

   ewu(List<eyy> $$0, jr<dcx> $$1, ezu $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exe<ewu> b() {
      return exf.m;
   }

   @Override
   public Set<bah<?>> a() {
      return Sets.union(ImmutableSet.of(eyj.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      buj $$2 = $$1.c(eyj.d);
      if ($$2 instanceof bvf $$3) {
         int $$4 = dcz.a(this.c, $$3);
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

   public static ewu.a a(jt.a $$0, ezu $$1) {
      jt.b<dcx> $$2 = $$0.d(mc.aO);
      return new ewu.a($$2.b(ddc.s), $$1);
   }

   public static class a extends exc.a<ewu.a> {
      private final jr<dcx> a;
      private final ezu b;
      private int c = 0;

      public a(jr<dcx> $$0, ezu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected ewu.a a() {
         return this;
      }

      public ewu.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public exd b() {
         return new ewu(this.g(), this.a, this.b, this.c);
      }
   }
}
