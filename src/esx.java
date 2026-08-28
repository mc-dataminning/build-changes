import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esx extends ete {
   public static final awu<ejr> a = awq.l;
   public static final jm<eqo> b = eqp.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<esx> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awu.a(lu.aR).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eqo.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, esx::new)
   );
   private final awu<ejr> h;
   private final jm<eqo> i;
   private final byte j;
   private final int k;
   private final boolean l;

   esx(List<evc> $$0, awu<ejr> $$1, jm<eqo> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public etg<esx> b() {
      return eth.q;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.f);
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if (!$$0.a(cut.uj)) {
         return $$0;
      } else {
         exc $$2 = $$1.c(eun.f);
         if ($$2 != null) {
            aqu $$3 = $$1.d();
            jd $$4 = $$3.a(this.h, jd.a((jw)$$2), this.k, this.l);
            if ($$4 != null) {
               cuq $$5 = cvc.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cvc.a($$3, $$5);
               eqt.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static esx.a c() {
      return new esx.a();
   }

   public static class a extends ete.a<esx.a> {
      private awu<ejr> a;
      private jm<eqo> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = esx.a;
         this.b = esx.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected esx.a a() {
         return this;
      }

      public esx.a a(awu<ejr> $$0) {
         this.a = $$0;
         return this;
      }

      public esx.a a(jm<eqo> $$0) {
         this.b = $$0;
         return this;
      }

      public esx.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public esx.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public esx.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public etf b() {
         return new esx(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
