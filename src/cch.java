import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cch extends bil implements bjy {
   @Nullable
   private UUID b;
   @Nullable
   private bil c;
   private boolean d;
   private boolean e;

   cch(bip<? extends cch> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bil $$0) {
      if ($$0 != null) {
         this.b = $$0.cv();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bil v() {
      if (this.c != null && !this.c.dF()) {
         return this.c;
      } else if (this.b != null && this.dK() instanceof akn) {
         this.c = ((akn)this.dK()).a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bil A() {
      return (bil)MoreObjects.firstNonNull(this.v(), this);
   }

   @Override
   protected void b(qu $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(bil $$0) {
      return $$0.cv().equals(this.b);
   }

   @Override
   protected void a(qu $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(djo.K, this.v());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.m();
      }

      super.l();
   }

   private boolean m() {
      bil $$0 = this.v();
      if ($$0 != null) {
         for (bil $$1 : this.dK().a(this, this.cG().b(this.dn()).g(1.0), $$0x -> !$$0x.G_() && $$0x.br())) {
            if ($$1.cV() == $$0.cV()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ehi $$5 = new ehi($$0, $$1, $$2)
         .d()
         .b(this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.f($$5);
      double $$6 = $$5.h();
      this.r((float)(ars.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(ars.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dA();
      this.O = this.dC();
   }

   public void a(bil $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ars.a($$2 * (float) (Math.PI / 180.0)) * ars.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ars.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ars.b($$2 * (float) (Math.PI / 180.0)) * ars.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ehi $$9 = $$0.dn();
      this.f(this.dn().b($$9.c, $$0.aA() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(ehg $$0) {
      ehg.a $$1 = $$0.c();
      if ($$1 == ehg.a.c) {
         this.a((ehf)$$0);
         this.dK().a(djo.J, $$0.e(), djo.a.a(this, null));
      } else if ($$1 == ehg.a.b) {
         ehe $$2 = (ehe)$$0;
         this.a($$2);
         gw $$3 = $$2.a();
         this.dK().a(djo.J, $$3, djo.a.a(this, this.dK().a_($$3)));
      }
   }

   protected void a(ehf $$0) {
   }

   protected void a(ehe $$0) {
      dfe $$1 = this.dK().a_($$0.a());
      $$1.a(this.dK(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(ars.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(ars.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dC();
         this.N = this.dA();
         this.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
      }
   }

   protected boolean a(bil $$0) {
      if (!$$0.bq()) {
         return false;
      } else {
         bil $$1 = this.v();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void B() {
      ehi $$0 = this.dn();
      double $$1 = $$0.h();
      this.s(d(this.O, (float)(ars.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.N, (float)(ars.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ars.i(0.2F, $$0, $$1);
   }

   @Override
   public va<ws> U() {
      bil $$0 = this.v();
      return new wt(this, $$0 == null ? 0 : $$0.ah());
   }

   @Override
   public void a(wt $$0) {
      super.a($$0);
      bil $$1 = this.dK().a($$0.o());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(cpq $$0, gw $$1) {
      bil $$2 = this.v();
      return $$2 instanceof cbp ? $$2.a($$0, $$1) : $$2 == null || $$0.X().b(cpm.c);
   }
}
