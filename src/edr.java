import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class edr extends edw {
   public static final aqk<dvc> a = aqg.l;
   public static final ebn.a b = ebn.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<edr> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arj.a(aqk.a(jc.aA), "destination", a).forGetter($$0x -> $$0x.h),
                  ebn.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  arj.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  arj.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  arj.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, edr::new)
   );
   private final aqk<dvc> h;
   private final ebn.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   edr(List<efj> $$0, aqk<dvc> $$1, ebn.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public edy b() {
      return edz.m;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.f);
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      if (!$$0.a(cjo.tp)) {
         return $$0;
      } else {
         ehh $$2 = $$1.c(eev.f);
         if ($$2 != null) {
            akt $$3 = $$1.d();
            gw $$4 = $$3.a(this.h, gw.a($$2), this.k, this.l);
            if ($$4 != null) {
               cjl $$5 = cjs.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cjs.a($$3, $$5);
               ebq.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static edr.a c() {
      return new edr.a();
   }

   public static class a extends edw.a<edr.a> {
      private aqk<dvc> a;
      private ebn.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = edr.a;
         this.b = edr.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected edr.a a() {
         return this;
      }

      public edr.a a(aqk<dvc> $$0) {
         this.a = $$0;
         return this;
      }

      public edr.a a(ebn.a $$0) {
         this.b = $$0;
         return this;
      }

      public edr.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public edr.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public edr.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public edx b() {
         return new edr(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
