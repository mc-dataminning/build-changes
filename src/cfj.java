import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cfj extends blf implements bms {
   @Nullable
   private UUID b;
   @Nullable
   private blf c;
   private boolean d;
   private boolean e;

   cfj(blj<? extends cfj> $$0, csy $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable blf $$0) {
      if ($$0 != null) {
         this.b = $$0.cw();
         this.c = $$0;
      }
   }

   @Nullable
   @Override
   public blf w() {
      if (this.c != null && !this.c.dH()) {
         return this.c;
      } else if (this.b != null && this.dM() instanceof amp $$0) {
         this.c = $$0.a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public blf J() {
      return (blf)MoreObjects.firstNonNull(this.w(), this);
   }

   @Override
   protected void b(sj $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(blf $$0) {
      return $$0.cw().equals(this.b);
   }

   @Override
   protected void a(sj $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
         this.c = null;
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void w(blf $$0) {
      super.w($$0);
      if ($$0 instanceof cfj $$1) {
         this.c = $$1.c;
      }
   }

   @Override
   public void l() {
      if (!this.e) {
         this.a(dmz.K, this.w());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.s();
      }

      super.l();
   }

   private boolean s() {
      blf $$0 = this.w();
      if ($$0 != null) {
         for (blf $$1 : this.dM().a(this, this.cH().b(this.dp()).g(1.0), $$0x -> !$$0x.P_() && $$0x.bt())) {
            if ($$1.cW() == $$0.cW()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      elb $$5 = new elb($$0, $$1, $$2)
         .d()
         .b(this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4), this.ag.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.g($$5);
      double $$6 = $$5.h();
      this.r((float)(aty.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.s((float)(aty.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.N = this.dC();
      this.O = this.dE();
   }

   public void a(blf $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -aty.a($$2 * (float) (Math.PI / 180.0)) * aty.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -aty.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = aty.b($$2 * (float) (Math.PI / 180.0)) * aty.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      elb $$9 = $$0.dp();
      this.g(this.dp().b($$9.c, $$0.aC() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(ekz $$0) {
      ekz.a $$1 = $$0.c();
      if ($$1 == ekz.a.c) {
         this.a((eky)$$0);
         this.dM().a(dmz.J, $$0.e(), dmz.a.a(this, null));
      } else if ($$1 == ekz.a.b) {
         ekx $$2 = (ekx)$$0;
         this.a($$2);
         hv $$3 = $$2.a();
         this.dM().a(dmz.J, $$3, dmz.a.a(this, this.dM().a_($$3)));
      }
   }

   protected void a(eky $$0) {
   }

   protected void a(ekx $$0) {
      dip $$1 = this.dM().a_($$0.a());
      $$1.a(this.dM(), $$1, $$0, this);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.s((float)(aty.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.r((float)(aty.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dE();
         this.N = this.dC();
         this.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
      }
   }

   protected boolean a(blf $$0) {
      if (!$$0.bs()) {
         return false;
      } else {
         blf $$1 = this.w();
         return $$1 == null || this.d || !$$1.y($$0);
      }
   }

   protected void K() {
      elb $$0 = this.dp();
      double $$1 = $$0.h();
      this.s(d(this.O, (float)(aty.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.r(d(this.N, (float)(aty.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while ($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while ($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return aty.i(0.2F, $$0, $$1);
   }

   @Override
   public wu<yo> dj() {
      blf $$0 = this.w();
      return new yp(this, $$0 == null ? 0 : $$0.aj());
   }

   @Override
   public void a(yp $$0) {
      super.a($$0);
      blf $$1 = this.dM().a($$0.o());
      if ($$1 != null) {
         this.b($$1);
      }
   }

   @Override
   public boolean a(csy $$0, hv $$1) {
      blf $$2 = this.w();
      return $$2 instanceof cer ? $$2.a($$0, $$1) : $$2 == null || $$0.Y().b(csu.c);
   }

   public boolean b(csy $$0) {
      return this.ai().a(aru.g) && $$0.Y().b(csu.g);
   }
}
