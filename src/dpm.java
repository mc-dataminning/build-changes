import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpm extends dpx {
   public static final MapCodec<dpm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.f.c), t()).apply($$0, dpm::new)
   );
   private static final int d = 3;
   private static final int e = 2;
   private final dpm.a f;

   @Override
   public MapCodec<? extends dpm> a() {
      return a;
   }

   public dpm(dpm.a $$0, eas.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.f = $$0;
   }

   public dpm(boolean $$0, eas.d $$1) {
      super(dpm.a.a($$0).d, dpm.a.a($$0).e, $$1);
      this.f = dpm.a.a($$0);
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if (this.f.d() && $$3.a(700) == 0) {
         eat $$4 = $$1.a_($$2.e());
         if ($$4.a(dmt.ue)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.jk, awo.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().f, awo.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().g, awo.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$1.B_().j()) {
         return false;
      } else if (don.a($$1) == this.f.c) {
         return false;
      } else {
         dpm.a $$4 = this.f.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(eft.c, $$2, eft.a.a($$0));
         $$4.a($$1, $$2, $$3);
         iv.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            eat $$5 = $$1.a_($$4x);
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
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!$$1.w_() && $$1.an() != bud.a && $$3 instanceof cja $$5 && cja.c($$0) && !$$5.b(bvo.s)) {
         $$5.a(this.b());
      }
   }

   @Override
   public bvm b() {
      return new bvm(bvo.s, 25);
   }

   public static enum a {
      a(true, bvo.o, 11.0F, awn.jg, awn.jh, 16545810),
      b(false, bvo.i, 7.0F, awn.ji, awn.jj, 6250335);

      final boolean c;
      final jf<bvk> d;
      final float e;
      final awm f;
      final awm g;
      private final int h;

      private a(final boolean $$0, final jf<bvk> $$1, final float $$2, final awm $$3, final awm $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dmr a() {
         return this.c ? dmt.uh : dmt.ui;
      }

      public eat b() {
         return this.a().m();
      }

      public dpm.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dpm.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(arq $$0, iv $$1, azv $$2) {
         ffc $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         ffc $$5 = new ffc($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         ffc $$6 = $$3.e($$5.c($$4));
         md $$7 = new md($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public awm e() {
         return this.f;
      }
   }
}
