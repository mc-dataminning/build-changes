import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evi extends evp {
   public static final axq<elx> a = axm.l;
   public static final jq<esz> b = eta.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<evi> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axq.a(lz.aS).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  esz.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, evi::new)
   );
   private final axq<elx> h;
   private final jq<esz> i;
   private final byte j;
   private final int k;
   private final boolean l;

   evi(List<exn> $$0, axq<elx> $$1, jq<esz> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public evr<evi> b() {
      return evs.q;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.f);
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      if (!$$0.a(cwf.ul)) {
         return $$0;
      } else {
         ezn $$2 = $$1.c(ewy.f);
         if ($$2 != null) {
            arn $$3 = $$1.d();
            jh $$4 = $$3.a(this.h, jh.a((ka)$$2), this.k, this.l);
            if ($$4 != null) {
               cwb $$5 = cwo.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cwo.a($$3, $$5);
               ete.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static evi.a c() {
      return new evi.a();
   }

   public static class a extends evp.a<evi.a> {
      private axq<elx> a;
      private jq<esz> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = evi.a;
         this.b = evi.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected evi.a a() {
         return this;
      }

      public evi.a a(axq<elx> $$0) {
         this.a = $$0;
         return this;
      }

      public evi.a a(jq<esz> $$0) {
         this.b = $$0;
         return this;
      }

      public evi.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public evi.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public evi.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public evq b() {
         return new evi(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
