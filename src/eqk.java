import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqk extends eqq {
   public static final awl<ehj> a = awh.l;
   public static final ix<eoe> b = eof.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<eqk> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awl.a(lf.aJ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eoe.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eqk::new)
   );
   private final awl<ehj> h;
   private final ix<eoe> i;
   private final byte j;
   private final int k;
   private final boolean l;

   eqk(List<esl> $$0, awl<ehj> $$1, ix<eoe> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eqs b() {
      return eqt.p;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.f);
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      if (!$$0.a(ctr.uj)) {
         return $$0;
      } else {
         euk $$2 = $$1.c(erx.f);
         if ($$2 != null) {
            aqm $$3 = $$1.d();
            io $$4 = $$3.a(this.h, io.a($$2), this.k, this.l);
            if ($$4 != null) {
               cto $$5 = ctw.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               ctw.a($$3, $$5);
               eoj.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eqk.a c() {
      return new eqk.a();
   }

   public static class a extends eqq.a<eqk.a> {
      private awl<ehj> a;
      private ix<eoe> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eqk.a;
         this.b = eqk.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eqk.a a() {
         return this;
      }

      public eqk.a a(awl<ehj> $$0) {
         this.a = $$0;
         return this;
      }

      public eqk.a a(ix<eoe> $$0) {
         this.b = $$0;
         return this;
      }

      public eqk.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eqk.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eqk.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eqr b() {
         return new eqk(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
