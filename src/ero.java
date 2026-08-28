import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ero extends erv {
   public static final axf<eil> a = axb.l;
   public static final ji<epg> b = eph.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<ero> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axf.a(lq.aJ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  epg.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ero::new)
   );
   private final axf<eil> h;
   private final ji<epg> i;
   private final byte j;
   private final int k;
   private final boolean l;

   ero(List<ett> $$0, axf<eil> $$1, ji<epg> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public erx<ero> b() {
      return ery.q;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.f);
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      if (!$$0.a(cut.uj)) {
         return $$0;
      } else {
         evs $$2 = $$1.c(etf.f);
         if ($$2 != null) {
            arf $$3 = $$1.d();
            iz $$4 = $$3.a(this.h, iz.a($$2), this.k, this.l);
            if ($$4 != null) {
               cuq $$5 = cuy.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cuy.a($$3, $$5);
               epl.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ero.a c() {
      return new ero.a();
   }

   public static class a extends erv.a<ero.a> {
      private axf<eil> a;
      private ji<epg> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ero.a;
         this.b = ero.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ero.a a() {
         return this;
      }

      public ero.a a(axf<eil> $$0) {
         this.a = $$0;
         return this;
      }

      public ero.a a(ji<epg> $$0) {
         this.b = $$0;
         return this;
      }

      public ero.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ero.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ero.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public erw b() {
         return new ero(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
