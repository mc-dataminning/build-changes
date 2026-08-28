import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbo extends fbw {
   public static final int a = 0;
   public static final MapCodec<fbo> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dgn.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fep.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fbo::new)
   );
   private final jg<dgn> c;
   private final feo d;
   private final int e;

   fbo(List<fds> $$0, jg<dgn> $$1, feo $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fby<fbo> b() {
      return fbz.m;
   }

   @Override
   public Set<bbb<?>> a() {
      return Sets.union(ImmutableSet.of(fdd.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      bwv $$2 = $$1.c(fdd.d);
      if ($$2 instanceof bxw $$3) {
         int $$4 = dgp.a(this.c, $$3);
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

   public static fbo.a a(ji.a $$0, feo $$1) {
      ji.b<dgn> $$2 = $$0.e(mi.aR);
      return new fbo.a($$2.b(dgs.s), $$1);
   }

   public static class a extends fbw.a<fbo.a> {
      private final jg<dgn> a;
      private final feo b;
      private int c = 0;

      public a(jg<dgn> $$0, feo $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected fbo.a a() {
         return this;
      }

      public fbo.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public fbx b() {
         return new fbo(this.g(), this.a, this.b, this.c);
      }
   }
}
