import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etc extends esx {
   public static final float e = 0.44444445F;

   @Override
   public esy d() {
      return eta.d;
   }

   @Override
   public esy e() {
      return eta.e;
   }

   @Override
   public cwl a() {
      return cwt.rh;
   }

   @Override
   public void a(dgi $$0, ji $$1, esz $$2, azh $$3) {
      ji $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lt.aa, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awa.op, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awa.on, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(arc $$0, ji $$1, esz $$2, azh $$3) {
      if ($$0.O().b(dge.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ji $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dwx $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dgl)$$0, $$5)) {
                     $$0.b($$5, diz.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ji $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), diz.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dgl $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dgl $$0, ji $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lr h() {
      return lt.i;
   }

   @Override
   protected void a(dgj $$0, ji $$1, dwx $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dgl $$0) {
      return $$0.G_().i() ? 4 : 2;
   }

   @Override
   public dwx b(esz $$0) {
      return djo.K.m().b(doe.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(esy $$0) {
      return $$0 == eta.e || $$0 == eta.d;
   }

   @Override
   public int c(dgl $$0) {
      return $$0.G_().i() ? 1 : 2;
   }

   @Override
   public boolean a(esz $$0, dfn $$1, ji $$2, esy $$3, jn $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awv.a);
   }

   @Override
   public int a(dgl $$0) {
      return $$0.G_().i() ? 10 : 30;
   }

   @Override
   public int a(dgi $$0, ji $$1, esz $$2, esz $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.H_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dgj $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(arc $$0) {
      return $$0.O().b(dge.W);
   }

   @Override
   protected void a(dgj $$0, ji $$1, dwx $$2, jn $$3, esz $$4) {
      if ($$3 == jn.a) {
         esz $$5 = $$0.b_($$1);
         if (this.a(awv.b) && $$5.a(awv.a)) {
            if ($$2.b() instanceof doe) {
               $$0.a($$1, djo.b.m(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avz> j() {
      return Optional.of(awa.dm);
   }

   public static class a extends etc {
      @Override
      protected void a(dwy.a<esy, esz> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(esz $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(esz $$0) {
         return false;
      }
   }

   public static class b extends etc {
      @Override
      public int d(esz $$0) {
         return 8;
      }

      @Override
      public boolean c(esz $$0) {
         return true;
      }
   }
}
