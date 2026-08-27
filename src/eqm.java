import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqm extends eqs {
   public static final awm<ehl> a = awi.l;
   public static final ix<eog> b = eoh.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<eqm> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awm.a(lf.aJ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eog.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eqm::new)
   );
   private final awm<ehl> h;
   private final ix<eog> i;
   private final byte j;
   private final int k;
   private final boolean l;

   eqm(List<esn> $$0, awm<ehl> $$1, ix<eog> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public equ b() {
      return eqv.p;
   }

   @Override
   public Set<erw<?>> a() {
      return ImmutableSet.of(erz.f);
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      if (!$$0.a(ctt.uj)) {
         return $$0;
      } else {
         eum $$2 = $$1.c(erz.f);
         if ($$2 != null) {
            aqn $$3 = $$1.d();
            io $$4 = $$3.a(this.h, io.a($$2), this.k, this.l);
            if ($$4 != null) {
               ctq $$5 = cty.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cty.a($$3, $$5);
               eol.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eqm.a c() {
      return new eqm.a();
   }

   public static class a extends eqs.a<eqm.a> {
      private awm<ehl> a;
      private ix<eog> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eqm.a;
         this.b = eqm.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eqm.a a() {
         return this;
      }

      public eqm.a a(awm<ehl> $$0) {
         this.a = $$0;
         return this;
      }

      public eqm.a a(ix<eog> $$0) {
         this.b = $$0;
         return this;
      }

      public eqm.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eqm.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eqm.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eqt b() {
         return new eqm(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
