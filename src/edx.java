import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edx extends eec {
   public static final aqh<dvi> a = aqd.l;
   public static final ebt.a b = ebt.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<edx> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arf.a(aqh.a(jc.az), "destination", a).forGetter($$0x -> $$0x.h),
                  ebt.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  arf.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  arf.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  arf.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, edx::new)
   );
   private final aqh<dvi> h;
   private final ebt.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   edx(List<efp> $$0, aqh<dvi> $$1, ebt.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eee b() {
      return eef.m;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.f);
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      if (!$$0.a(cji.tp)) {
         return $$0;
      } else {
         ehn $$2 = $$1.c(efb.f);
         if ($$2 != null) {
            akq $$3 = $$1.d();
            gw $$4 = $$3.a(this.h, gw.a($$2), this.k, this.l);
            if ($$4 != null) {
               cjf $$5 = cjm.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cjm.a($$3, $$5);
               ebw.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static edx.a c() {
      return new edx.a();
   }

   public static class a extends eec.a<edx.a> {
      private aqh<dvi> a;
      private ebt.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = edx.a;
         this.b = edx.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected edx.a a() {
         return this;
      }

      public edx.a a(aqh<dvi> $$0) {
         this.a = $$0;
         return this;
      }

      public edx.a a(ebt.a $$0) {
         this.b = $$0;
         return this;
      }

      public edx.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public edx.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public edx.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eed b() {
         return new edx(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
