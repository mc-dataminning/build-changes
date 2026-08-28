import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dno extends dny {
   public static final MapCodec<dno> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("open").forGetter($$0x -> $$0x.f.c), t()).apply($$0, dno::new)
   );
   private static final int d = 3;
   private static final int e = 2;
   private final dno.a f;

   @Override
   public MapCodec<? extends dno> a() {
      return a;
   }

   public dno(dno.a $$0, dyl.d $$1) {
      super($$0.d, $$0.e, $$1);
      this.f = $$0;
   }

   public dno(boolean $$0, dyl.d $$1) {
      super(dno.a.a($$0).d, dno.a.a($$0).e, $$1);
      this.f = dno.a.a($$0);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if (this.f.d() && $$3.a(700) == 0) {
         dym $$4 = $$1.a_($$2.e());
         if ($$4.a(dkw.ua)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awk.jh, awl.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().f, awl.e, 1.0F, 1.0F);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (this.c($$0, $$1, $$2, $$3)) {
         $$1.a(null, $$2, this.f.c().g, awl.e, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private boolean c(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!$$1.B_().j()) {
         return false;
      } else if (dmp.a($$1) == this.f.c) {
         return false;
      } else {
         dno.a $$4 = this.f.c();
         $$1.a($$2, $$4.b(), 3);
         $$1.a(edm.c, $$2, edm.a.a($$0));
         $$4.a($$1, $$2, $$3);
         jj.c($$2.b(-3, -2, -3), $$2.b(3, 2, 3)).forEach($$4x -> {
            dym $$5 = $$1.a_($$4x);
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
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (!$$1.w_() && $$1.an() != btn.a && $$3 instanceof cih $$4 && cih.c($$0) && !$$4.b(buy.s)) {
         $$4.a(this.b());
      }
   }

   @Override
   public buw b() {
      return new buw(buy.s, 25);
   }

   public static enum a {
      a(true, buy.o, 11.0F, awk.jd, awk.je, 16545810),
      b(false, buy.i, 7.0F, awk.jf, awk.jg, 6250335);

      final boolean c;
      final js<buu> d;
      final float e;
      final awj f;
      final awj g;
      private final int h;

      private a(final boolean $$0, final js<buu> $$1, final float $$2, final awj $$3, final awj $$4, final int $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }

      public dku a() {
         return this.c ? dkw.ud : dkw.ue;
      }

      public dym b() {
         return this.a().m();
      }

      public dno.a c() {
         return a(!this.c);
      }

      public boolean d() {
         return this.c;
      }

      public static dno.a a(boolean $$0) {
         return $$0 ? a : b;
      }

      public void a(arn $$0, jj $$1, azs $$2) {
         fcu $$3 = $$1.b();
         double $$4 = 0.5 + $$2.j();
         fcu $$5 = new fcu($$2.j() - 0.5, $$2.j() + 1.0, $$2.j() - 0.5);
         fcu $$6 = $$3.e($$5.c($$4));
         ma $$7 = new ma($$6, this.h, (int)(20.0 * $$4));
         $$0.a($$7, $$3.d, $$3.e, $$3.f, 1, 0.0, 0.0, 0.0, 0.0);
      }

      public awj e() {
         return this.f;
      }
   }
}
