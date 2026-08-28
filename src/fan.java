import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fan extends fau {
   public static final axr<erb> a = axn.l;
   public static final je<eye> b = eyf.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<fan> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axr.a(mg.be).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eye.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, fan::new)
   );
   private final axr<erb> h;
   private final je<eye> i;
   private final byte j;
   private final int k;
   private final boolean l;

   fan(List<fcq> $$0, axr<erb> $$1, je<eye> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public faw<fan> b() {
      return fax.q;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.f);
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if (!$$0.a(czh.vt)) {
         return $$0;
      } else {
         feq $$2 = $$1.c(fcb.f);
         if ($$2 != null) {
            arq $$3 = $$1.d();
            iu $$4 = $$3.a(this.h, iu.a((jo)$$2), this.k, this.l);
            if ($$4 != null) {
               czd $$5 = czq.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               czq.a($$3, $$5);
               eyj.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static fan.a c() {
      return new fan.a();
   }

   public static class a extends fau.a<fan.a> {
      private axr<erb> a;
      private je<eye> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = fan.a;
         this.b = fan.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected fan.a a() {
         return this;
      }

      public fan.a a(axr<erb> $$0) {
         this.a = $$0;
         return this;
      }

      public fan.a a(je<eye> $$0) {
         this.b = $$0;
         return this;
      }

      public fan.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public fan.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fan.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public fav b() {
         return new fan(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
