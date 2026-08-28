import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqj extends dqu {
   public static final MapCodec<dqj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.f.c), t()).apply($$0, dqj::new)
   );
   private static final int d = 3;
   private static final int e = 2;
   private final dqj.a f;

   @Override
   public MapCodec<? extends dqj> a() {
      return a;
   }

   public dqj(dqj.a $$0, ebp.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.f = $$0;
   }

   public dqj(boolean $$0, ebp.d $$1) {
      super(dqj.a.a($$0).d, dqj.a.a($$0).e, $$1);
      this.f = dqj.a.a($$0);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      if (this.f.d() && $$3.a(700) == 0) {
         ebq $$4 = $$1.a_($$2.e());
         if ($$4.a(dnq.ue)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awy.jk, awz.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().f, awz.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().g, awz.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$1.F_().j()) {
         return false;
      } else if (dpk.a($$1) == this.f.c) {
         return false;
      } else {
         dqj.a $$4 = this.f.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(egq.c, $$2, egq.a.a($$0));
         $$4.a($$1, $$2, $$3);
         iw.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            ebq $$5 = $$1.a_($$4x);
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
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if (!$$1.A_() && $$1.an() != buz.a && $$3 instanceof cjw $$5 && cjw.c($$0) && !$$5.b(bwk.s)) {
         $$5.a(this.b());
      }
   }

   @Override
   public bwi b() {
      return new bwi(bwk.s, 25);
   }

   public static enum a {
      a(true, bwk.o, 11.0F, awy.jg, awy.jh, 16545810),
      b(false, bwk.i, 7.0F, awy.ji, awy.jj, 6250335);

      final boolean c;
      final jg<bwg> d;
      final float e;
      final awx f;
      final awx g;
      private final int h;

      private a(final boolean $$0, final jg<bwg> $$1, final float $$2, final awx $$3, final awx $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dno a() {
         return this.c ? dnq.uh : dnq.ui;
      }

      public ebq b() {
         return this.a().m();
      }

      public dqj.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dqj.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(asb $$0, iw $$1, bai $$2) {
         fgc $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fgc $$5 = new fgc($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fgc $$6 = $$3.e($$5.c($$4));
         me $$7 = new me($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public awx e() {
         return this.f;
      }
   }
}
