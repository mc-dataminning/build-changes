import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esq extends esy {
   public static final int a = 0;
   public static final MapCodec<esq> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  daa.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  evt.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, esq::new)
   );
   private final jm<daa> c;
   private final evs d;
   private final int e;

   esq(List<euw> $$0, jm<daa> $$1, evs $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eta<esq> b() {
      return etb.m;
   }

   @Override
   public Set<eue<?>> a() {
      return Sets.union(ImmutableSet.of(euh.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      bsq $$2 = $$1.c(euh.d);
      if ($$2 instanceof btl $$3) {
         int $$4 = dac.a(this.c, $$3);
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

   public static esq.a a(jo.a $$0, evs $$1) {
      jo.b<daa> $$2 = $$0.b(lu.aL);
      return new esq.a($$2.b(daf.s), $$1);
   }

   public static class a extends esy.a<esq.a> {
      private final jm<daa> a;
      private final evs b;
      private int c = 0;

      public a(jm<daa> $$0, evs $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected esq.a a() {
         return this;
      }

      public esq.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public esz b() {
         return new esq(this.g(), this.a, this.b, this.c);
      }
   }
}
