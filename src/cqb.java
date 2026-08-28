import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cqb extends cls {
   protected static final akl<Boolean> d = akp.a(cqb.class, akn.k);
   static final Predicate<ckv> b = $$0 -> !$$0.w() && $$0.bM() && cwb.a($$0.m(), cqa.a($$0.dZ().e(lz.d)));
   @Nullable
   protected cqa e;
   private int c;
   private boolean bY;
   private int bZ;

   protected cqb(bul<? extends cqb> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new cqb.b<>(this));
      this.bS.a(3, new ccs<>(this));
      this.bS.a(4, new cqb.d(this, 1.05F, 1));
      this.bS.a(5, new cqb.c(this));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public abstract void a(arn var1, int var2, boolean var3);

   public boolean gH() {
      return this.bY;
   }

   public void A(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void n_() {
      if (this.dX() instanceof arn && this.bM()) {
         cqa $$0 = this.gI();
         if (this.gH()) {
            if ($$0 == null) {
               if (this.dX().aa() % 20L == 0L) {
                  cqa $$1 = ((arn)this.dX()).d(this.dx());
                  if ($$1 != null && cqc.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bva $$2 = this.m();
               if ($$2 != null && ($$2.ar() == bul.by || $$2.ar() == bul.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gz() {
      this.bf += 2;
   }

   @Override
   public void a(bsu $$0) {
      if (this.dX() instanceof arn) {
         bue $$1 = $$0.d();
         cqa $$2 = this.gI();
         if ($$2 != null) {
            if (this.gy()) {
               $$2.c(this.gM());
            }

            if ($$1 != null && $$1.ar() == bul.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gB() {
      return !this.gL();
   }

   public void a(@Nullable cqa $$0) {
      this.e = $$0;
   }

   @Nullable
   public cqa gI() {
      return this.e;
   }

   public boolean gJ() {
      cwb $$0 = this.a(bum.f);
      boolean $$1 = !$$0.f() && cwb.a($$0, cqa.a(this.dZ().e(lz.d)));
      boolean $$2 = this.gy();
      return $$1 && $$2;
   }

   public boolean gK() {
      return !(this.dX() instanceof arn $$0) ? false : this.gI() != null || $$0.d(this.dx()) != null;
   }

   public boolean gL() {
      return this.gI() != null && this.gI().u();
   }

   public void b(int $$0) {
      this.c = $$0;
   }

   public int gM() {
      return this.c;
   }

   public boolean gN() {
      return this.am.a(d);
   }

   public void B(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Wave", this.c);
      $$0.a("CanJoinRaid", this.bY);
      if (this.e != null) {
         $$0.a("RaidId", this.e.t());
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.c = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dX() instanceof arn) {
            this.e = ((arn)this.dX()).z().a($$0.h("RaidId"));
         }

         if (this.e != null) {
            this.e.a(this.c, this, false);
            if (this.gy()) {
               this.e.a(this.c, this);
            }
         }
      }
   }

   @Override
   protected void b(ckv $$0) {
      cwb $$1 = $$0.m();
      boolean $$2 = this.gL() && this.gI().b(this.gM()) != null;
      if (this.gL() && !$$2 && cwb.a($$1, cqa.a(this.dZ().e(lz.d)))) {
         bum $$3 = bum.f;
         cwb $$4 = this.a($$3);
         double $$5 = (double)this.h($$3);
         if (!$$4.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.av();
         this.gI().a(this.gM(), this);
         this.x(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gI() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gI() != null;
   }

   public int gO() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.gL()) {
         this.gI().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.A(this.ar() != bul.bo || $$2 != buk.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awk aj_();

   protected class a extends cby {
      private final cqb b;
      private final float c;
      public final cfr a = cfr.b().a(8.0).d().e();

      public a(final cky $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(cby.a.a, cby.a.b));
      }

      @Override
      public boolean b() {
         bva $$0 = this.b.es();
         return this.b.gI() == null && this.b.gD() && this.b.m() != null && !this.b.gj() && ($$0 == null || $$0.ar() != bul.by);
      }

      @Override
      public void d() {
         super.d();
         this.b.P().o();

         for (cqb $$1 : this.b.dX().a(cqb.class, this.a, this.b, this.b.cS().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.m());
         }
      }

      @Override
      public void e() {
         super.e();
         bva $$0 = this.b.m();
         if ($$0 != null) {
            for (cqb $$2 : this.b.dX().a(cqb.class, this.a, this.b, this.b.cS().c(8.0, 8.0, 8.0))) {
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
         bva $$0 = this.b.m();
         if ($$0 != null) {
            if (this.b.g((bue)$$0) > (double)this.c) {
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

   public class b<T extends cqb> extends cby {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private ery d;
      @Nullable
      private ckv e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cqb.this.h(bwi.m);

            for (ckv $$3 : this.b.dX().a(ckv.class, this.b.cS().c($$1, 8.0, $$1), cqb.b)) {
               long $$4 = this.c.getOrDefault($$3.as(), Long.MIN_VALUE);
               if (cqb.this.dX().aa() < $$4) {
                  $$0.put($$3.as(), $$4);
               } else {
                  ery $$5 = this.b.P().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.as(), cqb.this.dX().aa() + 600L);
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
         } else if (this.e.dS()) {
            return false;
         } else {
            return this.d.c() ? false : !this.h();
         }
      }

      private boolean h() {
         if (!this.b.gL()) {
            return true;
         } else if (this.b.gI().a()) {
            return true;
         } else if (!this.b.gv()) {
            return true;
         } else if (cwb.a(this.b.a(bum.f), cqa.a(this.b.dZ().e(lz.d)))) {
            return true;
         } else {
            cqb $$0 = cqb.this.e.b(this.b.gM());
            return $$0 != null && $$0.bM();
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

   public class c extends cby {
      private final cqb b;

      c(final cqb $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         cqa $$0 = this.b.gI();
         return this.b.bM() && this.b.m() == null && $$0 != null && $$0.f();
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
         if (!this.b.bc() && this.b.af.a(this.a(100)) == 0) {
            cqb.this.b(cqb.this.aj_());
         }

         if (!this.b.ca() && this.b.af.a(this.a(50)) == 0) {
            this.b.O().a();
         }

         super.a();
      }
   }

   static class d extends cby {
      private final cqb a;
      private final double b;
      private jh c;
      private final List<jh> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cqb $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.m() == null;
      }

      private boolean h() {
         return this.a.gL() && !this.a.gI().a();
      }

      private boolean i() {
         arn $$0 = (arn)this.a.dX();
         jh $$1 = this.a.dx();
         Optional<jh> $$2 = $$0.y().a($$0x -> $$0x.a(cgi.n), this::a, cge.b.c, $$1, 48, this.a.af);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.P().m() ? false : this.a.m() == null && !this.c.a(this.a.dv(), (double)(this.a.ds() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.dv(), (double)this.e)) {
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
            ezn $$0 = ezn.c(this.c);
            ezn $$1 = cfv.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cfv.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
