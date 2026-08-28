import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eri extends erp {
   public static final axb<eif> a = awx.l;
   public static final ji<epa> b = epb.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<eri> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axb.a(lq.aJ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  epa.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eri::new)
   );
   private final axb<eif> h;
   private final ji<epa> i;
   private final byte j;
   private final int k;
   private final boolean l;

   eri(List<etn> $$0, axb<eif> $$1, ji<epa> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public err<eri> b() {
      return ers.q;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.f);
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if (!$$0.a(cun.uj)) {
         return $$0;
      } else {
         evm $$2 = $$1.c(esz.f);
         if ($$2 != null) {
            arb $$3 = $$1.d();
            iz $$4 = $$3.a(this.h, iz.a($$2), this.k, this.l);
            if ($$4 != null) {
               cuk $$5 = cus.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cus.a($$3, $$5);
               epf.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eri.a c() {
      return new eri.a();
   }

   public static class a extends erp.a<eri.a> {
      private axb<eif> a;
      private ji<epa> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eri.a;
         this.b = eri.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eri.a a() {
         return this;
      }

      public eri.a a(axb<eif> $$0) {
         this.a = $$0;
         return this;
      }

      public eri.a a(ji<epa> $$0) {
         this.b = $$0;
         return this;
      }

      public eri.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eri.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eri.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public erq b() {
         return new eri(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
