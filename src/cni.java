import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cni extends cjd {
   protected static final ajr<Boolean> c = ajv.a(cni.class, ajt.k);
   static final Predicate<cig> b = $$0 -> !$$0.y() && $$0.bD() && cto.a($$0.p(), cnh.a($$0.dR().b(lf.d)));
   @Nullable
   protected cnh d;
   private int e;
   private boolean bY;
   private int bZ;

   protected cni(bsa<? extends cni> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cni.b<>(this));
      this.bS.a(3, new cag<>(this));
      this.bS.a(4, new cni.d(this, 1.05F, 1));
      this.bS.a(5, new cni.c(this));
   }

   @Override
   protected void a(ajv.a $$0) {
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
      if (this.dP() instanceof aqm && this.bD()) {
         cnh $$0 = this.gD();
         if (this.gC()) {
            if ($$0 == null) {
               if (this.dP().Y() % 20L == 0L) {
                  cnh $$1 = ((aqm)this.dP()).d(this.dp());
                  if ($$1 != null && cnj.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bso $$2 = this.p();
               if ($$2 != null && ($$2.ak() == bsa.by || $$2.ak() == bsa.af)) {
                  this.bg = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gu() {
      this.bg += 2;
   }

   @Override
   public void a(bqn $$0) {
      if (this.dP() instanceof aqm) {
         bru $$1 = $$0.d();
         cnh $$2 = this.gD();
         if ($$2 != null) {
            if (this.gt()) {
               $$2.c(this.gH());
            }

            if ($$1 != null && $$1.ak() == bsa.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (!this.dP().J().b(col.c) && this.gt() && $$2 == null && ((aqm)this.dP()).d(this.dp()) == null) {
            cto $$3 = this.a(bsb.f);
            clw $$4 = null;
            if ($$1 instanceof clw) {
               $$4 = (clw)$$1;
            } else if ($$1 instanceof cfh $$6) {
               bso $$7 = $$6.P_();
               if ($$6.s() && $$7 instanceof clw) {
                  $$4 = (clw)$$7;
               }
            }

            if (!$$3.e() && cto.a($$3, cnh.a(this.dR().b(lf.d))) && $$4 != null) {
               brc $$8 = $$4.c(bre.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.d(bre.E);
               } else {
                  $$9--;
               }

               $$9 = ayd.a($$9, 0, 4);
               brc $$10 = new brc(bre.E, 120000, $$9, false, false, true);
               if (!this.dP().aa().b(dat.B)) {
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

   public void a(@Nullable cnh $$0) {
      this.d = $$0;
   }

   @Nullable
   public cnh gD() {
      return this.d;
   }

   public boolean gE() {
      cto $$0 = this.a(bsb.f);
      boolean $$1 = !$$0.e() && cto.a($$0, cnh.a(this.dR().b(lf.d)));
      boolean $$2 = this.gt();
      return $$1 && $$2;
   }

   public boolean gF() {
      return !(this.dP() instanceof aqm $$0) ? false : this.gD() != null || $$0.d(this.dp()) != null;
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
         if (this.dP() instanceof aqm) {
            this.d = ((aqm)this.dP()).z().a($$0.h("RaidId"));
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
   protected void b(cig $$0) {
      cto $$1 = $$0.p();
      boolean $$2 = this.gG() && this.gD().b(this.gH()) != null;
      if (this.gG() && !$$2 && cto.a($$1, cnh.a(this.dR().b(lf.d)))) {
         bsb $$3 = bsb.f;
         cto $$4 = this.a($$3);
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
   public boolean a(bqn $$0, float $$1) {
      if (this.gG()) {
         this.gD().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      this.z(this.ak() != bsa.bo || $$2 != bss.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avg ae_();

   protected class a extends bzm {
      private final cni c;
      private final float d;
      public final cdf a = cdf.b().a(8.0).d().e();

      public a(cij $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bzm.a.a, bzm.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = this.c.em();
         return this.c.gD() == null && this.c.gy() && this.c.p() != null && !this.c.gh() && ($$0 == null || $$0.ak() != bsa.by);
      }

      @Override
      public void c() {
         super.c();
         this.c.K().n();

         for (cni $$1 : this.c.dP().a(cni.class, this.a, this.c, this.c.cK().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.p());
         }
      }

      @Override
      public void d() {
         super.d();
         bso $$0 = this.c.p();
         if ($$0 != null) {
            for (cni $$2 : this.c.dP().a(cni.class, this.a, this.c, this.c.cK().c(8.0, 8.0, 8.0))) {
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
         bso $$0 = this.c.p();
         if ($$0 != null) {
            if (this.c.g((bru)$$0) > (double)this.d) {
               this.c.G().a($$0, 30.0F, 30.0F);
               if (this.c.ah.a(50) == 0) {
                  this.c.P();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cni> extends bzm {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         cnh $$0 = this.b.gD();
         if (this.b.gG() && !this.b.gD().a() && this.b.gq() && !cto.a(this.b.a(bsb.f), cnh.a(this.b.dR().b(lf.d)))) {
            cni $$1 = $$0.b(this.b.gH());
            if ($$1 == null || !$$1.bD()) {
               List<cig> $$2 = this.b.dP().a(cig.class, this.b.cK().c(16.0, 8.0, 16.0), cni.b);
               if (!$$2.isEmpty()) {
                  return this.b.K().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.K().h().a(this.b.dn(), 1.414)) {
            List<cig> $$0 = this.b.dP().a(cig.class, this.b.cK().c(4.0, 4.0, 4.0), cni.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bzm {
      private final cni b;

      c(cni $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         cnh $$0 = this.b.gD();
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
            cni.this.b(cni.this.ae_());
         }

         if (!this.b.bR() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends bzm {
      private final cni a;
      private final double b;
      private io c;
      private final List<io> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cni $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bzm.a.a));
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
         aqm $$0 = (aqm)this.a.dP();
         io $$1 = this.a.dp();
         Optional<io> $$2 = $$0.y().a($$0x -> $$0x.a(cdw.n), this::a, cds.b.c, $$1, 48, this.a.ah);
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
            euk $$0 = euk.c(this.c);
            euk $$1 = cdj.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdj.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
