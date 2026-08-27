import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edn extends eds {
   public static final aqa<duy> a = apw.e;
   public static final ebj.a b = ebj.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<edn> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aqy.a(aqa.a(jc.az), "destination", a).forGetter($$0x -> $$0x.h),
                  ebj.a.B.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  aqy.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  aqy.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  aqy.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, edn::new)
   );
   private final aqa<duy> h;
   private final ebj.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   edn(List<eff> $$0, aqa<duy> $$1, ebj.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public edu b() {
      return edv.m;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.f);
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      if (!$$0.a(cja.tp)) {
         return $$0;
      } else {
         ehd $$2 = $$1.c(eer.f);
         if ($$2 != null) {
            akk $$3 = $$1.d();
            gu $$4 = $$3.a(this.h, gu.a($$2), this.k, this.l);
            if ($$4 != null) {
               cix $$5 = cje.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cje.a($$3, $$5);
               ebm.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static edn.a c() {
      return new edn.a();
   }

   public static class a extends eds.a<edn.a> {
      private aqa<duy> a;
      private ebj.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = edn.a;
         this.b = edn.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected edn.a a() {
         return this;
      }

      public edn.a a(aqa<duy> $$0) {
         this.a = $$0;
         return this;
      }

      public edn.a a(ebj.a $$0) {
         this.b = $$0;
         return this;
      }

      public edn.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public edn.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public edn.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public edt b() {
         return new edn(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
