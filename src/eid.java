import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eid extends eii {
   public static final asw<dzg> a = ass.l;
   public static final efy.a b = efy.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<eid> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atw.a(asw.a(ke.aD), "destination", a).forGetter($$0x -> $$0x.h),
                  efy.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  atw.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  atw.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  atw.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, eid::new)
   );
   private final asw<dzg> h;
   private final efy.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   eid(List<ejv> $$0, asw<dzg> $$1, efy.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eik b() {
      return eil.m;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.f);
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      if (!$$0.a(cnb.uc)) {
         return $$0;
      } else {
         elt $$2 = $$1.c(ejh.f);
         if ($$2 != null) {
            and $$3 = $$1.d();
            hx $$4 = $$3.a(this.h, hx.a($$2), this.k, this.l);
            if ($$4 != null) {
               cmy $$5 = cnf.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cnf.a($$3, $$5);
               egb.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static eid.a c() {
      return new eid.a();
   }

   public static class a extends eii.a<eid.a> {
      private asw<dzg> a;
      private efy.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = eid.a;
         this.b = eid.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected eid.a a() {
         return this;
      }

      public eid.a a(asw<dzg> $$0) {
         this.a = $$0;
         return this;
      }

      public eid.a a(efy.a $$0) {
         this.b = $$0;
         return this;
      }

      public eid.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public eid.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eid.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eij b() {
         return new eid(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
