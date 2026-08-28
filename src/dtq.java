import com.mojang.serialization.MapCodec;

public class dtq extends dpf {
   public static final MapCodec<dtq> a = b(dtq::new);
   public static final ebv b = ebu.v;
   public static final ece d = ebu.aD;

   @Override
   public MapCodec<dtq> a() {
      return a;
   }

   protected dtq(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(d, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$3.gk().e) {
         return bur.e;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bur.a;
      }
   }

   @Override
   protected int h(ebe $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == jb.a && !this.a($$1, $$5, $$6)) {
         return dne.a.m();
      } else {
         return !$$1.A_() && $$4.o() != $$0.c(e).o() ? $$0.b(b, Boolean.valueOf(this.b($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dka $$0, iv $$1, ebe $$2) {
      return this.a((dkp)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(c)) {
         jb $$4 = $$0.c(e);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(d) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(lt.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e, d, b, c);
   }
}
