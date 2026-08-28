import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erp extends erw {
   public static final axf<eim> a = axb.l;
   public static final ji<eph> b = epi.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<erp> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axf.a(lq.aJ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eph.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, erp::new)
   );
   private final axf<eim> h;
   private final ji<eph> i;
   private final byte j;
   private final int k;
   private final boolean l;

   erp(List<etu> $$0, axf<eim> $$1, ji<eph> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public ery<erp> b() {
      return erz.q;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.f);
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      if (!$$0.a(cuu.uj)) {
         return $$0;
      } else {
         evt $$2 = $$1.c(etg.f);
         if ($$2 != null) {
            arf $$3 = $$1.d();
            iz $$4 = $$3.a(this.h, iz.a($$2), this.k, this.l);
            if ($$4 != null) {
               cur $$5 = cuz.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cuz.a($$3, $$5);
               epm.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static erp.a c() {
      return new erp.a();
   }

   public static class a extends erw.a<erp.a> {
      private axf<eim> a;
      private ji<eph> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = erp.a;
         this.b = erp.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected erp.a a() {
         return this;
      }

      public erp.a a(axf<eim> $$0) {
         this.a = $$0;
         return this;
      }

      public erp.a a(ji<eph> $$0) {
         this.b = $$0;
         return this;
      }

      public erp.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public erp.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public erp.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public erx b() {
         return new erp(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
