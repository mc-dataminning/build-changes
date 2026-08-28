import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ety extends eug {
   public static final int a = 0;
   public static final MapCodec<ety> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  daw.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  exb.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ety::new)
   );
   private final jn<daw> c;
   private final exa d;
   private final int e;

   ety(List<ewe> $$0, jn<daw> $$1, exa $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eui<ety> b() {
      return euj.m;
   }

   @Override
   public Set<evm<?>> a() {
      return Sets.union(ImmutableSet.of(evp.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      btj $$2 = $$1.c(evp.d);
      if ($$2 instanceof buf $$3) {
         int $$4 = day.a(this.c, $$3);
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

   public static ety.a a(jp.a $$0, exa $$1) {
      jp.b<daw> $$2 = $$0.b(lv.aL);
      return new ety.a($$2.b(dbb.s), $$1);
   }

   public static class a extends eug.a<ety.a> {
      private final jn<daw> a;
      private final exa b;
      private int c = 0;

      public a(jn<daw> $$0, exa $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected ety.a a() {
         return this;
      }

      public ety.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public euh b() {
         return new ety(this.g(), this.a, this.b, this.c);
      }
   }
}
