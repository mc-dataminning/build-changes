import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ewv extends exc {
   public static final axe<enk> a = axa.l;
   public static final jr<eum> b = eun.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<ewv> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.a(mc.aU).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eum.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ewv::new)
   );
   private final axe<enk> h;
   private final jr<eum> i;
   private final byte j;
   private final int k;
   private final boolean l;

   ewv(List<eyy> $$0, axe<enk> $$1, jr<eum> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public exe<ewv> b() {
      return exf.q;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.f);
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      if (!$$0.a(cwr.vi)) {
         return $$0;
      } else {
         fay $$2 = $$1.c(eyj.f);
         if ($$2 != null) {
            arc $$3 = $$1.d();
            ji $$4 = $$3.a(this.h, ji.a((kb)$$2), this.k, this.l);
            if ($$4 != null) {
               cwn $$5 = cxa.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cxa.a($$3, $$5);
               eur.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ewv.a c() {
      return new ewv.a();
   }

   public static class a extends exc.a<ewv.a> {
      private axe<enk> a;
      private jr<eum> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ewv.a;
         this.b = ewv.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ewv.a a() {
         return this;
      }

      public ewv.a a(axe<enk> $$0) {
         this.a = $$0;
         return this;
      }

      public ewv.a a(jr<eum> $$0) {
         this.b = $$0;
         return this;
      }

      public ewv.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ewv.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ewv.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public exd b() {
         return new ewv(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
