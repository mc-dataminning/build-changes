import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eum extends euu {
   public static final int a = 0;
   public static final MapCodec<eum> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dbk.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  exp.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eum::new)
   );
   private final jn<dbk> c;
   private final exo d;
   private final int e;

   eum(List<ews> $$0, jn<dbk> $$1, exo $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public euw<eum> b() {
      return eux.m;
   }

   @Override
   public Set<ewa<?>> a() {
      return Sets.union(ImmutableSet.of(ewd.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      bto $$2 = $$1.c(ewd.d);
      if ($$2 instanceof buk $$3) {
         int $$4 = dbm.a(this.c, $$3);
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

   public static eum.a a(jp.a $$0, exo $$1) {
      jp.b<dbk> $$2 = $$0.b(lv.aM);
      return new eum.a($$2.b(dbp.s), $$1);
   }

   public static class a extends euu.a<eum.a> {
      private final jn<dbk> a;
      private final exo b;
      private int c = 0;

      public a(jn<dbk> $$0, exo $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected eum.a a() {
         return this;
      }

      public eum.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public euv b() {
         return new eum(this.g(), this.a, this.b, this.c);
      }
   }
}
