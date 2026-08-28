import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evt extends ewa {
   public static final axs<emi> a = axo.l;
   public static final jq<etk> b = etl.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<evt> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axs.a(ma.aS).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  etk.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, evt::new)
   );
   private final axs<emi> h;
   private final jq<etk> i;
   private final byte j;
   private final int k;
   private final boolean l;

   evt(List<exy> $$0, axs<emi> $$1, jq<etk> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public ewc<evt> b() {
      return ewd.q;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.f);
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if (!$$0.a(cwq.uB)) {
         return $$0;
      } else {
         ezy $$2 = $$1.c(exj.f);
         if ($$2 != null) {
            arp $$3 = $$1.d();
            jh $$4 = $$3.a(this.h, jh.a((ka)$$2), this.k, this.l);
            if ($$4 != null) {
               cwm $$5 = cwz.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cwz.a($$3, $$5);
               etp.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static evt.a c() {
      return new evt.a();
   }

   public static class a extends ewa.a<evt.a> {
      private axs<emi> a;
      private jq<etk> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = evt.a;
         this.b = evt.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected evt.a a() {
         return this;
      }

      public evt.a a(axs<emi> $$0) {
         this.a = $$0;
         return this;
      }

      public evt.a a(jq<etk> $$0) {
         this.b = $$0;
         return this;
      }

      public evt.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public evt.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public evt.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public ewb b() {
         return new evt(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
