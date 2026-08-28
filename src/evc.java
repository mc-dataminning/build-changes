import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evc extends evj {
   public static final axp<elr> a = axl.l;
   public static final jp<est> b = esu.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<evc> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axp.a(ly.aS).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  est.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, evc::new)
   );
   private final axp<elr> h;
   private final jp<est> i;
   private final byte j;
   private final int k;
   private final boolean l;

   evc(List<exh> $$0, axp<elr> $$1, jp<est> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public evl<evc> b() {
      return evm.q;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.f);
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      if (!$$0.a(cwb.ul)) {
         return $$0;
      } else {
         ezh $$2 = $$1.c(ews.f);
         if ($$2 != null) {
            arm $$3 = $$1.d();
            jg $$4 = $$3.a(this.h, jg.a((jz)$$2), this.k, this.l);
            if ($$4 != null) {
               cvx $$5 = cwk.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cwk.a($$3, $$5);
               esy.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static evc.a c() {
      return new evc.a();
   }

   public static class a extends evj.a<evc.a> {
      private axp<elr> a;
      private jp<est> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = evc.a;
         this.b = evc.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected evc.a a() {
         return this;
      }

      public evc.a a(axp<elr> $$0) {
         this.a = $$0;
         return this;
      }

      public evc.a a(jp<est> $$0) {
         this.b = $$0;
         return this;
      }

      public evc.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public evc.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public evc.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public evk b() {
         return new evc(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
