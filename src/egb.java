import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egb extends efx {
   public static final int a = 0;
   public static final Codec<egb> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eig.a.fieldOf("count").forGetter($$0x -> $$0x.c), asq.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, egb::new)
   );
   private final eif c;
   private final int d;

   egb(List<ehk> $$0, eif $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public efz b() {
      return ega.i;
   }

   @Override
   public Set<egt<?>> a() {
      return Sets.union(ImmutableSet.of(egw.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      bki $$2 = $$1.c(egw.d);
      if ($$2 instanceof bky) {
         int $$3 = cpo.h((bky)$$2);
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

   public static egb.a a(eif $$0) {
      return new egb.a($$0);
   }

   public static class a extends efx.a<egb.a> {
      private final eif a;
      private int b = 0;

      public a(eif $$0) {
         this.a = $$0;
      }

      protected egb.a a() {
         return this;
      }

      public egb.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public efy b() {
         return new egb(this.g(), this.a, this.b);
      }
   }
}
