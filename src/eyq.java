import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyq extends eyy {
   public static final int a = 0;
   public static final MapCodec<eyq> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  deh.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fbr.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eyq::new)
   );
   private final js<deh> c;
   private final fbq d;
   private final int e;

   eyq(List<fau> $$0, js<deh> $$1, fbq $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eza<eyq> b() {
      return ezb.m;
   }

   @Override
   public Set<bat<?>> a() {
      return Sets.union(ImmutableSet.of(faf.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      bvs $$2 = $$1.c(faf.d);
      if ($$2 instanceof bwr $$3) {
         int $$4 = dej.a(this.c, $$3);
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

   public static eyq.a a(ju.a $$0, fbq $$1) {
      ju.b<deh> $$2 = $$0.e(me.aS);
      return new eyq.a($$2.b(dem.s), $$1);
   }

   public static class a extends eyy.a<eyq.a> {
      private final js<deh> a;
      private final fbq b;
      private int c = 0;

      public a(js<deh> $$0, fbq $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected eyq.a a() {
         return this;
      }

      public eyq.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public eyz b() {
         return new eyq(this.g(), this.a, this.b, this.c);
      }
   }
}
