import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ehl extends ehq {
   public static final asg<dyo> a = asc.l;
   public static final efg.a b = efg.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<ehl> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atg.a(asg.a(kc.aC), "destination", a).forGetter($$0x -> $$0x.h),
                  efg.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  atg.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  atg.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  atg.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, ehl::new)
   );
   private final asg<dyo> h;
   private final efg.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   ehl(List<ejd> $$0, asg<dyo> $$1, efg.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public ehs b() {
      return eht.m;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.f);
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      if (!$$0.a(cmk.uc)) {
         return $$0;
      } else {
         elb $$2 = $$1.c(eip.f);
         if ($$2 != null) {
            amp $$3 = $$1.d();
            hv $$4 = $$3.a(this.h, hv.a($$2), this.k, this.l);
            if ($$4 != null) {
               cmh $$5 = cmo.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cmo.a($$3, $$5);
               efj.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static ehl.a c() {
      return new ehl.a();
   }

   public static class a extends ehq.a<ehl.a> {
      private asg<dyo> a;
      private efg.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = ehl.a;
         this.b = ehl.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected ehl.a a() {
         return this;
      }

      public ehl.a a(asg<dyo> $$0) {
         this.a = $$0;
         return this;
      }

      public ehl.a a(efg.a $$0) {
         this.b = $$0;
         return this;
      }

      public ehl.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public ehl.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public ehl.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public ehr b() {
         return new ehl(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
