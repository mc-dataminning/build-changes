import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class ccv extends bzc {
   protected static final adz<Boolean> c = aec.a(ccv.class, aeb.k);
   static final Predicate<byg> b = $$0 -> !$$0.r() && $$0.bv() && ciy.a($$0.j(), ccu.s());
   @Nullable
   protected ccu d;
   private int e;
   private boolean bT;
   private int bU;

   protected ccv(bim<? extends ccv> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(1, new ccv.b<>(this));
      this.bO.a(3, new bqo<>(this));
      this.bO.a(4, new ccv.d(this, 1.05F, 1));
      this.bO.a(5, new ccv.c(this));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gm() {
      return this.bT;
   }

   public void z(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   public void b_() {
      if (this.dK() instanceof akk && this.bv()) {
         ccu $$0 = this.gn();
         if (this.gm()) {
            if ($$0 == null) {
               if (this.dK().V() % 20L == 0L) {
                  ccu $$1 = ((akk)this.dK()).c(this.dk());
                  if ($$1 != null && ccw.a(this, $$1)) {
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
   protected void ge() {
      this.bb += 2;
   }

   @Override
   public void a(bhg $$0) {
      if (this.dK() instanceof akk) {
         bii $$1 = $$0.d();
         ccu $$2 = this.gn();
         if ($$2 != null) {
            if (this.gd()) {
               $$2.c(this.gp());
            }

            if ($$1 != null && $$1.ag() == bim.bt) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gd() && $$2 == null && ((akk)this.dK()).c(this.dk()) == null) {
            ciy $$3 = this.c(bin.f);
            cbn $$4 = null;
            if ($$1 instanceof cbn) {
               $$4 = (cbn)$$1;
            } else if ($$1 instanceof bvn $$6) {
               biy $$7 = $$6.I_();
               if ($$6.p() && $$7 instanceof cbn) {
                  $$4 = (cbn)$$7;
               }
            }

            if (!$$3.b() && ciy.a($$3, ccu.s()) && $$4 != null) {
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
               if (!this.dK().X().b(cpi.z)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gg() {
      return !this.go();
   }

   public void a(@Nullable ccu $$0) {
      this.d = $$0;
   }

   @Nullable
   public ccu gn() {
      return this.d;
   }

   public boolean go() {
      return this.gn() != null && this.gn().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gp() {
      return this.e;
   }

   public boolean gq() {
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
            if (this.gd()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(byg $$0) {
      ciy $$1 = $$0.j();
      boolean $$2 = this.go() && this.gn().b(this.gp()) != null;
      if (this.go() && !$$2 && ciy.a($$1, ccu.s())) {
         bin $$3 = bin.f;
         ciy $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.ag.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.ak();
         this.gn().a(this.gp(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gn() == null ? super.h($$0) : false;
   }

   @Override
   public boolean R() {
      return super.R() || this.gn() != null;
   }

   public int gr() {
      return this.bU;
   }

   public void c(int $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      if (this.go()) {
         this.gn().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      this.z(this.ag() != bim.bj || $$2 != bjc.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract aov Y_();

   protected class a extends bpu {
      private final ccv c;
      private final float d;
      public final btl a = btl.b().a(8.0).d().e();

      public a(byj $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bpu.a.a, bpu.a.b));
      }

      @Override
      public boolean a() {
         biy $$0 = this.c.ef();
         return this.c.gn() == null && this.c.gi() && this.c.j() != null && !this.c.fS() && ($$0 == null || $$0.ag() != bim.bt);
      }

      @Override
      public void c() {
         super.c();
         this.c.H().n();

         for (ccv $$1 : this.c.dK().a(ccv.class, this.a, this.c, this.c.cG().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.j());
         }
      }

      @Override
      public void d() {
         super.d();
         biy $$0 = this.c.j();
         if ($$0 != null) {
            for (ccv $$2 : this.c.dK().a(ccv.class, this.a, this.c, this.c.cG().c(8.0, 8.0, 8.0))) {
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

   public class b<T extends ccv> extends bpu {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         ccu $$0 = this.b.gn();
         if (this.b.go() && !this.b.gn().a() && this.b.ga() && !ciy.a(this.b.c(bin.f), ccu.s())) {
            ccv $$1 = $$0.b(this.b.gp());
            if ($$1 == null || !$$1.bv()) {
               List<byg> $$2 = this.b.dK().a(byg.class, this.b.cG().c(16.0, 8.0, 16.0), ccv.b);
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
            List<byg> $$0 = this.b.dK().a(byg.class, this.b.cG().c(4.0, 4.0, 4.0), ccv.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bpu {
      private final ccv b;

      c(ccv $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         ccu $$0 = this.b.gn();
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
            ccv.this.a(ccv.this.Y_(), ccv.this.eU(), ccv.this.eV());
         }

         if (!this.b.bN() && this.b.ag.a(this.a(50)) == 0) {
            this.b.F().a();
         }

         super.e();
      }
   }

   static class d extends bpu {
      private final ccv a;
      private final double b;
      private gu c;
      private final List<gu> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(ccv $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.j() == null;
      }

      private boolean h() {
         return this.a.go() && !this.a.gn().a();
      }

      private boolean i() {
         akk $$0 = (akk)this.a.dK();
         gu $$1 = this.a.dk();
         Optional<gu> $$2 = $$0.w().a($$0x -> $$0x.a(buc.n), this::a, bty.b.c, $$1, 48, this.a.ag);
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
            ehe $$0 = ehe.c(this.c);
            ehe $$1 = btp.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = btp.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
