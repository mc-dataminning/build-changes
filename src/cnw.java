import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cnw extends cjr {
   protected static final ajp<Boolean> c = ajt.a(cnw.class, ajr.k);
   static final Predicate<ciu> b = $$0 -> !$$0.y() && $$0.bE() && cuc.a($$0.p(), cnv.a($$0.dS().b(lr.d)));
   @Nullable
   protected cnv d;
   private int e;
   private boolean ca;
   private int cb;

   protected cnw(bsm<? extends cnw> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cnw.b<>(this));
      this.bU.a(3, new cat<>(this));
      this.bU.a(4, new cnw.d(this, 1.05F, 1));
      this.bU.a(5, new cnw.c(this));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gB() {
      return this.ca;
   }

   public void z(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public void n_() {
      if (this.dQ() instanceof aqm && this.bE()) {
         cnv $$0 = this.gC();
         if (this.gB()) {
            if ($$0 == null) {
               if (this.dQ().Z() % 20L == 0L) {
                  cnv $$1 = ((aqm)this.dQ()).d(this.dq());
                  if ($$1 != null && cnx.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               btb $$2 = this.p();
               if ($$2 != null && ($$2.al() == bsm.by || $$2.al() == bsm.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gt() {
      this.bf += 2;
   }

   @Override
   public void a(bqz $$0) {
      if (this.dQ() instanceof aqm) {
         bsg $$1 = $$0.d();
         cnv $$2 = this.gC();
         if ($$2 != null) {
            if (this.gs()) {
               $$2.c(this.gG());
            }

            if ($$1 != null && $$1.al() == bsm.by) {
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

   public void a(@Nullable cnv $$0) {
      this.d = $$0;
   }

   @Nullable
   public cnv gC() {
      return this.d;
   }

   public boolean gD() {
      cuc $$0 = this.a(bsn.f);
      boolean $$1 = !$$0.e() && cuc.a($$0, cnv.a(this.dS().b(lr.d)));
      boolean $$2 = this.gs();
      return $$1 && $$2;
   }

   public boolean gE() {
      return !(this.dQ() instanceof aqm $$0) ? false : this.gC() != null || $$0.d(this.dq()) != null;
   }

   public boolean gF() {
      return this.gC() != null && this.gC().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gG() {
      return this.e;
   }

   public boolean gH() {
      return this.ao.a(c);
   }

   public void A(boolean $$0) {
      this.ao.a(c, $$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Wave", this.e);
      $$0.a("CanJoinRaid", this.ca);
      if (this.d != null) {
         $$0.a("RaidId", this.d.t());
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.e = $$0.h("Wave");
      this.ca = $$0.q("CanJoinRaid");
      if ($$0.b("RaidId", 3)) {
         if (this.dQ() instanceof aqm) {
            this.d = ((aqm)this.dQ()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gs()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(ciu $$0) {
      cuc $$1 = $$0.p();
      boolean $$2 = this.gF() && this.gC().b(this.gG()) != null;
      if (this.gF() && !$$2 && cuc.a($$1, cnv.a(this.dS().b(lr.d)))) {
         bsn $$3 = bsn.f;
         cuc $$4 = this.a($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.H());
         $$0.ap();
         this.gC().a(this.gG(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gC() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gC() != null;
   }

   public int gI() {
      return this.cb;
   }

   public void c(int $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.gF()) {
         this.gC().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.z(this.al() != bsm.bo || $$2 != btf.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract avg ae_();

   protected class a extends bzz {
      private final cnw b;
      private final float c;
      public final cds a = cds.b().a(8.0).d().e();

      public a(final cix $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      }

      @Override
      public boolean a() {
         btb $$0 = this.b.ej();
         return this.b.gC() == null && this.b.gx() && this.b.p() != null && !this.b.gf() && ($$0 == null || $$0.al() != bsm.by);
      }

      @Override
      public void c() {
         super.c();
         this.b.K().n();

         for (cnw $$1 : this.b.dQ().a(cnw.class, this.a, this.b, this.b.cL().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.p());
         }
      }

      @Override
      public void d() {
         super.d();
         btb $$0 = this.b.p();
         if ($$0 != null) {
            for (cnw $$2 : this.b.dQ().a(cnw.class, this.a, this.b, this.b.cL().c(8.0, 8.0, 8.0))) {
               $$2.h($$0);
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
      public void e() {
         btb $$0 = this.b.p();
         if ($$0 != null) {
            if (this.b.g((bsg)$$0) > (double)this.c) {
               this.b.G().a($$0, 30.0F, 30.0F);
               if (this.b.ah.a(50) == 0) {
                  this.b.Q();
               }
            } else {
               this.b.v(true);
            }

            super.e();
         }
      }
   }

   public class b<T extends cnw> extends bzz {
      private final T a;

      public b(final T $$1) {
         this.a = $$1;
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         cnv $$0 = this.a.gC();
         if (this.a.gF() && !this.a.gC().a() && this.a.gp() && !cuc.a(this.a.a(bsn.f), cnv.a(this.a.dS().b(lr.d)))) {
            cnw $$1 = $$0.b(this.a.gG());
            if ($$1 == null || !$$1.bE()) {
               List<ciu> $$2 = this.a.dQ().a(ciu.class, this.a.cL().c(16.0, 8.0, 16.0), cnw.b);
               if (!$$2.isEmpty()) {
                  return this.a.K().a($$2.get(0), 1.15F);
               }
            }

            return false;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (this.a.K().h().a(this.a.do(), 1.414)) {
            List<ciu> $$0 = this.a.dQ().a(ciu.class, this.a.cL().c(4.0, 4.0, 4.0), cnw.b);
            if (!$$0.isEmpty()) {
               this.a.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bzz {
      private final cnw b;

      c(final cnw $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         cnv $$0 = this.b.gC();
         return this.b.bE() && this.b.p() == null && $$0 != null && $$0.f();
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
         if (!this.b.aX() && this.b.ah.a(this.a(100)) == 0) {
            cnw.this.b(cnw.this.ae_());
         }

         if (!this.b.bS() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends bzz {
      private final cnw a;
      private final double b;
      private ja c;
      private final List<ja> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cnw $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bzz.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gF() && !this.a.gC().a();
      }

      private boolean i() {
         aqm $$0 = (aqm)this.a.dQ();
         ja $$1 = this.a.dq();
         Optional<ja> $$2 = $$0.y().a($$0x -> $$0x.a(cej.n), this::a, cef.b.c, $$1, 48, this.a.ah);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.K().l() ? false : this.a.p() == null && !this.c.a(this.a.do(), (double)(this.a.dk() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.do(), (double)this.e)) {
            this.d.add(this.c);
         }
      }

      @Override
      public void c() {
         super.c();
         this.a.o(0);
         this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), this.b);
         this.f = false;
      }

      @Override
      public void e() {
         if (this.a.K().l()) {
            ewf $$0 = ewf.c(this.c);
            ewf $$1 = cdw.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdw.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 == null) {
               this.f = true;
               return;
            }

            this.a.K().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      private boolean a(ja $$0) {
         for (ja $$1 : this.d) {
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
