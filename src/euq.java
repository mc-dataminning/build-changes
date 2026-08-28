import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class euq extends euy {
   public static final int a = 0;
   public static final MapCodec<euq> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dbn.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  ext.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, euq::new)
   );
   private final jo<dbn> c;
   private final exs d;
   private final int e;

   euq(List<eww> $$0, jo<dbn> $$1, exs $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eva<euq> b() {
      return evb.m;
   }

   @Override
   public Set<ewe<?>> a() {
      return Sets.union(ImmutableSet.of(ewh.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      btr $$2 = $$1.c(ewh.d);
      if ($$2 instanceof bun $$3) {
         int $$4 = dbp.a(this.c, $$3);
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

   public static euq.a a(jq.a $$0, exs $$1) {
      jq.b<dbn> $$2 = $$0.d(lw.aN);
      return new euq.a($$2.b(dbs.s), $$1);
   }

   public static class a extends euy.a<euq.a> {
      private final jo<dbn> a;
      private final exs b;
      private int c = 0;

      public a(jo<dbn> $$0, exs $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected euq.a a() {
         return this;
      }

      public euq.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public euz b() {
         return new euq(this.g(), this.a, this.b, this.c);
      }
   }
}
