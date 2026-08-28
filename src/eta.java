import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eta extends esv {
   public static final float e = 0.44444445F;

   @Override
   public esw d() {
      return esy.d;
   }

   @Override
   public esw e() {
      return esy.e;
   }

   @Override
   public cwj a() {
      return cwr.rh;
   }

   @Override
   public void a(dgg $$0, ji $$1, esx $$2, azg $$3) {
      ji $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lt.aa, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, avz.op, awa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), avz.on, awa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(arc $$0, ji $$1, esx $$2, azg $$3) {
      if ($$0.O().b(dgc.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ji $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dwv $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dgj)$$0, $$5)) {
                     $$0.b($$5, dix.a($$0, $$5));
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
                  $$0.b($$9.d(), dix.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dgj $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dgj $$0, ji $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lr h() {
      return lt.i;
   }

   @Override
   protected void a(dgh $$0, ji $$1, dwv $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dgj $$0) {
      return $$0.G_().i() ? 4 : 2;
   }

   @Override
   public dwv b(esx $$0) {
      return djm.K.m().b(doc.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(esw $$0) {
      return $$0 == esy.e || $$0 == esy.d;
   }

   @Override
   public int c(dgj $$0) {
      return $$0.G_().i() ? 1 : 2;
   }

   @Override
   public boolean a(esx $$0, dfl $$1, ji $$2, esw $$3, jn $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awu.a);
   }

   @Override
   public int a(dgj $$0) {
      return $$0.G_().i() ? 10 : 30;
   }

   @Override
   public int a(dgg $$0, ji $$1, esx $$2, esx $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.H_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dgh $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(arc $$0) {
      return $$0.O().b(dgc.W);
   }

   @Override
   protected void a(dgh $$0, ji $$1, dwv $$2, jn $$3, esx $$4) {
      if ($$3 == jn.a) {
         esx $$5 = $$0.b_($$1);
         if (this.a(awu.b) && $$5.a(awu.a)) {
            if ($$2.b() instanceof doc) {
               $$0.a($$1, djm.b.m(), 3);
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
   public Optional<avy> j() {
      return Optional.of(avz.dm);
   }

   public static class a extends eta {
      @Override
      protected void a(dww.a<esw, esx> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(esx $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(esx $$0) {
         return false;
      }
   }

   public static class b extends eta {
      @Override
      public int d(esx $$0) {
         return 8;
      }

      @Override
      public boolean c(esx $$0) {
         return true;
      }
   }
}
