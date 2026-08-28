import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cso extends coa {
   protected static final akj<Boolean> c = akn.a(cso.class, akl.k);
   static final Predicate<cnd> a = $$0 -> !$$0.o() && $$0.bK() && cyy.a($$0.f(), csn.a($$0.dX().f(mg.aF)));
   @Nullable
   protected csn d;
   private int b;
   private boolean bF;
   private int bG;

   protected cso(bwm<? extends cso> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(1, new cso.b<>(this));
      this.bC.a(3, new ces<>(this));
      this.bC.a(4, new cso.d(this, 1.05F, 1));
      this.bC.a(5, new cso.c(this));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(arq var1, int var2, boolean var3);

   public boolean gA() {
      return this.bF;
   }

   public void z(boolean $$0) {
      this.bF = $$0;
   }

   @Override
   public void k_() {
      if (this.dV() instanceof arq $$0 && this.bK()) {
         csn $$1 = this.gB();
         if (this.gA()) {
            if ($$1 == null) {
               if (this.dV().ae() % 20L == 0L) {
                  csn $$2 = $$0.d(this.dv());
                  if ($$2 != null && csp.a(this)) {
                     $$2.a($$0, $$2.j(), this, null, true);
                  }
               }
            } else {
               bxc $$3 = this.f();
               if ($$3 != null && ($$3.aq() == bwm.bS || $$3.aq() == bwm.ap)) {
                  this.bd = 0;
               }
            }
         }
      }

      super.k_();
   }

   @Override
   protected void gs() {
      this.bd += 2;
   }

   @Override
   public void a(bus $$0) {
      if (this.dV() instanceof arq $$1) {
         bwd $$2 = $$0.d();
         csn $$3 = this.gB();
         if ($$3 != null) {
            if (this.gr()) {
               $$3.c(this.gF());
            }

            if ($$2 != null && $$2.aq() == bwm.bS) {
               $$3.a($$2);
            }

            $$3.a($$1, this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gu() {
      return !this.gE();
   }

   public void a(@Nullable csn $$0) {
      this.d = $$0;
   }

   @Nullable
   public csn gB() {
      return this.d;
   }

   public boolean gC() {
      cyy $$0 = this.a(bwn.f);
      boolean $$1 = !$$0.f() && cyy.a($$0, csn.a(this.dX().f(mg.aF)));
      boolean $$2 = this.gr();
      return $$1 && $$2;
   }

   public boolean gD() {
      return !(this.dV() instanceof arq $$0) ? false : this.gB() != null || $$0.d(this.dv()) != null;
   }

   public boolean gE() {
      return this.gB() != null && this.gB().r();
   }

   public void b(int $$0) {
      this.b = $$0;
   }

   public int gF() {
      return this.b;
   }

   public boolean gG() {
      return this.al.a(c);
   }

   public void A(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bF);
      if (this.d != null && this.dV() instanceof arq $$1) {
         $$1.B().a(this.d).ifPresent($$1x -> $$0.a("RaidId", $$1x));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bF = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3) && this.dV() instanceof arq $$1) {
         this.d = $$1.B().a($$0.h("RaidId"));
         if (this.d != null) {
            this.d.a($$1, this.b, this, false);
            if (this.gr()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(arq $$0, cnd $$1) {
      cyy $$2 = $$1.f();
      boolean $$3 = this.gE() && this.gB().b(this.gF()) != null;
      if (this.gE() && !$$3 && cyy.a($$2, csn.a(this.dX().f(mg.aF)))) {
         bwn $$4 = bwn.f;
         cyy $$5 = this.a($$4);
         double $$6 = (double)this.fX().b($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.at();
         this.gB().a(this.gF(), this);
         this.w(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gB() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gB() != null;
   }

   public int gH() {
      return this.bG;
   }

   public void c(int $$0) {
      this.bG = $$0;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.gE()) {
         this.gB().n();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.z(this.aq() != bwm.bI || $$2 != bwl.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awm ad_();

   protected static class a extends cdy {
      private final cso b;
      private final float c;
      public final chr a = chr.b().a(8.0).d().e();

      public a(cng $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(cdy.a.a, cdy.a.b));
      }

      @Override
      public boolean b() {
         bxc $$0 = this.b.eq();
         return this.b.gB() == null && this.b.gw() && this.b.f() != null && !this.b.gh() && ($$0 == null || $$0.aq() != bwm.bS);
      }

      @Override
      public void d() {
         super.d();
         this.b.O().m();

         for (cso $$1 : a(this.b).a(cso.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.g(this.b.f());
         }
      }

      @Override
      public void e() {
         super.e();
         bxc $$0 = this.b.f();
         if ($$0 != null) {
            for (cso $$2 : a(this.b).a(cso.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
               $$2.g($$0);
               $$2.v(true);
            }

            this.b.v(true);
         }
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         bxc $$0 = this.b.f();
         if ($$0 != null) {
            if (this.b.g((bwd)$$0) > (double)this.c) {
               this.b.J().a($$0, 30.0F, 30.0F);
               if (this.b.ae.a(50) == 0) {
                  this.b.T();
               }
            } else {
               this.b.v(true);
            }

            super.a();
         }
      }
   }

   public class b<T extends cso> extends cdy {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private ewu d;
      @Nullable
      private cnd e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cso.this.h(byi.m);

            for (cnd $$3 : this.b.dV().a(cnd.class, this.b.cR().c($$1, 8.0, $$1), cso.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (cso.this.dV().ae() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  ewu $$5 = this.b.O().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), cso.this.dV().ae() + 600L);
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
         if (!this.b.gE()) {
            return true;
         } else if (this.b.gB().a()) {
            return true;
         } else if (!this.b.t()) {
            return true;
         } else if (cyy.a(this.b.a(bwn.f), csn.a(this.b.dX().f(mg.aF)))) {
            return true;
         } else {
            cso $$0 = cso.this.d.b(this.b.gF());
            return $$0 != null && $$0.bK();
         }
      }

      @Override
      public void d() {
         this.b.O().a(this.d, 1.15F);
      }

      @Override
      public void e() {
         this.d = null;
         this.e = null;
      }

      @Override
      public void a() {
         if (this.e != null && this.e.a(this.b, 1.414)) {
            this.b.a(a(cso.this.dV()), this.e);
         }
      }
   }

   public class c extends cdy {
      private final cso b;

      c(final cso $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         csn $$0 = this.b.gB();
         return this.b.bK() && this.b.f() == null && $$0 != null && $$0.f();
      }

      @Override
      public void d() {
         this.b.A(true);
         super.d();
      }

      @Override
      public void e() {
         this.b.A(false);
         super.e();
      }

      @Override
      public void a() {
         if (!this.b.bb() && this.b.ae.a(this.a(100)) == 0) {
            cso.this.b(cso.this.ad_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.N().a();
         }

         super.a();
      }
   }

   static class d extends cdy {
      private final cso a;
      private final double b;
      private iu c;
      private final List<iu> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cso $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.f() == null;
      }

      private boolean h() {
         return this.a.gE() && !this.a.gB().a();
      }

      private boolean i() {
         arq $$0 = (arq)this.a.dV();
         iu $$1 = this.a.dv();
         Optional<iu> $$2 = $$0.A().a($$0x -> $$0x.a(cii.n), this::a, cie.b.c, $$1, 48, this.a.ae);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.O().k() ? false : this.a.f() == null && !this.c.a(this.a.dt(), (double)(this.a.dq() + (float)this.e)) && !this.f;
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
         this.a.O().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void a() {
         if (this.a.O().k()) {
            fei $$0 = fei.c(this.c);
            fei $$1 = chv.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = chv.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.O().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(iu $$0) {
         for (iu $$1 : this.d) {
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
