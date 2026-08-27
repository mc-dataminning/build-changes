import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edw extends eds {
   public static final int a = 0;
   public static final Codec<edw> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egb.a.fieldOf("count").forGetter($$0x -> $$0x.c), aqy.a(Codec.INT, "limit", Integer.valueOf(0)).forGetter($$0x -> $$0x.d)))
            .apply($$0, edw::new)
   );
   private final ega c;
   private final int d;

   edw(List<eff> $$0, ega $$1, int $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public edu b() {
      return edv.i;
   }

   @Override
   public Set<eeo<?>> a() {
      return Sets.union(ImmutableSet.of(eer.d), this.c.a());
   }

   private boolean c() {
      return this.d > 0;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      bii $$2 = $$1.c(eer.d);
      if ($$2 instanceof biy) {
         int $$3 = cng.h((biy)$$2);
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

   public static edw.a a(ega $$0) {
      return new edw.a($$0);
   }

   public static class a extends eds.a<edw.a> {
      private final ega a;
      private int b = 0;

      public a(ega $$0) {
         this.a = $$0;
      }

      protected edw.a a() {
         return this;
      }

      public edw.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      @Override
      public edt b() {
         return new edw(this.g(), this.a, this.b);
      }
   }
}
