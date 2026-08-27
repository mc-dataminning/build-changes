import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ceu extends cbb {
   protected static final afm<Boolean> c = afp.a(ceu.class, afo.k);
   static final Predicate<caf> b = $$0 -> !$$0.y() && $$0.bv() && clb.a($$0.q(), cet.s());
   @Nullable
   protected cet d;
   private int e;
   private boolean bT;
   private int bU;

   protected ceu(bkm<? extends ceu> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new ceu.b<>(this));
      this.bO.a(3, new bsn<>(this));
      this.bO.a(4, new ceu.d(this, 1.05F, 1));
      this.bO.a(5, new ceu.c(this));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gr() {
      return this.bT;
   }

   public void z(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   public void c_() {
      if (this.dL() instanceof ama && this.bv()) {
         cet $$0 = this.gs();
         if (this.gr()) {
            if ($$0 == null) {
               if (this.dL().V() % 20L == 0L) {
                  cet $$1 = ((ama)this.dL()).c(this.dl());
                  if ($$1 != null && cev.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bky $$2 = this.q();
               if ($$2 != null && ($$2.ag() == bkm.bt || $$2.ag() == bkm.ac)) {
                  this.bb = 0;
               }
            }
         }
      }

      super.c_();
   }

   @Override
   protected void gj() {
      this.bb += 2;
   }

   @Override
   public void a(bjg $$0) {
      if (this.dL() instanceof ama) {
         bki $$1 = $$0.d();
         cet $$2 = this.gs();
         if ($$2 != null) {
            if (this.gi()) {
               $$2.c(this.gu());
            }

            if ($$1 != null && $$1.ag() == bkm.bt) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gi() && $$2 == null && ((ama)this.dL()).c(this.dl()) == null) {
            clb $$3 = this.c(bkn.f);
            cdm $$4 = null;
            if ($$1 instanceof cdm) {
               $$4 = (cdm)$$1;
            } else if ($$1 instanceof bxm $$6) {
               bky $$7 = $$6.P_();
               if ($$6.s() && $$7 instanceof cdm) {
                  $$4 = (cdm)$$7;
               }
            }

            if (!$$3.b() && clb.a($$3, cet.s()) && $$4 != null) {
               bjv $$8 = $$4.b(bjx.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.c(bjx.E);
               } else {
                  $$9--;
               }

               $$9 = ati.a($$9, 0, 4);
               bjv $$10 = new bjv(bjx.E, 120000, $$9, false, false, true);
               if (!this.dL().X().b(cro.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gl() {
      return !this.gt();
   }

   public void a(@Nullable cet $$0) {
      this.d = $$0;
   }

   @Nullable
   public cet gs() {
      return this.d;
   }

   public boolean gt() {
      return this.gs() != null && this.gs().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gu() {
      return this.e;
   }

   public boolean gv() {
      return this.an.b(c);
   }

   public void A(boolean $$0) {
      this.an.b(c, $$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bT);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bT = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dL() instanceof ama) {
            this.d = ((ama)this.dL()).x().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gi()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(caf $$0) {
      clb $$1 = $$0.q();
      boolean $$2 = this.gt() && this.gs().b(this.gu()) != null;
      if (this.gt() && !$$2 && clb.a($$1, cet.s())) {
         bkn $$3 = bkn.f;
         clb $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.ak();
         this.gs().a(this.gu(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gs() == null ? super.h($$0) : false;
   }

   @Override
   public boolean U() {
      return super.U() || this.gs() != null;
   }

   public int gw() {
      return this.bU;
   }

   public void c(int $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.gt()) {
         this.gs().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.z(this.ag() != bkm.bj || $$2 != blc.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract aqm ad_();

   protected class a extends brt {
      private final ceu c;
      private final float d;
      public final bvk a = bvk.b().a(8.0).d().e();

      public a(cai $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(brt.a.a, brt.a.b));
      }

      @Override
      public boolean a() {
         bky $$0 = this.c.eg();
         return this.c.gs() == null && this.c.gn() && this.c.q() != null && !this.c.fW() && ($$0 == null || $$0.ag() != bkm.bt);
      }

      @Override
      public void c() {
         super.c();
         this.c.L().n();

         for (ceu $$1 : this.c.dL().a(ceu.class, this.a, this.c, this.c.cG().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.q());
         }
      }

      @Override
      public void d() {
         super.d();
         bky $$0 = this.c.q();
         if ($$0 != null) {
            for (ceu $$2 : this.c.dL().a(ceu.class, this.a, this.c, this.c.cG().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.c.v(true);
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bky $$0 = this.c.q();
         if ($$0 != null) {
            if (this.c.f($$0) > (double)this.d) {
               this.c.G().a($$0, 30.0F, 30.0F);
               if (this.c.ag.a(50) == 0) {
                  this.c.P();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends ceu> extends brt {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         cet $$0 = this.b.gs();
         if (this.b.gt() && !this.b.gs().a() && this.b.gf() && !clb.a(this.b.c(bkn.f), cet.s())) {
            ceu $$1 = $$0.b(this.b.gu());
            if ($$1 == null || !$$1.bv()) {
               List<caf> $$2 = this.b.dL().a(caf.class, this.b.cG().c(16.0, 8.0, 16.0), ceu.b);
               if (!$$2.isEmpty()) {
                  return this.b.L().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.L().h().a(this.b.dj(), 1.414)) {
            List<caf> $$0 = this.b.dL().a(caf.class, this.b.cG().c(4.0, 4.0, 4.0), ceu.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends brt {
      private final ceu b;

      c(ceu $$1) {
         this.b = $$1;
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         cet $$0 = this.b.gs();
         return this.b.bv() && this.b.q() == null && $$0 != null && $$0.f();
      }

      @Override
      public void c() {
         this.b.A(true);
         super.c();
      }

      @Override
      public void d() {
         this.b.A(false);
         super.d();
      }

      @Override
      public void e() {
         if (!this.b.aS() && this.b.ag.a(this.a(100)) == 0) {
            ceu.this.a(ceu.this.ad_(), ceu.this.eV(), ceu.this.eW());
         }

         if (!this.b.bN() && this.b.ag.a(this.a(50)) == 0) {
            this.b.K().a();
         }

         super.e();
      }
   }

   static class d extends brt {
      private final ceu a;
      private final double b;
      private ht c;
      private final List<ht> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(ceu $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.q() == null;
      }

      private boolean h() {
         return this.a.gt() && !this.a.gs().a();
      }

      private boolean i() {
         ama $$0 = (ama)this.a.dL();
         ht $$1 = this.a.dl();
         Optional<ht> $$2 = $$0.w().a($$0x -> $$0x.a(bwb.n), this::a, bvx.b.c, $$1, 48, this.a.ag);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.L().l() ? false : this.a.q() == null && !this.c.a(this.a.dj(), (double)(this.a.df() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dj(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.o(0);
         this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.L().l()) {
            eji $$0 = eji.c(this.c);
            eji $$1 = bvo.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bvo.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.L().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(ht $$0) {
         for (ht $$1 : this.d) {
            if (Objects.equals($$0, $$1)) {
               return false;
            }
         }

         return true;
      }

      private void k() {
         if (this.d.size() > 2) {
            this.d.remove(0);
         }
      }
   }
}
