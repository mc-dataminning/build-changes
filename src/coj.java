import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class coj extends cke {
   protected static final ajw<Boolean> c = aka.a(coj.class, ajy.k);
   static final Predicate<cjh> b = $$0 -> !$$0.y() && $$0.bE() && cuq.a($$0.p(), coi.a($$0.dQ().b(lu.d)));
   @Nullable
   protected coi d;
   private int e;
   private boolean ca;
   private int cb;

   protected coj(bsx<? extends coj> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bU.a(1, new coj.b<>(this));
      this.bU.a(3, new cbg<>(this));
      this.bU.a(4, new coj.d(this, 1.05F, 1));
      this.bU.a(5, new coj.c(this));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(aqu var1, int var2, boolean var3);

   public boolean gx() {
      return this.ca;
   }

   public void A(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public void m_() {
      if (this.dO() instanceof aqu && this.bE()) {
         coi $$0 = this.gy();
         if (this.gx()) {
            if ($$0 == null) {
               if (this.dO().Z() % 20L == 0L) {
                  coi $$1 = ((aqu)this.dO()).d(this.do());
                  if ($$1 != null && cok.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               btn $$2 = this.p();
               if ($$2 != null && ($$2.am() == bsx.by || $$2.am() == bsx.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.m_();
   }

   @Override
   protected void gp() {
      this.bf += 2;
   }

   @Override
   public void a(brk $$0) {
      if (this.dO() instanceof aqu) {
         bsr $$1 = $$0.d();
         coi $$2 = this.gy();
         if ($$2 != null) {
            if (this.go()) {
               $$2.c(this.gC());
            }

            if ($$1 != null && $$1.am() == bsx.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gr() {
      return !this.gB();
   }

   public void a(@Nullable coi $$0) {
      this.d = $$0;
   }

   @Nullable
   public coi gy() {
      return this.d;
   }

   public boolean gz() {
      cuq $$0 = this.a(bsy.f);
      boolean $$1 = !$$0.e() && cuq.a($$0, coi.a(this.dQ().b(lu.d)));
      boolean $$2 = this.go();
      return $$1 && $$2;
   }

   public boolean gA() {
      return !(this.dO() instanceof aqu $$0) ? false : this.gy() != null || $$0.d(this.do()) != null;
   }

   public boolean gB() {
      return this.gy() != null && this.gy().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gC() {
      return this.e;
   }

   public boolean gD() {
      return this.ao.a(c);
   }

   public void B(boolean $$0) {
      this.ao.a(c, $$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.ca);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.ca = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dO() instanceof aqu) {
            this.d = ((aqu)this.dO()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.go()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cjh $$0) {
      cuq $$1 = $$0.p();
      boolean $$2 = this.gB() && this.gy().b(this.gC()) != null;
      if (this.gB() && !$$2 && cuq.a($$1, coi.a(this.dQ().b(lu.d)))) {
         bsy $$3 = bsy.f;
         cuq $$4 = this.a($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.H());
         $$0.aq();
         this.gy().a(this.gC(), this);
         this.x(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gy() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Y() {
      return super.Y() || this.gy() != null;
   }

   public int gE() {
      return this.cb;
   }

   public void c(int $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.gB()) {
         this.gy().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.A(this.am() != bsx.bo || $$2 != btr.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avo ai_();

   protected class a extends cam {
      private final coj b;
      private final float c;
      public final cef a = cef.b().a(8.0).d().e();

      public a(final cjk $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean b() {
         btn $$0 = this.b.ei();
         return this.b.gy() == null && this.b.gt() && this.b.p() != null && !this.b.gb() && ($$0 == null || $$0.am() != bsx.by);
      }

      @Override
      public void d() {
         super.d();
         this.b.N().n();

         for (coj $$1 : this.b.dO().a(coj.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.p());
         }
      }

      @Override
      public void e() {
         super.e();
         btn $$0 = this.b.p();
         if ($$0 != null) {
            for (coj $$2 : this.b.dO().a(coj.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.w(true);
            }

            this.b.w(true);
         }
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         btn $$0 = this.b.p();
         if ($$0 != null) {
            if (this.b.g((bsr)$$0) > (double)this.c) {
               this.b.I().a($$0, 30.0F, 30.0F);
               if (this.b.ah.a(50) == 0) {
                  this.b.S();
               }
            } else {
               this.b.w(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends coj> extends cam {
      private final T a;

      public b(final T $$1) {
         this.a = $$1;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         coi $$0 = this.a.gy();
         if (this.a.gB() && !this.a.gy().a() && this.a.gl() && !cuq.a(this.a.a(bsy.f), coi.a(this.a.dQ().b(lu.d)))) {
            coj $$1 = $$0.b(this.a.gC());
            if ($$1 == null || !$$1.bE()) {
               List<cjh> $$2 = this.a.dO().a(cjh.class, this.a.cK().c(16.0, 8.0, 16.0), coj.b);
               if (!$$2.isEmpty()) {
                  return this.a.N().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void a() {
         if (this.a.N().h().a(this.a.dm(), 1.414)) {
            List<cjh> $$0 = this.a.dO().a(cjh.class, this.a.cK().c(4.0, 4.0, 4.0), coj.b);
            if (!$$0.isEmpty()) {
               this.a.b($$0.get(0));
            }
         }
      }
   }

   public class c extends cam {
      private final coj b;

      c(final coj $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         coi $$0 = this.b.gy();
         return this.b.bE() && this.b.p() == null && $$0 != null && $$0.f();
      }

      @Override
      public void d() {
         this.b.B(true);
         super.d();
      }

      @Override
      public void e() {
         this.b.B(false);
         super.e();
      }

      @Override
      public void a() {
         if (!this.b.aX() && this.b.ah.a(this.a(100)) == 0) {
            coj.this.b(coj.this.ai_());
         }

         if (!this.b.bS() && this.b.ah.a(this.a(50)) == 0) {
            this.b.L().a();
         }

         super.a();
      }
   }

   static class d extends cam {
      private final coj a;
      private final double b;
      private jd c;
      private final List<jd> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(coj $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gB() && !this.a.gy().a();
      }

      private boolean i() {
         aqu $$0 = (aqu)this.a.dO();
         jd $$1 = this.a.do();
         Optional<jd> $$2 = $$0.y().a($$0x -> $$0x.a(cew.n), this::a, ces.b.c, $$1, 48, this.a.ah);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.N().l() ? false : this.a.p() == null && !this.c.a(this.a.dm(), (double)(this.a.dj() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.dm(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void d() {
         super.d();
         this.a.o(0);
         this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.N().l()) {
            exc $$0 = exc.c(this.c);
            exc $$1 = cej.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cej.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.N().a($$1.c, $$1.d, $$1.e, this.b);
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
