import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egs extends ego {
   public static final int a = 0;
   public static final Codec<egs> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eix.a.fieldOf("count").forGetter($$0x -> $$0x.c), asy.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, egs::new)
   );
   private final eiw c;
   private final int d;

   egs(List<eib> $$0, eiw $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public egq b() {
      return egr.i;
   }

   @Override
   public Set<ehk<?>> a() {
      return Sets.union(ImmutableSet.of(ehn.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      bkv $$2 = $$1.c(ehn.d);
      if ($$2 instanceof bll) {
         int $$3 = cqb.h((bll)$$2);
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

   public static egs.a a(eiw $$0) {
      return new egs.a($$0);
   }

   public static class a extends ego.a<egs.a> {
      private final eiw a;
      private int b = 0;

      public a(eiw $$0) {
         this.a = $$0;
      }

      protected egs.a a() {
         return this;
      }

      public egs.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public egp b() {
         return new egs(this.g(), this.a, this.b);
      }
   }
}
