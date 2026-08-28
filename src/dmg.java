import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmg extends dmp {
   public static final MapCodec<dmg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.h.c), t()).apply($$0, dmg::new)
   );
   private static final int f = 3;
   private static final int g = 2;
   private final dmg.a h;

   @Override
   public MapCodec<? extends dmg> a() {
      return a;
   }

   public dmg(dmg.a $$0, dww.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.h = $$0;
   }

   public dmg(boolean $$0, dww.d $$1) {
      super(dmg.a.a($$0).d, dmg.a.a($$0).e, $$1);
      this.h = dmg.a.a($$0);
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if (this.h.e() && $$3.a(700) == 0) {
         dwx $$4 = $$1.a_($$2.e());
         if ($$4.a(djo.tW)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.jh, awb.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.d().f, awb.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.h.d().g, awb.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (!$$1.G_().j()) {
         return false;
      } else if ($$1.V() != this.h.c) {
         return false;
      } else {
         dmg.a $$4 = this.h.d();
         $$1.a($$2, $$4.c(), 3);
         $$1.a(ebt.c, $$2, ebt.a.a($$0));
         $$4.a($$1, $$2, $$3);
         ji.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            dwx $$5 = $$1.a_($$4x);
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
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      if (!$$1.B_() && $$1.am() != bsg.a && $$3 instanceof cgy $$4 && !$$4.b(btr.s)) {
         $$4.a(this.b());
      }
   }

   @Override
   public btp b() {
      return new btp(btr.s, 25);
   }

   public static enum a {
      a(true, btr.o, 7.0F, awa.jd, awa.je, 16545810),
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

      public dwx a() {
         return this == a ? djo.ua.m() : djo.tZ.m();
      }

      public djm b() {
         return this.c ? djo.tZ : djo.ua;
      }

      public dwx c() {
         return this.b().m();
      }

      public dmg.a d() {
         return a(!this.c);
      }

      public boolean e() {
         return this.c;
      }

      public static dmg.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(arc $$0, ji $$1, azh $$2) {
         fba $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fba $$5 = new fba($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fba $$6 = $$3.e($$5.c($$4));
         ly $$7 = new ly($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public avz f() {
         return this.f;
      }
   }
}
