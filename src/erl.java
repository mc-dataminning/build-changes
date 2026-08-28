import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erl extends ers {
   public static final axe<eii> a = axa.l;
   public static final ji<epd> b = epe.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<erl> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.a(lq.aJ).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  epd.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, erl::new)
   );
   private final axe<eii> h;
   private final ji<epd> i;
   private final byte j;
   private final int k;
   private final boolean l;

   erl(List<etq> $$0, axe<eii> $$1, ji<epd> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eru<erl> b() {
      return erv.q;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.f);
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if (!$$0.a(cuq.uj)) {
         return $$0;
      } else {
         evp $$2 = $$1.c(etc.f);
         if ($$2 != null) {
            are $$3 = $$1.d();
            iz $$4 = $$3.a(this.h, iz.a($$2), this.k, this.l);
            if ($$4 != null) {
               cun $$5 = cuv.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cuv.a($$3, $$5);
               epi.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static erl.a c() {
      return new erl.a();
   }

   public static class a extends ers.a<erl.a> {
      private axe<eii> a;
      private ji<epd> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = erl.a;
         this.b = erl.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected erl.a a() {
         return this;
      }

      public erl.a a(axe<eii> $$0) {
         this.a = $$0;
         return this;
      }

      public erl.a a(ji<epd> $$0) {
         this.b = $$0;
         return this;
      }

      public erl.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public erl.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public erl.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public ert b() {
         return new erl(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
