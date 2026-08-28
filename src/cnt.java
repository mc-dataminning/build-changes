import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cnt extends cjo {
   protected static final ajp<Boolean> c = ajt.a(cnt.class, ajr.k);
   static final Predicate<cir> b = $$0 -> !$$0.y() && $$0.bD() && cua.a($$0.p(), cns.a($$0.dR().b(lr.d)));
   @Nullable
   protected cns d;
   private int e;
   private boolean ca;
   private int cb;

   protected cnt(bsj<? extends cnt> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(1, new cnt.b<>(this));
      this.bU.a(3, new caq<>(this));
      this.bU.a(4, new cnt.d(this, 1.05F, 1));
      this.bU.a(5, new cnt.c(this));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   public abstract void a(int var1, boolean var2);

   public boolean gA() {
      return this.ca;
   }

   public void z(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public void n_() {
      if (this.dP() instanceof aqk && this.bD()) {
         cns $$0 = this.gB();
         if (this.gA()) {
            if ($$0 == null) {
               if (this.dP().Z() % 20L == 0L) {
                  cns $$1 = ((aqk)this.dP()).d(this.dp());
                  if ($$1 != null && cnu.a(this, $$1)) {
                     $$1.a($$1.k(), this, null, true);
                  }
               }
            } else {
               bsy $$2 = this.p();
               if ($$2 != null && ($$2.ak() == bsj.by || $$2.ak() == bsj.af)) {
                  this.bf = 0;
               }
            }
         }
      }

      super.n_();
   }

   @Override
   protected void gs() {
      this.bf += 2;
   }

   @Override
   public void a(bqw $$0) {
      if (this.dP() instanceof aqk) {
         bsd $$1 = $$0.d();
         cns $$2 = this.gB();
         if ($$2 != null) {
            if (this.gr()) {
               $$2.c(this.gF());
            }

            if ($$1 != null && $$1.ak() == bsj.by) {
               $$2.a($$1);
            }

            $$2.a(this, false);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean gu() {
      return !this.gE();
   }

   public void a(@Nullable cns $$0) {
      this.d = $$0;
   }

   @Nullable
   public cns gB() {
      return this.d;
   }

   public boolean gC() {
      cua $$0 = this.a(bsk.f);
      boolean $$1 = !$$0.e() && cua.a($$0, cns.a(this.dR().b(lr.d)));
      boolean $$2 = this.gr();
      return $$1 && $$2;
   }

   public boolean gD() {
      return !(this.dP() instanceof aqk $$0) ? false : this.gB() != null || $$0.d(this.dp()) != null;
   }

   public boolean gE() {
      return this.gB() != null && this.gB().u();
   }

   public void b(int $$0) {
      this.e = $$0;
   }

   public int gF() {
      return this.e;
   }

   public boolean gG() {
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
         if (this.dP() instanceof aqk) {
            this.d = ((aqk)this.dP()).z().a($$0.h("RaidId"));
         }

         if (this.d != null) {
            this.d.a(this.e, this, false);
            if (this.gr()) {
               this.d.a(this.e, this);
            }
         }
      }
   }

   @Override
   protected void b(cir $$0) {
      cua $$1 = $$0.p();
      boolean $$2 = this.gE() && this.gB().b(this.gF()) != null;
      if (this.gE() && !$$2 && cua.a($$1, cns.a(this.dR().b(lr.d)))) {
         bsk $$3 = bsk.f;
         cua $$4 = this.a($$3);
         double $$5 = (double)this.g($$3);
         if (!$$4.e() && (double)Math.max(this.ah.i() - 0.1F, 0.0F) < $$5) {
            this.b($$4);
         }

         this.a($$0);
         this.a($$3, $$1);
         this.a($$0, $$1.H());
         $$0.ao();
         this.gB().a(this.gF(), this);
         this.w(true);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean h(double $$0) {
      return this.gB() == null ? super.h($$0) : false;
   }

   @Override
   public boolean W() {
      return super.W() || this.gB() != null;
   }

   public int gH() {
      return this.cb;
   }

   public void c(int $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.gE()) {
         this.gB().p();
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.z(this.ak() != bsj.bo || $$2 != btc.a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public abstract ave ae_();

   protected class a extends bzw {
      private final cnt b;
      private final float c;
      public final cdp a = cdp.b().a(8.0).d().e();

      public a(final ciu $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2 * $$2;
         this.a(EnumSet.of(bzw.a.a, bzw.a.b));
      }

      @Override
      public boolean a() {
         bsy $$0 = this.b.ei();
         return this.b.gB() == null && this.b.gw() && this.b.p() != null && !this.b.ge() && ($$0 == null || $$0.ak() != bsj.by);
      }

      @Override
      public void c() {
         super.c();
         this.b.K().n();

         for (cnt $$1 : this.b.dP().a(cnt.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
            $$1.h(this.b.p());
         }
      }

      @Override
      public void d() {
         super.d();
         bsy $$0 = this.b.p();
         if ($$0 != null) {
            for (cnt $$2 : this.b.dP().a(cnt.class, this.a, this.b, this.b.cK().c(8.0, 8.0, 8.0))) {
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
         bsy $$0 = this.b.p();
         if ($$0 != null) {
            if (this.b.g((bsd)$$0) > (double)this.c) {
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

   public class b<T extends cnt> extends bzw {
      private final T a;

      public b(final T $$1) {
         this.a = $$1;
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         cns $$0 = this.a.gB();
         if (this.a.gE() && !this.a.gB().a() && this.a.go() && !cua.a(this.a.a(bsk.f), cns.a(this.a.dR().b(lr.d)))) {
            cnt $$1 = $$0.b(this.a.gF());
            if ($$1 == null || !$$1.bD()) {
               List<cir> $$2 = this.a.dP().a(cir.class, this.a.cK().c(16.0, 8.0, 16.0), cnt.b);
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
         if (this.a.K().h().a(this.a.dn(), 1.414)) {
            List<cir> $$0 = this.a.dP().a(cir.class, this.a.cK().c(4.0, 4.0, 4.0), cnt.b);
            if (!$$0.isEmpty()) {
               this.a.b($$0.get(0));
            }
         }
      }
   }

   public class c extends bzw {
      private final cnt b;

      c(final cnt $$1) {
         this.b = $$1;
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         cns $$0 = this.b.gB();
         return this.b.bD() && this.b.p() == null && $$0 != null && $$0.f();
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
         if (!this.b.aW() && this.b.ah.a(this.a(100)) == 0) {
            cnt.this.b(cnt.this.ae_());
         }

         if (!this.b.bR() && this.b.ah.a(this.a(50)) == 0) {
            this.b.I().a();
         }

         super.e();
      }
   }

   static class d extends bzw {
      private final cnt a;
      private final double b;
      private ja c;
      private final List<ja> d = Lists.newArrayList();
      private final int e;
      private boolean f;

      public d(cnt $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.e = $$2;
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         this.k();
         return this.h() && this.i() && this.a.p() == null;
      }

      private boolean h() {
         return this.a.gE() && !this.a.gB().a();
      }

      private boolean i() {
         aqk $$0 = (aqk)this.a.dP();
         ja $$1 = this.a.dp();
         Optional<ja> $$2 = $$0.y().a($$0x -> $$0x.a(ceg.n), this::a, cec.b.c, $$1, 48, this.a.ah);
         if ($$2.isEmpty()) {
            return false;
         } else {
            this.c = $$2.get().i();
            return true;
         }
      }

      @Override
      public boolean b() {
         return this.a.K().l() ? false : this.a.p() == null && !this.c.a(this.a.dn(), (double)(this.a.dj() + (float)this.e)) && !this.f;
      }

      @Override
      public void d() {
         if (this.c.a(this.a.dn(), (double)this.e)) {
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
            evz $$0 = evz.c(this.c);
            evz $$1 = cdt.a(this.a, 16, 7, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdt.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
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
