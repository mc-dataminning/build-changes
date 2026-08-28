import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewx extends exf {
   public static final int a = 0;
   public static final MapCodec<ewx> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dda.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  ezy.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ewx::new)
   );
   private final jr<dda> c;
   private final ezx d;
   private final int e;

   ewx(List<ezb> $$0, jr<dda> $$1, ezx $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exh<ewx> b() {
      return exi.m;
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(ImmutableSet.of(eym.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      bum $$2 = $$1.c(eym.d);
      if ($$2 instanceof bvi $$3) {
         int $$4 = ddc.a(this.c, $$3);
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

   public static ewx.a a(jt.a $$0, ezx $$1) {
      jt.b<dda> $$2 = $$0.d(mc.aO);
      return new ewx.a($$2.b(ddf.s), $$1);
   }

   public static class a extends exf.a<ewx.a> {
      private final jr<dda> a;
      private final ezx b;
      private int c = 0;

      public a(jr<dda> $$0, ezx $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected ewx.a a() {
         return this;
      }

      public ewx.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public exg b() {
         return new ewx(this.g(), this.a, this.b, this.c);
      }
   }
}
