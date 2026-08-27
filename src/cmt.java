import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cmt extends cio {
   protected static final ajm<Boolean> c = ajq.a(cmt.class, ajo.k);
   static final Predicate<chr> b = $$0 -> !$$0.y() && $$0.bB() && csz.a($$0.p(), cms.a($$0.dP().b(le.d)));
   @Nullable
   protected cms d;
   private int e;
   private boolean bY;
   private int bZ;

   protected cmt(brn<? extends cmt> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cmt.b<>(this));
      this.bS.a(3, new bzr<>(this));
      this.bS.a(4, new cmt.d(this, 1.05F, 1));
      this.bS.a(5, new cmt.c(this));
   }

   @Override
   protected void a(ajq.a $$0) {
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
      if (this.dN() instanceof aqh && this.bB()) {
         cms $$0 = this.gD();
         if (this.gC()) {
            if ($$0 == null) {
               if (this.dN().Y() % 20L == 0L) {
                  cms $$1 = ((aqh)this.dN()).d(this.dn());
                  if ($$1 != null && cmu.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bsa $$2 = this.p();
               if ($$2 != null && ($$2.ai() == brn.bx || $$2.ai() == brn.af)) {
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
   public void a(bqf $$0) {
      if (this.dN() instanceof aqh) {
         brh $$1 = $$0.d();
         cms $$2 = this.gD();
         if ($$2 != null) {
            if (this.gt()) {
               $$2.c(this.gF());
            }

            if ($$1 != null && $$1.ai() == brn.bx) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gt() && $$2 == null && ((aqh)this.dN()).d(this.dn()) == null) {
            csz $$3 = this.d(bro.f);
            clh $$4 = null;
            if ($$1 instanceof clh) {
               $$4 = (clh)$$1;
            } else if ($$1 instanceof ces $$6) {
               bsa $$7 = $$6.P_();
               if ($$6.r() && $$7 instanceof clh) {
                  $$4 = (clh)$$7;
               }
            }

            if (!$$3.d() && csz.a($$3, cms.a(this.dP().b(le.d))) && $$4 != null) {
               bqt $$8 = $$4.c(bqv.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.d(bqv.E);
               } else {
                  $$9--;
               }

               $$9 = axz.a($$9, 0, 4);
               bqt $$10 = new bqt(bqv.E, 120000, $$9, false, false, true);
               if (!this.dN().aa().b(czz.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gw() {
      return !this.gE();
   }

   public void a(@Nullable cms $$0) {
      this.d = $$0;
   }

   @Nullable
   public cms gD() {
      return this.d;
   }

   public boolean gE() {
      return this.gD() != null && this.gD().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gF() {
      return this.e;
   }

   public boolean gG() {
      return this.ao.a(c);
   }

   public void A(boolean $$0) {
      this.ao.a(c, $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bY);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dN() instanceof aqh) {
            this.d = ((aqh)this.dN()).z().a($$0.h("RaidId"));
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
   protected void b(chr $$0) {
      csz $$1 = $$0.p();
      boolean $$2 = this.gE() && this.gD().b(this.gF()) != null;
      if (this.gE() && !$$2 && csz.a($$1, cms.a(this.dP().b(le.d)))) {
         bro $$3 = bro.f;
         csz $$4 = this.d($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.d() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.G());
         $$0.am();
         this.gD().a(this.gF(), this);
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

   public int gH() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.gE()) {
         this.gD().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.z(this.ai() != brn.bn || $$2 != bse.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avb ae_();

   protected class a extends byx {
      private final cmt c;
      private final float d;
      public final ccq a = ccq.b().a(8.0).d().e();

      public a(chu $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean a() {
         bsa $$0 = this.c.ek();
         return this.c.gD() == null && this.c.gy() && this.c.p() != null && !this.c.gh() && ($$0 == null || $$0.ai() != brn.bx);
      }

      @Override
      public void c() {
         super.c();
         this.c.K().n();

         for (cmt $$1 : this.c.dN().a(cmt.class, this.a, this.c, this.c.cI().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.p());
         }
      }

      @Override
      public void d() {
         super.d();
         bsa $$0 = this.c.p();
         if ($$0 != null) {
            for (cmt $$2 : this.c.dN().a(cmt.class, this.a, this.c, this.c.cI().c(8.0, 8.0, 8.0))) {
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
         bsa $$0 = this.c.p();
         if ($$0 != null) {
            if (this.c.g((brh)$$0) > (double)this.d) {
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

   public class b<T extends cmt> extends byx {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         cms $$0 = this.b.gD();
         if (this.b.gE() && !this.b.gD().a() && this.b.gq() && !csz.a(this.b.d(bro.f), cms.a(this.b.dP().b(le.d)))) {
            cmt $$1 = $$0.b(this.b.gF());
            if ($$1 == null || !$$1.bB()) {
               List<chr> $$2 = this.b.dN().a(chr.class, this.b.cI().c(16.0, 8.0, 16.0), cmt.b);
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
         if (this.b.K().h().a(this.b.dl(), 1.414)) {
            List<chr> $$0 = this.b.dN().a(chr.class, this.b.cI().c(4.0, 4.0, 4.0), cmt.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends byx {
      private final cmt b;

      c(cmt $$1) {
         this.b = $$1;
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         cms $$0 = this.b.gD();
         return this.b.bB() && this.b.p() == null && $$0 != null && $$0.f();
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
         if (!this.b.aU() && this.b.ah.a(this.a(100)) == 0) {
            cmt.this.b(cmt.this.ae_());
         }

         if (!this.b.bP() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends byx {
      private final cmt a;
      private final double b;
      private in c;
      private final List<in> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cmt $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(byx.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gE() && !this.a.gD().a();
      }

      private boolean i() {
         aqh $$0 = (aqh)this.a.dN();
         in $$1 = this.a.dn();
         Optional<in> $$2 = $$0.y().a($$0x -> $$0x.a(cdh.n), this::a, cdd.b.c, $$1, 48, this.a.ah);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.K().l() ? false : this.a.p() == null && !this.c.a(this.a.dl(), (double)(this.a.dh() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dl(), (double)this.e)) {
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
            etp $$0 = etp.c(this.c);
            etp $$1 = ccu.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = ccu.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(in $$0) {
         for (in $$1 : this.d) {
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
