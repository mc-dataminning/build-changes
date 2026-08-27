import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edo extends edt {
   public static final aqa<duz> a = apw.e;
   public static final ebk.a b = ebk.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<edo> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aqy.a(aqa.a(jc.az), "destination", a).forGetter($$0x -> $$0x.h),
                  ebk.a.B.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  aqy.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  aqy.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  aqy.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, edo::new)
   );
   private final aqa<duz> h;
   private final ebk.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   edo(List<efg> $$0, aqa<duz> $$1, ebk.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public edv b() {
      return edw.m;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.f);
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      if (!$$0.a(cjb.tp)) {
         return $$0;
      } else {
         ehe $$2 = $$1.c(ees.f);
         if ($$2 != null) {
            akk $$3 = $$1.d();
            gu $$4 = $$3.a(this.h, gu.a($$2), this.k, this.l);
            if ($$4 != null) {
               ciy $$5 = cjf.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cjf.a($$3, $$5);
               ebn.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static edo.a c() {
      return new edo.a();
   }

   public static class a extends edt.a<edo.a> {
      private aqa<duz> a;
      private ebk.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = edo.a;
         this.b = edo.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected edo.a a() {
         return this;
      }

      public edo.a a(aqa<duz> $$0) {
         this.a = $$0;
         return this;
      }

      public edo.a a(ebk.a $$0) {
         this.b = $$0;
         return this;
      }

      public edo.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public edo.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public edo.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public edu b() {
         return new edo(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
