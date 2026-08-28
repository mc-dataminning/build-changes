import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ctz extends cpl {
   protected static final aku<Boolean> c = aky.a(ctz.class, akw.k);
   static final Predicate<coo> a = $$0 -> !$$0.o() && $$0.bJ() && dak.a($$0.f(), cty.a($$0.dX().f(mi.aF)));
   private static final int b = 0;
   private static final boolean e = false;
   @Nullable
   protected cty d;
   private int f = 0;
   private boolean bI = false;
   private int bJ;

   protected ctz(bxn<? extends ctz> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(1, new ctz.b<>(this));
      this.bF.a(3, new cfv<>(this));
      this.bF.a(4, new ctz.d(this, 1.05F, 1));
      this.bF.a(5, new ctz.c(this));
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(asb var1, int var2, boolean var3);

   public boolean gE() {
      return this.bI;
   }

   public void z(boolean $$0) {
      this.bI = $$0;
   }

   @Override
   public void k_() {
      if (this.dV() instanceof asb $$0 && this.bJ()) {
         cty $$1 = this.gF();
         if (this.gE()) {
            if ($$1 == null) {
               if (this.dV().ae() % 20L == 0L) {
                  cty $$2 = $$0.d(this.dv());
                  if ($$2 != null && cua.a(this)) {
                     $$2.a($$0, $$2.j(), this, null, true);
                  }
               }
            } else {
               byf $$3 = this.f();
               if ($$3 != null && ($$3.an() == bxn.bT || $$3.an() == bxn.aq)) {
                  this.bd = 0;
               }
            }
         }
      }

      super.k_();
   }

   @Override
   protected void gw() {
      this.bd += 2;
   }

   @Override
   public void a(bvt $$0) {
      if (this.dV() instanceof asb $$1) {
         bxe $$2 = $$0.d();
         cty $$3 = this.gF();
         if ($$3 != null) {
            if (this.gv()) {
               $$3.c(this.gJ());
            }

            if ($$2 != null && $$2.an() == bxn.bT) {
               $$3.a($$2);
            }

            $$3.a($$1, this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gy() {
      return !this.gI();
   }

   public void a(@Nullable cty $$0) {
      this.d = $$0;
   }

   @Nullable
   public cty gF() {
      return this.d;
   }

   public boolean gG() {
      dak $$0 = this.a(bxo.f);
      boolean $$1 = !$$0.f() && dak.a($$0, cty.a(this.dX().f(mi.aF)));
      boolean $$2 = this.gv();
      return $$1 && $$2;
   }

   public boolean gH() {
      return !(this.dV() instanceof asb $$0) ? false : this.gF() != null || $$0.d(this.dv()) != null;
   }

   public boolean gI() {
      return this.gF() != null && this.gF().r();
   }

   public void b(int $$0) {
      this.f = $$0;
   }

   public int gJ() {
      return this.f;
   }

   public boolean gK() {
      return this.al.a(c);
   }

   public void A(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Wave", this.f);
      $$0.a("CanJoinRaid", this.bI);
      if (this.d != null && this.dV() instanceof asb $$1) {
         $$1.B().a(this.d).ifPresent($$1x -> $$0.a("RaidId", $$1x));
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.f = $$0.b("Wave", 0);
      this.bI = $$0.b("CanJoinRaid", false);
      if (this.dV() instanceof asb $$1) {
         $$0.e("RaidId").ifPresent($$1x -> {
            this.d = $$1.B().a($$1x);
            if (this.d != null) {
               this.d.a($$1, this.f, this, false);
               if (this.gv()) {
                  this.d.a(this.f, this);
               }
            }
         });
      }
   }

   @Override
   protected void a(asb $$0, coo $$1) {
      dak $$2 = $$1.f();
      boolean $$3 = this.gI() && this.gF().b(this.gJ()) != null;
      if (this.gI() && !$$3 && dak.a($$2, cty.a(this.dX().f(mi.aF)))) {
         bxo $$4 = bxo.f;
         dak $$5 = this.a($$4);
         double $$6 = (double)this.gb().b($$4);
         if (!$$5.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$6) {
            this.a($$0, $$5);
         }

         this.a($$1);
         this.a($$4, $$2);
         this.a($$1, $$2.M());
         $$1.aq();
         this.gF().a(this.gJ(), this);
         this.w(true);
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gF() == null ? super.h($$0) : false;
   }

   @Override
   public boolean Z() {
      return super.Z() || this.gF() != null;
   }

   public int gL() {
      return this.bJ;
   }

   public void c(int $$0) {
      this.bJ = $$0;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.gI()) {
         this.gF().n();
      }

      return super.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.z(this.an() != bxn.bJ || $$2 != bxm.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awx aj_();

   protected static class a extends cfb {
      private final ctz b;
      private final float c;
      public final ciu a = ciu.b().a(8.0).d().e();

      public a(cor $$0, float $$1) {
         this.b = $$0;
         this.c = $$1 * $$1;
         this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      }

      @Override
      public boolean b() {
         byf $$0 = this.b.er();
         return this.b.gF() == null && this.b.gA() && this.b.f() != null && !this.b.gl() && ($$0 == null || $$0.an() != bxn.bT);
      }

      @Override
      public void d() {
         super.d();
         this.b.O().m();

         for (ctz $$1 : a(this.b).a(ctz.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
            $$1.g(this.b.f());
         }
      }

      @Override
      public void e() {
         super.e();
         byf $$0 = this.b.f();
         if ($$0 != null) {
            for (ctz $$2 : a(this.b).a(ctz.class, this.a, this.b, this.b.cR().c(8.0, 8.0, 8.0))) {
               $$2.g($$0);
               $$2.v(true);
            }

            this.b.v(true);
         }
      }

      @Override
      public boolean W_() {
         return true;
      }

      @Override
      public void a() {
         byf $$0 = this.b.f();
         if ($$0 != null) {
            if (this.b.g((bxe)$$0) > (double)this.c) {
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

   public class b<T extends ctz> extends cfb {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private eyo d;
      @Nullable
      private coo e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = ctz.this.h(bzl.m);

            for (coo $$3 : this.b.dV().a(coo.class, this.b.cR().c($$1, 8.0, $$1), ctz.a)) {
               long $$4 = this.c.getOrDefault($$3.ao(), Long.MIN_VALUE);
               if (ctz.this.dV().ae() < $$4) {
                  $$0.put($$3.ao(), $$4);
               } else {
                  eyo $$5 = this.b.O().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ao(), ctz.this.dV().ae() + 600L);
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
         } else if (!this.b.t()) {
            return true;
         } else if (dak.a(this.b.a(bxo.f), cty.a(this.b.dX().f(mi.aF)))) {
            return true;
         } else {
            ctz $$0 = ctz.this.d.b(this.b.gJ());
            return $$0 != null && $$0.bJ();
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
            this.b.a(a(ctz.this.dV()), this.e);
         }
      }
   }

   public class c extends cfb {
      private final ctz b;

      c(final ctz $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         cty $$0 = this.b.gF();
         return this.b.bJ() && this.b.f() == null && $$0 != null && $$0.f();
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
         if (!this.b.ba() && this.b.ae.a(this.a(100)) == 0) {
            ctz.this.b(ctz.this.aj_());
         }

         if (!this.b.bY() && this.b.ae.a(this.a(50)) == 0) {
            this.b.N().a();
         }

         super.a();
      }
   }

   static class d extends cfb {
      private final ctz a;
      private final double b;
      private iw c;
      private final List<iw> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(ctz $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.f() == null;
      }

      private boolean h() {
         return this.a.gI() && !this.a.gF().a();
      }

      private boolean i() {
         asb $$0 = (asb)this.a.dV();
         iw $$1 = this.a.dv();
         Optional<iw> $$2 = $$0.A().a($$0x -> $$0x.a(cjl.n), this::a, cjh.b.c, $$1, 48, this.a.ae);
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
            fgc $$0 = fgc.c(this.c);
            fgc $$1 = ciy.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = ciy.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.O().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(iw $$0) {
         for (iw $$1 : this.d) {
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
