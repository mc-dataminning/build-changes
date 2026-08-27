import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cgz extends ccx {
   protected static final agn<Boolean> c = agq.a(cgz.class, agp.k);
   static final Predicate<ccb> b = $$0 -> !$$0.z() && $$0.bx() && cng.a($$0.q(), cgy.s());
   @Nullable
   protected cgy d;
   private int e;
   private boolean bU;
   private int bV;

   protected cgz(bmc<? extends cgz> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(1, new cgz.b<>(this));
      this.bP.a(3, new bue<>(this));
      this.bP.a(4, new cgz.d(this, 1.05F, 1));
      this.bP.a(5, new cgz.c(this));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gs() {
      return this.bU;
   }

   public void z(boolean $$0) {
      this.bU = $$0;
   }

   @Override
   public void d_() {
      if (this.dL() instanceof ane && this.bx()) {
         cgy $$0 = this.gt();
         if (this.gs()) {
            if ($$0 == null) {
               if (this.dL().X() % 20L == 0L) {
                  cgy $$1 = ((ane)this.dL()).d(this.dl());
                  if ($$1 != null && cha.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bmo $$2 = this.q();
               if ($$2 != null && ($$2.ai() == bmc.bw || $$2.ai() == bmc.ae)) {
                  this.bb = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gk() {
      this.bb += 2;
   }

   @Override
   public void a(bkv $$0) {
      if (this.dL() instanceof ane) {
         blw $$1 = $$0.d();
         cgy $$2 = this.gt();
         if ($$2 != null) {
            if (this.gj()) {
               $$2.c(this.gv());
            }

            if ($$1 != null && $$1.ai() == bmc.bw) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gj() && $$2 == null && ((ane)this.dL()).d(this.dl()) == null) {
            cng $$3 = this.c(bmd.f);
            cfq $$4 = null;
            if ($$1 instanceof cfq) {
               $$4 = (cfq)$$1;
            } else if ($$1 instanceof bzf $$6) {
               bmo $$7 = $$6.R_();
               if ($$6.u() && $$7 instanceof cfq) {
                  $$4 = (cfq)$$7;
               }
            }

            if (!$$3.b() && cng.a($$3, cgy.s()) && $$4 != null) {
               blj $$8 = $$4.c(bll.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.d();
                  $$4.d(bll.E);
               } else {
                  $$9--;
               }

               $$9 = aup.a($$9, 0, 4);
               blj $$10 = new blj(bll.E, 120000, $$9, false, false, true);
               if (!this.dL().Z().b(ctt.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gm() {
      return !this.gu();
   }

   public void a(@Nullable cgy $$0) {
      this.d = $$0;
   }

   @Nullable
   public cgy gt() {
      return this.d;
   }

   public boolean gu() {
      return this.gt() != null && this.gt().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gv() {
      return this.e;
   }

   public boolean gw() {
      return this.an.b(c);
   }

   public void A(boolean $$0) {
      this.an.b(c, $$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bU);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bU = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dL() instanceof ane) {
            this.d = ((ane)this.dL()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gj()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(ccb $$0) {
      cng $$1 = $$0.q();
      boolean $$2 = this.gu() && this.gt().b(this.gv()) != null;
      if (this.gu() && !$$2 && cng.a($$1, cgy.s())) {
         bmd $$3 = bmd.f;
         cng $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.am();
         this.gt().a(this.gv(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gt() == null ? super.h($$0) : false;
   }

   @Override
   public boolean X() {
      return super.X() || this.gt() != null;
   }

   public int gx() {
      return this.bV;
   }

   public void c(int $$0) {
      this.bV = $$0;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.gu()) {
         this.gt().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.z(this.ai() != bmc.bm || $$2 != bms.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract ars ag_();

   protected class a extends btk {
      private final cgz c;
      private final float d;
      public final bxd a = bxd.b().a(8.0).d().e();

      public a(cce $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(btk.a.a, btk.a.b));
      }

      @Override
      public boolean a() {
         bmo $$0 = this.c.eh();
         return this.c.gt() == null && this.c.go() && this.c.q() != null && !this.c.fX() && ($$0 == null || $$0.ai() != bmc.bw);
      }

      @Override
      public void c() {
         super.c();
         this.c.N().n();

         for (cgz $$1 : this.c.dL().a(cgz.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.q());
         }
      }

      @Override
      public void d() {
         super.d();
         bmo $$0 = this.c.q();
         if ($$0 != null) {
            for (cgz $$2 : this.c.dL().a(cgz.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
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
         bmo $$0 = this.c.q();
         if ($$0 != null) {
            if (this.c.f($$0) > (double)this.d) {
               this.c.I().a($$0, 30.0F, 30.0F);
               if (this.c.ag.a(50) == 0) {
                  this.c.R();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cgz> extends btk {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         cgy $$0 = this.b.gt();
         if (this.b.gu() && !this.b.gt().a() && this.b.gg() && !cng.a(this.b.c(bmd.f), cgy.s())) {
            cgz $$1 = $$0.b(this.b.gv());
            if ($$1 == null || !$$1.bx()) {
               List<ccb> $$2 = this.b.dL().a(ccb.class, this.b.cH().c(16.0, 8.0, 16.0), cgz.b);
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
         if (this.b.N().h().a(this.b.dj(), 1.414)) {
            List<ccb> $$0 = this.b.dL().a(ccb.class, this.b.cH().c(4.0, 4.0, 4.0), cgz.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends btk {
      private final cgz b;

      c(cgz $$1) {
         this.b = $$1;
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         cgy $$0 = this.b.gt();
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
         if (!this.b.aU() && this.b.ag.a(this.a(100)) == 0) {
            cgz.this.a(cgz.this.ag_(), cgz.this.eW(), cgz.this.eX());
         }

         if (!this.b.bO() && this.b.ag.a(this.a(50)) == 0) {
            this.b.M().a();
         }

         super.e();
      }
   }

   static class d extends btk {
      private final cgz a;
      private final double b;
      private hx c;
      private final List<hx> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cgz $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.q() == null;
      }

      private boolean h() {
         return this.a.gu() && !this.a.gt().a();
      }

      private boolean i() {
         ane $$0 = (ane)this.a.dL();
         hx $$1 = this.a.dl();
         Optional<hx> $$2 = $$0.y().a($$0x -> $$0x.a(bxu.n), this::a, bxq.b.c, $$1, 48, this.a.ag);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.N().l() ? false : this.a.q() == null && !this.c.a(this.a.dj(), (double)(this.a.dg() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dj(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.o(0);
         this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            emc $$0 = emc.c(this.c);
            emc $$1 = bxh.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bxh.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.N().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(hx $$0) {
         for (hx $$1 : this.d) {
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
