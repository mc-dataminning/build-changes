import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ccu extends bzb {
   protected static final adz<Boolean> c = aec.a(ccu.class, aeb.k);
   static final Predicate<byf> b = $$0 -> !$$0.r() && $$0.bv() && cix.a($$0.j(), cct.s());
   @Nullable
   protected cct d;
   private int e;
   private boolean bT;
   private int bU;

   protected ccu(bim<? extends ccu> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(1, new ccu.b<>(this));
      this.bO.a(3, new bqn<>(this));
      this.bO.a(4, new ccu.d(this, 1.05F, 1));
      this.bO.a(5, new ccu.c(this));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gn() {
      return this.bT;
   }

   public void z(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   public void b_() {
      if (this.dK() instanceof akk && this.bv()) {
         cct $$0 = this.go();
         if (this.gn()) {
            if ($$0 == null) {
               if (this.dK().V() % 20L == 0L) {
                  cct $$1 = ((akk)this.dK()).c(this.dk());
                  if ($$1 != null && ccv.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               biy $$2 = this.j();
               if ($$2 != null && ($$2.ag() == bim.bt || $$2.ag() == bim.ac)) {
                  this.bb = 0;
               }
            }
         }
      }

      super.b_();
   }

   @Override
   protected void gf() {
      this.bb += 2;
   }

   @Override
   public void a(bhg $$0) {
      if (this.dK() instanceof akk) {
         bii $$1 = $$0.d();
         cct $$2 = this.go();
         if ($$2 != null) {
            if (this.ge()) {
               $$2.c(this.gq());
            }

            if ($$1 != null && $$1.ag() == bim.bt) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.ge() && $$2 == null && ((akk)this.dK()).c(this.dk()) == null) {
            cix $$3 = this.c(bin.f);
            cbm $$4 = null;
            if ($$1 instanceof cbm) {
               $$4 = (cbm)$$1;
            } else if ($$1 instanceof bvm $$6) {
               biy $$7 = $$6.I_();
               if ($$6.p() && $$7 instanceof cbm) {
                  $$4 = (cbm)$$7;
               }
            }

            if (!$$3.b() && cix.a($$3, cct.s()) && $$4 != null) {
               bhv $$8 = $$4.b(bhx.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.c(bhx.E);
               } else {
                  $$9--;
               }

               $$9 = arp.a($$9, 0, 4);
               bhv $$10 = new bhv(bhx.E, 120000, $$9, false, false, true);
               if (!this.dK().X().b(cph.z)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gh() {
      return !this.gp();
   }

   public void a(@Nullable cct $$0) {
      this.d = $$0;
   }

   @Nullable
   public cct go() {
      return this.d;
   }

   public boolean gp() {
      return this.go() != null && this.go().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gq() {
      return this.e;
   }

   public boolean gr() {
      return this.an.b(c);
   }

   public void A(boolean $$0) {
      this.an.b(c, $$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bT);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bT = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dK() instanceof akk) {
            this.d = ((akk)this.dK()).x().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.ge()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(byf $$0) {
      cix $$1 = $$0.j();
      boolean $$2 = this.gp() && this.go().b(this.gq()) != null;
      if (this.gp() && !$$2 && cix.a($$1, cct.s())) {
         bin $$3 = bin.f;
         cix $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.ak();
         this.go().a(this.gq(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.go() == null ? super.h($$0) : false;
   }

   @Override
   public boolean R() {
      return super.R() || this.go() != null;
   }

   public int gs() {
      return this.bU;
   }

   public void c(int $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.gp()) {
         this.go().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      this.z(this.ag() != bim.bj || $$2 != bjc.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract aov X_();

   protected class a extends bpt {
      private final ccu c;
      private final float d;
      public final btk a = btk.b().a(8.0).d().e();

      public a(byi $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bpt.a.a, bpt.a.b));
      }

      @Override
      public boolean a() {
         biy $$0 = this.c.ef();
         return this.c.go() == null && this.c.gj() && this.c.j() != null && !this.c.fS() && ($$0 == null || $$0.ag() != bim.bt);
      }

      @Override
      public void c() {
         super.c();
         this.c.H().n();

         for (ccu $$1 : this.c.dK().a(ccu.class, this.a, this.c, this.c.cG().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.j());
         }
      }

      @Override
      public void d() {
         super.d();
         biy $$0 = this.c.j();
         if ($$0 != null) {
            for (ccu $$2 : this.c.dK().a(ccu.class, this.a, this.c, this.c.cG().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.c.v(true);
         }
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         biy $$0 = this.c.j();
         if ($$0 != null) {
            if (this.c.f($$0) > (double)this.d) {
               this.c.D().a($$0, 30.0F, 30.0F);
               if (this.c.ag.a(50) == 0) {
                  this.c.M();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends ccu> extends bpt {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         cct $$0 = this.b.go();
         if (this.b.gp() && !this.b.go().a() && this.b.gb() && !cix.a(this.b.c(bin.f), cct.s())) {
            ccu $$1 = $$0.b(this.b.gq());
            if ($$1 == null || !$$1.bv()) {
               List<byf> $$2 = this.b.dK().a(byf.class, this.b.cG().c(16.0, 8.0, 16.0), ccu.b);
               if (!$$2.isEmpty()) {
                  return this.b.H().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.H().h().a(this.b.di(), 1.414)) {
            List<byf> $$0 = this.b.dK().a(byf.class, this.b.cG().c(4.0, 4.0, 4.0), ccu.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bpt {
      private final ccu b;

      c(ccu $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         cct $$0 = this.b.go();
         return this.b.bv() && this.b.j() == null && $$0 != null && $$0.f();
      }

      @Override
      public void c() {
         this.b.A(true);
         super.c();
      }

      @Override
      public void d() {
         this.b.A(false);
         super.d();
      }

      @Override
      public void e() {
         if (!this.b.aS() && this.b.ag.a(this.a(100)) == 0) {
            ccu.this.a(ccu.this.X_(), ccu.this.eU(), ccu.this.eV());
         }

         if (!this.b.bN() && this.b.ag.a(this.a(50)) == 0) {
            this.b.F().a();
         }

         super.e();
      }
   }

   static class d extends bpt {
      private final ccu a;
      private final double b;
      private gu c;
      private final List<gu> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(ccu $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bpt.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.j() == null;
      }

      private boolean h() {
         return this.a.gp() && !this.a.go().a();
      }

      private boolean i() {
         akk $$0 = (akk)this.a.dK();
         gu $$1 = this.a.dk();
         Optional<gu> $$2 = $$0.w().a($$0x -> $$0x.a(bub.n), this::a, btx.b.c, $$1, 48, this.a.ag);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.H().l() ? false : this.a.j() == null && !this.c.a(this.a.di(), (double)(this.a.df() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.di(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.o(0);
         this.a.H().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.H().l()) {
            ehd $$0 = ehd.c(this.c);
            ehd $$1 = bto.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bto.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.H().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(gu $$0) {
         for (gu $$1 : this.d) {
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
