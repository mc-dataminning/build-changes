import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class bzi extends bzg {
   private static final double b = 0.15;
   @Nullable
   private bfj c;
   @Nullable
   private ha d;
   private int e;
   private double f;
   private double g;
   private double h;
   @Nullable
   private UUID i;

   public bzi(bfn<? extends bzi> $$0, cmm $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   public bzi(cmm $$0, bfz $$1, bfj $$2, ha.a $$3) {
      this(bfn.aH, $$0);
      this.b($$1);
      gu $$4 = $$1.di();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dy(), this.dA());
      this.c = $$2;
      this.d = ha.b;
      this.a($$3);
   }

   @Override
   public ami cY() {
      return ami.f;
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.ct());
      }

      if (this.d != null) {
         $$0.a("Dir", this.d.d());
      }

      $$0.a("Steps", this.e);
      $$0.a("TXD", this.f);
      $$0.a("TYD", this.g);
      $$0.a("TZD", this.h);
   }

   @Override
   protected void a(qr $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.g = $$0.k("TYD");
      this.h = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = ha.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.i = $$0.a("Target");
      }
   }

   @Override
   protected void a_() {
   }

   @Nullable
   private ha j() {
      return this.d;
   }

   private void a(@Nullable ha $$0) {
      this.d = $$0;
   }

   private void a(@Nullable ha.a $$0) {
      double $$1 = 0.5;
      gu $$2;
      if (this.c == null) {
         $$2 = this.di().d();
      } else {
         $$1 = (double)this.c.de() * 0.5;
         $$2 = gu.a(this.c.dn(), this.c.dp() + $$1, this.c.dt());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      ha $$7 = null;
      if (!$$2.a(this.dg(), 2.0)) {
         gu $$8 = this.di();
         List<ha> $$9 = Lists.newArrayList();
         if ($$0 != ha.a.a) {
            if ($$8.u() < $$2.u() && this.dI().t($$8.h())) {
               $$9.add(ha.f);
            } else if ($$8.u() > $$2.u() && this.dI().t($$8.g())) {
               $$9.add(ha.e);
            }
         }

         if ($$0 != ha.a.b) {
            if ($$8.v() < $$2.v() && this.dI().t($$8.c())) {
               $$9.add(ha.b);
            } else if ($$8.v() > $$2.v() && this.dI().t($$8.d())) {
               $$9.add(ha.a);
            }
         }

         if ($$0 != ha.a.c) {
            if ($$8.w() < $$2.w() && this.dI().t($$8.f())) {
               $$9.add(ha.d);
            } else if ($$8.w() > $$2.w() && this.dI().t($$8.e())) {
               $$9.add(ha.c);
            }
         }

         $$7 = ha.b(this.af);
         if ($$9.isEmpty()) {
            for (int $$10 = 5; !this.dI().t($$8.a($$7)) && $$10 > 0; $$10--) {
               $$7 = ha.b(this.af);
            }
         } else {
            $$7 = $$9.get(this.af.a($$9.size()));
         }

         $$4 = this.dn() + (double)$$7.j();
         $$5 = this.dp() + (double)$$7.k();
         $$6 = this.dt() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.dn();
      double $$12 = $$5 - this.dp();
      double $$13 = $$6 - this.dt();
      double $$14 = Math.sqrt($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
      if ($$14 == 0.0) {
         this.f = 0.0;
         this.g = 0.0;
         this.h = 0.0;
      } else {
         this.f = $$11 / $$14 * 0.15;
         this.g = $$12 / $$14 * 0.15;
         this.h = $$13 / $$14 * 0.15;
      }

      this.at = true;
      this.e = 10 + this.af.a(5) * 10;
   }

   @Override
   public void du() {
      if (this.dI().ai() == bdu.a) {
         this.ai();
      }
   }

   @Override
   public void l() {
      super.l();
      if (!this.dI().B) {
         if (this.c == null && this.i != null) {
            this.c = ((aif)this.dI()).a(this.i);
            if (this.c == null) {
               this.i = null;
            }
         }

         if (this.c == null || !this.c.bs() || this.c instanceof byo && this.c.G_()) {
            if (!this.aR()) {
               this.f(this.dl().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = apa.a(this.f * 1.025, -1.0, 1.0);
            this.g = apa.a(this.g * 1.025, -1.0, 1.0);
            this.h = apa.a(this.h * 1.025, -1.0, 1.0);
            eei $$0 = this.dl();
            this.f($$0.b((this.f - $$0.c) * 0.2, (this.g - $$0.d) * 0.2, (this.h - $$0.e) * 0.2));
         }

         eeg $$1 = bzh.a(this, this::a);
         if ($$1.c() != eeg.a.a) {
            this.a($$1);
         }
      }

      this.aM();
      eei $$2 = this.dl();
      this.e(this.dn() + $$2.c, this.dp() + $$2.d, this.dt() + $$2.e);
      bzh.a(this, 0.5F);
      if (this.dI().B) {
         this.dI().a(iv.u, this.dn() - $$2.c, this.dp() - $$2.d + 0.15, this.dt() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dD()) {
         if (this.e > 0) {
            this.e--;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            gu $$3 = this.di();
            ha.a $$4 = this.d.o();
            if (this.dI().a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               gu $$5 = this.c.di();
               if ($$4 == ha.a.a && $$3.u() == $$5.u() || $$4 == ha.a.c && $$3.w() == $$5.w() || $$4 == ha.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }
   }

   @Override
   protected boolean a(bfj $$0) {
      return super.a($$0) && !$$0.ae;
   }

   @Override
   public boolean bL() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bj() {
      return 1.0F;
   }

   @Override
   protected void a(eef $$0) {
      super.a($$0);
      bfj $$1 = $$0.a();
      bfj $$2 = this.v();
      bfz $$3 = $$2 instanceof bfz ? (bfz)$$2 : null;
      boolean $$4 = $$1.a(this.dJ().a(this, $$3), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bfz $$5) {
            $$5.b(new bfa(bfc.y, 200), (bfj)MoreObjects.firstNonNull($$2, this));
         }
      }
   }

   @Override
   protected void a(eee $$0) {
      super.a($$0);
      ((aif)this.dI()).a(iv.x, this.dn(), this.dp(), this.dt(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(amh.vb, 1.0F, 1.0F);
   }

   private void k() {
      this.ai();
      this.dI().a(dgl.o, this.dg(), dgl.a.a(this));
   }

   @Override
   protected void a(eeg $$0) {
      super.a($$0);
      this.k();
   }

   @Override
   public boolean bo() {
      return true;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (!this.dI().B) {
         this.a(amh.vc, 1.0F, 1.0F);
         ((aif)this.dI()).a(iv.g, this.dn(), this.dp(), this.dt(), 15, 0.2, 0.2, 0.2, 0.0);
         this.k();
      }

      return true;
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      double $$1 = $$0.h();
      double $$2 = $$0.i();
      double $$3 = $$0.j();
      this.o($$1, $$2, $$3);
   }
}
