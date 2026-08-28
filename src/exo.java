import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exo extends exv {
   public static final aya<eod> a = axw.l;
   public static final jq<evf> b = evg.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<exo> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aya.a(mb.aU).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  evf.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, exo::new)
   );
   private final aya<eod> h;
   private final jq<evf> i;
   private final byte j;
   private final int k;
   private final boolean l;

   exo(List<ezr> $$0, aya<eod> $$1, jq<evf> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public exx<exo> b() {
      return exy.q;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.f);
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if (!$$0.a(cxk.vi)) {
         return $$0;
      } else {
         fbr $$2 = $$1.c(ezc.f);
         if ($$2 != null) {
            arx $$3 = $$1.d();
            jh $$4 = $$3.a(this.h, jh.a((ka)$$2), this.k, this.l);
            if ($$4 != null) {
               cxg $$5 = cxt.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cxt.a($$3, $$5);
               evk.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static exo.a c() {
      return new exo.a();
   }

   public static class a extends exv.a<exo.a> {
      private aya<eod> a;
      private jq<evf> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = exo.a;
         this.b = exo.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected exo.a a() {
         return this;
      }

      public exo.a a(aya<eod> $$0) {
         this.a = $$0;
         return this;
      }

      public exo.a a(jq<evf> $$0) {
         this.b = $$0;
         return this;
      }

      public exo.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public exo.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public exo.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public exw b() {
         return new exo(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
