import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exu extends eyb {
   public static final axf<eoj> a = axb.l;
   public static final jr<evl> b = evm.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<exu> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axf.a(mc.aW).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  evl.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, exu::new)
   );
   private final axf<eoj> h;
   private final jr<evl> i;
   private final byte j;
   private final int k;
   private final boolean l;

   exu(List<ezx> $$0, axf<eoj> $$1, jr<evl> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public eyd<exu> b() {
      return eye.q;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(ezi.f);
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      if (!$$0.a(cxl.vk)) {
         return $$0;
      } else {
         fbx $$2 = $$1.c(ezi.f);
         if ($$2 != null) {
            ard $$3 = $$1.d();
            ji $$4 = $$3.a(this.h, ji.a((kb)$$2), this.k, this.l);
            if ($$4 != null) {
               cxh $$5 = cxu.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               cxu.a($$3, $$5);
               evq.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static exu.a c() {
      return new exu.a();
   }

   public static class a extends eyb.a<exu.a> {
      private axf<eoj> a;
      private jr<evl> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = exu.a;
         this.b = exu.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected exu.a a() {
         return this;
      }

      public exu.a a(axf<eoj> $$0) {
         this.a = $$0;
         return this;
      }

      public exu.a a(jr<evl> $$0) {
         this.b = $$0;
         return this;
      }

      public exu.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public exu.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public exu.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public eyc b() {
         return new exu(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
