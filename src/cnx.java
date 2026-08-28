import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cnx extends cjs {
   protected static final ajp<Boolean> c = ajt.a(cnx.class, ajr.k);
   static final Predicate<civ> b = $$0 -> !$$0.y() && $$0.bF() && cud.a($$0.p(), cnw.a($$0.dT().b(lr.d)));
   @Nullable
   protected cnw d;
   private int e;
   private boolean ca;
   private int cb;

   protected cnx(bsn<? extends cnx> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cnx.b<>(this));
      this.bU.a(3, new cau<>(this));
      this.bU.a(4, new cnx.d(this, 1.05F, 1));
      this.bU.a(5, new cnx.c(this));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(aqm var1, int var2, boolean var3);

   public boolean gA() {
      return this.ca;
   }

   public void z(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public void m_() {
      if (this.dR() instanceof aqm && this.bF()) {
         cnw $$0 = this.gB();
         if (this.gA()) {
            if ($$0 == null) {
               if (this.dR().Z() % 20L == 0L) {
                  cnw $$1 = ((aqm)this.dR()).d(this.dr());
                  if ($$1 != null && cny.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               btc $$2 = this.p();
               if ($$2 != null && ($$2.am() == bsn.by || $$2.am() == bsn.af)) {
                  this.bg = 0;
               }
            }
         }
      }

      super.m_();
   }

   @Override
   protected void gs() {
      this.bg += 2;
   }

   @Override
   public void a(bra $$0) {
      if (this.dR() instanceof aqm) {
         bsh $$1 = $$0.d();
         cnw $$2 = this.gB();
         if ($$2 != null) {
            if (this.gr()) {
               $$2.c(this.gF());
            }

            if ($$1 != null && $$1.am() == bsn.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gu() {
      return !this.gE();
   }

   public void a(@Nullable cnw $$0) {
      this.d = $$0;
   }

   @Nullable
   public cnw gB() {
      return this.d;
   }

   public boolean gC() {
      cud $$0 = this.a(bso.f);
      boolean $$1 = !$$0.e() && cud.a($$0, cnw.a(this.dT().b(lr.d)));
      boolean $$2 = this.gr();
      return $$1 && $$2;
   }

   public boolean gD() {
      return !(this.dR() instanceof aqm $$0) ? false : this.gB() != null || $$0.d(this.dr()) != null;
   }

   public boolean gE() {
      return this.gB() != null && this.gB().u();
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.ca);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.ca = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dR() instanceof aqm) {
            this.d = ((aqm)this.dR()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gr()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(civ $$0) {
      cud $$1 = $$0.p();
      boolean $$2 = this.gE() && this.gB().b(this.gF()) != null;
      if (this.gE() && !$$2 && cud.a($$1, cnw.a(this.dT().b(lr.d)))) {
         bso $$3 = bso.f;
         cud $$4 = this.a($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.H());
         $$0.aq();
         this.gB().a(this.gF(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gB() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gB() != null;
   }

   public int gH() {
      return this.cb;
   }

   public void c(int $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.gE()) {
         this.gB().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.z(this.am() != bsn.bo || $$2 != btg.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avg ae_();

   protected class a extends caa {
      private final cnx b;
      private final float c;
      public final cdt a = cdt.b().a(8.0).d().e();

      public a(final ciy $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean a() {
         btc $$0 = this.b.ek();
         return this.b.gB() == null && this.b.gw() && this.b.p() != null && !this.b.ge() && ($$0 == null || $$0.am() != bsn.by);
      }

      @Override
      public void c() {
         super.c();
         this.b.J().n();

         for (cnx $$1 : this.b.dR().a(cnx.class, this.a, this.b, this.b.cM().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.p());
         }
      }

      @Override
      public void d() {
         super.d();
         btc $$0 = this.b.p();
         if ($$0 != null) {
            for (cnx $$2 : this.b.dR().a(cnx.class, this.a, this.b, this.b.cM().c(8.0, 8.0, 8.0))) {
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
         btc $$0 = this.b.p();
         if ($$0 != null) {
            if (this.b.g((bsh)$$0) > (double)this.c) {
               this.b.F().a($$0, 30.0F, 30.0F);
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

   public class b<T extends cnx> extends caa {
      private final T a;

      public b(final T $$1) {
         this.a = $$1;
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         cnw $$0 = this.a.gB();
         if (this.a.gE() && !this.a.gB().a() && this.a.go() && !cud.a(this.a.a(bso.f), cnw.a(this.a.dT().b(lr.d)))) {
            cnx $$1 = $$0.b(this.a.gF());
            if ($$1 == null || !$$1.bF()) {
               List<civ> $$2 = this.a.dR().a(civ.class, this.a.cM().c(16.0, 8.0, 16.0), cnx.b);
               if (!$$2.isEmpty()) {
                  return this.a.J().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.a.J().h().a(this.a.dp(), 1.414)) {
            List<civ> $$0 = this.a.dR().a(civ.class, this.a.cM().c(4.0, 4.0, 4.0), cnx.b);
            if (!$$0.isEmpty()) {
               this.a.b($$0.get(0));
            }
         }
      }
   }

   public class c extends caa {
      private final cnx b;

      c(final cnx $$1) {
         this.b = $$1;
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         cnw $$0 = this.b.gB();
         return this.b.bF() && this.b.p() == null && $$0 != null && $$0.f();
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
         if (!this.b.aY() && this.b.ah.a(this.a(100)) == 0) {
            cnx.this.b(cnx.this.ae_());
         }

         if (!this.b.bT() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends caa {
      private final cnx a;
      private final double b;
      private ja c;
      private final List<ja> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cnx $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(caa.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gE() && !this.a.gB().a();
      }

      private boolean i() {
         aqm $$0 = (aqm)this.a.dR();
         ja $$1 = this.a.dr();
         Optional<ja> $$2 = $$0.y().a($$0x -> $$0x.a(cek.n), this::a, ceg.b.c, $$1, 48, this.a.ah);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.J().l() ? false : this.a.p() == null && !this.c.a(this.a.dp(), (double)(this.a.dl() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dp(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.o(0);
         this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.J().l()) {
            ewh $$0 = ewh.c(this.c);
            ewh $$1 = cdx.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdx.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.J().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(ja $$0) {
         for (ja $$1 : this.d) {
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
