import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bzw extends bwd {
   protected static final aby<Boolean> c = acb.a(bzw.class, aca.k);
   static final Predicate<bvh> b = $$0 -> !$$0.r() && $$0.bs() && cfz.a($$0.j(), bzv.s());
   @Nullable
   protected bzv d;
   private int e;
   private boolean bT;
   private int bU;

   protected bzw(bfn<? extends bzw> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(1, new bzw.b<>(this));
      this.bO.a(3, new bnp<>(this));
      this.bO.a(4, new bzw.d(this, 1.05F, 1));
      this.bO.a(5, new bzw.c(this));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gl() {
      return this.bT;
   }

   public void z(boolean $$0) {
      this.bT = $$0;
   }

   @Override
   public void b_() {
      if (this.dI() instanceof aif && this.bs()) {
         bzv $$0 = this.gm();
         if (this.gl()) {
            if ($$0 == null) {
               if (this.dI().V() % 20L == 0L) {
                  bzv $$1 = ((aif)this.dI()).c(this.di());
                  if ($$1 != null && bzx.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bfz $$2 = this.j();
               if ($$2 != null && ($$2.ae() == bfn.bt || $$2.ae() == bfn.ac)) {
                  this.bc = 0;
               }
            }
         }
      }

      super.b_();
   }

   @Override
   protected void gd() {
      this.bc += 2;
   }

   @Override
   public void a(ben $$0) {
      if (this.dI() instanceof aif) {
         bfj $$1 = $$0.d();
         bzv $$2 = this.gm();
         if ($$2 != null) {
            if (this.gc()) {
               $$2.c(this.go());
            }

            if ($$1 != null && $$1.ae() == bfn.bt) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }

         if (this.gc() && $$2 == null && ((aif)this.dI()).c(this.di()) == null) {
            cfz $$3 = this.c(bfo.f);
            byo $$4 = null;
            if ($$1 instanceof byo) {
               $$4 = (byo)$$1;
            } else if ($$1 instanceof bso $$6) {
               bfz $$7 = $$6.I_();
               if ($$6.q() && $$7 instanceof byo) {
                  $$4 = (byo)$$7;
               }
            }

            if (!$$3.b() && cfz.a($$3, bzv.s()) && $$4 != null) {
               bfa $$8 = $$4.b(bfc.E);
               int $$9 = 1;
               if ($$8 != null) {
                  $$9 += $$8.e();
                  $$4.c(bfc.E);
               } else {
                  $$9--;
               }

               $$9 = apa.a($$9, 0, 4);
               bfa $$10 = new bfa(bfc.E, 120000, $$9, false, false, true);
               if (!this.dI().X().b(cmi.z)) {
                  $$4.b($$10);
               }
            }
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gf() {
      return !this.gn();
   }

   public void a(@Nullable bzv $$0) {
      this.d = $$0;
   }

   @Nullable
   public bzv gm() {
      return this.d;
   }

   public boolean gn() {
      return this.gm() != null && this.gm().v();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int go() {
      return this.e;
   }

   public boolean gp() {
      return this.am.b(c);
   }

   public void A(boolean $$0) {
      this.am.b(c, $$0);
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
         if (this.dI() instanceof aif) {
            this.d = ((aif)this.dI()).x().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gc()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(bvh $$0) {
      cfz $$1 = $$0.j();
      boolean $$2 = this.gn() && this.gm().b(this.go()) != null;
      if (this.gn() && !$$2 && cfz.a($$1, bzv.s())) {
         bfo $$3 = bfo.f;
         cfz $$4 = this.c($$3);
         double $$5 = (double)this.f($$3);
         if (!$$4.b() && (double)Math.max(this.af.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.L());
         $$0.ai();
         this.gm().a(this.go(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gm() == null ? super.h($$0) : false;
   }

   @Override
   public boolean T() {
      return super.T() || this.gm() != null;
   }

   public int gq() {
      return this.bU;
   }

   public void c(int $$0) {
      this.bU = $$0;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.gn()) {
         this.gm().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      this.z(this.ae() != bfn.bj || $$2 != bgd.a);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public abstract amg Y_();

   protected class a extends bmv {
      private final bzw c;
      private final float d;
      public final bqm a = bqm.b().a(8.0).d().e();

      public a(bvk $$1, float $$2) {
         this.c = $$1;
         this.d = $$2 * $$2;
         this.a(EnumSet.of(bmv.a.a, bmv.a.b));
      }

      @Override
      public boolean a() {
         bfz $$0 = this.c.ed();
         return this.c.gm() == null && this.c.gh() && this.c.j() != null && !this.c.fS() && ($$0 == null || $$0.ae() != bfn.bt);
      }

      @Override
      public void c() {
         super.c();
         this.c.J().n();

         for (bzw $$1 : this.c.dI().a(bzw.class, this.a, this.c, this.c.cE().c(8.0, 8.0, 8.0))) {
            $$1.h(this.c.j());
         }
      }

      @Override
      public void d() {
         super.d();
         bfz $$0 = this.c.j();
         if ($$0 != null) {
            for (bzw $$2 : this.c.dI().a(bzw.class, this.a, this.c, this.c.cE().c(8.0, 8.0, 8.0))) {
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
         bfz $$0 = this.c.j();
         if ($$0 != null) {
            if (this.c.f($$0) > (double)this.d) {
               this.c.E().a($$0, 30.0F, 30.0F);
               if (this.c.af.a(50) == 0) {
                  this.c.N();
               }
            } else {
               this.c.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends bzw> extends bmv {
      private final T b;

      public b(T $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         bzv $$0 = this.b.gm();
         if (this.b.gn() && !this.b.gm().a() && this.b.fZ() && !cfz.a(this.b.c(bfo.f), bzv.s())) {
            bzw $$1 = $$0.b(this.b.go());
            if ($$1 == null || !$$1.bs()) {
               List<bvh> $$2 = this.b.dI().a(bvh.class, this.b.cE().c(16.0, 8.0, 16.0), bzw.b);
               if (!$$2.isEmpty()) {
                  return this.b.J().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.b.J().h().a(this.b.dg(), 1.414)) {
            List<bvh> $$0 = this.b.dI().a(bvh.class, this.b.cE().c(4.0, 4.0, 4.0), bzw.b);
            if (!$$0.isEmpty()) {
               this.b.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bmv {
      private final bzw b;

      c(bzw $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         bzv $$0 = this.b.gm();
         return this.b.bs() && this.b.j() == null && $$0 != null && $$0.f();
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
         if (!this.b.aQ() && this.b.af.a(this.a(100)) == 0) {
            bzw.this.a(bzw.this.Y_(), bzw.this.eR(), bzw.this.eS());
         }

         if (!this.b.bM() && this.b.af.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends bmv {
      private final bzw a;
      private final double b;
      private gu c;
      private final List<gu> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(bzw $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.j() == null;
      }

      private boolean h() {
         return this.a.gn() && !this.a.gm().a();
      }

      private boolean i() {
         aif $$0 = (aif)this.a.dI();
         gu $$1 = this.a.di();
         Optional<gu> $$2 = $$0.w().a($$0x -> $$0x.a(brd.n), this::a, bqz.b.c, $$1, 48, this.a.af);
         if (!$$2.isPresent()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.J().l() ? false : this.a.j() == null && !this.c.a(this.a.dg(), (double)(this.a.dd() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dg(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.o(0);
         this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.J().l()) {
            eei $$0 = eei.c(this.c);
            eei $$1 = bqq.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bqq.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.J().a($$1.c, $$1.d, $$1.e, this.b);
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
