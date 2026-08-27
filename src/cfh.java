import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cfh extends cbo {
   protected static final afs<Boolean> c = afv.a(cfh.class, afu.k);
   static final Predicate<cas> b = $$0 -> !$$0.z() && $$0.bx() && clo.a($$0.q(), cfg.s());
   @Nullable
   protected cfg d;
   private int e;
   private boolean bT;
   private int bU;

   protected cfh(bkz<? extends cfh> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new cfh.b<>(this));
      this.bO.a(3, new bta<>(this));
      this.bO.a(4, new cfh.d(this, 1.05F, 1));
      this.bO.a(5, new cfh.c(this));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gs() {
      return this.bT;
   }

   public void z(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   public void d_() {
      if (this.dN() instanceof ami && this.bx()) {
         cfg $$0 = this.gt();
         if (this.gs()) {
            if ($$0 == null) {
               if (this.dN().W() % 20L == 0L) {
                  cfg $$1 = ((ami)this.dN()).c(this.dn());
                  if ($$1 != null && cfi.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bll $$2 = this.q();
               if ($$2 != null && ($$2.ai() == bkz.bt || $$2.ai() == bkz.ac)) {
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
   public void a(bjt $$0) {
      if (this.dN() instanceof ami) {
         bkv $$1 = $$0.d();
         cfg $$2 = this.gt();
         if ($$2 != null) {
            if (this.gj()) {
               $$2.c(this.gv());
            }

            if ($$1 != null && $$1.ai() == bkz.bt) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gj() && $$2 == null && ((ami)this.dN()).c(this.dn()) == null) {
            clo $$3 = this.c(bla.f);
            cdz $$4 = null;
            if ($$1 instanceof cdz) {
               $$4 = (cdz)$$1;
            } else if ($$1 instanceof bxz $$6) {
               bll $$7 = $$6.R_();
               if ($$6.u() && $$7 instanceof cdz) {
                  $$4 = (cdz)$$7;
               }
            }

            if (!$$3.b() && clo.a($$3, cfg.s()) && $$4 != null) {
               bki $$8 = $$4.b(bkk.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.c(bkk.E);
               } else {
                  $$9--;
               }

               $$9 = atq.a($$9, 0, 4);
               bki $$10 = new bki(bkk.E, 120000, $$9, false, false, true);
               if (!this.dN().Y().b(csb.B)) {
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

   public void a(@Nullable cfg $$0) {
      this.d = $$0;
   }

   @Nullable
   public cfg gt() {
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
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bT);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bT = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dN() instanceof ami) {
            this.d = ((ami)this.dN()).y().a($$0.h("RaidId"));
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
   protected void b(cas $$0) {
      clo $$1 = $$0.q();
      boolean $$2 = this.gu() && this.gt().b(this.gv()) != null;
      if (this.gu() && !$$2 && clo.a($$1, cfg.s())) {
         bla $$3 = bla.f;
         clo $$4 = this.c($$3);
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
   public boolean W() {
      return super.W() || this.gt() != null;
   }

   public int gx() {
      return this.bU;
   }

   public void c(int $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.gu()) {
         this.gt().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.z(this.ai() != bkz.bj || $$2 != blp.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract aqu af_();

   protected class a extends bsg {
      private final cfh c;
      private final float d;
      public final bvx a = bvx.b().a(8.0).d().e();

      public a(cav $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bsg.a.a, bsg.a.b));
      }

      @Override
      public boolean a() {
         bll $$0 = this.c.ei();
         return this.c.gt() == null && this.c.go() && this.c.q() != null && !this.c.fX() && ($$0 == null || $$0.ai() != bkz.bt);
      }

      @Override
      public void c() {
         super.c();
         this.c.N().n();

         for (cfh $$1 : this.c.dN().a(cfh.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.q());
         }
      }

      @Override
      public void d() {
         super.d();
         bll $$0 = this.c.q();
         if ($$0 != null) {
            for (cfh $$2 : this.c.dN().a(cfh.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
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
         bll $$0 = this.c.q();
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

   public class b<T extends cfh> extends bsg {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         cfg $$0 = this.b.gt();
         if (this.b.gu() && !this.b.gt().a() && this.b.gg() && !clo.a(this.b.c(bla.f), cfg.s())) {
            cfh $$1 = $$0.b(this.b.gv());
            if ($$1 == null || !$$1.bx()) {
               List<cas> $$2 = this.b.dN().a(cas.class, this.b.cH().c(16.0, 8.0, 16.0), cfh.b);
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
         if (this.b.N().h().a(this.b.dl(), 1.414)) {
            List<cas> $$0 = this.b.dN().a(cas.class, this.b.cH().c(4.0, 4.0, 4.0), cfh.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bsg {
      private final cfh b;

      c(cfh $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean a() {
         cfg $$0 = this.b.gt();
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
            cfh.this.a(cfh.this.af_(), cfh.this.eX(), cfh.this.eY());
         }

         if (!this.b.bO() && this.b.ag.a(this.a(50)) == 0) {
            this.b.M().a();
         }

         super.e();
      }
   }

   static class d extends bsg {
      private final cfh a;
      private final double b;
      private hx c;
      private final List<hx> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cfh $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bsg.a.a));
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
         ami $$0 = (ami)this.a.dN();
         hx $$1 = this.a.dn();
         Optional<hx> $$2 = $$0.x().a($$0x -> $$0x.a(bwo.n), this::a, bwk.b.c, $$1, 48, this.a.ag);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.N().l() ? false : this.a.q() == null && !this.c.a(this.a.dl(), (double)(this.a.dh() + (float)this.e)) && !this.f;
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
         this.a.o(0);
         this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            ejz $$0 = ejz.c(this.c);
            ejz $$1 = bwb.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bwb.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
