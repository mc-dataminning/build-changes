import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egn extends egj {
   public static final int a = 0;
   public static final Codec<egn> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eis.a.fieldOf("count").forGetter($$0x -> $$0x.c), asu.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, egn::new)
   );
   private final eir c;
   private final int d;

   egn(List<ehw> $$0, eir $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public egl b() {
      return egm.i;
   }

   @Override
   public Set<ehf<?>> a() {
      return Sets.union(ImmutableSet.of(ehi.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      bkq $$2 = $$1.c(ehi.d);
      if ($$2 instanceof blg) {
         int $$3 = cpw.h((blg)$$2);
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

   public static egn.a a(eir $$0) {
      return new egn.a($$0);
   }

   public static class a extends egj.a<egn.a> {
      private final eir a;
      private int b = 0;

      public a(eir $$0) {
         this.a = $$0;
      }

      protected egn.a a() {
         return this;
      }

      public egn.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public egk b() {
         return new egn(this.g(), this.a, this.b);
      }
   }
}
