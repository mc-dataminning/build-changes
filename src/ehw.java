import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehw extends eib {
   public static final asq<dyz> a = asm.l;
   public static final efr.a b = efr.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<ehw> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atq.a(asq.a(ke.aD), "destination", a).forGetter($$0x -> $$0x.h),
                  efr.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  atq.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  atq.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  atq.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ehw::new)
   );
   private final asq<dyz> h;
   private final efr.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   ehw(List<ejo> $$0, asq<dyz> $$1, efr.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eid b() {
      return eie.m;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.f);
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      if (!$$0.a(cmu.uc)) {
         return $$0;
      } else {
         elm $$2 = $$1.c(eja.f);
         if ($$2 != null) {
            amz $$3 = $$1.d();
            hx $$4 = $$3.a(this.h, hx.a($$2), this.k, this.l);
            if ($$4 != null) {
               cmr $$5 = cmy.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cmy.a($$3, $$5);
               efu.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ehw.a c() {
      return new ehw.a();
   }

   public static class a extends eib.a<ehw.a> {
      private asq<dyz> a;
      private efr.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ehw.a;
         this.b = ehw.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ehw.a a() {
         return this;
      }

      public ehw.a a(asq<dyz> $$0) {
         this.a = $$0;
         return this;
      }

      public ehw.a a(efr.a $$0) {
         this.b = $$0;
         return this;
      }

      public ehw.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ehw.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ehw.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eic b() {
         return new ehw(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
