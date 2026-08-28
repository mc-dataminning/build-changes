import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjq extends ciu implements bxz {
   private static final akj<Integer> bG = akn.a(cjq.class, akl.b);
   private static final int bH = 1024;
   private static final String bI = "stew_effects";
   @Nullable
   private dcp bK;
   @Nullable
   private UUID bL;

   public cjq(bwr<? extends cjq> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iv $$0, djp $$1) {
      return $$1.a_($$0.e()).a(dmt.fE) ? 10.0F : $$1.x($$0);
   }

   public static boolean c(bwr<cjq> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ce) && a($$1, $$3);
   }

   @Override
   public void a(arq $$0, bxi $$1) {
      UUID $$2 = $$1.cF();
      if (!$$2.equals(this.bL)) {
         this.a(this.t() == cjq.a.a ? cjq.a.b : cjq.a.a);
         this.bL = $$2;
         this.a(awn.pA, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, cjq.a.a.g);
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if ($$2.a(czr.ph) && !this.n_()) {
         boolean $$3 = false;
         czn $$4;
         if (this.bK != null) {
            $$3 = true;
            $$4 = new czn(czr.xh);
            $$4.b(kk.T, this.bK);
            this.bK = null;
         } else {
            $$4 = new czn(czr.qf);
         }

         czn $$6 = czq.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awm $$7;
         if ($$3) {
            $$7 = awn.pD;
         } else {
            $$7 = awn.pC;
         }

         this.a($$7, 1.0F, 1.0F);
         return bug.a;
      } else if ($$2.a(czr.td) && this.a()) {
         if (this.dU() instanceof arq $$9) {
            this.a($$9, awo.h, $$2);
            this.a(eft.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bug.a;
      } else if (this.t() == cjq.a.b) {
         Optional<dcp> $$10 = this.j($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.bK != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dU().a(ly.ah, this.dz() + this.ae.j() / 2.0, this.e(0.5), this.dF() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dU().a(ly.p, this.dz() + this.ae.j() / 2.0, this.e(0.5), this.dF() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.bK = $$10.get();
               this.a(awn.pB, 2.0F, 1.0F);
            }

            return bug.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arq $$0, awo $$1, czn $$2) {
      $$0.a(null, this, awn.pE, $$1, 1.0F, 1.0F);
      this.a(bwr.C, bwc.a(this, false, false), $$2x -> {
         $$0.a(ly.w, this.dz(), this.e(0.5), this.dF(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, ezp.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cnr(this.dU(), this.dz(), this.e(1.0), this.dF(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bI() && !this.n_();
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Type", cjq.a.c, this.t());
      $$0.b("stew_effects", dcp.c, this.bK);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<cjq.a>a("Type", cjq.a.c).orElse(cjq.a.a));
      this.bK = $$0.<dcp>a("stew_effects", dcp.c).orElse(dcp.a);
   }

   private Optional<dcp> j(czn $$0) {
      dvd $$1 = dvd.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(cjq.a $$0) {
      this.al.a(bG, $$0.g);
   }

   public cjq.a t() {
      return cjq.a.a(this.al.a(bG));
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aF ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aF);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aF) {
         this.a(c(kk.aF, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cjq b(arq $$0, bvy $$1) {
      cjq $$2 = bwr.aE.a($$0, bwq.e);
      if ($$2 != null) {
         $$2.a(this.a((cjq)$$1));
      }

      return $$2;
   }

   private cjq.a a(cjq $$0) {
      cjq.a $$1 = this.t();
      cjq.a $$2 = $$0.t();
      cjq.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cjq.a.b ? cjq.a.a : cjq.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bak {
      a("red", 0, dmt.cq.m()),
      b("brown", 1, dmt.cp.m());

      public static final Codec<cjq.a> c = bak.a(cjq.a::values);
      private static final IntFunction<cjq.a> e = ayc.a(cjq.a::b, values(), ayc.a.c);
      public static final yw<ByteBuf, cjq.a> d = yu.a(e, cjq.a::b);
      private final String f;
      final int g;
      private final eat h;

      private a(final String $$0, final int $$1, final eat $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      public eat a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.f;
      }

      private int b() {
         return this.g;
      }

      static cjq.a a(int $$0) {
         return e.apply($$0);
      }
   }
}
