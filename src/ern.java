import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ern extends eru {
   public static final axf<eik> a = axb.l;
   public static final ji<epf> b = epg.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<ern> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axf.a(lq.aJ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  epf.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ern::new)
   );
   private final axf<eik> h;
   private final ji<epf> i;
   private final byte j;
   private final int k;
   private final boolean l;

   ern(List<ets> $$0, axf<eik> $$1, ji<epf> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public erw<ern> b() {
      return erx.q;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.f);
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if (!$$0.a(cus.uj)) {
         return $$0;
      } else {
         evr $$2 = $$1.c(ete.f);
         if ($$2 != null) {
            arf $$3 = $$1.d();
            iz $$4 = $$3.a(this.h, iz.a($$2), this.k, this.l);
            if ($$4 != null) {
               cup $$5 = cux.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cux.a($$3, $$5);
               epk.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ern.a c() {
      return new ern.a();
   }

   public static class a extends eru.a<ern.a> {
      private axf<eik> a;
      private ji<epf> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ern.a;
         this.b = ern.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ern.a a() {
         return this;
      }

      public ern.a a(axf<eik> $$0) {
         this.a = $$0;
         return this;
      }

      public ern.a a(ji<epf> $$0) {
         this.b = $$0;
         return this;
      }

      public ern.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ern.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ern.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public erv b() {
         return new ern(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
