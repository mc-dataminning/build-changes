import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class ccq extends cck implements bre, brn<ccq.a> {
   private static final aiy<String> bX = ajc.a(ccq.class, aja.e);
   private static final int bY = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private cui cb;
   @Nullable
   private UUID cc;

   public ccq(bqb<? extends ccq> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ib $$0, cza $$1) {
      return $$1.a_($$0.d()).a(dca.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bqb<ccq> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.bU) && a($$1, $$3);
   }

   @Override
   public void a(aps $$0, bqn $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.cc)) {
         this.a(this.u() == ccq.a.a ? ccq.a.b : ccq.a.a);
         this.cc = $$2;
         this.a(aum.ow, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bX, ccq.a.a.d);
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.pp) && !this.p_()) {
         boolean $$3 = false;
         crj $$4;
         if (this.cb != null) {
            $$3 = true;
            $$4 = new crj(crm.vS);
            $$4.b(jp.y, this.cb);
            this.cb = null;
         } else {
            $$4 = new crj(crm.pq);
         }

         crj $$6 = crl.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aul $$7;
         if ($$3) {
            $$7 = aum.oz;
         } else {
            $$7 = aum.oy;
         }

         this.a($$7, 1.0F, 1.0F);
         return boa.a(this.dM().B);
      } else if ($$2.a(crm.rU) && this.a()) {
         this.a(aun.h);
         this.a(dts.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return boa.a(this.dM().B);
      } else if (this.u() == ccq.a.b && $$2.a(avk.O)) {
         if (this.cb != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(kl.ac, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<cui> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return boa.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(kl.q, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.cb = $$10.get();
            this.a(aum.ox, 2.0F, 1.0F);
         }

         return boa.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aun $$0) {
      this.dM().a(null, this, aum.oA, $$0, 1.0F, 1.0F);
      if (!this.dM().x_()) {
         cck $$1 = bqb.w.a(this.dM());
         if ($$1 != null) {
            ((aps)this.dM()).a(kl.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.t(this.ex());
            $$1.aX = this.aX;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fU()) {
               $$1.fS();
            }

            $$1.m(this.cr());
            this.dM().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dM().b(new cgd(this.dM(), this.dr(), this.e(1.0), this.dx(), new crj(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bA() && !this.p_();
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.cb != null) {
         cui.b.encodeStart(ua.a, this.cb).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a(ccq.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cui.b.parse(ua.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.cb = $$0x);
      }
   }

   private Optional<cui> n(crj $$0) {
      djz $$1 = djz.a($$0.f());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(ccq.a $$0) {
      this.an.a(bX, $$0.d);
   }

   public ccq.a u() {
      return ccq.a.a(this.an.a(bX));
   }

   @Nullable
   public ccq c(aps $$0, bpp $$1) {
      ccq $$2 = bqb.ar.a((cyx)$$0);
      if ($$2 != null) {
         $$2.a(this.a((ccq)$$1));
      }

      return $$2;
   }

   private ccq.a a(ccq $$0) {
      ccq.a $$1 = this.u();
      ccq.a $$2 = $$0.u();
      ccq.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == ccq.a.b ? ccq.a.a : ccq.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements aye {
      a("red", dca.cg.n()),
      b("brown", dca.cf.n());

      public static final aye.a<ccq.a> c = aye.a(ccq.a::values);
      final String d;
      final doz e;

      private a(String $$0, doz $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public doz a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static ccq.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
