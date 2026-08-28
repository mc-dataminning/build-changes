import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cit extends cin implements bxh {
   private static final akg<Integer> bE = akk.a(cit.class, aki.b);
   private static final int bF = 1024;
   private static final String bG = "stew_effects";
   @Nullable
   private daw bI;
   @Nullable
   private UUID bJ;

   public cit(bwb<? extends cit> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return $$1.a_($$0.e()).a(dkw.fA) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bwb<cit> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.cd) && a($$1, $$3);
   }

   @Override
   public void a(arn $$0, bwq $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.bJ)) {
         this.a(this.t() == cit.a.a ? cit.a.b : cit.a.a);
         this.bJ = $$2;
         this.a(awk.pw, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, cit.a.a.g);
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.pc) && !this.n_()) {
         boolean $$3 = false;
         cxy $$4;
         if (this.bI != null) {
            $$3 = true;
            $$4 = new cxy(cyc.xa);
            $$4.b(kx.T, this.bI);
            this.bI = null;
         } else {
            $$4 = new cxy(cyc.qa);
         }

         cxy $$6 = cyb.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awj $$7;
         if ($$3) {
            $$7 = awk.pz;
         } else {
            $$7 = awk.py;
         }

         this.a($$7, 1.0F, 1.0F);
         return btq.a;
      } else if ($$2.a(cyc.sW) && this.a()) {
         if (this.dV() instanceof arn $$9) {
            this.a($$9, awl.h, $$2);
            this.a(edm.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return btq.a;
      } else if (this.t() == cit.a.b) {
         Optional<daw> $$10 = this.j($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.bI != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dV().a(lv.ah, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dV().a(lv.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.bI = $$10.get();
               this.a(awk.px, 2.0F, 1.0F);
            }

            return btq.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arn $$0, awl $$1, cxy $$2) {
      $$0.a(null, this, awk.pA, $$1, 1.0F, 1.0F);
      this.a(bwb.C, bvm.a(this, false, false), $$2x -> {
         $$0.a(lv.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, exh.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cmn(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bK() && !this.n_();
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bI != null) {
         daw.c.encodeStart(uk.a, this.bI).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(cit.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         daw.c.parse(uk.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.bI = $$0x);
      }
   }

   private Optional<daw> j(cxy $$0) {
      dtc $$1 = dtc.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(cit.a $$0) {
      this.al.a(bE, $$0.g);
   }

   public cit.a t() {
      return cit.a.a(this.al.a(bE));
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aB ? b((kw<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aB);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aB) {
         this.a(b(kx.aB, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   @Nullable
   public cit c(arn $$0, bvi $$1) {
      cit $$2 = bwb.aE.a($$0, bwa.e);
      if ($$2 != null) {
         $$2.a(this.a((cit)$$1));
      }

      return $$2;
   }

   private cit.a a(cit $$0) {
      cit.a $$1 = this.t();
      cit.a $$2 = $$0.t();
      cit.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cit.a.b ? cit.a.a : cit.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bag {
      a("red", 0, dkw.cn.m()),
      b("brown", 1, dkw.cm.m());

      public static final bag.a<cit.a> c = bag.a(cit.a::values);
      private static final IntFunction<cit.a> e = aya.a(cit.a::b, values(), aya.a.c);
      public static final yt<ByteBuf, cit.a> d = yr.a(e, cit.a::b);
      private final String f;
      final int g;
      private final dym h;

      private a(final String $$0, final int $$1, final dym $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      public dym a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.f;
      }

      private int b() {
         return this.g;
      }

      static cit.a a(String $$0) {
         return c.a($$0, a);
      }

      static cit.a a(int $$0) {
         return e.apply($$0);
      }
   }
}
