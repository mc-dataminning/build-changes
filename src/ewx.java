import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewx extends exe {
   public static final axf<enm> a = axb.l;
   public static final jr<euo> b = eup.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<ewx> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axf.a(mc.aU).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  euo.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ewx::new)
   );
   private final axf<enm> h;
   private final jr<euo> i;
   private final byte j;
   private final int k;
   private final boolean l;

   ewx(List<eza> $$0, axf<enm> $$1, jr<euo> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public exg<ewx> b() {
      return exh.q;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.f);
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if (!$$0.a(cwt.vi)) {
         return $$0;
      } else {
         fba $$2 = $$1.c(eyl.f);
         if ($$2 != null) {
            arc $$3 = $$1.d();
            ji $$4 = $$3.a(this.h, ji.a((kb)$$2), this.k, this.l);
            if ($$4 != null) {
               cwp $$5 = cxc.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cxc.a($$3, $$5);
               eut.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ewx.a c() {
      return new ewx.a();
   }

   public static class a extends exe.a<ewx.a> {
      private axf<enm> a;
      private jr<euo> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ewx.a;
         this.b = ewx.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ewx.a a() {
         return this;
      }

      public ewx.a a(axf<enm> $$0) {
         this.a = $$0;
         return this;
      }

      public ewx.a a(jr<euo> $$0) {
         this.b = $$0;
         return this;
      }

      public ewx.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ewx.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ewx.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public exf b() {
         return new ewx(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
