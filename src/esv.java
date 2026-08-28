import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esv extends etc {
   public static final awu<ejp> a = awq.l;
   public static final jm<eqm> b = eqn.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<esv> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awu.a(lu.aR).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eqm.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, esv::new)
   );
   private final awu<ejp> h;
   private final jm<eqm> i;
   private final byte j;
   private final int k;
   private final boolean l;

   esv(List<eva> $$0, awu<ejp> $$1, jm<eqm> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public ete<esv> b() {
      return etf.q;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(eul.f);
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      if (!$$0.a(cut.uj)) {
         return $$0;
      } else {
         exa $$2 = $$1.c(eul.f);
         if ($$2 != null) {
            aqu $$3 = $$1.d();
            jd $$4 = $$3.a(this.h, jd.a((jw)$$2), this.k, this.l);
            if ($$4 != null) {
               cuq $$5 = cvc.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cvc.a($$3, $$5);
               eqr.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static esv.a c() {
      return new esv.a();
   }

   public static class a extends etc.a<esv.a> {
      private awu<ejp> a;
      private jm<eqm> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = esv.a;
         this.b = esv.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected esv.a a() {
         return this;
      }

      public esv.a a(awu<ejp> $$0) {
         this.a = $$0;
         return this;
      }

      public esv.a a(jm<eqm> $$0) {
         this.b = $$0;
         return this;
      }

      public esv.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public esv.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public esv.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public etd b() {
         return new esv(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
