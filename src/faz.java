import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class faz extends fbg {
   public static final axr<ern> a = axn.l;
   public static final jf<eyq> b = eyr.i;
   public static final byte c = 2;
   public static final int d = 50;
   public static final boolean e = true;
   public static final MapCodec<faz> f = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axr.a(mh.be).optionalFieldOf("destination", a).forGetter($$0x -> $$0x.h),
                  eyq.b.optionalFieldOf("decoration", b).forGetter($$0x -> $$0x.i),
                  Codec.BYTE.optionalFieldOf("zoom", (byte)2).forGetter($$0x -> $$0x.j),
                  Codec.INT.optionalFieldOf("search_radius", 50).forGetter($$0x -> $$0x.k),
                  Codec.BOOL.optionalFieldOf("skip_existing_chunks", true).forGetter($$0x -> $$0x.l)
               )
            )
            .apply($$0, faz::new)
   );
   private final axr<ern> h;
   private final jf<eyq> i;
   private final byte j;
   private final int k;
   private final boolean l;

   faz(List<fdc> $$0, axr<ern> $$1, jf<eyq> $$2, byte $$3, int $$4, boolean $$5) {
      super($$0);
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
   }

   @Override
   public fbi<faz> b() {
      return fbj.q;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.f);
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if (!$$0.a(czr.vt)) {
         return $$0;
      } else {
         ffc $$2 = $$1.c(fcn.f);
         if ($$2 != null) {
            arq $$3 = $$1.d();
            iv $$4 = $$3.a(this.h, iv.a((jp)$$2), this.k, this.l);
            if ($$4 != null) {
               czn $$5 = daa.a($$3, $$4.u(), $$4.w(), this.j, true, true);
               daa.a($$3, $$5);
               eyv.a($$5, $$4, "+", this.i);
               return $$5;
            }
         }

         return $$0;
      }
   }

   public static faz.a c() {
      return new faz.a();
   }

   public static class a extends fbg.a<faz.a> {
      private axr<ern> a;
      private jf<eyq> b;
      private byte c;
      private int d;
      private boolean e;

      public a() {
         this.a = faz.a;
         this.b = faz.b;
         this.c = 2;
         this.d = 50;
         this.e = true;
      }

      protected faz.a a() {
         return this;
      }

      public faz.a a(axr<ern> $$0) {
         this.a = $$0;
         return this;
      }

      public faz.a a(jf<eyq> $$0) {
         this.b = $$0;
         return this;
      }

      public faz.a a(byte $$0) {
         this.c = $$0;
         return this;
      }

      public faz.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public faz.a a(boolean $$0) {
         this.e = $$0;
         return this;
      }

      @Override
      public fbh b() {
         return new faz(this.g(), this.a, this.b, this.c, this.d, this.e);
      }
   }
}
