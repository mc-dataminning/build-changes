import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eww extends exd {
   public static final axf<enl> a = axb.l;
   public static final jr<eun> b = euo.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<eww> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axf.a(mc.aU).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eun.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eww::new)
   );
   private final axf<enl> h;
   private final jr<eun> i;
   private final byte j;
   private final int k;
   private final boolean l;

   eww(List<eyz> $$0, axf<enl> $$1, jr<eun> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public exf<eww> b() {
      return exg.q;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.f);
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      if (!$$0.a(cws.vi)) {
         return $$0;
      } else {
         faz $$2 = $$1.c(eyk.f);
         if ($$2 != null) {
            ard $$3 = $$1.d();
            ji $$4 = $$3.a(this.h, ji.a((kb)$$2), this.k, this.l);
            if ($$4 != null) {
               cwo $$5 = cxb.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cxb.a($$3, $$5);
               eus.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eww.a c() {
      return new eww.a();
   }

   public static class a extends exd.a<eww.a> {
      private axf<enl> a;
      private jr<eun> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eww.a;
         this.b = eww.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eww.a a() {
         return this;
      }

      public eww.a a(axf<enl> $$0) {
         this.a = $$0;
         return this;
      }

      public eww.a a(jr<eun> $$0) {
         this.b = $$0;
         return this;
      }

      public eww.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eww.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eww.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public exe b() {
         return new eww(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
