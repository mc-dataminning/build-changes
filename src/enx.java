import java.util.Optional;
import javax.annotation.Nullable;

public abstract class enx extends ens {
   public static final float e = 0.44444445F;

   @Override
   public ent d() {
      return env.d;
   }

   @Override
   public ent e() {
      return env.e;
   }

   @Override
   public cuj a() {
      return cur.qA;
   }

   @Override
   public void a(dbx $$0, iz $$1, enu $$2, azg $$3) {
      iz $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(li.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, avz.nR, awa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), avz.nP, awa.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dbx $$0, iz $$1, enu $$2, azg $$3) {
      if ($$0.ab().b(dbt.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            iz $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dsb $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dca)$$0, $$5)) {
                     $$0.b($$5, del.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               iz $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), del.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dca $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dca $$0, iz $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.am() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public lg h() {
      return li.i;
   }

   @Override
   protected void a(dby $$0, iz $$1, dsb $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dca $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dsb b(enu $$0) {
      return dfa.H.o().a(djo.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ent $$0) {
      return $$0 == env.e || $$0 == env.d;
   }

   @Override
   public int c(dca $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(enu $$0, dbd $$1, iz $$2, ent $$3, je $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awu.a);
   }

   @Override
   public int a(dca $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dbx $$0, iz $$1, enu $$2, enu $$3) {
      int $$4 = this.a((dca)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((dbd)$$0, $$1) > $$2.a((dbd)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dby $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dbx $$0) {
      return $$0.ab().b(dbt.V);
   }

   @Override
   protected void a(dby $$0, iz $$1, dsb $$2, je $$3, enu $$4) {
      if ($$3 == je.a) {
         enu $$5 = $$0.b_($$1);
         if (this.a(awu.b) && $$5.a(awu.a)) {
            if ($$2.b() instanceof djo) {
               $$0.a($$1, dfa.b.o(), 3);
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
      return Optional.of(avz.dl);
   }

   public static class a extends enx {
      @Override
      protected void a(dsc.a<ent, enu> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(enu $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(enu $$0) {
         return false;
      }
   }

   public static class b extends enx {
      @Override
      public int d(enu $$0) {
         return 8;
      }

      @Override
      public boolean c(enu $$0) {
         return true;
      }
   }
}
