import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cjk extends cfh {
   protected static final aii<Boolean> c = ail.a(cjk.class, aik.k);
   static final Predicate<cel> b = $$0 -> !$$0.z() && $$0.bx() && cpq.a($$0.q(), cjj.s());
   @Nullable
   protected cjj d;
   private int e;
   private boolean bV;
   private int bW;

   protected cjk(bol<? extends cjk> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(1, new cjk.b<>(this));
      this.bP.a(3, new bwo<>(this));
      this.bP.a(4, new cjk.d(this, 1.05F, 1));
      this.bP.a(5, new cjk.c(this));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gy() {
      return this.bV;
   }

   public void z(boolean $$0) {
      this.bV = $$0;
   }

   @Override
   public void d_() {
      if (this.dJ() instanceof apa && this.bx()) {
         cjj $$0 = this.gz();
         if (this.gy()) {
            if ($$0 == null) {
               if (this.dJ().X() % 20L == 0L) {
                  cjj $$1 = ((apa)this.dJ()).d(this.dj());
                  if ($$1 != null && cjl.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               box $$2 = this.q();
               if ($$2 != null && ($$2.ai() == bol.bw || $$2.ai() == bol.ae)) {
                  this.bc = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gq() {
      this.bc += 2;
   }

   @Override
   public void a(bne $$0) {
      if (this.dJ() instanceof apa) {
         bof $$1 = $$0.d();
         cjj $$2 = this.gz();
         if ($$2 != null) {
            if (this.gp()) {
               $$2.c(this.gB());
            }

            if ($$1 != null && $$1.ai() == bol.bw) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gp() && $$2 == null && ((apa)this.dJ()).d(this.dj()) == null) {
            cpq $$3 = this.c(bom.f);
            cia $$4 = null;
            if ($$1 instanceof cia) {
               $$4 = (cia)$$1;
            } else if ($$1 instanceof cbp $$6) {
               box $$7 = $$6.R_();
               if ($$6.u() && $$7 instanceof cia) {
                  $$4 = (cia)$$7;
               }
            }

            if (!$$3.b() && cpq.a($$3, cjj.s()) && $$4 != null) {
               bns $$8 = $$4.c(bnu.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.d();
                  $$4.d(bnu.E);
               } else {
                  $$9--;
               }

               $$9 = awm.a($$9, 0, 4);
               bns $$10 = new bns(bnu.E, 120000, $$9, false, false, true);
               if (!this.dJ().Z().b(cwa.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gs() {
      return !this.gA();
   }

   public void a(@Nullable cjj $$0) {
      this.d = $$0;
   }

   @Nullable
   public cjj gz() {
      return this.d;
   }

   public boolean gA() {
      return this.gz() != null && this.gz().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gB() {
      return this.e;
   }

   public boolean gC() {
      return this.am.b(c);
   }

   public void A(boolean $$0) {
      this.am.b(c, $$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bV);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bV = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dJ() instanceof apa) {
            this.d = ((apa)this.dJ()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gp()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cel $$0) {
      cpq $$1 = $$0.q();
      boolean $$2 = this.gA() && this.gz().b(this.gB()) != null;
      if (this.gA() && !$$2 && cpq.a($$1, cjj.s())) {
         bom $$3 = bom.f;
         cpq $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.M());
         $$0.am();
         this.gz().a(this.gB(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gz() == null ? super.h($$0) : false;
   }

   @Override
   public boolean X() {
      return super.X() || this.gz() != null;
   }

   public int gD() {
      return this.bW;
   }

   public void c(int $$0) {
      this.bW = $$0;
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.gA()) {
         this.gz().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.z(this.ai() != bol.bm || $$2 != bpb.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract ato ag_();

   protected class a extends bvu {
      private final cjk c;
      private final float d;
      public final bzn a = bzn.b().a(8.0).d().e();

      public a(ceo $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean a() {
         box $$0 = this.c.eg();
         return this.c.gz() == null && this.c.gu() && this.c.q() != null && !this.c.gd() && ($$0 == null || $$0.ai() != bol.bw);
      }

      @Override
      public void c() {
         super.c();
         this.c.N().n();

         for (cjk $$1 : this.c.dJ().a(cjk.class, this.a, this.c, this.c.cE().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.q());
         }
      }

      @Override
      public void d() {
         super.d();
         box $$0 = this.c.q();
         if ($$0 != null) {
            for (cjk $$2 : this.c.dJ().a(cjk.class, this.a, this.c, this.c.cE().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.c.v(true);
         }
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         box $$0 = this.c.q();
         if ($$0 != null) {
            if (this.c.f((bof)$$0) > (double)this.d) {
               this.c.I().a($$0, 30.0F, 30.0F);
               if (this.c.af.a(50) == 0) {
                  this.c.R();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cjk> extends bvu {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         cjj $$0 = this.b.gz();
         if (this.b.gA() && !this.b.gz().a() && this.b.gm() && !cpq.a(this.b.c(bom.f), cjj.s())) {
            cjk $$1 = $$0.b(this.b.gB());
            if ($$1 == null || !$$1.bx()) {
               List<cel> $$2 = this.b.dJ().a(cel.class, this.b.cE().c(16.0, 8.0, 16.0), cjk.b);
               if (!$$2.isEmpty()) {
                  return this.b.N().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.N().h().a(this.b.dh(), 1.414)) {
            List<cel> $$0 = this.b.dJ().a(cel.class, this.b.cE().c(4.0, 4.0, 4.0), cjk.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bvu {
      private final cjk b;

      c(cjk $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         cjj $$0 = this.b.gz();
         return this.b.bx() && this.b.q() == null && $$0 != null && $$0.f();
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
         if (!this.b.aU() && this.b.af.a(this.a(100)) == 0) {
            cjk.this.b(cjk.this.ag_());
         }

         if (!this.b.bL() && this.b.af.a(this.a(50)) == 0) {
            this.b.M().a();
         }

         super.e();
      }
   }

   static class d extends bvu {
      private final cjk a;
      private final double b;
      private ib c;
      private final List<ib> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cjk $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.q() == null;
      }

      private boolean h() {
         return this.a.gA() && !this.a.gz().a();
      }

      private boolean i() {
         apa $$0 = (apa)this.a.dJ();
         ib $$1 = this.a.dj();
         Optional<ib> $$2 = $$0.y().a($$0x -> $$0x.a(cae.n), this::a, caa.b.c, $$1, 48, this.a.af);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.N().l() ? false : this.a.q() == null && !this.c.a(this.a.dh(), (double)(this.a.dd() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dh(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.p(0);
         this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            eov $$0 = eov.c(this.c);
            eov $$1 = bzr.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bzr.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.N().a($$1.c, $$1.d, $$1.e, this.b);
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
