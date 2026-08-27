import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eks extends eko {
   public static final int a = 0;
   public static final Codec<eks> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emx.a.fieldOf("count").forGetter($$0x -> $$0x.c), avq.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eks::new)
   );
   private final emw c;
   private final int d;

   eks(List<emb> $$0, emw $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ekq b() {
      return ekr.i;
   }

   @Override
   public Set<elk<?>> a() {
      return Sets.union(ImmutableSet.of(eln.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      bnq $$2 = $$1.c(eln.d);
      if ($$2 instanceof boi) {
         int $$3 = ctn.h((boi)$$2);
         if ($$3 == 0) {
            return $$0;
         }

         float $$4 = (float)$$3 * this.c.b($$1);
         $$0.g(Math.round($$4));
         if (this.c() && $$0.M() > this.d) {
            $$0.f(this.d);
         }
      }

      return $$0;
   }

   public static eks.a a(emw $$0) {
      return new eks.a($$0);
   }

   public static class a extends eko.a<eks.a> {
      private final emw a;
      private int b = 0;

      public a(emw $$0) {
         this.a = $$0;
      }

      protected eks.a a() {
         return this;
      }

      public eks.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public ekp b() {
         return new eks(this.g(), this.a, this.b);
      }
   }
}
