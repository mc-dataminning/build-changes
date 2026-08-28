import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmx extends dng {
   public static final MapCodec<dmx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.h.c), t()).apply($$0, dmx::new)
   );
   private static final int f = 3;
   private static final int g = 2;
   private final dmx.a h;

   @Override
   public MapCodec<? extends dmx> a() {
      return a;
   }

   public dmx(dmx.a $$0, dxn.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.h = $$0;
   }

   public dmx(boolean $$0, dxn.d $$1) {
      super(dmx.a.a($$0).d, dmx.a.a($$0).e, $$1);
      this.h = dmx.a.a($$0);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if (this.h.b() && $$3.a(700) == 0) {
         dxo $$4 = $$1.a_($$2.e());
         if ($$4.a(dkf.tW)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awv.jh, aww.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.f, aww.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.g, aww.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!$$1.G_().j()) {
         return false;
      } else if ($$1.V() != this.h.c) {
         return false;
      } else {
         dxo $$4 = this.h.a();
         $$1.a($$2, $$4, 3);
         this.h.a($$1, $$2, $$3);
         jh.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            dxo $$5 = $$1.a_($$4x);
            if ($$5 == $$0) {
               double $$6 = Math.sqrt($$2.j($$4x));
               int $$7 = $$3.a((int)($$6 * 5.0), (int)($$6 * 10.0));
               $$1.a($$4x, $$0.b(), $$7);
            }
         });
         return true;
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if (!$$1.B_() && $$1.am() != bsx.a && $$3 instanceof chp $$4 && !$$4.b(bui.s)) {
         $$4.a(this.b());
      }
   }

   @Override
   public bug b() {
      return new bug(bui.s, 25);
   }

   public static enum a {
      a(true, bui.o, 7.0F, awv.jd, awv.je, 6250335),
      b(false, bui.i, 7.0F, awv.jf, awv.jg, 16545810);

      final boolean c;
      final jq<bue> d;
      final float e;
      final awu f;
      final awu g;
      private final int h;

      private a(final boolean $$0, final jq<bue> $$1, final float $$2, final awu $$3, final awu $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dxo a() {
         return this == a ? dkf.ua.m() : dkf.tZ.m();
      }

      public boolean b() {
         return this.c;
      }

      public static dmx.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(arx $$0, jh $$1, bac $$2) {
         fbr $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fbr $$5 = new fbr($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fbr $$6 = $$3.e($$5.c($$4));
         lx $$7 = new lx($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public awu c() {
         return this.f;
      }
   }
}
