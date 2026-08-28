import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cql extends cly {
   protected static final ajx<Boolean> c = akb.a(cql.class, ajz.k);
   static final Predicate<clb> a = $$0 -> !$$0.v() && $$0.bL() && cwp.a($$0.l(), cqk.a($$0.dY().e(mc.d)));
   @Nullable
   protected cqk d;
   private int b;
   private boolean bY;
   private int bZ;

   protected cql(bur<? extends cql> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(1, new cql.b<>(this));
      this.bS.a(3, new ccy<>(this));
      this.bS.a(4, new cql.d(this, 1.05F, 1));
      this.bS.a(5, new cql.c(this));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(arc var1, int var2, boolean var3);

   public boolean gB() {
      return this.bY;
   }

   public void A(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void d_() {
      if (this.dW() instanceof arc && this.bL()) {
         cqk $$0 = this.gC();
         if (this.gB()) {
            if ($$0 == null) {
               if (this.dW().ad() % 20L == 0L) {
                  cqk $$1 = ((arc)this.dW()).d(this.dw());
                  if ($$1 != null && cqm.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bvg $$2 = this.O_();
               if ($$2 != null && ($$2.aq() == bur.bS || $$2.aq() == bur.aq)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gt() {
      this.bf += 2;
   }

   @Override
   public void a(bta $$0) {
      if (this.dW() instanceof arc) {
         buk $$1 = $$0.d();
         cqk $$2 = this.gC();
         if ($$2 != null) {
            if (this.gs()) {
               $$2.c(this.gG());
            }

            if ($$1 != null && $$1.aq() == bur.bS) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gv() {
      return !this.gF();
   }

   public void a(@Nullable cqk $$0) {
      this.d = $$0;
   }

   @Nullable
   public cqk gC() {
      return this.d;
   }

   public boolean gD() {
      cwp $$0 = this.a(bus.f);
      boolean $$1 = !$$0.f() && cwp.a($$0, cqk.a(this.dY().e(mc.d)));
      boolean $$2 = this.gs();
      return $$1 && $$2;
   }

   public boolean gE() {
      return !(this.dW() instanceof arc $$0) ? false : this.gC() != null || $$0.d(this.dw()) != null;
   }

   public boolean gF() {
      return this.gC() != null && this.gC().u();
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public int gG() {
      return this.b;
   }

   public boolean gH() {
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
         if (this.dW() instanceof arc) {
            this.d = ((arc)this.dW()).B().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.b, this, false);
            if (this.gs()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(arc $$0, clb $$1) {
      cwp $$2 = $$1.l();
      boolean $$3 = this.gF() && this.gC().b(this.gG()) != null;
      if (this.gF() && !$$3 && cwp.a($$2, cqk.a(this.dY().e(mc.d)))) {
         bus $$4 = bus.f;
         cwp $$5 = this.a($$4);
         double $$6 = (double)this.h($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.at();
         this.gC().a(this.gG(), this);
         this.x(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gC() == null ? super.h($$0) : false;
   }

   @Override
   public boolean X() {
      return super.X() || this.gC() != null;
   }

   public int gI() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (this.gF()) {
         this.gC().p();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.A(this.aq() != bur.bI || $$2 != buq.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avz aj_();

   protected static class a extends cce {
      private final cql b;
      private final float c;
      public final cfx a = cfx.b().a(8.0).d().e();

      public a(cle $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean b() {
         bvg $$0 = this.b.eq();
         return this.b.gC() == null && this.b.gx() && this.b.O_() != null && !this.b.ge() && ($$0 == null || $$0.aq() != bur.bS);
      }

      @Override
      public void d() {
         super.d();
         this.b.L().m();

         for (cql $$1 : a(this.b).a(cql.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.O_());
         }
      }

      @Override
      public void e() {
         super.e();
         bvg $$0 = this.b.O_();
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
         bvg $$0 = this.b.O_();
         if ($$0 != null) {
            if (this.b.g((buk)$$0) > (double)this.c) {
               this.b.H().a($$0, 30.0F, 30.0F);
               if (this.b.ae.a(50) == 0) {
                  this.b.R();
               }
            } else {
               this.b.w(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends cql> extends cce {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private etn d;
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
            double $$1 = cql.this.h(bwo.m);

            for (clb $$3 : this.b.dW().a(clb.class, this.b.cR().c($$1, 8.0, $$1), cql.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (cql.this.dW().ad() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  etn $$5 = this.b.L().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), cql.this.dW().ad() + 600L);
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
         } else if (this.e.dR()) {
            return false;
         } else {
            return this.d.c() ? false : !this.h();
         }
      }

      private boolean h() {
         if (!this.b.gF()) {
            return true;
         } else if (this.b.gC().a()) {
            return true;
         } else if (!this.b.gp()) {
            return true;
         } else if (cwp.a(this.b.a(bus.f), cqk.a(this.b.dY().e(mc.d)))) {
            return true;
         } else {
            cql $$0 = cql.this.d.b(this.b.gG());
            return $$0 != null && $$0.bL();
         }
      }

      @Override
      public void d() {
         this.b.L().a(this.d, 1.15F);
      }

      @Override
      public void e() {
         this.d = null;
         this.e = null;
      }

      @Override
      public void a() {
         if (this.e != null && this.e.a(this.b, 1.414)) {
            this.b.a(a(cql.this.dW()), this.e);
         }
      }
   }

   public class c extends cce {
      private final cql b;

      c(final cql $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         cqk $$0 = this.b.gC();
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
            this.b.J().a();
         }

         super.a();
      }
   }

   static class d extends cce {
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
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.O_() == null;
      }

      private boolean h() {
         return this.a.gF() && !this.a.gC().a();
      }

      private boolean i() {
         arc $$0 = (arc)this.a.dW();
         ji $$1 = this.a.dw();
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
         return this.a.L().k() ? false : this.a.O_() == null && !this.c.a(this.a.du(), (double)(this.a.dr() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.du(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void d() {
         super.d();
         this.a.n(0);
         this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.L().k()) {
            fba $$0 = fba.c(this.c);
            fba $$1 = cgb.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cgb.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.L().a($$1.d, $$1.e, $$1.f, this.b);
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
