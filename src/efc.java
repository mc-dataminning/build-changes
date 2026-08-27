import java.util.Optional;
import javax.annotation.Nullable;

public abstract class efc extends eex {
   public static final float e = 0.44444445F;

   @Override
   public eey d() {
      return efa.d;
   }

   @Override
   public eey e() {
      return efa.e;
   }

   @Override
   public cnb a() {
      return cnj.qz;
   }

   @Override
   public void a(ctx $$0, hx $$1, eez $$2, auw $$3) {
      hx $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(jx.V, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, art.ns, aru.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), art.nq, aru.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(ctx $$0, hx $$1, eez $$2, auw $$3) {
      if ($$0.Z().b(ctt.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            hx $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               djp $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((cua)$$0, $$5)) {
                     $$0.b($$5, cwl.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               hx $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cwl.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(cua $$0, hx $$1) {
      for (ic $$2 : ic.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cua $$0, hx $$1) {
      return $$1.v() >= $$0.J_() && $$1.v() < $$0.al() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public jv h() {
      return jx.j;
   }

   @Override
   protected void a(cty $$0, hx $$1, djp $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cua $$0) {
      return $$0.E_().i() ? 4 : 2;
   }

   @Override
   public djp b(eez $$0) {
      return cxa.H.o().a(dbn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eey $$0) {
      return $$0 == efa.e || $$0 == efa.d;
   }

   @Override
   public int c(cua $$0) {
      return $$0.E_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eez $$0, ctd $$1, hx $$2, eey $$3, ic $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(asn.a);
   }

   @Override
   public int a(cua $$0) {
      return $$0.E_().i() ? 10 : 30;
   }

   @Override
   public int a(ctx $$0, hx $$1, eez $$2, eez $$3) {
      int $$4 = this.a((cua)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((ctd)$$0, $$1) > $$2.a((ctd)$$0, $$1) && $$0.F_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cty $$0, hx $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(ctx $$0) {
      return $$0.Z().b(ctt.V);
   }

   @Override
   protected void a(cty $$0, hx $$1, djp $$2, ic $$3, eez $$4) {
      if ($$3 == ic.a) {
         eez $$5 = $$0.b_($$1);
         if (this.a(asn.b) && $$5.a(asn.a)) {
            if ($$2.b() instanceof dbn) {
               $$0.a($$1, cxa.b.o(), 3);
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
   public Optional<ars> j() {
      return Optional.of(art.dc);
   }

   public static class a extends efc {
      @Override
      protected void a(djq.a<eey, eez> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eez $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eez $$0) {
         return false;
      }
   }

   public static class b extends efc {
      @Override
      public int d(eez $$0) {
         return 8;
      }

      @Override
      public boolean c(eez $$0) {
         return true;
      }
   }
}
