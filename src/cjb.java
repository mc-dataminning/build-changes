import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjb extends ciw implements bxp {
   private static final akh<Integer> bF = akl.a(cjb.class, akj.b);
   private static final int bG = 1024;
   private static final String bH = "stew_effects";
   @Nullable
   private dbu bJ;
   @Nullable
   private UUID bK;

   public cjb(bwj<? extends cjb> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return $$1.a_($$0.e()).a(dlw.fA) ? 10.0F : $$1.x($$0);
   }

   public static boolean c(bwj<cjb> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.cd) && a($$1, $$3);
   }

   @Override
   public void a(aro $$0, bwy $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.bK)) {
         this.a(this.t() == cjb.a.a ? cjb.a.b : cjb.a.a);
         this.bK = $$2;
         this.a(awl.pw, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bF, cjb.a.a.g);
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.pc) && !this.n_()) {
         boolean $$3 = false;
         cys $$4;
         if (this.bJ != null) {
            $$3 = true;
            $$4 = new cys(cyw.xa);
            $$4.b(kj.T, this.bJ);
            this.bJ = null;
         } else {
            $$4 = new cys(cyw.qa);
         }

         cys $$6 = cyv.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awk $$7;
         if ($$3) {
            $$7 = awl.pz;
         } else {
            $$7 = awl.py;
         }

         this.a($$7, 1.0F, 1.0F);
         return bty.a;
      } else if ($$2.a(cyw.sW) && this.a()) {
         if (this.dV() instanceof aro $$9) {
            this.a($$9, awm.h, $$2);
            this.a(eeo.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bty.a;
      } else if (this.t() == cjb.a.b) {
         Optional<dbu> $$10 = this.j($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.bJ != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dV().a(lx.ah, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dV().a(lx.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.bJ = $$10.get();
               this.a(awl.px, 2.0F, 1.0F);
            }

            return bty.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aro $$0, awm $$1, cys $$2) {
      $$0.a(null, this, awl.pA, $$1, 1.0F, 1.0F);
      this.a(bwj.C, bvu.a(this, false, false), $$2x -> {
         $$0.a(lx.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, eyj.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cmx(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bK() && !this.n_();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bJ != null) {
         dbu.c.encodeStart(ul.a, this.bJ).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cjb.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dbu.c.parse(ul.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.bJ = $$0x);
      }
   }

   private Optional<dbu> j(cys $$0) {
      duc $$1 = duc.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(cjb.a $$0) {
      this.al.a(bF, $$0.g);
   }

   public cjb.a t() {
      return cjb.a.a(this.al.a(bF));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aE ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aE);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aE) {
         this.a(c(kj.aE, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cjb c(aro $$0, bvq $$1) {
      cjb $$2 = bwj.aE.a($$0, bwi.e);
      if ($$2 != null) {
         $$2.a(this.a((cjb)$$1));
      }

      return $$2;
   }

   private cjb.a a(cjb $$0) {
      cjb.a $$1 = this.t();
      cjb.a $$2 = $$0.t();
      cjb.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cjb.a.b ? cjb.a.a : cjb.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bai {
      a("red", 0, dlw.cn.m()),
      b("brown", 1, dlw.cm.m());

      public static final bai.a<cjb.a> c = bai.a(cjb.a::values);
      private static final IntFunction<cjb.a> e = aya.a(cjb.a::b, values(), aya.a.c);
      public static final yu<ByteBuf, cjb.a> d = ys.a(e, cjb.a::b);
      private final String f;
      final int g;
      private final dzo h;

      private a(final String $$0, final int $$1, final dzo $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      public dzo a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.f;
      }

      private int b() {
         return this.g;
      }

      static cjb.a a(String $$0) {
         return c.a($$0, a);
      }

      static cjb.a a(int $$0) {
         return e.apply($$0);
      }
   }
}
