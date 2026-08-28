import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgi extends cgc implements buv, bve<cgi.a> {
   private static final akg<String> bZ = akk.a(cgi.class, aki.e);
   private static final int ca = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cyp cd;
   @Nullable
   private UUID ce;

   public cgi(btq<? extends cgi> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return $$1.a_($$0.e()).a(dgx.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(btq<cgi> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.cb) && a($$1, $$3);
   }

   @Override
   public void a(arg $$0, bue $$1) {
      UUID $$2 = $$1.cD();
      if (!$$2.equals(this.ce)) {
         this.a(this.t() == cgi.a.a ? cgi.a.b : cgi.a.a);
         this.ce = $$2;
         this.a(awd.oP, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, cgi.a.a.d);
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.ou) && !this.o_()) {
         boolean $$3 = false;
         cvl $$4;
         if (this.cd != null) {
            $$3 = true;
            $$4 = new cvl(cvo.vY);
            $$4.b(kr.J, this.cd);
            this.cd = null;
         } else {
            $$4 = new cvl(cvo.ps);
         }

         cvl $$6 = cvn.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awc $$7;
         if ($$3) {
            $$7 = awd.oS;
         } else {
            $$7 = awd.oR;
         }

         this.a($$7, 1.0F, 1.0F);
         return brk.a;
      } else if ($$2.a(cvo.rW) && this.a()) {
         this.a(awe.h);
         this.a(dyx.M, $$0);
         if (!this.dS().B) {
            $$2.a(1, $$0, d($$1));
         }

         return brk.a;
      } else if (this.t() == cgi.a.b && $$2.a(axb.O)) {
         if (this.cd != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dS().a(ln.ae, this.dx() + this.af.j() / 2.0, this.e(0.5), this.dD() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<cyp> $$10 = this.o($$2);
            if ($$10.isEmpty()) {
               return brk.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dS().a(ln.p, this.dx() + this.af.j() / 2.0, this.e(0.5), this.dD() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.cd = $$10.get();
            this.a(awd.oQ, 2.0F, 1.0F);
         }

         return brk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awe $$0) {
      this.dS().a(null, this, awd.oT, $$0, 1.0F, 1.0F);
      if (!this.dS().w_()) {
         cgc $$1 = btq.w.a(this.dS(), btp.i);
         if ($$1 != null) {
            ((arg)this.dS()).a(ln.w, this.dx(), this.e(0.5), this.dD(), 1, 0.0, 0.0, 0.0, 0.0);
            this.as();
            $$1.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$1.x(this.eA());
            $$1.aU = this.aU;
            if (this.ak()) {
               $$1.b(this.al());
               $$1.p(this.cI());
            }

            if (this.fX()) {
               $$1.fV();
            }

            $$1.n(this.cz());
            this.dS().b($$1);
            this.a(this.t().b(), $$0x -> {
               for (int $$1x = 0; $$1x < $$0x.J(); $$1x++) {
                  this.dS().b(new cjz(this.dS(), this.dx(), this.e(1.0), this.dD(), $$0x.c(1)));
               }
            });
         }
      }
   }

   @Override
   public boolean a() {
      return this.bI() && !this.o_();
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cd != null) {
         cyp.b.encodeStart(ut.a, this.cd).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgi.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cyp.b.parse(ut.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cd = $$0x);
      }
   }

   private Optional<cyp> o(cvl $$0) {
      doy $$1 = doy.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cgi.a $$0) {
      this.am.a(bZ, $$0.d);
   }

   public cgi.a t() {
      return cgi.a.a(this.am.a(bZ));
   }

   @Nullable
   public cgi c(arg $$0, btc $$1) {
      cgi $$2 = btq.as.a($$0, btp.e);
      if ($$2 != null) {
         $$2.a(this.a((cgi)$$1));
      }

      return $$2;
   }

   private cgi.a a(cgi $$0) {
      cgi.a $$1 = this.t();
      cgi.a $$2 = $$0.t();
      cgi.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == cgi.a.b ? cgi.a.a : cgi.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azy {
      a("red", dgx.cg.o(), esp.aP),
      b("brown", dgx.cf.o(), esp.aQ);

      public static final azy.a<cgi.a> c = azy.a(cgi.a::values);
      final String d;
      private final dua e;
      private final ala<esy> f;

      private a(final String $$0, final dua $$1, final ala<esy> $$2) {
         this.d = $$0;
         this.e = $$1;
         this.f = $$2;
      }

      public dua a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      public ala<esy> b() {
         return this.f;
      }

      static cgi.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
