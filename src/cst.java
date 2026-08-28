import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cst extends coe {
   protected static final akj<Boolean> c = akn.a(cst.class, akl.k);
   static final Predicate<cnh> a = $$0 -> !$$0.o() && $$0.bK() && czd.a($$0.f(), css.a($$0.dX().f(mg.aF)));
   @Nullable
   protected css d;
   private int b;
   private boolean bG;
   private int bH;

   protected cst(bwo<? extends cst> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(1, new cst.b<>(this));
      this.bD.a(3, new ceu<>(this));
      this.bD.a(4, new cst.d(this, 1.05F, 1));
      this.bD.a(5, new cst.c(this));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(arq var1, int var2, boolean var3);

   public boolean gB() {
      return this.bG;
   }

   public void z(boolean $$0) {
      this.bG = $$0;
   }

   @Override
   public void k_() {
      if (this.dV() instanceof arq $$0 && this.bK()) {
         css $$1 = this.gC();
         if (this.gB()) {
            if ($$1 == null) {
               if (this.dV().ae() % 20L == 0L) {
                  css $$2 = $$0.d(this.dv());
                  if ($$2 != null && csu.a(this)) {
                     $$2.a($$0, $$2.j(), this, null, true);
                  }
               }
            } else {
               bxe $$3 = this.f();
               if ($$3 != null && ($$3.aq() == bwo.bS || $$3.aq() == bwo.ap)) {
                  this.bd = 0;
               }
            }
         }
      }

      super.k_();
   }

   @Override
   protected void gt() {
      this.bd += 2;
   }

   @Override
   public void a(buu $$0) {
      if (this.dV() instanceof arq $$1) {
         bwf $$2 = $$0.d();
         css $$3 = this.gC();
         if ($$3 != null) {
            if (this.gs()) {
               $$3.c(this.gG());
            }

            if ($$2 != null && $$2.aq() == bwo.bS) {
               $$3.a($$2);
            }

            $$3.a($$1, this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gv() {
      return !this.gF();
   }

   public void a(@Nullable css $$0) {
      this.d = $$0;
   }

   @Nullable
   public css gC() {
      return this.d;
   }

   public boolean gD() {
      czd $$0 = this.a(bwp.f);
      boolean $$1 = !$$0.f() && czd.a($$0, css.a(this.dX().f(mg.aF)));
      boolean $$2 = this.gs();
      return $$1 && $$2;
   }

   public boolean gE() {
      return !(this.dV() instanceof arq $$0) ? false : this.gC() != null || $$0.d(this.dv()) != null;
   }

   public boolean gF() {
      return this.gC() != null && this.gC().r();
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

   public void A(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Wave", this.b);
      $$0.a("CanJoinRaid", this.bG);
      if (this.d != null && this.dV() instanceof arq $$1) {
         $$1.B().a(this.d).ifPresent($$1x -> $$0.a("RaidId", $$1x));
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.b = $$0.h("Wave");
      this.bG = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3) && this.dV() instanceof arq $$1) {
         this.d = $$1.B().a($$0.h("RaidId"));
         if (this.d != null) {
            this.d.a($$1, this.b, this, false);
            if (this.gs()) {
               this.d.a(this.b, this);
            }
         }
      }
   }

   @Override
   protected void a(arq $$0, cnh $$1) {
      czd $$2 = $$1.f();
      boolean $$3 = this.gF() && this.gC().b(this.gG()) != null;
      if (this.gF() && !$$3 && czd.a($$2, css.a(this.dX().f(mg.aF)))) {
         bwp $$4 = bwp.f;
         czd $$5 = this.a($$4);
         double $$6 = (double)this.fY().b($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.at();
         this.gC().a(this.gG(), this);
         this.w(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gC() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gC() != null;
   }

   public int gI() {
      return this.bH;
   }

   public void c(int $$0) {
      this.bH = $$0;
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.gF()) {
         this.gC().n();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.z(this.aq() != bwo.bI || $$2 != bwn.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awm ae_();

   protected static class a extends cea {
      private final cst b;
      private final float c;
      public final cht a = cht.b().a(8.0).d().e();

      public a(cnk $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(cea.a.a, cea.a.b));
      }

      @Override
      public boolean b() {
         bxe $$0 = this.b.er();
         return this.b.gC() == null && this.b.gx() && this.b.f() != null && !this.b.gi() && ($$0 == null || $$0.aq() != bwo.bS);
      }

      @Override
      public void d() {
         super.d();
         this.b.O().m();

         for (cst $$1 : a(this.b).a(cst.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.g(this.b.f());
         }
      }

      @Override
      public void e() {
         super.e();
         bxe $$0 = this.b.f();
         if ($$0 != null) {
            for (cst $$2 : a(this.b).a(cst.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
               $$2.g($$0);
               $$2.v(true);
            }

            this.b.v(true);
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         bxe $$0 = this.b.f();
         if ($$0 != null) {
            if (this.b.g((bwf)$$0) > (double)this.c) {
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

   public class b<T extends cst> extends cea {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private exc d;
      @Nullable
      private cnh e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cst.this.h(byk.m);

            for (cnh $$3 : this.b.dV().a(cnh.class, this.b.cR().c($$1, 8.0, $$1), cst.a)) {
               long $$4 = this.c.getOrDefault($$3.ar(), Long.MIN_VALUE);
               if (cst.this.dV().ae() < $$4) {
                  $$0.put($$3.ar(), $$4);
               } else {
                  exc $$5 = this.b.O().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ar(), cst.this.dV().ae() + 600L);
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
         if (!this.b.gF()) {
            return true;
         } else if (this.b.gC().a()) {
            return true;
         } else if (!this.b.t()) {
            return true;
         } else if (czd.a(this.b.a(bwp.f), css.a(this.b.dX().f(mg.aF)))) {
            return true;
         } else {
            cst $$0 = cst.this.d.b(this.b.gG());
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
            this.b.a(a(cst.this.dV()), this.e);
         }
      }
   }

   public class c extends cea {
      private final cst b;

      c(final cst $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         css $$0 = this.b.gC();
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
            cst.this.b(cst.this.ae_());
         }

         if (!this.b.bZ() && this.b.ae.a(this.a(50)) == 0) {
            this.b.N().a();
         }

         super.a();
      }
   }

   static class d extends cea {
      private final cst a;
      private final double b;
      private iu c;
      private final List<iu> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cst $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.f() == null;
      }

      private boolean h() {
         return this.a.gF() && !this.a.gC().a();
      }

      private boolean i() {
         arq $$0 = (arq)this.a.dV();
         iu $$1 = this.a.dv();
         Optional<iu> $$2 = $$0.A().a($$0x -> $$0x.a(cik.n), this::a, cig.b.c, $$1, 48, this.a.ae);
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
            feq $$0 = feq.c(this.c);
            feq $$1 = chx.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = chx.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
