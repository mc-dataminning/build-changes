import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erx extends ert {
   public static final int a = 0;
   public static final MapCodec<erx> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eun.a.fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.d)))
            .apply($$0, erx::new)
   );
   private final eum c;
   private final int d;

   erx(List<etr> $$0, eum $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public erv<erx> b() {
      return erw.m;
   }

   @Override
   public Set<eta<?>> a() {
      return Sets.union(ImmutableSet.of(etd.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      bst $$2 = $$1.c(etd.d);
      if ($$2 instanceof bto) {
         int $$3 = daa.h((bto)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c()) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static erx.a a(eum $$0) {
      return new erx.a($$0);
   }

   public static class a extends ert.a<erx.a> {
      private final eum a;
      private int b = 0;

      public a(eum $$0) {
         this.a = $$0;
      }

      protected erx.a a() {
         return this;
      }

      public erx.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eru b() {
         return new erx(this.g(), this.a, this.b);
      }
   }
}
