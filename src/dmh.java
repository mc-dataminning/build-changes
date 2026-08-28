import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmh extends dmq {
   public static final MapCodec<dmh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.h.c), t()).apply($$0, dmh::new)
   );
   private static final int f = 3;
   private static final int g = 2;
   private final dmh.a h;

   @Override
   public MapCodec<? extends dmh> a() {
      return a;
   }

   public dmh(dmh.a $$0, dwx.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.h = $$0;
   }

   public dmh(boolean $$0, dwx.d $$1) {
      super(dmh.a.a($$0).d, dmh.a.a($$0).e, $$1);
      this.h = dmh.a.a($$0);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if (this.h.d() && $$3.a(700) == 0) {
         dwy $$4 = $$1.a_($$2.e());
         if ($$4.a(djp.tW)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.jh, awb.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.c().f, awb.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.c().g, awb.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$1.G_().j()) {
         return false;
      } else if ($$1.V() != this.h.c) {
         return false;
      } else {
         dmh.a $$4 = this.h.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(ebu.c, $$2, ebu.a.a($$0));
         $$4.a($$1, $$2, $$3);
         ji.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            dwy $$5 = $$1.a_($$4x);
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
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if (!$$1.B_() && $$1.am() != bsi.a && $$3 instanceof cha $$4 && cha.c($$0) && !$$4.b(btt.s)) {
         $$4.a(this.b());
      }
   }

   @Override
   public btr b() {
      return new btr(btt.s, 25);
   }

   public static enum a {
      a(true, btt.o, 11.0F, awa.jd, awa.je, 16545810),
      b(false, btt.i, 7.0F, awa.jf, awa.jg, 6250335);

      final boolean c;
      final jr<btp> d;
      final float e;
      final avz f;
      final avz g;
      private final int h;

      private a(final boolean $$0, final jr<btp> $$1, final float $$2, final avz $$3, final avz $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public djn a() {
         return this.c ? djp.tZ : djp.ua;
      }

      public dwy b() {
         return this.a().m();
      }

      public dmh.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dmh.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(ard $$0, ji $$1, azh $$2) {
         fbb $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fbb $$5 = new fbb($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fbb $$6 = $$3.e($$5.c($$4));
         ly $$7 = new ly($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public avz e() {
         return this.f;
      }
   }
}
