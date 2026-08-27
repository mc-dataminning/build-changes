import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eif extends eib {
   public static final int a = 0;
   public static final Codec<eif> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekk.a.fieldOf("count").forGetter($$0x -> $$0x.c), atq.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eif::new)
   );
   private final ekj c;
   private final int d;

   eif(List<ejo> $$0, ekj $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eid b() {
      return eie.i;
   }

   @Override
   public Set<eix<?>> a() {
      return Sets.union(ImmutableSet.of(eja.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      blp $$2 = $$1.c(eja.d);
      if ($$2 instanceof bmf) {
         int $$3 = cre.h((bmf)$$2);
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

   public static eif.a a(ekj $$0) {
      return new eif.a($$0);
   }

   public static class a extends eib.a<eif.a> {
      private final ekj a;
      private int b = 0;

      public a(ekj $$0) {
         this.a = $$0;
      }

      protected eif.a a() {
         return this;
      }

      public eif.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eic b() {
         return new eif(this.g(), this.a, this.b);
      }
   }
}
