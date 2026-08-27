import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cbq extends cbk implements bqe, bqn<cbq.a> {
   private static final aim<String> bX = aiq.a(cbq.class, aio.e);
   private static final int bY = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private List<dib.a> cb;
   @Nullable
   private UUID cc;

   public cbq(bpc<? extends cbq> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ib $$0, cxc $$1) {
      return $$1.a_($$0.d()).a(dac.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bpc<cbq> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bU) && a($$1, $$3);
   }

   @Override
   public void a(apf $$0, bpn $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.cc)) {
         this.a(this.s() == cbq.a.a ? cbq.a.b : cbq.a.a);
         this.cc = $$2;
         this.a(aty.oq, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bX, cbq.a.a.d);
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if ($$2.a(cqn.pp) && !this.o_()) {
         boolean $$3 = false;
         cqk $$4;
         if (this.cb != null) {
            $$3 = true;
            $$4 = new cqk(cqn.vR);
            cru.a($$4, this.cb);
            this.cb = null;
         } else {
            $$4 = new cqk(cqn.pq);
         }

         cqk $$6 = cqm.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         atx $$7;
         if ($$3) {
            $$7 = aty.ot;
         } else {
            $$7 = aty.os;
         }

         this.a($$7, 1.0F, 1.0F);
         return bnc.a(this.dM().B);
      } else if ($$2.a(cqn.rU) && this.a()) {
         this.a(atz.h);
         this.a(drn.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bnc.a(this.dM().B);
      } else if (this.s() == cbq.a.b && $$2.a(auv.O)) {
         if (this.cb != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(kc.ac, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dib.a>> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bnc.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(kc.q, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.cb = $$10.get();
            this.a(aty.or, 2.0F, 1.0F);
         }

         return bnc.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atz $$0) {
      this.dM().a(null, this, aty.ou, $$0, 1.0F, 1.0F);
      if (!this.dM().x_()) {
         cbk $$1 = bpc.w.a(this.dM());
         if ($$1 != null) {
            ((apf)this.dM()).a(kc.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
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
               this.dM().b(new cfd(this.dM(), this.dr(), this.e(1.0), this.dx(), new cqk(this.s().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bA() && !this.o_();
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Type", this.s().c());
      if (this.cb != null) {
         dib.a.b.encodeStart(to.a, this.cb).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(cbq.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dib.a.b.parse(to.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.cb = $$0x);
      }
   }

   private Optional<List<dib.a>> n(cqk $$0) {
      dib $$1 = dib.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cbq.a $$0) {
      this.an.a(bX, $$0.d);
   }

   public cbq.a s() {
      return cbq.a.a(this.an.a(bX));
   }

   @Nullable
   public cbq c(apf $$0, bor $$1) {
      cbq $$2 = bpc.ar.a((cwz)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cbq)$$1));
      }

      return $$2;
   }

   private cbq.a a(cbq $$0) {
      cbq.a $$1 = this.s();
      cbq.a $$2 = $$0.s();
      cbq.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == cbq.a.b ? cbq.a.a : cbq.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements axq {
      a("red", dac.cg.o()),
      b("brown", dac.cf.o());

      public static final axq.a<cbq.a> c = axq.a(cbq.a::values);
      final String d;
      final dmz e;

      private a(String $$0, dmz $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dmz a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cbq.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
