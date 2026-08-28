import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckb extends cjf implements byk {
   private static final akl<Integer> bI = akp.a(ckb.class, akn.b);
   private static final int bJ = 1024;
   private static final String bK = "stew_effects";
   @Nullable
   private dda bM;
   @Nullable
   private UUID bN;

   public ckb(bxc<? extends ckb> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return $$1.a_($$0.e()).a(dne.fE) ? 10.0F : $$1.x($$0);
   }

   public static boolean c(bxc<ckb> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.ce) && a($$1, $$3);
   }

   @Override
   public void a(ars $$0, bxt $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.bN)) {
         this.a(this.t() == ckb.a.a ? ckb.a.b : ckb.a.a);
         this.bN = $$2;
         this.a(awp.pA, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bI, ckb.a.c.h);
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.ph) && !this.n_()) {
         boolean $$3 = false;
         czy $$4;
         if (this.bM != null) {
            $$3 = true;
            $$4 = new czy(dac.xh);
            $$4.b(kk.T, this.bM);
            this.bM = null;
         } else {
            $$4 = new czy(dac.qf);
         }

         czy $$6 = dab.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awo $$7;
         if ($$3) {
            $$7 = awp.pD;
         } else {
            $$7 = awp.pC;
         }

         this.a($$7, 1.0F, 1.0F);
         return bur.a;
      } else if ($$2.a(dac.td) && this.a()) {
         if (this.dV() instanceof ars $$9) {
            this.a($$9, awq.h, $$2);
            this.a(ege.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bur.a;
      } else if (this.t() == ckb.a.b) {
         Optional<dda> $$10 = this.j($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.bM != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dV().a(ly.ah, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dV().a(ly.p, this.dA() + this.ae.j() / 2.0, this.e(0.5), this.dG() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.bM = $$10.get();
               this.a(awp.pB, 2.0F, 1.0F);
            }

            return bur.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ars $$0, awq $$1, czy $$2) {
      $$0.a(null, this, awp.pE, $$1, 1.0F, 1.0F);
      this.a(bxc.D, bwn.a(this, false, false), $$2x -> {
         $$0.a(ly.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, fad.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new coc(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bJ() && !this.n_();
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Type", ckb.a.d, this.t());
      $$0.b("stew_effects", dda.c, this.bM);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<ckb.a>a("Type", ckb.a.d).orElse(ckb.a.c));
      this.bM = $$0.<dda>a("stew_effects", dda.c).orElse(null);
   }

   private Optional<dda> j(czy $$0) {
      dvo $$1 = dvo.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(ckb.a $$0) {
      this.al.a(bI, $$0.h);
   }

   public ckb.a t() {
      return ckb.a.a(this.al.a(bI));
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
   public ckb b(ars $$0, bwj $$1) {
      ckb $$2 = bxc.aF.a($$0, bxb.e);
      if ($$2 != null) {
         $$2.a(this.a((ckb)$$1));
      }

      return $$2;
   }

   private ckb.a a(ckb $$0) {
      ckb.a $$1 = this.t();
      ckb.a $$2 = $$0.t();
      ckb.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == ckb.a.b ? ckb.a.a : ckb.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bam {
      a("red", 0, dne.cq.m()),
      b("brown", 1, dne.cp.m());

      public static final ckb.a c = a;
      public static final Codec<ckb.a> d = bam.a(ckb.a::values);
      private static final IntFunction<ckb.a> f = aye.a(ckb.a::b, values(), aye.a.c);
      public static final yy<ByteBuf, ckb.a> e = yw.a(f, ckb.a::b);
      private final String g;
      final int h;
      private final ebe i;

      private a(final String $$0, final int $$1, final ebe $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public ebe a() {
         return this.i;
      }

      @Override
      public String c() {
         return this.g;
      }

      private int b() {
         return this.h;
      }

      static ckb.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
