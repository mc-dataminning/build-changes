import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewy extends exf {
   public static final axf<enn> a = axb.l;
   public static final jr<eup> b = euq.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<ewy> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axf.a(mc.aU).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eup.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ewy::new)
   );
   private final axf<enn> h;
   private final jr<eup> i;
   private final byte j;
   private final int k;
   private final boolean l;

   ewy(List<ezb> $$0, axf<enn> $$1, jr<eup> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public exh<ewy> b() {
      return exi.q;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.f);
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if (!$$0.a(cwu.vi)) {
         return $$0;
      } else {
         fbb $$2 = $$1.c(eym.f);
         if ($$2 != null) {
            ard $$3 = $$1.d();
            ji $$4 = $$3.a(this.h, ji.a((kb)$$2), this.k, this.l);
            if ($$4 != null) {
               cwq $$5 = cxd.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cxd.a($$3, $$5);
               euu.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ewy.a c() {
      return new ewy.a();
   }

   public static class a extends exf.a<ewy.a> {
      private axf<enn> a;
      private jr<eup> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ewy.a;
         this.b = ewy.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ewy.a a() {
         return this;
      }

      public ewy.a a(axf<enn> $$0) {
         this.a = $$0;
         return this;
      }

      public ewy.a a(jr<eup> $$0) {
         this.b = $$0;
         return this;
      }

      public ewy.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ewy.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ewy.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public exg b() {
         return new ewy(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
