import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eiv extends eir {
   public static final int a = 0;
   public static final Codec<eiv> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ela.a.fieldOf("count").forGetter($$0x -> $$0x.c), atx.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, eiv::new)
   );
   private final ekz c;
   private final int d;

   eiv(List<eke> $$0, ekz $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eit b() {
      return eiu.i;
   }

   @Override
   public Set<ejn<?>> a() {
      return Sets.union(ImmutableSet.of(ejq.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      blw $$2 = $$1.c(ejq.d);
      if ($$2 instanceof bmo) {
         int $$3 = crt.h((bmo)$$2);
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

   public static eiv.a a(ekz $$0) {
      return new eiv.a($$0);
   }

   public static class a extends eir.a<eiv.a> {
      private final ekz a;
      private int b = 0;

      public a(ekz $$0) {
         this.a = $$0;
      }

      protected eiv.a a() {
         return this;
      }

      public eiv.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public eis b() {
         return new eiv(this.g(), this.a, this.b);
      }
   }
}
