import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehu extends ehq {
   public static final int a = 0;
   public static final Codec<ehu> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ejz.a.fieldOf("count").forGetter($$0x -> $$0x.c), atg.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, ehu::new)
   );
   private final ejy c;
   private final int d;

   ehu(List<ejd> $$0, ejy $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ehs b() {
      return eht.i;
   }

   @Override
   public Set<eim<?>> a() {
      return Sets.union(ImmutableSet.of(eip.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      blf $$2 = $$1.c(eip.d);
      if ($$2 instanceof blv) {
         int $$3 = cqu.h((blv)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.L() > this.d) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static ehu.a a(ejy $$0) {
      return new ehu.a($$0);
   }

   public static class a extends ehq.a<ehu.a> {
      private final ejy a;
      private int b = 0;

      public a(ejy $$0) {
         this.a = $$0;
      }

      protected ehu.a a() {
         return this;
      }

      public ehu.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public ehr b() {
         return new ehu(this.g(), this.a, this.b);
      }
   }
}
