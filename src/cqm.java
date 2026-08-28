import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cqm extends cma {
   protected static final ajy<Boolean> c = akc.a(cqm.class, aka.k);
   static final Predicate<cld> a = $$0 -> !$$0.v() && $$0.bL() && cwq.a($$0.l(), cql.a($$0.dX().e(mc.d)));
   @Nullable
   protected cql d;
   private int b;
   private boolean bY;
   private int bZ;

   protected cqm(but<? extends cqm> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(1, new cqm.b<>(this));
      this.bS.a(3, new cda<>(this));
      this.bS.a(4, new cqm.d(this, 1.05F, 1));
      this.bS.a(5, new cqm.c(this));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(ard var1, int var2, boolean var3);

   public boolean gE() {
      return this.bY;
   }

   public void A(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void d_() {
      if (this.dV() instanceof ard && this.bL()) {
         cql $$0 = this.gF();
         if (this.gE()) {
            if ($$0 == null) {
               if (this.dV().ad() % 20L == 0L) {
                  cql $$1 = ((ard)this.dV()).d(this.dv());
                  if ($$1 != null && cqn.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bvi $$2 = this.O_();
               if ($$2 != null && ($$2.aq() == but.bR || $$2.aq() == but.ap)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gw() {
      this.bf += 2;
   }

   @Override
   public void a(btc $$0) {
      if (this.dV() instanceof ard) {
         bum $$1 = $$0.d();
         cql $$2 = this.gF();
         if ($$2 != null) {
            if (this.gv()) {
               $$2.c(this.gJ());
            }

            if ($$1 != null && $$1.aq() == but.bR) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gy() {
      return !this.gI();
   }

   public void a(@Nullable cql $$0) {
      this.d = $$0;
   }

   @Nullable
   public cql gF() {
      return this.d;
   }

   public boolean gG() {
      cwq $$0 = this.a(buu.f);
      boolean $$1 = !$$0.f() && cwq.a($$0, cql.a(this.dX().e(mc.d)));
      boolean $$2 = this.gv();
      return $$1 && $$2;
   }

   public boolean gH() {
      return !(this.dV() instanceof ard $$0) ? false : this.gF() != null || $$0.d(this.dv()) != null;
   }

   public boolean gI() {
      return this.gF() != null && this.gF().u();
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public int gJ() {
      return this.b;
   }

   public boolean gK() {
      return this.al.a(c);
   }

   public void B(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bY);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dV() instanceof ard) {
            this.d = ((ard)this.dV()).B().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.b, this, false);
            if (this.gv()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(ard $$0, cld $$1) {
      cwq $$2 = $$1.l();
      boolean $$3 = this.gI() && this.gF().b(this.gJ()) != null;
      if (this.gI() && !$$3 && cwq.a($$2, cql.a(this.dX().e(mc.d)))) {
         buu $$4 = buu.f;
         cwq $$5 = this.a($$4);
         double $$6 = (double)this.h($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.at();
         this.gF().a(this.gJ(), this);
         this.x(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gF() == null ? super.h($$0) : false;
   }

   @Override
   public boolean aa() {
      return super.aa() || this.gF() != null;
   }

   public int gL() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.gI()) {
         this.gF().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      this.A(this.aq() != but.bH || $$2 != bus.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avz aj_();

   protected static class a extends ccg {
      private final cqm b;
      private final float c;
      public final cfz a = cfz.b().a(8.0).d().e();

      public a(clg $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(ccg.a.a, ccg.a.b));
      }

      @Override
      public boolean b() {
         bvi $$0 = this.b.ep();
         return this.b.gF() == null && this.b.gA() && this.b.O_() != null && !this.b.gh() && ($$0 == null || $$0.aq() != but.bR);
      }

      @Override
      public void d() {
         super.d();
         this.b.P().m();

         for (cqm $$1 : a(this.b).a(cqm.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.O_());
         }
      }

      @Override
      public void e() {
         super.e();
         bvi $$0 = this.b.O_();
         if ($$0 != null) {
            for (cqm $$2 : a(this.b).a(cqm.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
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
         bvi $$0 = this.b.O_();
         if ($$0 != null) {
            if (this.b.g((bum)$$0) > (double)this.c) {
               this.b.L().a($$0, 30.0F, 30.0F);
               if (this.b.ae.a(50) == 0) {
                  this.b.U();
               }
            } else {
               this.b.w(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends cqm> extends ccg {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private eto d;
      @Nullable
      private cld e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cqm.this.h(bwq.m);

            for (cld $$3 : this.b.dV().a(cld.class, this.b.cR().c($$1, 8.0, $$1), cqm.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (cqm.this.dV().ad() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  eto $$5 = this.b.P().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), cqm.this.dV().ad() + 600L);
               }
            }

            this.c = $$0;
            return false;
         }
      }

      @Override
      public boolean c() {
         if (this.e == null || this.d == null) {
            return false;
         } else if (this.e.dQ()) {
            return false;
         } else {
            return this.d.c() ? false : !this.h();
         }
      }

      private boolean h() {
         if (!this.b.gI()) {
            return true;
         } else if (this.b.gF().a()) {
            return true;
         } else if (!this.b.gs()) {
            return true;
         } else if (cwq.a(this.b.a(buu.f), cql.a(this.b.dX().e(mc.d)))) {
            return true;
         } else {
            cqm $$0 = cqm.this.d.b(this.b.gJ());
            return $$0 != null && $$0.bL();
         }
      }

      @Override
      public void d() {
         this.b.P().a(this.d, 1.15F);
      }

      @Override
      public void e() {
         this.d = null;
         this.e = null;
      }

      @Override
      public void a() {
         if (this.e != null && this.e.a(this.b, 1.414)) {
            this.b.a(a(cqm.this.dV()), this.e);
         }
      }
   }

   public class c extends ccg {
      private final cqm b;

      c(final cqm $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public boolean b() {
         cql $$0 = this.b.gF();
         return this.b.bL() && this.b.O_() == null && $$0 != null && $$0.f();
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
         if (!this.b.bb() && this.b.ae.a(this.a(100)) == 0) {
            cqm.this.b(cqm.this.aj_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.O().a();
         }

         super.a();
      }
   }

   static class d extends ccg {
      private final cqm a;
      private final double b;
      private ji c;
      private final List<ji> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cqm $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.O_() == null;
      }

      private boolean h() {
         return this.a.gI() && !this.a.gF().a();
      }

      private boolean i() {
         ard $$0 = (ard)this.a.dV();
         ji $$1 = this.a.dv();
         Optional<ji> $$2 = $$0.A().a($$0x -> $$0x.a(cgq.n), this::a, cgm.b.c, $$1, 48, this.a.ae);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.P().k() ? false : this.a.O_() == null && !this.c.a(this.a.dt(), (double)(this.a.dq() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.dt(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void d() {
         super.d();
         this.a.n(0);
         this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.P().k()) {
            fbb $$0 = fbb.c(this.c);
            fbb $$1 = cgd.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgd.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.P().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(ji $$0) {
         for (ji $$1 : this.d) {
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
