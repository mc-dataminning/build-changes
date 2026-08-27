import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cdg extends cda implements bru, bsd<cdg.a> {
   private static final ajk<String> bY = ajo.a(cdg.class, ajm.e);
   private static final int bZ = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cvf cc;
   @Nullable
   private UUID cd;

   public cdg(bqr<? extends cdg> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(im $$0, czx $$1) {
      return $$1.a_($$0.d()).a(dcx.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bqr<cdg> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.a_($$3.d()).a(avo.bU) && a($$1, $$3);
   }

   @Override
   public void a(aqe $$0, brd $$1) {
      UUID $$2 = $$1.cx();
      if (!$$2.equals(this.cd)) {
         this.a(this.u() == cdg.a.a ? cdg.a.b : cdg.a.a);
         this.cd = $$2;
         this.a(auz.oD, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bY, cdg.a.a.d);
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.pq) && !this.p_()) {
         boolean $$3 = false;
         csd $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new csd(csg.vU);
            $$4.b(jz.y, this.cc);
            this.cc = null;
         } else {
            $$4 = new csd(csg.pr);
         }

         csd $$6 = csf.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         auy $$7;
         if ($$3) {
            $$7 = auz.oG;
         } else {
            $$7 = auz.oF;
         }

         this.a($$7, 1.0F, 1.0F);
         return boq.a(this.dN().B);
      } else if ($$2.a(csg.rV) && this.a()) {
         this.a(ava.h);
         this.a(dur.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, d($$1));
         }

         return boq.a(this.dN().B);
      } else if (this.u() == cdg.a.b && $$2.a(avw.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dN().a(kw.ab, this.ds() + this.ah.j() / 2.0, this.e(0.5), this.dy() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cvf> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return boq.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dN().a(kw.p, this.ds() + this.ah.j() / 2.0, this.e(0.5), this.dy() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(auz.oE, 2.0F, 1.0F);
         }

         return boq.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ava $$0) {
      this.dN().a(null, this, auz.oH, $$0, 1.0F, 1.0F);
      if (!this.dN().x_()) {
         cda $$1 = bqr.w.a(this.dN());
         if ($$1 != null) {
            ((aqe)this.dN()).a(kw.w, this.ds(), this.e(0.5), this.dy(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$1.t(this.ey());
            $$1.aZ = this.aZ;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.o(this.cC());
            }

            if (this.fV()) {
               $$1.fT();
            }

            $$1.n(this.cs());
            this.dN().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dN().b(new cgv(this.dN(), this.ds(), this.e(1.0), this.dy(), new csd(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bB() && !this.p_();
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.cc != null) {
         cvf.b.encodeStart(um.a, this.cc).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a(cdg.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cvf.b.parse(um.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cvf> n(csd $$0) {
      dkx $$1 = dkx.a($$0.f());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cdg.a $$0) {
      this.ao.a(bY, $$0.d);
   }

   public cdg.a u() {
      return cdg.a.a(this.ao.a(bY));
   }

   @Nullable
   public cdg c(aqe $$0, bqf $$1) {
      cdg $$2 = bqr.ar.a((czu)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cdg)$$1));
      }

      return $$2;
   }

   private cdg.a a(cdg $$0) {
      cdg.a $$1 = this.u();
      cdg.a $$2 = $$0.u();
      cdg.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cdg.a.b ? cdg.a.a : cdg.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ayq {
      a("red", dcx.cg.n()),
      b("brown", dcx.cf.n());

      public static final ayq.a<cdg.a> c = ayq.a(cdg.a::values);
      final String d;
      final dpy e;

      private a(String $$0, dpy $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dpy a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cdg.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
