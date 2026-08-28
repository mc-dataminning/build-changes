import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ert extends esb {
   public static final int a = 0;
   public static final MapCodec<ert> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  czj.b.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  euw.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ert::new)
   );
   private final jj<czj> c;
   private final euv d;
   private final int e;

   ert(List<etz> $$0, jj<czj> $$1, euv $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public esd<ert> b() {
      return ese.m;
   }

   @Override
   public Set<eth<?>> a() {
      return Sets.union(ImmutableSet.of(etk.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      bsd $$2 = $$1.c(etk.d);
      if ($$2 instanceof bsy $$3) {
         int $$4 = czl.a(this.c, $$3);
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

   public static ert.a a(jl.a $$0, euv $$1) {
      jl.b<czj> $$2 = $$0.b(lr.aK);
      return new ert.a($$2.b(czo.s), $$1);
   }

   public static class a extends esb.a<ert.a> {
      private final jj<czj> a;
      private final euv b;
      private int c = 0;

      public a(jj<czj> $$0, euv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected ert.a a() {
         return this;
      }

      public ert.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public esc b() {
         return new ert(this.g(), this.a, this.b, this.c);
      }
   }
}
