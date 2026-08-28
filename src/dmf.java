import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmf extends dmo {
   public static final MapCodec<dmf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.h.c), t()).apply($$0, dmf::new)
   );
   private static final int f = 3;
   private static final int g = 2;
   private final dmf.a h;

   @Override
   public MapCodec<? extends dmf> a() {
      return a;
   }

   public dmf(dmf.a $$0, dwv.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.h = $$0;
   }

   public dmf(boolean $$0, dwv.d $$1) {
      super(dmf.a.a($$0).d, dmf.a.a($$0).e, $$1);
      this.h = dmf.a.a($$0);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      if (this.h.d() && $$3.a(700) == 0) {
         dww $$4 = $$1.a_($$2.e());
         if ($$4.a(djn.tW)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.jh, awb.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.c().f, awb.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.c().g, awb.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$1.G_().j()) {
         return false;
      } else if ($$1.V() != this.h.c) {
         return false;
      } else {
         dmf.a $$4 = this.h.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(ebs.c, $$2, ebs.a.a($$0));
         $$4.a($$1, $$2, $$3);
         ji.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            dww $$5 = $$1.a_($$4x);
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
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if (!$$1.B_() && $$1.am() != bsg.a && $$3 instanceof cgy $$4 && cgy.c($$0) && !$$4.b(btr.s)) {
         $$4.a(this.b());
      }
   }

   @Override
   public btp b() {
      return new btp(btr.s, 25);
   }

   public static enum a {
      a(true, btr.o, 11.0F, awa.jd, awa.je, 16545810),
      b(false, btr.i, 7.0F, awa.jf, awa.jg, 6250335);

      final boolean c;
      final jr<btn> d;
      final float e;
      final avz f;
      final avz g;
      private final int h;

      private a(final boolean $$0, final jr<btn> $$1, final float $$2, final avz $$3, final avz $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public djl a() {
         return this.c ? djn.tZ : djn.ua;
      }

      public dww b() {
         return this.a().m();
      }

      public dmf.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dmf.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(ard $$0, ji $$1, azh $$2) {
         faz $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         faz $$5 = new faz($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         faz $$6 = $$3.e($$5.c($$4));
         ly $$7 = new ly($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public avz e() {
         return this.f;
      }
   }
}
