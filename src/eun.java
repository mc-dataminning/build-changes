import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eun extends euu {
   public static final axj<elc> a = axf.l;
   public static final jn<ese> b = esf.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<eun> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axj.a(lv.aS).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  ese.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eun::new)
   );
   private final axj<elc> h;
   private final jn<ese> i;
   private final byte j;
   private final int k;
   private final boolean l;

   eun(List<ews> $$0, axj<elc> $$1, jn<ese> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public euw<eun> b() {
      return eux.q;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.f);
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if (!$$0.a(cvt.ul)) {
         return $$0;
      } else {
         eys $$2 = $$1.c(ewd.f);
         if ($$2 != null) {
            arh $$3 = $$1.d();
            je $$4 = $$3.a(this.h, je.a((jx)$$2), this.k, this.l);
            if ($$4 != null) {
               cvp $$5 = cwc.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cwc.a($$3, $$5);
               esj.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eun.a c() {
      return new eun.a();
   }

   public static class a extends euu.a<eun.a> {
      private axj<elc> a;
      private jn<ese> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eun.a;
         this.b = eun.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eun.a a() {
         return this;
      }

      public eun.a a(axj<elc> $$0) {
         this.a = $$0;
         return this;
      }

      public eun.a a(jn<ese> $$0) {
         this.b = $$0;
         return this;
      }

      public eun.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eun.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eun.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public euv b() {
         return new eun(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
