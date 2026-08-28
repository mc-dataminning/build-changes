import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erw extends ers {
   public static final int a = 0;
   public static final MapCodec<erw> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eum.a.fieldOf("count").forGetter($$0x -> $$0x.c), Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.d)))
            .apply($$0, erw::new)
   );
   private final eul c;
   private final int d;

   erw(List<etq> $$0, eul $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eru<erw> b() {
      return erv.m;
   }

   @Override
   public Set<esz<?>> a() {
      return Sets.union(ImmutableSet.of(etc.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      bss $$2 = $$1.c(etc.d);
      if ($$2 instanceof btn) {
         int $$3 = czz.h((btn)$$2);
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

   public static erw.a a(eul $$0) {
      return new erw.a($$0);
   }

   public static class a extends ers.a<erw.a> {
      private final eul a;
      private int b = 0;

      public a(eul $$0) {
         this.a = $$0;
      }

      protected erw.a a() {
         return this;
      }

      public erw.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public ert b() {
         return new erw(this.g(), this.a, this.b);
      }
   }
}
