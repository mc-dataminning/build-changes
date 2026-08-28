import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmy extends dni {
   public static final MapCodec<dmy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.f.c), t()).apply($$0, dmy::new)
   );
   private static final int d = 3;
   private static final int e = 2;
   private final dmy.a f;

   @Override
   public MapCodec<? extends dmy> a() {
      return a;
   }

   public dmy(dmy.a $$0, dxp.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.f = $$0;
   }

   public dmy(boolean $$0, dxp.d $$1) {
      super(dmy.a.a($$0).d, dmy.a.a($$0).e, $$1);
      this.f = dmy.a.a($$0);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if (this.f.d() && $$3.a(700) == 0) {
         dxq $$4 = $$1.a_($$2.e());
         if ($$4.a(dkg.tY)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.jh, awb.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().f, awb.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().g, awb.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$1.B_().j()) {
         return false;
      } else if (dlz.a($$1) == this.f.c) {
         return false;
      } else {
         dmy.a $$4 = this.f.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(ecp.c, $$2, ecp.a.a($$0));
         $$4.a($$1, $$2, $$3);
         ji.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            dxq $$5 = $$1.a_($$4x);
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
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (!$$1.w_() && $$1.an() != bsv.a && $$3 instanceof chq $$4 && chq.c($$0) && !$$4.b(bug.s)) {
         $$4.a(this.b());
      }
   }

   @Override
   public bue b() {
      return new bue(bug.s, 25);
   }

   public static enum a {
      a(true, bug.o, 11.0F, awa.jd, awa.je, 16545810),
      b(false, bug.i, 7.0F, awa.jf, awa.jg, 6250335);

      final boolean c;
      final jr<buc> d;
      final float e;
      final avz f;
      final avz g;
      private final int h;

      private a(final boolean $$0, final jr<buc> $$1, final float $$2, final avz $$3, final avz $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dke a() {
         return this.c ? dkg.ub : dkg.uc;
      }

      public dxq b() {
         return this.a().m();
      }

      public dmy.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dmy.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(ard $$0, ji $$1, azh $$2) {
         fbx $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fbx $$5 = new fbx($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fbx $$6 = $$3.e($$5.c($$4));
         ly $$7 = new ly($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public avz e() {
         return this.f;
      }
   }
}
