import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxj extends bxd implements bmc, bmj<bxj.a> {
   private static final afs<String> bT = afv.a(bxj.class, afu.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<ddg.a> bX;
   @Nullable
   private UUID bY;

   public bxj(bkz<? extends bxj> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return $$1.a_($$0.d()).a(cvh.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bkz<bxj> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bS) && a($$1, $$3);
   }

   @Override
   public void a(ami $$0, blk $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.w() == bxj.a.a ? bxj.a.b : bxj.a.a);
         this.bY = $$2;
         this.a(aqv.nD, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, bxj.a.a.d);
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$2.a(clr.pn) && !this.o_()) {
         boolean $$3 = false;
         clo $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new clo(clr.vM);
            cmy.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new clo(clr.po);
         }

         clo $$6 = clq.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aqu $$7;
         if ($$3) {
            $$7 = aqv.nG;
         } else {
            $$7 = aqv.nF;
         }

         this.a($$7, 1.0F, 1.0F);
         return bjb.a(this.dN().B);
      } else if ($$2.a(clr.rS) && this.a()) {
         this.a(aqw.h);
         this.a(dlx.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bjb.a(this.dN().B);
      } else if (this.w() == bxj.a.b && $$2.a(ars.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dN().a(jw.Z, this.ds() + this.ag.j() / 2.0, this.e(0.5), this.dy() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<ddg.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bjb.d;
            }

            if (!$$0.fU().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dN().a(jw.q, this.ds() + this.ag.j() / 2.0, this.e(0.5), this.dy() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(aqv.nE, 2.0F, 1.0F);
         }

         return bjb.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aqw $$0) {
      this.dN().a(null, this, aqv.nH, $$0, 1.0F, 1.0F);
      if (!this.dN().y_()) {
         bxd $$1 = bkz.t.a(this.dN());
         if ($$1 != null) {
            ((ami)this.dN()).a(jw.x, this.ds(), this.e(0.5), this.dy(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$1.c(this.ew());
            $$1.aU = this.aU;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fM()) {
               $$1.fK();
            }

            $$1.m(this.cr());
            this.dN().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dN().b(new cas(this.dN(), this.ds(), this.e(1.0), this.dy(), new clo(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.o_();
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bX != null) {
         ddg.a.b.encodeStart(sr.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a(bxj.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         ddg.a.b.parse(sr.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<ddg.a>> l(clo $$0) {
      ddg $$1 = ddg.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(bxj.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bxj.a w() {
      return bxj.a.a(this.an.b(bT));
   }

   @Nullable
   public bxj c(ami $$0, bkq $$1) {
      bxj $$2 = bkz.ao.a((csf)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bxj)$$1));
      }

      return $$2;
   }

   private bxj.a a(bxj $$0) {
      bxj.a $$1 = this.w();
      bxj.a $$2 = $$0.w();
      bxj.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bxj.a.b ? bxj.a.a : bxj.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements auk {
      a("red", cvh.cg.o()),
      b("brown", cvh.cf.o());

      public static final auk.a<bxj.a> c = auk.a(bxj.a::values);
      final String d;
      final dhn e;

      private a(String $$0, dhn $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dhn a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bxj.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
