import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class emd extends emi {
   public static final avd<ede> a = auz.l;
   public static final ejw.a b = ejw.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<emd> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  awe.a(avd.a(kj.aE), "destination", a).forGetter($$0x -> $$0x.h),
                  ejw.a.J.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  awe.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  awe.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  awe.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, emd::new)
   );
   private final avd<ede> h;
   private final ejw.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   emd(List<env> $$0, avd<ede> $$1, ejw.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public emk b() {
      return eml.m;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.f);
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      if (!$$0.a(cqp.uh)) {
         return $$0;
      } else {
         ept $$2 = $$1.c(enh.f);
         if ($$2 != null) {
            apf $$3 = $$1.d();
            ib $$4 = $$3.a(this.h, ib.a($$2), this.k, this.l);
            if ($$4 != null) {
               cqm $$5 = cqt.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cqt.a($$3, $$5);
               eka.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static emd.a c() {
      return new emd.a();
   }

   public static class a extends emi.a<emd.a> {
      private avd<ede> a;
      private ejw.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = emd.a;
         this.b = emd.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected emd.a a() {
         return this;
      }

      public emd.a a(avd<ede> $$0) {
         this.a = $$0;
         return this;
      }

      public emd.a a(ejw.a $$0) {
         this.b = $$0;
         return this;
      }

      public emd.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public emd.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public emd.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public emj b() {
         return new emd(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
