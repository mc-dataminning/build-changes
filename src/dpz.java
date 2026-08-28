import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpz extends dqk {
   public static final MapCodec<dpz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.f.c), t()).apply($$0, dpz::new)
   );
   private static final int d = 3;
   private static final int e = 2;
   private final dpz.a f;

   @Override
   public MapCodec<? extends dpz> a() {
      return a;
   }

   public dpz(dpz.a $$0, ebf.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.f = $$0;
   }

   public dpz(boolean $$0, ebf.d $$1) {
      super(dpz.a.a($$0).d, dpz.a.a($$0).e, $$1);
      this.f = dpz.a.a($$0);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if (this.f.d() && $$3.a(700) == 0) {
         ebg $$4 = $$1.a_($$2.e());
         if ($$4.a(dng.ue)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awr.jk, aws.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().f, aws.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().g, aws.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!$$1.F_().j()) {
         return false;
      } else if (dpa.a($$1) == this.f.c) {
         return false;
      } else {
         dpz.a $$4 = this.f.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(egg.c, $$2, egg.a.a($$0));
         $$4.a($$1, $$2, $$3);
         iw.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            ebg $$5 = $$1.a_($$4x);
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
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (!$$1.A_() && $$1.an() != buq.a && $$3 instanceof cjn $$5 && cjn.c($$0) && !$$5.b(bwb.s)) {
         $$5.a(this.b());
      }
   }

   @Override
   public bvz b() {
      return new bvz(bwb.s, 25);
   }

   public static enum a {
      a(true, bwb.o, 11.0F, awr.jg, awr.jh, 16545810),
      b(false, bwb.i, 7.0F, awr.ji, awr.jj, 6250335);

      final boolean c;
      final jg<bvx> d;
      final float e;
      final awq f;
      final awq g;
      private final int h;

      private a(final boolean $$0, final jg<bvx> $$1, final float $$2, final awq $$3, final awq $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dne a() {
         return this.c ? dng.uh : dng.ui;
      }

      public ebg b() {
         return this.a().m();
      }

      public dpz.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dpz.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(aru $$0, iw $$1, azz $$2) {
         ffs $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         ffs $$5 = new ffs($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         ffs $$6 = $$3.e($$5.c($$4));
         me $$7 = new me($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public awq e() {
         return this.f;
      }
   }
}
