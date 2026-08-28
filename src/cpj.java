import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cpj extends clb {
   protected static final akg<Boolean> d = akk.a(cpj.class, aki.k);
   static final Predicate<cke> b = $$0 -> !$$0.w() && $$0.bI() && cvp.a($$0.m(), cpi.a($$0.dU().b(lv.d)));
   @Nullable
   protected cpi e;
   private int c;
   private boolean bY;
   private int bZ;

   protected cpj(btv<? extends cpj> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new cpj.b<>(this));
      this.bS.a(3, new ccb<>(this));
      this.bS.a(4, new cpj.d(this, 1.05F, 1));
      this.bS.a(5, new cpj.c(this));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public abstract void a(arh var1, int var2, boolean var3);

   public boolean gC() {
      return this.bY;
   }

   public void A(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void m_() {
      if (this.dS() instanceof arh && this.bI()) {
         cpi $$0 = this.gD();
         if (this.gC()) {
            if ($$0 == null) {
               if (this.dS().aa() % 20L == 0L) {
                  cpi $$1 = ((arh)this.dS()).d(this.ds());
                  if ($$1 != null && cpk.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               buk $$2 = this.m();
               if ($$2 != null && ($$2.ao() == btv.by || $$2.ao() == btv.af)) {
                  this.bb = 0;
               }
            }
         }
      }

      super.m_();
   }

   @Override
   protected void gu() {
      this.bb += 2;
   }

   @Override
   public void a(bsg $$0) {
      if (this.dS() instanceof arh) {
         bto $$1 = $$0.d();
         cpi $$2 = this.gD();
         if ($$2 != null) {
            if (this.gt()) {
               $$2.c(this.gH());
            }

            if ($$1 != null && $$1.ao() == btv.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gw() {
      return !this.gG();
   }

   public void a(@Nullable cpi $$0) {
      this.e = $$0;
   }

   @Nullable
   public cpi gD() {
      return this.e;
   }

   public boolean gE() {
      cvp $$0 = this.a(btw.f);
      boolean $$1 = !$$0.f() && cvp.a($$0, cpi.a(this.dU().b(lv.d)));
      boolean $$2 = this.gt();
      return $$1 && $$2;
   }

   public boolean gF() {
      return !(this.dS() instanceof arh $$0) ? false : this.gD() != null || $$0.d(this.ds()) != null;
   }

   public boolean gG() {
      return this.gD() != null && this.gD().u();
   }

   public void b(int $$0) {
      this.c = $$0;
   }

   public int gH() {
      return this.c;
   }

   public boolean gI() {
      return this.am.a(d);
   }

   public void B(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Wave", this.c);
      $$0.a("CanJoinRaid", this.bY);
      if (this.e != null) {
         $$0.a("RaidId", this.e.t());
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.c = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dS() instanceof arh) {
            this.e = ((arh)this.dS()).z().a($$0.h("RaidId"));
         }

         if (this.e != null) {
            this.e.a(this.c, this, false);
            if (this.gt()) {
               this.e.a(this.c, this);
            }
         }
      }
   }

   @Override
   protected void b(cke $$0) {
      cvp $$1 = $$0.m();
      boolean $$2 = this.gG() && this.gD().b(this.gH()) != null;
      if (this.gG() && !$$2 && cvp.a($$1, cpi.a(this.dU().b(lv.d)))) {
         btw $$3 = btw.f;
         cvp $$4 = this.a($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.J());
         $$0.as();
         this.gD().a(this.gH(), this);
         this.x(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gD() == null ? super.h($$0) : false;
   }

   @Override
   public boolean aa() {
      return super.aa() || this.gD() != null;
   }

   public int gJ() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.gG()) {
         this.gD().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.A(this.ao() != btv.bo || $$2 != btu.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awd ah_();

   protected class a extends cbh {
      private final cpj b;
      private final float c;
      public final cfa a = cfa.b().a(8.0).d().e();

      public a(final ckh $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      }

      @Override
      public boolean b() {
         buk $$0 = this.b.em();
         return this.b.gD() == null && this.b.gy() && this.b.m() != null && !this.b.gg() && ($$0 == null || $$0.ao() != btv.by);
      }

      @Override
      public void d() {
         super.d();
         this.b.P().o();

         for (cpj $$1 : this.b.dS().a(cpj.class, this.a, this.b, this.b.cO().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.m());
         }
      }

      @Override
      public void e() {
         super.e();
         buk $$0 = this.b.m();
         if ($$0 != null) {
            for (cpj $$2 : this.b.dS().a(cpj.class, this.a, this.b, this.b.cO().c(8.0, 8.0, 8.0))) {
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
         buk $$0 = this.b.m();
         if ($$0 != null) {
            if (this.b.g((bto)$$0) > (double)this.c) {
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

   public class b<T extends cpj> extends cbh {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private erd d;
      @Nullable
      private cke e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cpj.this.h(bvr.m);

            for (cke $$3 : this.b.dS().a(cke.class, this.b.cO().c($$1, 8.0, $$1), cpj.b)) {
               long $$4 = this.c.getOrDefault($$3.ap(), Long.MIN_VALUE);
               if (cpj.this.dS().aa() < $$4) {
                  $$0.put($$3.ap(), $$4);
               } else {
                  erd $$5 = this.b.P().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ap(), cpj.this.dS().aa() + 600L);
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
         if (!this.b.gG()) {
            return true;
         } else if (this.b.gD().a()) {
            return true;
         } else if (!this.b.gq()) {
            return true;
         } else if (cvp.a(this.b.a(btw.f), cpi.a(this.b.dU().b(lv.d)))) {
            return true;
         } else {
            cpj $$0 = cpj.this.e.b(this.b.gH());
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

   public class c extends cbh {
      private final cpj b;

      c(final cpj $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         cpi $$0 = this.b.gD();
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
            cpj.this.b(cpj.this.ah_());
         }

         if (!this.b.bW() && this.b.af.a(this.a(50)) == 0) {
            this.b.O().a();
         }

         super.a();
      }
   }

   static class d extends cbh {
      private final cpj a;
      private final double b;
      private je c;
      private final List<je> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cpj $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         this.k();
         return this.h() && this.i() && this.a.m() == null;
      }

      private boolean h() {
         return this.a.gG() && !this.a.gD().a();
      }

      private boolean i() {
         arh $$0 = (arh)this.a.dS();
         je $$1 = this.a.ds();
         Optional<je> $$2 = $$0.y().a($$0x -> $$0x.a(cfr.n), this::a, cfn.b.c, $$1, 48, this.a.af);
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
            eys $$0 = eys.c(this.c);
            eys $$1 = cfe.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cfe.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
