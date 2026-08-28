import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cqk extends cly {
   protected static final ajy<Boolean> c = akc.a(cqk.class, aka.k);
   static final Predicate<clb> a = $$0 -> !$$0.v() && $$0.bL() && cwo.a($$0.l(), cqj.a($$0.dX().e(mc.d)));
   @Nullable
   protected cqj d;
   private int b;
   private boolean bY;
   private int bZ;

   protected cqk(bur<? extends cqk> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(1, new cqk.b<>(this));
      this.bS.a(3, new ccy<>(this));
      this.bS.a(4, new cqk.d(this, 1.05F, 1));
      this.bS.a(5, new cqk.c(this));
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
         cqj $$0 = this.gF();
         if (this.gE()) {
            if ($$0 == null) {
               if (this.dV().ad() % 20L == 0L) {
                  cqj $$1 = ((ard)this.dV()).d(this.dv());
                  if ($$1 != null && cql.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bvg $$2 = this.O_();
               if ($$2 != null && ($$2.aq() == bur.bR || $$2.aq() == bur.ap)) {
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
   public void a(bta $$0) {
      if (this.dV() instanceof ard) {
         buk $$1 = $$0.d();
         cqj $$2 = this.gF();
         if ($$2 != null) {
            if (this.gv()) {
               $$2.c(this.gJ());
            }

            if ($$1 != null && $$1.aq() == bur.bR) {
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

   public void a(@Nullable cqj $$0) {
      this.d = $$0;
   }

   @Nullable
   public cqj gF() {
      return this.d;
   }

   public boolean gG() {
      cwo $$0 = this.a(bus.f);
      boolean $$1 = !$$0.f() && cwo.a($$0, cqj.a(this.dX().e(mc.d)));
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
   protected void a(ard $$0, clb $$1) {
      cwo $$2 = $$1.l();
      boolean $$3 = this.gI() && this.gF().b(this.gJ()) != null;
      if (this.gI() && !$$3 && cwo.a($$2, cqj.a(this.dX().e(mc.d)))) {
         bus $$4 = bus.f;
         cwo $$5 = this.a($$4);
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
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (this.gI()) {
         this.gF().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.A(this.aq() != bur.bH || $$2 != buq.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avz aj_();

   protected static class a extends cce {
      private final cqk b;
      private final float c;
      public final cfx a = cfx.b().a(8.0).d().e();

      public a(cle $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean b() {
         bvg $$0 = this.b.ep();
         return this.b.gF() == null && this.b.gA() && this.b.O_() != null && !this.b.gh() && ($$0 == null || $$0.aq() != bur.bR);
      }

      @Override
      public void d() {
         super.d();
         this.b.P().m();

         for (cqk $$1 : a(this.b).a(cqk.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.O_());
         }
      }

      @Override
      public void e() {
         super.e();
         bvg $$0 = this.b.O_();
         if ($$0 != null) {
            for (cqk $$2 : a(this.b).a(cqk.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
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
         bvg $$0 = this.b.O_();
         if ($$0 != null) {
            if (this.b.g((buk)$$0) > (double)this.c) {
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

   public class b<T extends cqk> extends cce {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private etm d;
      @Nullable
      private clb e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cqk.this.h(bwo.m);

            for (clb $$3 : this.b.dV().a(clb.class, this.b.cR().c($$1, 8.0, $$1), cqk.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (cqk.this.dV().ad() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  etm $$5 = this.b.P().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), cqk.this.dV().ad() + 600L);
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
         } else if (cwo.a(this.b.a(bus.f), cqj.a(this.b.dX().e(mc.d)))) {
            return true;
         } else {
            cqk $$0 = cqk.this.d.b(this.b.gJ());
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
            this.b.a(a(cqk.this.dV()), this.e);
         }
      }
   }

   public class c extends cce {
      private final cqk b;

      c(final cqk $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         cqj $$0 = this.b.gF();
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
            cqk.this.b(cqk.this.aj_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.O().a();
         }

         super.a();
      }
   }

   static class d extends cce {
      private final cqk a;
      private final double b;
      private ji c;
      private final List<ji> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cqk $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cce.a.a));
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
         Optional<ji> $$2 = $$0.A().a($$0x -> $$0x.a(cgo.n), this::a, cgk.b.c, $$1, 48, this.a.ae);
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
            faz $$0 = faz.c(this.c);
            faz $$1 = cgb.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgb.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
