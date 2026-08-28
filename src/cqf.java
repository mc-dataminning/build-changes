import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cqf extends clw {
   protected static final ako<Boolean> d = aks.a(cqf.class, akq.k);
   static final Predicate<ckz> b = $$0 -> !$$0.w() && $$0.bN() && cwf.a($$0.m(), cqe.a($$0.ea().e(ma.d)));
   @Nullable
   protected cqe e;
   private int c;
   private boolean bY;
   private int bZ;

   protected cqf(bup<? extends cqf> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new cqf.b<>(this));
      this.bS.a(3, new ccw<>(this));
      this.bS.a(4, new cqf.d(this, 1.05F, 1));
      this.bS.a(5, new cqf.c(this));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public abstract void a(arq var1, int var2, boolean var3);

   public boolean gI() {
      return this.bY;
   }

   public void A(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void n_() {
      if (this.dY() instanceof arq && this.bN()) {
         cqe $$0 = this.gJ();
         if (this.gI()) {
            if ($$0 == null) {
               if (this.dY().aa() % 20L == 0L) {
                  cqe $$1 = ((arq)this.dY()).d(this.dy());
                  if ($$1 != null && cqg.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bve $$2 = this.m();
               if ($$2 != null && ($$2.ar() == bup.by || $$2.ar() == bup.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gA() {
      this.bf += 2;
   }

   @Override
   public void a(bsy $$0) {
      if (this.dY() instanceof arq) {
         bui $$1 = $$0.d();
         cqe $$2 = this.gJ();
         if ($$2 != null) {
            if (this.gz()) {
               $$2.c(this.gN());
            }

            if ($$1 != null && $$1.ar() == bup.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gC() {
      return !this.gM();
   }

   public void a(@Nullable cqe $$0) {
      this.e = $$0;
   }

   @Nullable
   public cqe gJ() {
      return this.e;
   }

   public boolean gK() {
      cwf $$0 = this.a(buq.f);
      boolean $$1 = !$$0.f() && cwf.a($$0, cqe.a(this.ea().e(ma.d)));
      boolean $$2 = this.gz();
      return $$1 && $$2;
   }

   public boolean gL() {
      return !(this.dY() instanceof arq $$0) ? false : this.gJ() != null || $$0.d(this.dy()) != null;
   }

   public boolean gM() {
      return this.gJ() != null && this.gJ().u();
   }

   public void b(int $$0) {
      this.c = $$0;
   }

   public int gN() {
      return this.c;
   }

   public boolean gO() {
      return this.am.a(d);
   }

   public void B(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Wave", this.c);
      $$0.a("CanJoinRaid", this.bY);
      if (this.e != null) {
         $$0.a("RaidId", this.e.t());
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.c = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dY() instanceof arq) {
            this.e = ((arq)this.dY()).z().a($$0.h("RaidId"));
         }

         if (this.e != null) {
            this.e.a(this.c, this, false);
            if (this.gz()) {
               this.e.a(this.c, this);
            }
         }
      }
   }

   @Override
   protected void b(ckz $$0) {
      cwf $$1 = $$0.m();
      boolean $$2 = this.gM() && this.gJ().b(this.gN()) != null;
      if (this.gM() && !$$2 && cwf.a($$1, cqe.a(this.ea().e(ma.d)))) {
         buq $$3 = buq.f;
         cwf $$4 = this.a($$3);
         double $$5 = (double)this.h($$3);
         if (!$$4.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.av();
         this.gJ().a(this.gN(), this);
         this.x(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gJ() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gJ() != null;
   }

   public int gP() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.gM()) {
         this.gJ().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.A(this.ar() != bup.bo || $$2 != buo.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awn aj_();

   protected class a extends ccc {
      private final cqf b;
      private final float c;
      public final cfv a = cfv.b().a(8.0).d().e();

      public a(final clc $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean b() {
         bve $$0 = this.b.et();
         return this.b.gJ() == null && this.b.gE() && this.b.m() != null && !this.b.gk() && ($$0 == null || $$0.ar() != bup.by);
      }

      @Override
      public void d() {
         super.d();
         this.b.P().o();

         for (cqf $$1 : this.b.dY().a(cqf.class, this.a, this.b, this.b.cT().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.m());
         }
      }

      @Override
      public void e() {
         super.e();
         bve $$0 = this.b.m();
         if ($$0 != null) {
            for (cqf $$2 : this.b.dY().a(cqf.class, this.a, this.b, this.b.cT().c(8.0, 8.0, 8.0))) {
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
         bve $$0 = this.b.m();
         if ($$0 != null) {
            if (this.b.g((bui)$$0) > (double)this.c) {
               this.b.K().a($$0, 30.0F, 30.0F);
               if (this.b.af.a(50) == 0) {
                  this.b.U();
               }
            } else {
               this.b.w(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends cqf> extends ccc {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private esc d;
      @Nullable
      private ckz e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cqf.this.h(bwm.m);

            for (ckz $$3 : this.b.dY().a(ckz.class, this.b.cT().c($$1, 8.0, $$1), cqf.b)) {
               long $$4 = this.c.getOrDefault($$3.as(), Long.MIN_VALUE);
               if (cqf.this.dY().aa() < $$4) {
                  $$0.put($$3.as(), $$4);
               } else {
                  esc $$5 = this.b.P().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.as(), cqf.this.dY().aa() + 600L);
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
         } else if (this.e.dT()) {
            return false;
         } else {
            return this.d.c() ? false : !this.h();
         }
      }

      private boolean h() {
         if (!this.b.gM()) {
            return true;
         } else if (this.b.gJ().a()) {
            return true;
         } else if (!this.b.gw()) {
            return true;
         } else if (cwf.a(this.b.a(buq.f), cqe.a(this.b.ea().e(ma.d)))) {
            return true;
         } else {
            cqf $$0 = cqf.this.e.b(this.b.gN());
            return $$0 != null && $$0.bN();
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
            this.b.b(this.e);
         }
      }
   }

   public class c extends ccc {
      private final cqf b;

      c(final cqf $$1) {
         this.b = $$1;
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         cqe $$0 = this.b.gJ();
         return this.b.bN() && this.b.m() == null && $$0 != null && $$0.f();
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
         if (!this.b.bd() && this.b.af.a(this.a(100)) == 0) {
            cqf.this.b(cqf.this.aj_());
         }

         if (!this.b.cb() && this.b.af.a(this.a(50)) == 0) {
            this.b.O().a();
         }

         super.a();
      }
   }

   static class d extends ccc {
      private final cqf a;
      private final double b;
      private jh c;
      private final List<jh> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cqf $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.m() == null;
      }

      private boolean h() {
         return this.a.gM() && !this.a.gJ().a();
      }

      private boolean i() {
         arq $$0 = (arq)this.a.dY();
         jh $$1 = this.a.dy();
         Optional<jh> $$2 = $$0.y().a($$0x -> $$0x.a(cgm.n), this::a, cgi.b.c, $$1, 48, this.a.af);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.P().m() ? false : this.a.m() == null && !this.c.a(this.a.dw(), (double)(this.a.dt() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.dw(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void d() {
         super.d();
         this.a.o(0);
         this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.P().m()) {
            ezr $$0 = ezr.c(this.c);
            ezr $$1 = cfz.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cfz.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.P().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(jh $$0) {
         for (jh $$1 : this.d) {
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
