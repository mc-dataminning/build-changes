import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cfz extends blu implements bnh {
   @Nullable
   private UUID b;
   @Nullable
   private blu c;
   private boolean d;
   private boolean e;

   cfz(bly<? extends cfz> $$0, cto $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable blu $$0) {
      if ($$0 != null) {
         this.b = $$0.cw();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public blu w() {
      if (this.c != null && !this.c.dH()) {
         return this.c;
      } else if (this.b != null && this.dM() instanceof and $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public blu J() {
      return (blu)MoreObjects.firstNonNull(this.w(), this);
   }

   @Override
   protected void b(sn $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(blu $$0) {
      return $$0.cw().equals(this.b);
   }

   @Override
   protected void a(sn $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(blu $$0) {
      super.w($$0);
      if ($$0 instanceof cfz $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dnq.K, this.w());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.s();
      }

      super.l();
   }

   private boolean s() {
      blu $$0 = this.w();
      if ($$0 != null) {
         for (blu $$1 : this.dM().a(this, this.cH().b(this.dp()).g(1.0), $$0x -> !$$0x.P_() && $$0x.bt())) {
            if ($$1.cW() == $$0.cW()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      els $$5 = new els($$0, $$1, $$2)
         .d()
         .b(this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(aun.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(aun.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   public void a(blu $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -aun.a($$2 * (float) (Math.PI / 180.0)) * aun.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -aun.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = aun.b($$2 * (float) (Math.PI / 180.0)) * aun.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      els $$9 = $$0.dp();
      this.g(this.dp().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(elq $$0) {
      elq.a $$1 = $$0.c();
      if ($$1 == elq.a.c) {
         this.a((elp)$$0);
         this.dM().a(dnq.J, $$0.e(), dnq.a.a(this, null));
      } else if ($$1 == elq.a.b) {
         elo $$2 = (elo)$$0;
         this.a($$2);
         hx $$3 = $$2.a();
         this.dM().a(dnq.J, $$3, dnq.a.a(this, this.dM().a_($$3)));
      }
   }

   protected void a(elp $$0) {
   }

   protected void a(elo $$0) {
      djg $$1 = this.dM().a_($$0.a());
      $$1.a(this.dM(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(aun.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(aun.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dE();
         this.N = this.dC();
         this.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   protected boolean a(blu $$0) {
      if (!$$0.bs()) {
         return false;
      } else {
         blu $$1 = this.w();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void K() {
      els $$0 = this.dp();
      double $$1 = $$0.h();
      this.s(d(this.O, (float)(aun.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.N, (float)(aun.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return aun.i(0.2F, $$0, $$1);
   }

   @Override
   public xf<za> dj() {
      blu $$0 = this.w();
      return new zb(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      blu $$1 = this.dM().a($$0.o());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(cto $$0, hx $$1) {
      blu $$2 = this.w();
      return $$2 instanceof cfh ? $$2.a($$0, $$1) : $$2 == null || $$0.Z().b(ctk.c);
   }

   public boolean b(cto $$0) {
      return this.ai().a(asj.g) && $$0.Z().b(ctk.g);
   }
}
