import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exn extends exu {
   public static final ayk<eoc> a = ayg.l;
   public static final jq<eve> b = evf.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<exn> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ayk.a(mb.aT).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eve.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, exn::new)
   );
   private final ayk<eoc> h;
   private final jq<eve> i;
   private final byte j;
   private final int k;
   private final boolean l;

   exn(List<ezs> $$0, ayk<eoc> $$1, jq<eve> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public exw<exn> b() {
      return exx.q;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.f);
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      if (!$$0.a(cxo.uZ)) {
         return $$0;
      } else {
         fbs $$2 = $$1.c(ezd.f);
         if ($$2 != null) {
            ash $$3 = $$1.d();
            jh $$4 = $$3.a(this.h, jh.a((ka)$$2), this.k, this.l);
            if ($$4 != null) {
               cxk $$5 = cxx.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cxx.a($$3, $$5);
               evj.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static exn.a c() {
      return new exn.a();
   }

   public static class a extends exu.a<exn.a> {
      private ayk<eoc> a;
      private jq<eve> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = exn.a;
         this.b = exn.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected exn.a a() {
         return this;
      }

      public exn.a a(ayk<eoc> $$0) {
         this.a = $$0;
         return this;
      }

      public exn.a a(jq<eve> $$0) {
         this.b = $$0;
         return this;
      }

      public exn.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public exn.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public exn.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public exv b() {
         return new exn(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
