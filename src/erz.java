import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erz extends esh {
   public static final int a = 0;
   public static final MapCodec<erz> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  czl.b.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  evc.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, erz::new)
   );
   private final jj<czl> c;
   private final evb d;
   private final int e;

   erz(List<euf> $$0, jj<czl> $$1, evb $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public esj<erz> b() {
      return esk.m;
   }

   @Override
   public Set<etn<?>> a() {
      return Sets.union(ImmutableSet.of(etq.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      bsg $$2 = $$1.c(etq.d);
      if ($$2 instanceof btb $$3) {
         int $$4 = czn.a(this.c, $$3);
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

   public static erz.a a(jl.a $$0, evb $$1) {
      jl.b<czl> $$2 = $$0.b(lr.aK);
      return new erz.a($$2.b(czq.s), $$1);
   }

   public static class a extends esh.a<erz.a> {
      private final jj<czl> a;
      private final evb b;
      private int c = 0;

      public a(jj<czl> $$0, evb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected erz.a a() {
         return this;
      }

      public erz.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public esi b() {
         return new erz(this.g(), this.a, this.b, this.c);
      }
   }
}
