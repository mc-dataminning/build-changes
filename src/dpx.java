import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpx extends dqi {
   public static final MapCodec<dpx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.f.c), t()).apply($$0, dpx::new)
   );
   private static final int d = 3;
   private static final int e = 2;
   private final dpx.a f;

   @Override
   public MapCodec<? extends dpx> a() {
      return a;
   }

   public dpx(dpx.a $$0, ebd.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.f = $$0;
   }

   public dpx(boolean $$0, ebd.d $$1) {
      super(dpx.a.a($$0).d, dpx.a.a($$0).e, $$1);
      this.f = dpx.a.a($$0);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if (this.f.d() && $$3.a(700) == 0) {
         ebe $$4 = $$1.a_($$2.e());
         if ($$4.a(dne.ue)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awp.jk, awq.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().f, awq.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().g, awq.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!$$1.F_().j()) {
         return false;
      } else if (doy.a($$1) == this.f.c) {
         return false;
      } else {
         dpx.a $$4 = this.f.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(ege.c, $$2, ege.a.a($$0));
         $$4.a($$1, $$2, $$3);
         iv.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            ebe $$5 = $$1.a_($$4x);
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
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if (!$$1.A_() && $$1.an() != buo.a && $$3 instanceof cjl $$5 && cjl.c($$0) && !$$5.b(bvz.s)) {
         $$5.a(this.b());
      }
   }

   @Override
   public bvx b() {
      return new bvx(bvz.s, 25);
   }

   public static enum a {
      a(true, bvz.o, 11.0F, awp.jg, awp.jh, 16545810),
      b(false, bvz.i, 7.0F, awp.ji, awp.jj, 6250335);

      final boolean c;
      final jf<bvv> d;
      final float e;
      final awo f;
      final awo g;
      private final int h;

      private a(final boolean $$0, final jf<bvv> $$1, final float $$2, final awo $$3, final awo $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dnc a() {
         return this.c ? dne.uh : dne.ui;
      }

      public ebe b() {
         return this.a().m();
      }

      public dpx.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dpx.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(ars $$0, iv $$1, azx $$2) {
         ffq $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         ffq $$5 = new ffq($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         ffq $$6 = $$3.e($$5.c($$4));
         md $$7 = new md($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public awo e() {
         return this.f;
      }
   }
}
