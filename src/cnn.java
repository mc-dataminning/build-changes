import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cnn extends cje {
   protected static final ajy<Boolean> c = akc.a(cnn.class, aka.k);
   static final Predicate<cig> b = $$0 -> !$$0.y() && $$0.bI() && cuh.a($$0.p(), cnm.a($$0.dY().b(li.d)));
   @Nullable
   protected cnm d;
   private int e;
   private boolean ch;
   private int ci;

   protected cnn(bsb<? extends cnn> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(1, new cnn.b<>(this));
      this.cb.a(3, new caf<>(this));
      this.cb.a(4, new cnn.d(this, 1.05F, 1));
      this.cb.a(5, new cnn.c(this));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gL() {
      return this.ch;
   }

   public void z(boolean $$0) {
      this.ch = $$0;
   }

   @Override
   public void m_() {
      if (this.dU() instanceof aqt && this.bI()) {
         cnm $$0 = this.gM();
         if (this.gL()) {
            if ($$0 == null) {
               if (this.dU().Z() % 20L == 0L) {
                  cnm $$1 = ((aqt)this.dU()).d(this.du());
                  if ($$1 != null && cno.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bso $$2 = this.p();
               if ($$2 != null && ($$2.ak() == bsb.bE || $$2.ak() == bsb.ah)) {
                  this.bq = 0;
               }
            }
         }
      }

      super.m_();
   }

   @Override
   protected void gF() {
      this.bq += 2;
   }

   @Override
   public void a(bqt $$0) {
      if (this.dU() instanceof aqt) {
         brv $$1 = $$0.d();
         cnm $$2 = this.gM();
         if ($$2 != null) {
            if (this.gC()) {
               $$2.c(this.gO());
            }

            if ($$1 != null && $$1.ak() == bsb.bE) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gC() && $$2 == null && ((aqt)this.dU()).d(this.du()) == null) {
            cuh $$3 = this.d(bsc.f);
            cly $$4 = null;
            if ($$1 instanceof cly) {
               $$4 = (cly)$$1;
            } else if ($$1 instanceof cfh $$6) {
               bso $$7 = $$6.Q_();
               if ($$6.r() && $$7 instanceof cly) {
                  $$4 = (cly)$$7;
               }
            }

            if (!$$3.d() && cuh.a($$3, cnm.a(this.dY().b(li.d))) && $$4 != null) {
               brh $$8 = $$4.c(brj.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.d(brj.E);
               } else {
                  $$9--;
               }

               $$9 = aym.a($$9, 0, 4);
               brh $$10 = new brh(brj.E, 120000, $$9, false, false, true);
               if (!this.dU().ab().b(dbw.C)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gD() {
      return !this.gN();
   }

   public void a(@Nullable cnm $$0) {
      this.d = $$0;
   }

   @Nullable
   public cnm gM() {
      return this.d;
   }

   public boolean gN() {
      return this.gM() != null && this.gM().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gO() {
      return this.e;
   }

   public boolean gP() {
      return this.as.a(c);
   }

   public void A(boolean $$0) {
      this.as.a(c, $$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.ch);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.ch = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dU() instanceof aqt) {
            this.d = ((aqt)this.dU()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gC()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cig $$0) {
      cuh $$1 = $$0.p();
      boolean $$2 = this.gN() && this.gM().b(this.gO()) != null;
      if (this.gN() && !$$2 && cuh.a($$1, cnm.a(this.dY().b(li.d)))) {
         bsc $$3 = bsc.f;
         cuh $$4 = this.d($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.d() && (double)Math.max(this.al.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.G());
         $$0.ao();
         this.gM().a(this.gO(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gM() == null ? super.h($$0) : false;
   }

   @Override
   public boolean V() {
      return super.V() || this.gM() != null;
   }

   public int gQ() {
      return this.ci;
   }

   public void c(int $$0) {
      this.ci = $$0;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.gN()) {
         this.gM().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.z(this.ak() != bsb.bs || $$2 != bss.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avn af_();

   protected class a extends bzl {
      private final cnn c;
      private final float d;
      public final cde a = cde.b().a(8.0).d().e();

      public a(cij $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = this.c.eu();
         return this.c.gM() == null && this.c.gH() && this.c.p() != null && !this.c.gq() && ($$0 == null || $$0.ak() != bsb.bE);
      }

      @Override
      public void c() {
         super.c();
         this.c.J().n();

         for (cnn $$1 : this.c.dU().a(cnn.class, this.a, this.c, this.c.cP().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.p());
         }
      }

      @Override
      public void d() {
         super.d();
         bso $$0 = this.c.p();
         if ($$0 != null) {
            for (cnn $$2 : this.c.dU().a(cnn.class, this.a, this.c, this.c.cP().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.c.v(true);
         }
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         bso $$0 = this.c.p();
         if ($$0 != null) {
            if (this.c.g((brv)$$0) > (double)this.d) {
               this.c.F().a($$0, 30.0F, 30.0F);
               if (this.c.al.a(50) == 0) {
                  this.c.P();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cnn> extends bzl {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         cnm $$0 = this.b.gM();
         if (this.b.gN() && !this.b.gM().a() && this.b.gz() && !cuh.a(this.b.d(bsc.f), cnm.a(this.b.dY().b(li.d)))) {
            cnn $$1 = $$0.b(this.b.gO());
            if ($$1 == null || !$$1.bI()) {
               List<cig> $$2 = this.b.dU().a(cig.class, this.b.cP().c(16.0, 8.0, 16.0), cnn.b);
               if (!$$2.isEmpty()) {
                  return this.b.J().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.J().h().a(this.b.ds(), 1.414)) {
            List<cig> $$0 = this.b.dU().a(cig.class, this.b.cP().c(4.0, 4.0, 4.0), cnn.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bzl {
      private final cnn b;

      c(cnn $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         cnm $$0 = this.b.gM();
         return this.b.bI() && this.b.p() == null && $$0 != null && $$0.f();
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
         if (!this.b.ba() && this.b.al.a(this.a(100)) == 0) {
            cnn.this.b(cnn.this.af_());
         }

         if (!this.b.bW() && this.b.al.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends bzl {
      private final cnn a;
      private final double b;
      private ir c;
      private final List<ir> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cnn $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gN() && !this.a.gM().a();
      }

      private boolean i() {
         aqt $$0 = (aqt)this.a.dU();
         ir $$1 = this.a.du();
         Optional<ir> $$2 = $$0.y().a($$0x -> $$0x.a(cdv.n), this::a, cdr.b.c, $$1, 48, this.a.al);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.J().l() ? false : this.a.p() == null && !this.c.a(this.a.ds(), (double)(this.a.do() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.ds(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.p(0);
         this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.J().l()) {
            ewu $$0 = ewu.c(this.c);
            ewu $$1 = cdi.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdi.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.J().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(ir $$0) {
         for (ir $$1 : this.d) {
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
