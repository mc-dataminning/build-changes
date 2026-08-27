import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cnk extends cjf {
   protected static final ajs<Boolean> c = ajw.a(cnk.class, aju.k);
   static final Predicate<cii> b = $$0 -> !$$0.y() && $$0.bD() && ctq.a($$0.p(), cnj.a($$0.dR().b(lf.d)));
   @Nullable
   protected cnj d;
   private int e;
   private boolean bY;
   private int bZ;

   protected cnk(bsc<? extends cnk> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cnk.b<>(this));
      this.bS.a(3, new cai<>(this));
      this.bS.a(4, new cnk.d(this, 1.05F, 1));
      this.bS.a(5, new cnk.c(this));
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gC() {
      return this.bY;
   }

   public void z(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void n_() {
      if (this.dP() instanceof aqn && this.bD()) {
         cnj $$0 = this.gD();
         if (this.gC()) {
            if ($$0 == null) {
               if (this.dP().Y() % 20L == 0L) {
                  cnj $$1 = ((aqn)this.dP()).d(this.dp());
                  if ($$1 != null && cnl.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bsq $$2 = this.p();
               if ($$2 != null && ($$2.ak() == bsc.by || $$2.ak() == bsc.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gu() {
      this.bf += 2;
   }

   @Override
   public void a(bqp $$0) {
      if (this.dP() instanceof aqn) {
         brw $$1 = $$0.d();
         cnj $$2 = this.gD();
         if ($$2 != null) {
            if (this.gt()) {
               $$2.c(this.gH());
            }

            if ($$1 != null && $$1.ak() == bsc.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (!this.dP().J().b(coo.c) && this.gt() && $$2 == null && ((aqn)this.dP()).d(this.dp()) == null) {
            ctq $$3 = this.a(bsd.f);
            cly $$4 = null;
            if ($$1 instanceof cly) {
               $$4 = (cly)$$1;
            } else if ($$1 instanceof cfj $$6) {
               bsq $$7 = $$6.P_();
               if ($$6.s() && $$7 instanceof cly) {
                  $$4 = (cly)$$7;
               }
            }

            if (!$$3.e() && ctq.a($$3, cnj.a(this.dR().b(lf.d))) && $$4 != null) {
               bre $$8 = $$4.c(brg.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.d(brg.E);
               } else {
                  $$9--;
               }

               $$9 = ayf.a($$9, 0, 4);
               bre $$10 = new bre(brg.E, 120000, $$9, false, false, true);
               if (!this.dP().aa().b(dav.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gw() {
      return !this.gG();
   }

   public void a(@Nullable cnj $$0) {
      this.d = $$0;
   }

   @Nullable
   public cnj gD() {
      return this.d;
   }

   public boolean gE() {
      ctq $$0 = this.a(bsd.f);
      boolean $$1 = !$$0.e() && ctq.a($$0, cnj.a(this.dR().b(lf.d)));
      boolean $$2 = this.gt();
      return $$1 && $$2;
   }

   public boolean gF() {
      return !(this.dP() instanceof aqn $$0) ? false : this.gD() != null || $$0.d(this.dp()) != null;
   }

   public boolean gG() {
      return this.gD() != null && this.gD().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gH() {
      return this.e;
   }

   public boolean gI() {
      return this.ao.a(c);
   }

   public void A(boolean $$0) {
      this.ao.a(c, $$0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bY);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dP() instanceof aqn) {
            this.d = ((aqn)this.dP()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gt()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cii $$0) {
      ctq $$1 = $$0.p();
      boolean $$2 = this.gG() && this.gD().b(this.gH()) != null;
      if (this.gG() && !$$2 && ctq.a($$1, cnj.a(this.dR().b(lf.d)))) {
         bsd $$3 = bsd.f;
         ctq $$4 = this.a($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.I());
         $$0.ao();
         this.gD().a(this.gH(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gD() == null ? super.h($$0) : false;
   }

   @Override
   public boolean V() {
      return super.V() || this.gD() != null;
   }

   public int gJ() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (this.gG()) {
         this.gD().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.z(this.ak() != bsc.bo || $$2 != bsu.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avh ae_();

   protected class a extends bzo {
      private final cnk b;
      private final float c;
      public final cdh a = cdh.b().a(8.0).d().e();

      public a(cil $$1, float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(bzo.a.a, bzo.a.b));
      }

      @Override
      public boolean a() {
         bsq $$0 = this.b.em();
         return this.b.gD() == null && this.b.gy() && this.b.p() != null && !this.b.gh() && ($$0 == null || $$0.ak() != bsc.by);
      }

      @Override
      public void c() {
         super.c();
         this.b.K().n();

         for (cnk $$1 : this.b.dP().a(cnk.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.p());
         }
      }

      @Override
      public void d() {
         super.d();
         bsq $$0 = this.b.p();
         if ($$0 != null) {
            for (cnk $$2 : this.b.dP().a(cnk.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.b.v(true);
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bsq $$0 = this.b.p();
         if ($$0 != null) {
            if (this.b.g((brw)$$0) > (double)this.c) {
               this.b.G().a($$0, 30.0F, 30.0F);
               if (this.b.ah.a(50) == 0) {
                  this.b.P();
               }
            } else {
               this.b.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cnk> extends bzo {
      private final T a;

      public b(T $$1) {
         this.a = $$1;
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean a() {
         cnj $$0 = this.a.gD();
         if (this.a.gG() && !this.a.gD().a() && this.a.gq() && !ctq.a(this.a.a(bsd.f), cnj.a(this.a.dR().b(lf.d)))) {
            cnk $$1 = $$0.b(this.a.gH());
            if ($$1 == null || !$$1.bD()) {
               List<cii> $$2 = this.a.dP().a(cii.class, this.a.cK().c(16.0, 8.0, 16.0), cnk.b);
               if (!$$2.isEmpty()) {
                  return this.a.K().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.a.K().h().a(this.a.dn(), 1.414)) {
            List<cii> $$0 = this.a.dP().a(cii.class, this.a.cK().c(4.0, 4.0, 4.0), cnk.b);
            if (!$$0.isEmpty()) {
               this.a.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bzo {
      private final cnk b;

      c(cnk $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean a() {
         cnj $$0 = this.b.gD();
         return this.b.bD() && this.b.p() == null && $$0 != null && $$0.f();
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
         if (!this.b.aW() && this.b.ah.a(this.a(100)) == 0) {
            cnk.this.b(cnk.this.ae_());
         }

         if (!this.b.bR() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends bzo {
      private final cnk a;
      private final double b;
      private io c;
      private final List<io> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cnk $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gG() && !this.a.gD().a();
      }

      private boolean i() {
         aqn $$0 = (aqn)this.a.dP();
         io $$1 = this.a.dp();
         Optional<io> $$2 = $$0.y().a($$0x -> $$0x.a(cdy.n), this::a, cdu.b.c, $$1, 48, this.a.ah);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.K().l() ? false : this.a.p() == null && !this.c.a(this.a.dn(), (double)(this.a.dj() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dn(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.p(0);
         this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            eum $$0 = eum.c(this.c);
            eum $$1 = cdl.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdl.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(io $$0) {
         for (io $$1 : this.d) {
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
