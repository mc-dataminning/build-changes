import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckm extends cjq implements byv {
   private static final aku<Integer> bI = aky.a(ckm.class, akw.b);
   private static final int bJ = 1024;
   private static final String bK = "stew_effects";
   @Nullable
   private ddm bM;
   @Nullable
   private UUID bN;

   public ckm(bxn<? extends ckm> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return $$1.a_($$0.e()).a(dnq.fE) ? 10.0F : $$1.x($$0);
   }

   public static boolean c(bxn<ckm> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.ce) && a($$1, $$3);
   }

   @Override
   public void a(asb $$0, bye $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.bN)) {
         this.a(this.p() == ckm.a.a ? ckm.a.b : ckm.a.a);
         this.bN = $$2;
         this.a(awy.pA, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bI, ckm.a.c.h);
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.ph) && !this.e_()) {
         boolean $$3 = false;
         dak $$4;
         if (this.bM != null) {
            $$3 = true;
            $$4 = new dak(dao.xh);
            $$4.b(kl.T, this.bM);
            this.bM = null;
         } else {
            $$4 = new dak(dao.qf);
         }

         dak $$6 = dan.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awx $$7;
         if ($$3) {
            $$7 = awy.pD;
         } else {
            $$7 = awy.pC;
         }

         this.a($$7, 1.0F, 1.0F);
         return bvc.a;
      } else if ($$2.a(dao.td) && this.a()) {
         if (this.dV() instanceof asb $$9) {
            this.a($$9, awz.h, $$2);
            this.a(egq.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bvc.a;
      } else if (this.p() == ckm.a.b) {
         Optional<ddm> $$10 = this.j($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.bM != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dV().a(lz.ah, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dV().a(lz.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.bM = $$10.get();
               this.a(awy.pB, 2.0F, 1.0F);
            }

            return bvc.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(asb $$0, awz $$1, dak $$2) {
      $$0.a(null, this, awy.pE, $$1, 1.0F, 1.0F);
      this.a(bxn.D, bwy.a(this, false, false), $$2x -> {
         $$0.a(lz.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, fap.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new coo(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bJ() && !this.e_();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Type", ckm.a.d, this.p());
      $$0.b("stew_effects", ddm.c, this.bM);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckm.a>a("Type", ckm.a.d).orElse(ckm.a.c));
      this.bM = $$0.<ddm>a("stew_effects", ddm.c).orElse(null);
   }

   private Optional<ddm> j(dak $$0) {
      dwa $$1 = dwa.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(ckm.a $$0) {
      this.al.a(bI, $$0.h);
   }

   public ckm.a p() {
      return ckm.a.a(this.al.a(bI));
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aF ? c((kk<T>)$$0, this.p()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aF);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aF) {
         this.a(c(kl.aF, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public ckm b(asb $$0, bwu $$1) {
      ckm $$2 = bxn.aF.a($$0, bxm.e);
      if ($$2 != null) {
         $$2.a(this.a((ckm)$$1));
      }

      return $$2;
   }

   private ckm.a a(ckm $$0) {
      ckm.a $$1 = this.p();
      ckm.a $$2 = $$0.p();
      ckm.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == ckm.a.b ? ckm.a.a : ckm.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bax {
      a("red", 0, dnq.cq.m()),
      b("brown", 1, dnq.cp.m());

      public static final ckm.a c = a;
      public static final Codec<ckm.a> d = bax.a(ckm.a::values);
      private static final IntFunction<ckm.a> f = ayo.a(ckm.a::b, values(), ayo.a.c);
      public static final ze<ByteBuf, ckm.a> e = zc.a(f, ckm.a::b);
      private final String g;
      final int h;
      private final ebq i;

      private a(final String $$0, final int $$1, final ebq $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public ebq a() {
         return this.i;
      }

      @Override
      public String c() {
         return this.g;
      }

      private int b() {
         return this.h;
      }

      static ckm.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
