import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ckg extends cgb {
   protected static final aim<Boolean> c = aiq.a(ckg.class, aio.k);
   static final Predicate<cfe> b = $$0 -> !$$0.y() && $$0.bA() && cqm.a($$0.p(), ckf.s());
   @Nullable
   protected ckf d;
   private int e;
   private boolean bX;
   private int bY;

   protected ckg(bpd<? extends ckg> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(1, new ckg.b<>(this));
      this.bR.a(3, new bxg<>(this));
      this.bR.a(4, new ckg.d(this, 1.05F, 1));
      this.bR.a(5, new ckg.c(this));
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gA() {
      return this.bX;
   }

   public void z(boolean $$0) {
      this.bX = $$0;
   }

   @Override
   public void m_() {
      if (this.dM() instanceof apf && this.bA()) {
         ckf $$0 = this.gB();
         if (this.gA()) {
            if ($$0 == null) {
               if (this.dM().X() % 20L == 0L) {
                  ckf $$1 = ((apf)this.dM()).d(this.dm());
                  if ($$1 != null && ckh.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bpp $$2 = this.p();
               if ($$2 != null && ($$2.ai() == bpd.by || $$2.ai() == bpd.ag)) {
                  this.be = 0;
               }
            }
         }
      }

      super.m_();
   }

   @Override
   protected void gs() {
      this.be += 2;
   }

   @Override
   public void a(bnw $$0) {
      if (this.dM() instanceof apf) {
         box $$1 = $$0.d();
         ckf $$2 = this.gB();
         if ($$2 != null) {
            if (this.gr()) {
               $$2.c(this.gD());
            }

            if ($$1 != null && $$1.ai() == bpd.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gr() && $$2 == null && ((apf)this.dM()).d(this.dm()) == null) {
            cqm $$3 = this.d(bpe.f);
            ciu $$4 = null;
            if ($$1 instanceof ciu) {
               $$4 = (ciu)$$1;
            } else if ($$1 instanceof cch $$6) {
               bpp $$7 = $$6.P_();
               if ($$6.r() && $$7 instanceof ciu) {
                  $$4 = (ciu)$$7;
               }
            }

            if (!$$3.b() && cqm.a($$3, ckf.s()) && $$4 != null) {
               bok $$8 = $$4.c(bom.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.d();
                  $$4.d(bom.E);
               } else {
                  $$9--;
               }

               $$9 = aww.a($$9, 0, 4);
               bok $$10 = new bok(bom.E, 120000, $$9, false, false, true);
               if (!this.dM().Z().b(cwx.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gu() {
      return !this.gC();
   }

   public void a(@Nullable ckf $$0) {
      this.d = $$0;
   }

   @Nullable
   public ckf gB() {
      return this.d;
   }

   public boolean gC() {
      return this.gB() != null && this.gB().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gD() {
      return this.e;
   }

   public boolean gE() {
      return this.an.a(c);
   }

   public void A(boolean $$0) {
      this.an.a(c, $$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bX);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bX = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dM() instanceof apf) {
            this.d = ((apf)this.dM()).z().a($$0.h("RaidId"));
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
   protected void b(cfe $$0) {
      cqm $$1 = $$0.p();
      boolean $$2 = this.gC() && this.gB().b(this.gD()) != null;
      if (this.gC() && !$$2 && cqm.a($$1, ckf.s())) {
         bpe $$3 = bpe.f;
         cqm $$4 = this.d($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.M());
         $$0.am();
         this.gB().a(this.gD(), this);
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
   public boolean V() {
      return super.V() || this.gB() != null;
   }

   public int gF() {
      return this.bY;
   }

   public void c(int $$0) {
      this.bY = $$0;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.gC()) {
         this.gB().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.z(this.ai() != bpd.bo || $$2 != bpt.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract atx ae_();

   protected class a extends bwm {
      private final ckg c;
      private final float d;
      public final caf a = caf.b().a(8.0).d().e();

      public a(cfh $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bwm.a.a, bwm.a.b));
      }

      @Override
      public boolean a() {
         bpp $$0 = this.c.ej();
         return this.c.gB() == null && this.c.gw() && this.c.p() != null && !this.c.gf() && ($$0 == null || $$0.ai() != bpd.by);
      }

      @Override
      public void c() {
         super.c();
         this.c.K().n();

         for (ckg $$1 : this.c.dM().a(ckg.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.p());
         }
      }

      @Override
      public void d() {
         super.d();
         bpp $$0 = this.c.p();
         if ($$0 != null) {
            for (ckg $$2 : this.c.dM().a(ckg.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
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
         bpp $$0 = this.c.p();
         if ($$0 != null) {
            if (this.c.g((box)$$0) > (double)this.d) {
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

   public class b<T extends ckg> extends bwm {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         ckf $$0 = this.b.gB();
         if (this.b.gC() && !this.b.gB().a() && this.b.go() && !cqm.a(this.b.d(bpe.f), ckf.s())) {
            ckg $$1 = $$0.b(this.b.gD());
            if ($$1 == null || !$$1.bA()) {
               List<cfe> $$2 = this.b.dM().a(cfe.class, this.b.cH().c(16.0, 8.0, 16.0), ckg.b);
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
         if (this.b.K().h().a(this.b.dk(), 1.414)) {
            List<cfe> $$0 = this.b.dM().a(cfe.class, this.b.cH().c(4.0, 4.0, 4.0), ckg.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bwm {
      private final ckg b;

      c(ckg $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         ckf $$0 = this.b.gB();
         return this.b.bA() && this.b.p() == null && $$0 != null && $$0.f();
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
         if (!this.b.aU() && this.b.ag.a(this.a(100)) == 0) {
            ckg.this.b(ckg.this.ae_());
         }

         if (!this.b.bO() && this.b.ag.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends bwm {
      private final ckg a;
      private final double b;
      private ib c;
      private final List<ib> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(ckg $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gC() && !this.a.gB().a();
      }

      private boolean i() {
         apf $$0 = (apf)this.a.dM();
         ib $$1 = this.a.dm();
         Optional<ib> $$2 = $$0.y().a($$0x -> $$0x.a(caw.n), this::a, cas.b.c, $$1, 48, this.a.ag);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.K().l() ? false : this.a.p() == null && !this.c.a(this.a.dk(), (double)(this.a.dg() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dk(), (double)this.e)) {
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
            ept $$0 = ept.c(this.c);
            ept $$1 = caj.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = caj.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(ib $$0) {
         for (ib $$1 : this.d) {
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
