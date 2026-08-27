import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cce extends bii implements bjv {
   @Nullable
   private UUID b;
   @Nullable
   private bii c;
   private boolean d;
   private boolean e;

   cce(bim<? extends cce> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bii $$0) {
      if ($$0 != null) {
         this.b = $$0.cv();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public bii v() {
      if (this.c != null && !this.c.dF()) {
         return this.c;
      } else if (this.b != null && this.dK() instanceof akk) {
         this.c = ((akk)this.dK()).a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bii A() {
      return (bii)MoreObjects.firstNonNull(this.v(), this);
   }

   @Override
   protected void b(qr $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(bii $$0) {
      return $$0.cv().equals(this.b);
   }

   @Override
   protected void a(qr $$0) {
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
         this.a(djj.K, this.v());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.m();
      }

      super.l();
   }

   private boolean m() {
      bii $$0 = this.v();
      if ($$0 != null) {
         for (bii $$1 : this.dK().a(this, this.cG().b(this.dn()).g(1.0), $$0x -> !$$0x.G_() && $$0x.br())) {
            if ($$1.cV() == $$0.cV()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      ehd $$5 = new ehd($$0, $$1, $$2)
         .d()
         .b(this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.f($$5);
      double $$6 = $$5.h();
      this.r((float)(arp.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(arp.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dA();
      this.O = this.dC();
   }

   public void a(bii $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -arp.a($$2 * (float) (Math.PI / 180.0)) * arp.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -arp.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = arp.b($$2 * (float) (Math.PI / 180.0)) * arp.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      ehd $$9 = $$0.dn();
      this.f(this.dn().b($$9.c, $$0.aA() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(ehb $$0) {
      ehb.a $$1 = $$0.c();
      if ($$1 == ehb.a.c) {
         this.a((eha)$$0);
         this.dK().a(djj.J, $$0.e(), djj.a.a(this, null));
      } else if ($$1 == ehb.a.b) {
         egz $$2 = (egz)$$0;
         this.a($$2);
         gu $$3 = $$2.a();
         this.dK().a(djj.J, $$3, djj.a.a(this, this.dK().a_($$3)));
      }
   }

   protected void a(eha $$0) {
   }

   protected void a(egz $$0) {
      dez $$1 = this.dK().a_($$0.a());
      $$1.a(this.dK(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(arp.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(arp.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dC();
         this.N = this.dA();
         this.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
      }
   }

   protected boolean a(bii $$0) {
      if (!$$0.bq()) {
         return false;
      } else {
         bii $$1 = this.v();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void B() {
      ehd $$0 = this.dn();
      double $$1 = $$0.h();
      this.s(d(this.O, (float)(arp.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.N, (float)(arp.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return arp.i(0.2F, $$0, $$1);
   }

   @Override
   public ux<wp> U() {
      bii $$0 = this.v();
      return new wq(this, $$0 == null ? 0 : $$0.ah());
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      bii $$1 = this.dK().a($$0.o());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(cpl $$0, gu $$1) {
      bii $$2 = this.v();
      return $$2 instanceof cbm ? $$2.a($$0, $$1) : $$2 == null || $$0.X().b(cph.c);
   }
}
