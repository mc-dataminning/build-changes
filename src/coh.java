import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class coh extends ckc {
   protected static final ajv<Boolean> c = ajz.a(coh.class, ajx.k);
   static final Predicate<cjf> b = $$0 -> !$$0.y() && $$0.bE() && cuo.a($$0.p(), cog.a($$0.dS().b(lu.d)));
   @Nullable
   protected cog d;
   private int e;
   private boolean ca;
   private int cb;

   protected coh(bsw<? extends coh> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new coh.b<>(this));
      this.bU.a(3, new cbe<>(this));
      this.bU.a(4, new coh.d(this, 1.05F, 1));
      this.bU.a(5, new coh.c(this));
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(aqt var1, int var2, boolean var3);

   public boolean gz() {
      return this.ca;
   }

   public void z(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public void m_() {
      if (this.dQ() instanceof aqt && this.bE()) {
         cog $$0 = this.gA();
         if (this.gz()) {
            if ($$0 == null) {
               if (this.dQ().Z() % 20L == 0L) {
                  cog $$1 = ((aqt)this.dQ()).d(this.dq());
                  if ($$1 != null && coi.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               btl $$2 = this.p();
               if ($$2 != null && ($$2.am() == bsw.by || $$2.am() == bsw.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.m_();
   }

   @Override
   protected void gr() {
      this.bf += 2;
   }

   @Override
   public void a(brj $$0) {
      if (this.dQ() instanceof aqt) {
         bsq $$1 = $$0.d();
         cog $$2 = this.gA();
         if ($$2 != null) {
            if (this.gq()) {
               $$2.c(this.gE());
            }

            if ($$1 != null && $$1.am() == bsw.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gt() {
      return !this.gD();
   }

   public void a(@Nullable cog $$0) {
      this.d = $$0;
   }

   @Nullable
   public cog gA() {
      return this.d;
   }

   public boolean gB() {
      cuo $$0 = this.a(bsx.f);
      boolean $$1 = !$$0.e() && cuo.a($$0, cog.a(this.dS().b(lu.d)));
      boolean $$2 = this.gq();
      return $$1 && $$2;
   }

   public boolean gC() {
      return !(this.dQ() instanceof aqt $$0) ? false : this.gA() != null || $$0.d(this.dq()) != null;
   }

   public boolean gD() {
      return this.gA() != null && this.gA().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gE() {
      return this.e;
   }

   public boolean gF() {
      return this.ao.a(c);
   }

   public void A(boolean $$0) {
      this.ao.a(c, $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.ca);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.ca = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dQ() instanceof aqt) {
            this.d = ((aqt)this.dQ()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gq()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cjf $$0) {
      cuo $$1 = $$0.p();
      boolean $$2 = this.gD() && this.gA().b(this.gE()) != null;
      if (this.gD() && !$$2 && cuo.a($$1, cog.a(this.dS().b(lu.d)))) {
         bsx $$3 = bsx.f;
         cuo $$4 = this.a($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.H());
         $$0.aq();
         this.gA().a(this.gE(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gA() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gA() != null;
   }

   public int gG() {
      return this.cb;
   }

   public void c(int $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.gD()) {
         this.gA().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.z(this.am() != bsw.bo || $$2 != btp.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avn ae_();

   protected class a extends cak {
      private final coh b;
      private final float c;
      public final ced a = ced.b().a(8.0).d().e();

      public a(final cji $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean b() {
         btl $$0 = this.b.ej();
         return this.b.gA() == null && this.b.gv() && this.b.p() != null && !this.b.gd() && ($$0 == null || $$0.am() != bsw.by);
      }

      @Override
      public void d() {
         super.d();
         this.b.J().n();

         for (coh $$1 : this.b.dQ().a(coh.class, this.a, this.b, this.b.cL().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.p());
         }
      }

      @Override
      public void e() {
         super.e();
         btl $$0 = this.b.p();
         if ($$0 != null) {
            for (coh $$2 : this.b.dQ().a(coh.class, this.a, this.b, this.b.cL().c(8.0, 8.0, 8.0))) {
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
      public void a() {
         btl $$0 = this.b.p();
         if ($$0 != null) {
            if (this.b.g((bsq)$$0) > (double)this.c) {
               this.b.F().a($$0, 30.0F, 30.0F);
               if (this.b.ah.a(50) == 0) {
                  this.b.Q();
               }
            } else {
               this.b.v(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends coh> extends cak {
      private final T a;

      public b(final T $$1) {
         this.a = $$1;
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         cog $$0 = this.a.gA();
         if (this.a.gD() && !this.a.gA().a() && this.a.gn() && !cuo.a(this.a.a(bsx.f), cog.a(this.a.dS().b(lu.d)))) {
            coh $$1 = $$0.b(this.a.gE());
            if ($$1 == null || !$$1.bE()) {
               List<cjf> $$2 = this.a.dQ().a(cjf.class, this.a.cL().c(16.0, 8.0, 16.0), coh.b);
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
      public void a() {
         if (this.a.J().h().a(this.a.do(), 1.414)) {
            List<cjf> $$0 = this.a.dQ().a(cjf.class, this.a.cL().c(4.0, 4.0, 4.0), coh.b);
            if (!$$0.isEmpty()) {
               this.a.b($$0.get(0));
            }
         }
      }
   }

   public class c extends cak {
      private final coh b;

      c(final coh $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         cog $$0 = this.b.gA();
         return this.b.bE() && this.b.p() == null && $$0 != null && $$0.f();
      }

      @Override
      public void d() {
         this.b.A(true);
         super.d();
      }

      @Override
      public void e() {
         this.b.A(false);
         super.e();
      }

      @Override
      public void a() {
         if (!this.b.aX() && this.b.ah.a(this.a(100)) == 0) {
            coh.this.b(coh.this.ae_());
         }

         if (!this.b.bS() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.a();
      }
   }

   static class d extends cak {
      private final coh a;
      private final double b;
      private jd c;
      private final List<jd> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(coh $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gD() && !this.a.gA().a();
      }

      private boolean i() {
         aqt $$0 = (aqt)this.a.dQ();
         jd $$1 = this.a.dq();
         Optional<jd> $$2 = $$0.y().a($$0x -> $$0x.a(ceu.n), this::a, ceq.b.c, $$1, 48, this.a.ah);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.J().l() ? false : this.a.p() == null && !this.c.a(this.a.do(), (double)(this.a.dk() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.do(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void d() {
         super.d();
         this.a.o(0);
         this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.J().l()) {
            eww $$0 = eww.c(this.c);
            eww $$1 = ceh.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = ceh.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.J().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(jd $$0) {
         for (jd $$1 : this.d) {
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
