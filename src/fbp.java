import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbp extends fbw {
   public static final axv<esd> a = axr.l;
   public static final jg<ezg> b = ezh.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<fbp> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axv.a(mi.be).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  ezg.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, fbp::new)
   );
   private final axv<esd> h;
   private final jg<ezg> i;
   private final byte j;
   private final int k;
   private final boolean l;

   fbp(List<fds> $$0, axv<esd> $$1, jg<ezg> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public fby<fbp> b() {
      return fbz.q;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.f);
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if (!$$0.a(dae.vt)) {
         return $$0;
      } else {
         ffs $$2 = $$1.c(fdd.f);
         if ($$2 != null) {
            aru $$3 = $$1.d();
            iw $$4 = $$3.a(this.h, iw.a((jq)$$2), this.k, this.l);
            if ($$4 != null) {
               daa $$5 = dan.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               dan.a($$3, $$5);
               ezl.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static fbp.a c() {
      return new fbp.a();
   }

   public static class a extends fbw.a<fbp.a> {
      private axv<esd> a;
      private jg<ezg> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = fbp.a;
         this.b = fbp.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected fbp.a a() {
         return this;
      }

      public fbp.a a(axv<esd> $$0) {
         this.a = $$0;
         return this;
      }

      public fbp.a a(jg<ezg> $$0) {
         this.b = $$0;
         return this;
      }

      public fbp.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public fbp.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fbp.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public fbx b() {
         return new fbp(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
