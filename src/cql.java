import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cql extends clz {
   protected static final ajy<Boolean> c = akc.a(cql.class, aka.k);
   static final Predicate<clc> a = $$0 -> !$$0.v() && $$0.bL() && cwp.a($$0.l(), cqk.a($$0.dX().e(mc.d)));
   @Nullable
   protected cqk d;
   private int b;
   private boolean bY;
   private int bZ;

   protected cql(bus<? extends cql> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(1, new cql.b<>(this));
      this.bS.a(3, new ccz<>(this));
      this.bS.a(4, new cql.d(this, 1.05F, 1));
      this.bS.a(5, new cql.c(this));
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
         cqk $$0 = this.gF();
         if (this.gE()) {
            if ($$0 == null) {
               if (this.dV().ad() % 20L == 0L) {
                  cqk $$1 = ((ard)this.dV()).d(this.dv());
                  if ($$1 != null && cqm.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bvh $$2 = this.O_();
               if ($$2 != null && ($$2.aq() == bus.bR || $$2.aq() == bus.ap)) {
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
   public void a(btb $$0) {
      if (this.dV() instanceof ard) {
         bul $$1 = $$0.d();
         cqk $$2 = this.gF();
         if ($$2 != null) {
            if (this.gv()) {
               $$2.c(this.gJ());
            }

            if ($$1 != null && $$1.aq() == bus.bR) {
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

   public void a(@Nullable cqk $$0) {
      this.d = $$0;
   }

   @Nullable
   public cqk gF() {
      return this.d;
   }

   public boolean gG() {
      cwp $$0 = this.a(but.f);
      boolean $$1 = !$$0.f() && cwp.a($$0, cqk.a(this.dX().e(mc.d)));
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
   protected void a(ard $$0, clc $$1) {
      cwp $$2 = $$1.l();
      boolean $$3 = this.gI() && this.gF().b(this.gJ()) != null;
      if (this.gI() && !$$3 && cwp.a($$2, cqk.a(this.dX().e(mc.d)))) {
         but $$4 = but.f;
         cwp $$5 = this.a($$4);
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
   public boolean a(ard $$0, btb $$1, float $$2) {
      if (this.gI()) {
         this.gF().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.A(this.aq() != bus.bH || $$2 != bur.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avz aj_();

   protected static class a extends ccf {
      private final cql b;
      private final float c;
      public final cfy a = cfy.b().a(8.0).d().e();

      public a(clf $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         bvh $$0 = this.b.ep();
         return this.b.gF() == null && this.b.gA() && this.b.O_() != null && !this.b.gh() && ($$0 == null || $$0.aq() != bus.bR);
      }

      @Override
      public void d() {
         super.d();
         this.b.P().m();

         for (cql $$1 : a(this.b).a(cql.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.O_());
         }
      }

      @Override
      public void e() {
         super.e();
         bvh $$0 = this.b.O_();
         if ($$0 != null) {
            for (cql $$2 : a(this.b).a(cql.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
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
         bvh $$0 = this.b.O_();
         if ($$0 != null) {
            if (this.b.g((bul)$$0) > (double)this.c) {
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

   public class b<T extends cql> extends ccf {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private etn d;
      @Nullable
      private clc e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cql.this.h(bwp.m);

            for (clc $$3 : this.b.dV().a(clc.class, this.b.cR().c($$1, 8.0, $$1), cql.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (cql.this.dV().ad() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  etn $$5 = this.b.P().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), cql.this.dV().ad() + 600L);
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
         } else if (cwp.a(this.b.a(but.f), cqk.a(this.b.dX().e(mc.d)))) {
            return true;
         } else {
            cql $$0 = cql.this.d.b(this.b.gJ());
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
            this.b.a(a(cql.this.dV()), this.e);
         }
      }
   }

   public class c extends ccf {
      private final cql b;

      c(final cql $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         cqk $$0 = this.b.gF();
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
            cql.this.b(cql.this.aj_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.O().a();
         }

         super.a();
      }
   }

   static class d extends ccf {
      private final cql a;
      private final double b;
      private ji c;
      private final List<ji> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cql $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(ccf.a.a));
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
         Optional<ji> $$2 = $$0.A().a($$0x -> $$0x.a(cgp.n), this::a, cgl.b.c, $$1, 48, this.a.ae);
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
            fba $$0 = fba.c(this.c);
            fba $$1 = cgc.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgc.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
