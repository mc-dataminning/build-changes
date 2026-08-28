import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dme extends dmn {
   public static final MapCodec<dme> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.h.c), t()).apply($$0, dme::new)
   );
   private static final int f = 3;
   private static final int g = 2;
   private final dme.a h;

   @Override
   public MapCodec<? extends dme> a() {
      return a;
   }

   public dme(dme.a $$0, dwu.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.h = $$0;
   }

   public dme(boolean $$0, dwu.d $$1) {
      super(dme.a.a($$0).d, dme.a.a($$0).e, $$1);
      this.h = dme.a.a($$0);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if (this.h.d() && $$3.a(700) == 0) {
         dwv $$4 = $$1.a_($$2.e());
         if ($$4.a(djm.tW)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avz.jh, awa.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.c().f, awa.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.c().g, awa.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$1.G_().j()) {
         return false;
      } else if ($$1.V() != this.h.c) {
         return false;
      } else {
         dme.a $$4 = this.h.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(ebr.c, $$2, ebr.a.a($$0));
         $$4.a($$1, $$2, $$3);
         ji.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            dwv $$5 = $$1.a_($$4x);
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
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if (!$$1.B_() && $$1.am() != bsf.a && $$3 instanceof cgx $$4 && cgx.c($$0) && !$$4.b(btq.s)) {
         $$4.a(this.b());
      }
   }

   @Override
   public bto b() {
      return new bto(btq.s, 25);
   }

   public static enum a {
      a(true, btq.o, 11.0F, avz.jd, avz.je, 16545810),
      b(false, btq.i, 7.0F, avz.jf, avz.jg, 6250335);

      final boolean c;
      final jr<btm> d;
      final float e;
      final avy f;
      final avy g;
      private final int h;

      private a(final boolean $$0, final jr<btm> $$1, final float $$2, final avy $$3, final avy $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public djk a() {
         return this.c ? djm.tZ : djm.ua;
      }

      public dwv b() {
         return this.a().m();
      }

      public dme.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dme.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(arc $$0, ji $$1, azg $$2) {
         fay $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fay $$5 = new fay($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fay $$6 = $$3.e($$5.c($$4));
         ly $$7 = new ly($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public avy e() {
         return this.f;
      }
   }
}
