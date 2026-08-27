import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cde extends bzl {
   protected static final aeg<Boolean> c = aej.a(cde.class, aei.k);
   static final Predicate<byp> b = $$0 -> !$$0.y() && $$0.bv() && cjh.a($$0.q(), cdd.s());
   @Nullable
   protected cdd d;
   private int e;
   private boolean bT;
   private int bU;

   protected cde(biw<? extends cde> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(1, new cde.b<>(this));
      this.bO.a(3, new bqx<>(this));
      this.bO.a(4, new cde.d(this, 1.05F, 1));
      this.bO.a(5, new cde.c(this));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gq() {
      return this.bT;
   }

   public void z(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   public void b_() {
      if (this.dL() instanceof aks && this.bv()) {
         cdd $$0 = this.gr();
         if (this.gq()) {
            if ($$0 == null) {
               if (this.dL().V() % 20L == 0L) {
                  cdd $$1 = ((aks)this.dL()).c(this.dl());
                  if ($$1 != null && cdf.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bji $$2 = this.q();
               if ($$2 != null && ($$2.ag() == biw.bt || $$2.ag() == biw.ac)) {
                  this.bb = 0;
               }
            }
         }
      }

      super.b_();
   }

   @Override
   protected void gi() {
      this.bb += 2;
   }

   @Override
   public void a(bhq $$0) {
      if (this.dL() instanceof aks) {
         bis $$1 = $$0.d();
         cdd $$2 = this.gr();
         if ($$2 != null) {
            if (this.gh()) {
               $$2.c(this.gt());
            }

            if ($$1 != null && $$1.ag() == biw.bt) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gh() && $$2 == null && ((aks)this.dL()).c(this.dl()) == null) {
            cjh $$3 = this.c(bix.f);
            cbw $$4 = null;
            if ($$1 instanceof cbw) {
               $$4 = (cbw)$$1;
            } else if ($$1 instanceof bvw $$6) {
               bji $$7 = $$6.O_();
               if ($$6.s() && $$7 instanceof cbw) {
                  $$4 = (cbw)$$7;
               }
            }

            if (!$$3.b() && cjh.a($$3, cdd.s()) && $$4 != null) {
               bif $$8 = $$4.b(bih.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.c(bih.E);
               } else {
                  $$9--;
               }

               $$9 = ary.a($$9, 0, 4);
               bif $$10 = new bif(bih.E, 120000, $$9, false, false, true);
               if (!this.dL().X().b(cpt.z)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gk() {
      return !this.gs();
   }

   public void a(@Nullable cdd $$0) {
      this.d = $$0;
   }

   @Nullable
   public cdd gr() {
      return this.d;
   }

   public boolean gs() {
      return this.gr() != null && this.gr().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gt() {
      return this.e;
   }

   public boolean gu() {
      return this.an.b(c);
   }

   public void A(boolean $$0) {
      this.an.b(c, $$0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bT);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bT = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dL() instanceof aks) {
            this.d = ((aks)this.dL()).x().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gh()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(byp $$0) {
      cjh $$1 = $$0.q();
      boolean $$2 = this.gs() && this.gr().b(this.gt()) != null;
      if (this.gs() && !$$2 && cjh.a($$1, cdd.s())) {
         bix $$3 = bix.f;
         cjh $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.ak();
         this.gr().a(this.gt(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gr() == null ? super.h($$0) : false;
   }

   @Override
   public boolean U() {
      return super.U() || this.gr() != null;
   }

   public int gv() {
      return this.bU;
   }

   public void c(int $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (this.gs()) {
         this.gr().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.z(this.ag() != biw.bj || $$2 != bjm.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract ape ac_();

   protected class a extends bqd {
      private final cde c;
      private final float d;
      public final btu a = btu.b().a(8.0).d().e();

      public a(bys $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean a() {
         bji $$0 = this.c.eg();
         return this.c.gr() == null && this.c.gm() && this.c.q() != null && !this.c.fV() && ($$0 == null || $$0.ag() != biw.bt);
      }

      @Override
      public void c() {
         super.c();
         this.c.L().n();

         for (cde $$1 : this.c.dL().a(cde.class, this.a, this.c, this.c.cG().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.q());
         }
      }

      @Override
      public void d() {
         super.d();
         bji $$0 = this.c.q();
         if ($$0 != null) {
            for (cde $$2 : this.c.dL().a(cde.class, this.a, this.c, this.c.cG().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.c.v(true);
         }
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void e() {
         bji $$0 = this.c.q();
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

   public class b<T extends cde> extends bqd {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         cdd $$0 = this.b.gr();
         if (this.b.gs() && !this.b.gr().a() && this.b.ge() && !cjh.a(this.b.c(bix.f), cdd.s())) {
            cde $$1 = $$0.b(this.b.gt());
            if ($$1 == null || !$$1.bv()) {
               List<byp> $$2 = this.b.dL().a(byp.class, this.b.cG().c(16.0, 8.0, 16.0), cde.b);
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
            List<byp> $$0 = this.b.dL().a(byp.class, this.b.cG().c(4.0, 4.0, 4.0), cde.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bqd {
      private final cde b;

      c(cde $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         cdd $$0 = this.b.gr();
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
            cde.this.a(cde.this.ac_(), cde.this.eV(), cde.this.eW());
         }

         if (!this.b.bN() && this.b.ag.a(this.a(50)) == 0) {
            this.b.K().a();
         }

         super.e();
      }
   }

   static class d extends bqd {
      private final cde a;
      private final double b;
      private gw c;
      private final List<gw> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cde $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.q() == null;
      }

      private boolean h() {
         return this.a.gs() && !this.a.gr().a();
      }

      private boolean i() {
         aks $$0 = (aks)this.a.dL();
         gw $$1 = this.a.dl();
         Optional<gw> $$2 = $$0.w().a($$0x -> $$0x.a(bul.n), this::a, buh.b.c, $$1, 48, this.a.ag);
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
            ehp $$0 = ehp.c(this.c);
            ehp $$1 = bty.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bty.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.L().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(gw $$0) {
         for (gw $$1 : this.d) {
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
