import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epi extends epo {
   public static final awd<egg> a = avz.l;
   public static final ena.a b = ena.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<epi> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.a(awd.a(ld.aI), "destination", a).forGetter($$0x -> $$0x.h),
                  ena.a.J.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  axe.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  axe.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  axe.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, epi::new)
   );
   private final awd<egg> h;
   private final ena.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   epi(List<erh> $$0, awd<egg> $$1, ena.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public epq b() {
      return epr.n;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.f);
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      if (!$$0.a(csg.uj)) {
         return $$0;
      } else {
         etf $$2 = $$1.c(eqt.f);
         if ($$2 != null) {
            aqe $$3 = $$1.d();
            im $$4 = $$3.a(this.h, im.a($$2), this.k, this.l);
            if ($$4 != null) {
               csd $$5 = csl.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               csl.a($$3, $$5);
               ene.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static epi.a c() {
      return new epi.a();
   }

   public static class a extends epo.a<epi.a> {
      private awd<egg> a;
      private ena.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = epi.a;
         this.b = epi.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected epi.a a() {
         return this;
      }

      public epi.a a(awd<egg> $$0) {
         this.a = $$0;
         return this;
      }

      public epi.a a(ena.a $$0) {
         this.b = $$0;
         return this;
      }

      public epi.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public epi.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public epi.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public epp b() {
         return new epi(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
