import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cpm extends cle {
   protected static final akh<Boolean> d = akl.a(cpm.class, akj.k);
   static final Predicate<ckh> b = $$0 -> !$$0.w() && $$0.bI() && cvs.a($$0.m(), cpl.a($$0.dU().e(lw.d)));
   @Nullable
   protected cpl e;
   private int c;
   private boolean bY;
   private int bZ;

   protected cpm(bty<? extends cpm> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(1, new cpm.b<>(this));
      this.bS.a(3, new cce<>(this));
      this.bS.a(4, new cpm.d(this, 1.05F, 1));
      this.bS.a(5, new cpm.c(this));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   public abstract void a(arj var1, int var2, boolean var3);

   public boolean gB() {
      return this.bY;
   }

   public void A(boolean $$0) {
      this.bY = $$0;
   }

   @Override
   public void n_() {
      if (this.dS() instanceof arj && this.bI()) {
         cpl $$0 = this.gC();
         if (this.gB()) {
            if ($$0 == null) {
               if (this.dS().aa() % 20L == 0L) {
                  cpl $$1 = ((arj)this.dS()).d(this.ds());
                  if ($$1 != null && cpn.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bun $$2 = this.m();
               if ($$2 != null && ($$2.ao() == bty.by || $$2.ao() == bty.af)) {
                  this.bb = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gt() {
      this.bb += 2;
   }

   @Override
   public void a(bsj $$0) {
      if (this.dS() instanceof arj) {
         btr $$1 = $$0.d();
         cpl $$2 = this.gC();
         if ($$2 != null) {
            if (this.gs()) {
               $$2.c(this.gG());
            }

            if ($$1 != null && $$1.ao() == bty.by) {
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

   public void a(@Nullable cpl $$0) {
      this.e = $$0;
   }

   @Nullable
   public cpl gC() {
      return this.e;
   }

   public boolean gD() {
      cvs $$0 = this.a(btz.f);
      boolean $$1 = !$$0.f() && cvs.a($$0, cpl.a(this.dU().e(lw.d)));
      boolean $$2 = this.gs();
      return $$1 && $$2;
   }

   public boolean gE() {
      return !(this.dS() instanceof arj $$0) ? false : this.gC() != null || $$0.d(this.ds()) != null;
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
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Wave", this.c);
      $$0.a("CanJoinRaid", this.bY);
      if (this.e != null) {
         $$0.a("RaidId", this.e.t());
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.c = $$0.h("Wave");
      this.bY = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dS() instanceof arj) {
            this.e = ((arj)this.dS()).z().a($$0.h("RaidId"));
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
   protected void b(ckh $$0) {
      cvs $$1 = $$0.m();
      boolean $$2 = this.gF() && this.gC().b(this.gG()) != null;
      if (this.gF() && !$$2 && cvs.a($$1, cpl.a(this.dU().e(lw.d)))) {
         btz $$3 = btz.f;
         cvs $$4 = this.a($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.f() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.K());
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
   public boolean Z() {
      return super.Z() || this.gC() != null;
   }

   public int gI() {
      return this.bZ;
   }

   public void c(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.gF()) {
         this.gC().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.A(this.ao() != bty.bo || $$2 != btx.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract awf ai_();

   protected class a extends cbk {
      private final cpm b;
      private final float c;
      public final cfd a = cfd.b().a(8.0).d().e();

      public a(final ckk $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }

      @Override
      public boolean b() {
         bun $$0 = this.b.en();
         return this.b.gC() == null && this.b.gx() && this.b.m() != null && !this.b.gf() && ($$0 == null || $$0.ao() != bty.by);
      }

      @Override
      public void d() {
         super.d();
         this.b.P().o();

         for (cpm $$1 : this.b.dS().a(cpm.class, this.a, this.b, this.b.cO().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.m());
         }
      }

      @Override
      public void e() {
         super.e();
         bun $$0 = this.b.m();
         if ($$0 != null) {
            for (cpm $$2 : this.b.dS().a(cpm.class, this.a, this.b, this.b.cO().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.w(true);
            }

            this.b.w(true);
         }
      }

      @Override
      public boolean U_() {
         return true;
      }

      @Override
      public void a() {
         bun $$0 = this.b.m();
         if ($$0 != null) {
            if (this.b.g((btr)$$0) > (double)this.c) {
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

   public class b<T extends cpm> extends cbk {
      private final T b;
      private Int2LongOpenHashMap c = new Int2LongOpenHashMap();
      @Nullable
      private erh d;
      @Nullable
      private ckh e;

      public b(final T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         if (this.h()) {
            return false;
         } else {
            Int2LongOpenHashMap $$0 = new Int2LongOpenHashMap();
            double $$1 = cpm.this.h(bvu.m);

            for (ckh $$3 : this.b.dS().a(ckh.class, this.b.cO().c($$1, 8.0, $$1), cpm.b)) {
               long $$4 = this.c.getOrDefault($$3.ap(), Long.MIN_VALUE);
               if (cpm.this.dS().aa() < $$4) {
                  $$0.put($$3.ap(), $$4);
               } else {
                  erh $$5 = this.b.P().a($$3, 1);
                  if ($$5 != null && $$5.j()) {
                     this.d = $$5;
                     this.e = $$3;
                     return true;
                  }

                  $$0.put($$3.ap(), cpm.this.dS().aa() + 600L);
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
         } else if (cvs.a(this.b.a(btz.f), cpl.a(this.b.dU().e(lw.d)))) {
            return true;
         } else {
            cpm $$0 = cpm.this.e.b(this.b.gG());
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

   public class c extends cbk {
      private final cpm b;

      c(final cpm $$1) {
         this.b = $$1;
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         cpl $$0 = this.b.gC();
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
            cpm.this.b(cpm.this.ai_());
         }

         if (!this.b.bW() && this.b.af.a(this.a(50)) == 0) {
            this.b.O().a();
         }

         super.a();
      }
   }

   static class d extends cbk {
      private final cpm a;
      private final double b;
      private jf c;
      private final List<jf> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cpm $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(cbk.a.a));
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
         arj $$0 = (arj)this.a.dS();
         jf $$1 = this.a.ds();
         Optional<jf> $$2 = $$0.y().a($$0x -> $$0x.a(cfu.n), this::a, cfq.b.c, $$1, 48, this.a.af);
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
            eyw $$0 = eyw.c(this.c);
            eyw $$1 = cfh.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cfh.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.P().a($$1.d, $$1.e, $$1.f, this.b);
         }
      }

      private boolean a(jf $$0) {
         for (jf $$1 : this.d) {
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
