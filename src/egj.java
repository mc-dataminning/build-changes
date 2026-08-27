import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egj extends ego {
   public static final arz<dxm> a = arv.l;
   public static final eee.a b = eee.a.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final Codec<egj> f = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asy.a(arz.a(kd.aB), "destination", a).forGetter($$0x -> $$0x.h),
                  eee.a.I.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  asy.a(Codec.BYTE, "zoom", Byte.valueOf((byte)2)).forGetter($$0x -> $$0x.j),
                  asy.a(Codec.INT, "search_radius", Integer.valueOf(50)).forGetter($$0x -> $$0x.k),
                  asy.a(Codec.BOOL, "skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, egj::new)
   );
   private final arz<dxm> h;
   private final eee.a i;
   private final byte j;
   private final int k;
   private final boolean l;

   egj(List<eib> $$0, arz<dxm> $$1, eee.a $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public egq b() {
      return egr.m;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.f);
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      if (!$$0.a(clr.ub)) {
         return $$0;
      } else {
         ejz $$2 = $$1.c(ehn.f);
         if ($$2 != null) {
            ami $$3 = $$1.d();
            hx $$4 = $$3.a(this.h, hx.a($$2), this.k, this.l);
            if ($$4 != null) {
               clo $$5 = clv.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               clv.a($$3, $$5);
               eeh.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static egj.a c() {
      return new egj.a();
   }

   public static class a extends ego.a<egj.a> {
      private arz<dxm> a;
      private eee.a b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = egj.a;
         this.b = egj.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected egj.a a() {
         return this;
      }

      public egj.a a(arz<dxm> $$0) {
         this.a = $$0;
         return this;
      }

      public egj.a a(eee.a $$0) {
         this.b = $$0;
         return this;
      }

      public egj.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public egj.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public egj.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public egp b() {
         return new egj(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
