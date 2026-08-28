import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exn extends exv {
   public static final int a = 0;
   public static final MapCodec<exn> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ddq.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  fao.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, exn::new)
   );
   private final jq<ddq> c;
   private final fan d;
   private final int e;

   exn(List<ezr> $$0, jq<ddq> $$1, fan $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exx<exn> b() {
      return exy.m;
   }

   @Override
   public Set<bbd<?>> a() {
      return Sets.union(ImmutableSet.of(ezc.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      bvb $$2 = $$1.c(ezc.d);
      if ($$2 instanceof bvx $$3) {
         int $$4 = dds.a(this.c, $$3);
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

   public static exn.a a(js.a $$0, fan $$1) {
      js.b<ddq> $$2 = $$0.d(mb.aO);
      return new exn.a($$2.b(ddv.s), $$1);
   }

   public static class a extends exv.a<exn.a> {
      private final jq<ddq> a;
      private final fan b;
      private int c = 0;

      public a(jq<ddq> $$0, fan $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected exn.a a() {
         return this;
      }

      public exn.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public exw b() {
         return new exn(this.g(), this.a, this.b, this.c);
      }
   }
}
