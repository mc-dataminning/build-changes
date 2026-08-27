import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eds extends edx {
   public static final aqd<dvd> a = apz.e;
   public static final ebo.a b = ebo.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<eds> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arb.a(aqd.a(je.az), "destination", a).forGetter($$0x -> $$0x.h),
                  ebo.a.B.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  arb.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  arb.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  arb.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eds::new)
   );
   private final aqd<dvd> h;
   private final ebo.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   eds(List<efk> $$0, aqd<dvd> $$1, ebo.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public edz b() {
      return eea.m;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.f);
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      if (!$$0.a(cjd.tp)) {
         return $$0;
      } else {
         ehi $$2 = $$1.c(eew.f);
         if ($$2 != null) {
            akn $$3 = $$1.d();
            gw $$4 = $$3.a(this.h, gw.a($$2), this.k, this.l);
            if ($$4 != null) {
               cja $$5 = cjh.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cjh.a($$3, $$5);
               ebr.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eds.a c() {
      return new eds.a();
   }

   public static class a extends edx.a<eds.a> {
      private aqd<dvd> a;
      private ebo.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eds.a;
         this.b = eds.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eds.a a() {
         return this;
      }

      public eds.a a(aqd<dvd> $$0) {
         this.a = $$0;
         return this;
      }

      public eds.a a(ebo.a $$0) {
         this.b = $$0;
         return this;
      }

      public eds.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eds.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eds.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public edy b() {
         return new eds(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
