import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eim extends eii {
   public static final int a = 0;
   public static final Codec<eim> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekr.a.fieldOf("count").forGetter($$0x -> $$0x.c), atw.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eim::new)
   );
   private final ekq c;
   private final int d;

   eim(List<ejv> $$0, ekq $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eik b() {
      return eil.i;
   }

   @Override
   public Set<eje<?>> a() {
      return Sets.union(ImmutableSet.of(ejh.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      blv $$2 = $$1.c(ejh.d);
      if ($$2 instanceof bml) {
         int $$3 = crl.h((bml)$$2);
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

   public static eim.a a(ekq $$0) {
      return new eim.a($$0);
   }

   public static class a extends eii.a<eim.a> {
      private final ekq a;
      private int b = 0;

      public a(ekq $$0) {
         this.a = $$0;
      }

      protected eim.a a() {
         return this;
      }

      public eim.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eij b() {
         return new eim(this.g(), this.a, this.b);
      }
   }
}
