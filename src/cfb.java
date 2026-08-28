import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfb extends cev implements btp, bty<cfb.a> {
   private static final ajp<String> ca = ajt.a(cfb.class, ajr.e);
   private static final int cb = 1024;
   private static final String cd = "stew_effects";
   @Nullable
   private cxd ce;
   @Nullable
   private UUID cf;

   public cfb(bsj<? extends cfb> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      return $$1.a_($$0.d()).a(dfh.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsj<cfb> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.ca) && a($$1, $$3);
   }

   @Override
   public void a(aqk $$0, bsx $$1) {
      UUID $$2 = $$1.cz();
      if (!$$2.equals(this.cf)) {
         this.a(this.u() == cfb.a.a ? cfb.a.b : cfb.a.a);
         this.cf = $$2;
         this.a(avf.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, cfb.a.a.d);
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.pq) && !this.p_()) {
         boolean $$3 = false;
         cua $$4;
         if (this.ce != null) {
            $$3 = true;
            $$4 = new cua(cud.vX);
            $$4.b(kn.H, this.ce);
            this.ce = null;
         } else {
            $$4 = new cua(cud.pr);
         }

         cua $$6 = cuc.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         ave $$7;
         if ($$3) {
            $$7 = avf.oR;
         } else {
            $$7 = avf.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqd.a(this.dP().B);
      } else if ($$2.a(cud.rV) && this.a()) {
         this.a(avg.h);
         this.a(dxa.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqd.a(this.dP().B);
      } else if (this.u() == cfb.a.b && $$2.a(awd.O)) {
         if (this.ce != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dP().a(lj.ae, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxd> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqd.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dP().a(lj.p, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.ce = $$10.get();
            this.a(avf.oP, 2.0F, 1.0F);
         }

         return bqd.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avg $$0) {
      this.dP().a(null, this, avf.oS, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         cev $$1 = bsj.w.a(this.dP());
         if ($$1 != null) {
            ((aqk)this.dP()).a(lj.w, this.du(), this.e(0.5), this.dA(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ao();
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.u(this.ew());
            $$1.aY = this.aY;
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            if (this.fS()) {
               $$1.fQ();
            }

            $$1.n(this.cu());
            this.dP().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dP().b(new cir(this.dP(), this.du(), this.e(1.0), this.dA(), new cua(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bD() && !this.p_();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.ce != null) {
         cxd.b.encodeStart(ul.a, this.ce).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfb.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxd.b.parse(ul.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.ce = $$0x);
      }
   }

   private Optional<cxd> n(cua $$0) {
      dnh $$1 = dnh.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cfb.a $$0) {
      this.ao.a(ca, $$0.d);
   }

   public cfb.a u() {
      return cfb.a.a(this.ao.a(ca));
   }

   @Nullable
   public cfb c(aqk $$0, brx $$1) {
      cfb $$2 = bsj.as.a((dcd)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cfb)$$1));
      }

      return $$2;
   }

   private cfb.a a(cfb $$0) {
      cfb.a $$1 = this.u();
      cfb.a $$2 = $$0.u();
      cfb.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cfb.a.b ? cfb.a.a : cfb.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ayz {
      a("red", dfh.cg.o()),
      b("brown", dfh.cf.o());

      public static final ayz.a<cfb.a> c = ayz.a(cfb.a::values);
      final String d;
      final dsh e;

      private a(final String $$0, final dsh $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dsh a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cfb.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
