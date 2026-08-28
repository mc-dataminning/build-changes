import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fau extends fbb {
   public static final axr<eri> a = axn.l;
   public static final jf<eyl> b = eym.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<fau> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axr.a(mh.be).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eyl.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, fau::new)
   );
   private final axr<eri> h;
   private final jf<eyl> i;
   private final byte j;
   private final int k;
   private final boolean l;

   fau(List<fcx> $$0, axr<eri> $$1, jf<eyl> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public fbd<fau> b() {
      return fbe.q;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.f);
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if (!$$0.a(czo.vt)) {
         return $$0;
      } else {
         fex $$2 = $$1.c(fci.f);
         if ($$2 != null) {
            arq $$3 = $$1.d();
            iv $$4 = $$3.a(this.h, iv.a((jp)$$2), this.k, this.l);
            if ($$4 != null) {
               czk $$5 = czx.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               czx.a($$3, $$5);
               eyq.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static fau.a c() {
      return new fau.a();
   }

   public static class a extends fbb.a<fau.a> {
      private axr<eri> a;
      private jf<eyl> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = fau.a;
         this.b = fau.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected fau.a a() {
         return this;
      }

      public fau.a a(axr<eri> $$0) {
         this.a = $$0;
         return this;
      }

      public fau.a a(jf<eyl> $$0) {
         this.b = $$0;
         return this;
      }

      public fau.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public fau.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fau.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public fbc b() {
         return new fau(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
