import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cpd extends ckw {
   protected static final akg<Boolean> d = akk.a(cpd.class, aki.k);
   static final Predicate<cjz> b = $$0 -> !$$0.w() && $$0.bI() && cvl.a($$0.m(), cpc.a($$0.dU().b(lv.d)));
   @Nullable
   protected cpc e;
   private int c;
   private boolean bZ;
   private int ca;

   protected cpd(btq<? extends cpd> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(1, new cpd.b<>(this));
      this.bT.a(3, new cbw<>(this));
      this.bT.a(4, new cpd.d(this, 1.05F, 1));
      this.bT.a(5, new cpd.c(this));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public abstract void a(arg var1, int var2, boolean var3);

   public boolean gB() {
      return this.bZ;
   }

   public void A(boolean $$0) {
      this.bZ = $$0;
   }

   @Override
   public void m_() {
      if (this.dS() instanceof arg && this.bI()) {
         cpc $$0 = this.gC();
         if (this.gB()) {
            if ($$0 == null) {
               if (this.dS().aa() % 20L == 0L) {
                  cpc $$1 = ((arg)this.dS()).d(this.ds());
                  if ($$1 != null && cpe.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               buf $$2 = this.m();
               if ($$2 != null && ($$2.ao() == btq.by || $$2.ao() == btq.af)) {
                  this.bc = 0;
               }
            }
         }
      }

      super.m_();
   }

   @Override
   protected void gt() {
      this.bc += 2;
   }

   @Override
   public void a(bsb $$0) {
      if (this.dS() instanceof arg) {
         btj $$1 = $$0.d();
         cpc $$2 = this.gC();
         if ($$2 != null) {
            if (this.gs()) {
               $$2.c(this.gG());
            }

            if ($$1 != null && $$1.ao() == btq.by) {
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

   public void a(@Nullable cpc $$0) {
      this.e = $$0;
   }

   @Nullable
   public cpc gC() {
      return this.e;
   }

   public boolean gD() {
      cvl $$0 = this.a(btr.f);
      boolean $$1 = !$$0.f() && cvl.a($$0, cpc.a(this.dU().b(lv.d)));
      boolean $$2 = this.gs();
      return $$1 && $$2;
   }

   public boolean gE() {
      return !(this.dS() instanceof arg $$0) ? false : this.gC() != null || $$0.d(this.ds()) != null;
   }

   public boolean gF() {
      return this.gC() != null && this.gC().u();
   }

   public void b(int $$0) {
      this.c = $$0;
   }

   public int gG() {
      return this.c;
   }

   public boolean gH() {
      return this.am.a(d);
   }

   public void B(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Wave", this.c);
      $$0.a("CanJoinRaid", this.bZ);
      if (this.e != null) {
         $$0.a("RaidId", this.e.t());
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.c = $$0.h("Wave");
      this.bZ = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dS() instanceof arg) {
            this.e = ((arg)this.dS()).z().a($$0.h("RaidId"));
         }

         if (this.e != null) {
            this.e.a(this.c, this, false);
            if (this.gs()) {
               this.e.a(this.c, this);
            }
         }
      }
   }

   @Override
   protected void b(cjz $$0) {
      cvl $$1 = $$0.m();
      boolean $$2 = this.gF() && this.gC().b(this.gG()) != null;
      if (this.gF() && !$$2 && cvl.a($$1, cpc.a(this.dU().b(lv.d)))) {
         btr $$3 = btr.f;
         cvl $$4 = this.a($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.J());
         $$0.as();
         this.gC().a(this.gG(), this);
         this.x(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gC() == null ? super.h($$0) : false;
   }

   @Override
   public boolean aa() {
      return super.aa() || this.gC() != null;
   }

   public int gI() {
      return this.ca;
   }

   public void c(int $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.gF()) {
         this.gC().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.A(this.ao() != btq.bo || $$2 != btp.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awc ah_();

   protected class a extends cbc {
      private final cpd b;
      private final float c;
      public final cev a = cev.b().a(8.0).d().e();

      public a(final ckc $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      }

      @Override
      public boolean b() {
         buf $$0 = this.b.em();
         return this.b.gC() == null && this.b.gx() && this.b.m() != null && !this.b.gf() && ($$0 == null || $$0.ao() != btq.by);
      }

      @Override
      public void d() {
         super.d();
         this.b.P().o();

         for (cpd $$1 : this.b.dS().a(cpd.class, this.a, this.b, this.b.cO().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.m());
         }
      }

      @Override
      public void e() {
         super.e();
         buf $$0 = this.b.m();
         if ($$0 != null) {
            for (cpd $$2 : this.b.dS().a(cpd.class, this.a, this.b, this.b.cO().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.w(true);
            }

            this.b.w(true);
         }
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         buf $$0 = this.b.m();
         if ($$0 != null) {
            if (this.b.g((btj)$$0) > (double)this.c) {
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

   public class b<T extends cpd> extends cbc {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private eqp d;
      @Nullable
      private cjz e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cpd.this.h(bvm.m);

            for (cjz $$3 : this.b.dS().a(cjz.class, this.b.cO().c($$1, 8.0, $$1), cpd.b)) {
               long $$4 = this.c.getOrDefault($$3.ap(), Long.MIN_VALUE);
               if (cpd.this.dS().aa() < $$4) {
                  $$0.put($$3.ap(), $$4);
               } else {
                  eqp $$5 = this.b.P().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ap(), cpd.this.dS().aa() + 600L);
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
         } else if (this.e.dN()) {
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
         } else if (cvl.a(this.b.a(btr.f), cpc.a(this.b.dU().b(lv.d)))) {
            return true;
         } else {
            cpd $$0 = cpd.this.e.b(this.b.gG());
            return $$0 != null && $$0.bI();
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

   public class c extends cbc {
      private final cpd b;

      c(final cpd $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         cpc $$0 = this.b.gC();
         return this.b.bI() && this.b.m() == null && $$0 != null && $$0.f();
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
         if (!this.b.ba() && this.b.af.a(this.a(100)) == 0) {
            cpd.this.b(cpd.this.ah_());
         }

         if (!this.b.bW() && this.b.af.a(this.a(50)) == 0) {
            this.b.O().a();
         }

         super.a();
      }
   }

   static class d extends cbc {
      private final cpd a;
      private final double b;
      private je c;
      private final List<je> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cpd $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.m() == null;
      }

      private boolean h() {
         return this.a.gF() && !this.a.gC().a();
      }

      private boolean i() {
         arg $$0 = (arg)this.a.dS();
         je $$1 = this.a.ds();
         Optional<je> $$2 = $$0.y().a($$0x -> $$0x.a(cfm.n), this::a, cfi.b.c, $$1, 48, this.a.af);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().j();
            return true;
         }
      }

      @Override
      public boolean c() {
         return this.a.P().m() ? false : this.a.m() == null && !this.c.a(this.a.dq(), (double)(this.a.dn() + (float)this.e)) && !this.f;
      }

      @Override
      public void e() {
         if (this.c.a(this.a.dq(), (double)this.e)) {
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
            eye $$0 = eye.c(this.c);
            eye $$1 = cez.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cez.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.P().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(je $$0) {
         for (je $$1 : this.d) {
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
