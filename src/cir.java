import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cir extends ceo {
   protected static final aie<Boolean> c = aih.a(cir.class, aig.k);
   static final Predicate<cds> b = $$0 -> !$$0.z() && $$0.bx() && coz.a($$0.q(), ciq.s());
   @Nullable
   protected ciq d;
   private int e;
   private boolean bT;
   private int bU;

   protected cir(bnu<? extends cir> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new cir.b<>(this));
      this.bO.a(3, new bvv<>(this));
      this.bO.a(4, new cir.d(this, 1.05F, 1));
      this.bO.a(5, new cir.c(this));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gt() {
      return this.bT;
   }

   public void z(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   public void d_() {
      if (this.dM() instanceof aov && this.bx()) {
         ciq $$0 = this.gu();
         if (this.gt()) {
            if ($$0 == null) {
               if (this.dM().X() % 20L == 0L) {
                  ciq $$1 = ((aov)this.dM()).d(this.dm());
                  if ($$1 != null && cis.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bog $$2 = this.q();
               if ($$2 != null && ($$2.ai() == bnu.bw || $$2.ai() == bnu.ae)) {
                  this.bb = 0;
               }
            }
         }
      }

      super.d_();
   }

   @Override
   protected void gl() {
      this.bb += 2;
   }

   @Override
   public void a(bmn $$0) {
      if (this.dM() instanceof aov) {
         bno $$1 = $$0.d();
         ciq $$2 = this.gu();
         if ($$2 != null) {
            if (this.gk()) {
               $$2.c(this.gw());
            }

            if ($$1 != null && $$1.ai() == bnu.bw) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gk() && $$2 == null && ((aov)this.dM()).d(this.dm()) == null) {
            coz $$3 = this.c(bnv.f);
            chh $$4 = null;
            if ($$1 instanceof chh) {
               $$4 = (chh)$$1;
            } else if ($$1 instanceof caw $$6) {
               bog $$7 = $$6.R_();
               if ($$6.u() && $$7 instanceof chh) {
                  $$4 = (chh)$$7;
               }
            }

            if (!$$3.b() && coz.a($$3, ciq.s()) && $$4 != null) {
               bnb $$8 = $$4.c(bnd.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.d();
                  $$4.d(bnd.E);
               } else {
                  $$9--;
               }

               $$9 = awh.a($$9, 0, 4);
               bnb $$10 = new bnb(bnd.E, 120000, $$9, false, false, true);
               if (!this.dM().Z().b(cvj.B)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gn() {
      return !this.gv();
   }

   public void a(@Nullable ciq $$0) {
      this.d = $$0;
   }

   @Nullable
   public ciq gu() {
      return this.d;
   }

   public boolean gv() {
      return this.gu() != null && this.gu().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gw() {
      return this.e;
   }

   public boolean gx() {
      return this.am.b(c);
   }

   public void A(boolean $$0) {
      this.am.b(c, $$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.bT);
      if (this.d != null) {
         $$0.a("RaidId", this.d.u());
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.bT = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dM() instanceof aov) {
            this.d = ((aov)this.dM()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gk()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cds $$0) {
      coz $$1 = $$0.q();
      boolean $$2 = this.gv() && this.gu().b(this.gw()) != null;
      if (this.gv() && !$$2 && coz.a($$1, ciq.s())) {
         bnv $$3 = bnv.f;
         coz $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.M());
         $$0.am();
         this.gu().a(this.gw(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gu() == null ? super.h($$0) : false;
   }

   @Override
   public boolean X() {
      return super.X() || this.gu() != null;
   }

   public int gy() {
      return this.bU;
   }

   public void c(int $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.gv()) {
         this.gu().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      this.z(this.ai() != bnu.bm || $$2 != bok.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract atj ag_();

   protected class a extends bvb {
      private final cir c;
      private final float d;
      public final byu a = byu.b().a(8.0).d().e();

      public a(cdv $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bvb.a.a, bvb.a.b));
      }

      @Override
      public boolean a() {
         bog $$0 = this.c.ei();
         return this.c.gu() == null && this.c.gp() && this.c.q() != null && !this.c.fY() && ($$0 == null || $$0.ai() != bnu.bw);
      }

      @Override
      public void c() {
         super.c();
         this.c.N().n();

         for (cir $$1 : this.c.dM().a(cir.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.q());
         }
      }

      @Override
      public void d() {
         super.d();
         bog $$0 = this.c.q();
         if ($$0 != null) {
            for (cir $$2 : this.c.dM().a(cir.class, this.a, this.c, this.c.cH().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
               $$2.v(true);
            }

            this.c.v(true);
         }
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bog $$0 = this.c.q();
         if ($$0 != null) {
            if (this.c.f((bno)$$0) > (double)this.d) {
               this.c.I().a($$0, 30.0F, 30.0F);
               if (this.c.af.a(50) == 0) {
                  this.c.R();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cir> extends bvb {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         ciq $$0 = this.b.gu();
         if (this.b.gv() && !this.b.gu().a() && this.b.gh() && !coz.a(this.b.c(bnv.f), ciq.s())) {
            cir $$1 = $$0.b(this.b.gw());
            if ($$1 == null || !$$1.bx()) {
               List<cds> $$2 = this.b.dM().a(cds.class, this.b.cH().c(16.0, 8.0, 16.0), cir.b);
               if (!$$2.isEmpty()) {
                  return this.b.N().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.N().h().a(this.b.dk(), 1.414)) {
            List<cds> $$0 = this.b.dM().a(cds.class, this.b.cH().c(4.0, 4.0, 4.0), cir.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bvb {
      private final cir b;

      c(cir $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         ciq $$0 = this.b.gu();
         return this.b.bx() && this.b.q() == null && $$0 != null && $$0.f();
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
         if (!this.b.aU() && this.b.af.a(this.a(100)) == 0) {
            cir.this.b(cir.this.ag_());
         }

         if (!this.b.bO() && this.b.af.a(this.a(50)) == 0) {
            this.b.M().a();
         }

         super.e();
      }
   }

   static class d extends bvb {
      private final cir a;
      private final double b;
      private hz c;
      private final List<hz> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cir $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.q() == null;
      }

      private boolean h() {
         return this.a.gv() && !this.a.gu().a();
      }

      private boolean i() {
         aov $$0 = (aov)this.a.dM();
         hz $$1 = this.a.dm();
         Optional<hz> $$2 = $$0.y().a($$0x -> $$0x.a(bzl.n), this::a, bzh.b.c, $$1, 48, this.a.af);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.N().l() ? false : this.a.q() == null && !this.c.a(this.a.dk(), (double)(this.a.dg() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dk(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.p(0);
         this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.N().l()) {
            ens $$0 = ens.c(this.c);
            ens $$1 = byy.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = byy.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.N().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(hz $$0) {
         for (hz $$1 : this.d) {
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
