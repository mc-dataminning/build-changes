import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eic extends eih {
   public static final asv<dzf> a = asr.l;
   public static final efx.a b = efx.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<eic> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atv.a(asv.a(ke.aD), "destination", a).forGetter($$0x -> $$0x.h),
                  efx.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  atv.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  atv.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  atv.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eic::new)
   );
   private final asv<dzf> h;
   private final efx.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   eic(List<eju> $$0, asv<dzf> $$1, efx.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eij b() {
      return eik.m;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.f);
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      if (!$$0.a(cna.uc)) {
         return $$0;
      } else {
         els $$2 = $$1.c(ejg.f);
         if ($$2 != null) {
            and $$3 = $$1.d();
            hx $$4 = $$3.a(this.h, hx.a($$2), this.k, this.l);
            if ($$4 != null) {
               cmx $$5 = cne.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cne.a($$3, $$5);
               ega.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eic.a c() {
      return new eic.a();
   }

   public static class a extends eih.a<eic.a> {
      private asv<dzf> a;
      private efx.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eic.a;
         this.b = eic.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eic.a a() {
         return this;
      }

      public eic.a a(asv<dzf> $$0) {
         this.a = $$0;
         return this;
      }

      public eic.a a(efx.a $$0) {
         this.b = $$0;
         return this;
      }

      public eic.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eic.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eic.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eii b() {
         return new eic(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
