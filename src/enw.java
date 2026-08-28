import java.util.Optional;
import javax.annotation.Nullable;

public abstract class enw extends enr {
   public static final float e = 0.44444445F;

   @Override
   public ens d() {
      return enu.d;
   }

   @Override
   public ens e() {
      return enu.e;
   }

   @Override
   public cui a() {
      return cuq.qA;
   }

   @Override
   public void a(dbw $$0, iz $$1, ent $$2, azf $$3) {
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
   public void b(dbw $$0, iz $$1, ent $$2, azf $$3) {
      if ($$0.ab().b(dbs.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            iz $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dsa $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dbz)$$0, $$5)) {
                     $$0.b($$5, dek.a($$0, $$5));
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
                  $$0.b($$9.c(), dek.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dbz $$0, iz $$1) {
      for (je $$2 : je.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dbz $$0, iz $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.am() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public lg h() {
      return li.i;
   }

   @Override
   protected void a(dbx $$0, iz $$1, dsa $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dbz $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dsa b(ent $$0) {
      return dez.H.o().a(djn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ens $$0) {
      return $$0 == enu.e || $$0 == enu.d;
   }

   @Override
   public int c(dbz $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ent $$0, dbc $$1, iz $$2, ens $$3, je $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awu.a);
   }

   @Override
   public int a(dbz $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dbw $$0, iz $$1, ent $$2, ent $$3) {
      int $$4 = this.a((dbz)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((dbc)$$0, $$1) > $$2.a((dbc)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dbx $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dbw $$0) {
      return $$0.ab().b(dbs.V);
   }

   @Override
   protected void a(dbx $$0, iz $$1, dsa $$2, je $$3, ent $$4) {
      if ($$3 == je.a) {
         ent $$5 = $$0.b_($$1);
         if (this.a(awu.b) && $$5.a(awu.a)) {
            if ($$2.b() instanceof djn) {
               $$0.a($$1, dez.b.o(), 3);
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

   public static class a extends enw {
      @Override
      protected void a(dsb.a<ens, ent> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ent $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ent $$0) {
         return false;
      }
   }

   public static class b extends enw {
      @Override
      public int d(ent $$0) {
         return 8;
      }

      @Override
      public boolean c(ent $$0) {
         return true;
      }
   }
}
