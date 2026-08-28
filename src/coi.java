import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class coi extends ckd {
   protected static final akj<Boolean> c = akn.a(coi.class, akl.k);
   static final Predicate<cjg> b = $$0 -> !$$0.y() && $$0.bD() && cuo.a($$0.p(), coh.a($$0.dR().b(lq.d)));
   @Nullable
   protected coh d;
   private int e;
   private boolean bY;
   private int bZ;

   protected coi(bsz<? extends coi> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new coi.b<>(this));
      this.bS.a(3, new cbg<>(this));
      this.bS.a(4, new coi.d(this, 1.05F, 1));
      this.bS.a(5, new coi.c(this));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gD() {
      return this.bY;
   }

   public void z(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void n_() {
      if (this.dP() instanceof are && this.bD()) {
         coh $$0 = this.gE();
         if (this.gD()) {
            if ($$0 == null) {
               if (this.dP().Z() % 20L == 0L) {
                  coh $$1 = ((are)this.dP()).d(this.dp());
                  if ($$1 != null && coj.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bto $$2 = this.p();
               if ($$2 != null && ($$2.ak() == bsz.by || $$2.ak() == bsz.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gv() {
      this.bf += 2;
   }

   @Override
   public void a(brm $$0) {
      if (this.dP() instanceof are) {
         bst $$1 = $$0.d();
         coh $$2 = this.gE();
         if ($$2 != null) {
            if (this.gu()) {
               $$2.c(this.gI());
            }

            if ($$1 != null && $$1.ak() == bsz.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (!this.dP().J().b(cpm.c) && this.gu() && $$2 == null && ((are)this.dP()).d(this.dp()) == null) {
            cuo $$3 = this.a(bta.f);
            cmw $$4 = null;
            if ($$1 instanceof cmw) {
               $$4 = (cmw)$$1;
            } else if ($$1 instanceof cgh $$6) {
               bto $$7 = $$6.P_();
               if ($$6.s() && $$7 instanceof cmw) {
                  $$4 = (cmw)$$7;
               }
            }

            if (!$$3.e() && cuo.a($$3, coh.a(this.dR().b(lq.d))) && $$4 != null) {
               bsb $$8 = $$4.c(bsd.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.d(bsd.E);
               } else {
                  $$9--;
               }

               $$9 = ayy.a($$9, 0, 4);
               bsb $$10 = new bsb(bsd.E, 120000, $$9, false, false, true);
               if (!this.dP().ab().b(dbt.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gx() {
      return !this.gH();
   }

   public void a(@Nullable coh $$0) {
      this.d = $$0;
   }

   @Nullable
   public coh gE() {
      return this.d;
   }

   public boolean gF() {
      cuo $$0 = this.a(bta.f);
      boolean $$1 = !$$0.e() && cuo.a($$0, coh.a(this.dR().b(lq.d)));
      boolean $$2 = this.gu();
      return $$1 && $$2;
   }

   public boolean gG() {
      return !(this.dP() instanceof are $$0) ? false : this.gE() != null || $$0.d(this.dp()) != null;
   }

   public boolean gH() {
      return this.gE() != null && this.gE().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gI() {
      return this.e;
   }

   public boolean gJ() {
      return this.ao.a(c);
   }

   public void A(boolean $$0) {
      this.ao.a(c, $$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bY);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dP() instanceof are) {
            this.d = ((are)this.dP()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gu()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cjg $$0) {
      cuo $$1 = $$0.p();
      boolean $$2 = this.gH() && this.gE().b(this.gI()) != null;
      if (this.gH() && !$$2 && cuo.a($$1, coh.a(this.dR().b(lq.d)))) {
         bta $$3 = bta.f;
         cuo $$4 = this.a($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.I());
         $$0.ao();
         this.gE().a(this.gI(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gE() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gE() != null;
   }

   public int gK() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if (this.gH()) {
         this.gE().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      this.z(this.ak() != bsz.bo || $$2 != bts.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avy ae_();

   protected class a extends cam {
      private final coi b;
      private final float c;
      public final cef a = cef.b().a(8.0).d().e();

      public a(final cjj $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean a() {
         bto $$0 = this.b.em();
         return this.b.gE() == null && this.b.gz() && this.b.p() != null && !this.b.gi() && ($$0 == null || $$0.ak() != bsz.by);
      }

      @Override
      public void c() {
         super.c();
         this.b.K().n();

         for (coi $$1 : this.b.dP().a(coi.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.p());
         }
      }

      @Override
      public void d() {
         super.d();
         bto $$0 = this.b.p();
         if ($$0 != null) {
            for (coi $$2 : this.b.dP().a(coi.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
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
         bto $$0 = this.b.p();
         if ($$0 != null) {
            if (this.b.g((bst)$$0) > (double)this.c) {
               this.b.G().a($$0, 30.0F, 30.0F);
               if (this.b.ah.a(50) == 0) {
                  this.b.Q();
               }
            } else {
               this.b.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends coi> extends cam {
      private final T a;

      public b(final T $$1) {
         this.a = $$1;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean a() {
         coh $$0 = this.a.gE();
         if (this.a.gH() && !this.a.gE().a() && this.a.gr() && !cuo.a(this.a.a(bta.f), coh.a(this.a.dR().b(lq.d)))) {
            coi $$1 = $$0.b(this.a.gI());
            if ($$1 == null || !$$1.bD()) {
               List<cjg> $$2 = this.a.dP().a(cjg.class, this.a.cK().c(16.0, 8.0, 16.0), coi.b);
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
            List<cjg> $$0 = this.a.dP().a(cjg.class, this.a.cK().c(4.0, 4.0, 4.0), coi.b);
            if (!$$0.isEmpty()) {
               this.a.b($$0.get(0));
            }
         }
      }
   }

   public class c extends cam {
      private final coi b;

      c(final coi $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean a() {
         coh $$0 = this.b.gE();
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
            coi.this.b(coi.this.ae_());
         }

         if (!this.b.bR() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends cam {
      private final coi a;
      private final double b;
      private iz c;
      private final List<iz> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(coi $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gH() && !this.a.gE().a();
      }

      private boolean i() {
         are $$0 = (are)this.a.dP();
         iz $$1 = this.a.dp();
         Optional<iz> $$2 = $$0.y().a($$0x -> $$0x.a(cew.n), this::a, ces.b.c, $$1, 48, this.a.ah);
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
            evq $$0 = evq.c(this.c);
            evq $$1 = cej.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cej.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(iz $$0) {
         for (iz $$1 : this.d) {
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
