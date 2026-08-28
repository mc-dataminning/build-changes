import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckd extends cjh implements bym {
   private static final akn<Integer> bI = akr.a(ckd.class, akp.b);
   private static final int bJ = 1024;
   private static final String bK = "stew_effects";
   @Nullable
   private ddc bM;
   @Nullable
   private UUID bN;

   public ckd(bxe<? extends ckd> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iw $$0, dkc $$1) {
      return $$1.a_($$0.e()).a(dng.fE) ? 10.0F : $$1.x($$0);
   }

   public static boolean c(bxe<ckd> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.ce) && a($$1, $$3);
   }

   @Override
   public void a(aru $$0, bxv $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.bN)) {
         this.a(this.t() == ckd.a.a ? ckd.a.b : ckd.a.a);
         this.bN = $$2;
         this.a(awr.pA, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bI, ckd.a.c.h);
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.ph) && !this.n_()) {
         boolean $$3 = false;
         daa $$4;
         if (this.bM != null) {
            $$3 = true;
            $$4 = new daa(dae.xh);
            $$4.b(kl.T, this.bM);
            this.bM = null;
         } else {
            $$4 = new daa(dae.qf);
         }

         daa $$6 = dad.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awq $$7;
         if ($$3) {
            $$7 = awr.pD;
         } else {
            $$7 = awr.pC;
         }

         this.a($$7, 1.0F, 1.0F);
         return but.a;
      } else if ($$2.a(dae.td) && this.a()) {
         if (this.dV() instanceof aru $$9) {
            this.a($$9, aws.h, $$2);
            this.a(egg.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return but.a;
      } else if (this.t() == ckd.a.b) {
         Optional<ddc> $$10 = this.j($$2);
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
               this.a(awr.pB, 2.0F, 1.0F);
            }

            return but.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aru $$0, aws $$1, daa $$2) {
      $$0.a(null, this, awr.pE, $$1, 1.0F, 1.0F);
      this.a(bxe.D, bwp.a(this, false, false), $$2x -> {
         $$0.a(lz.w, this.dA(), this.e(0.5), this.dG(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, faf.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new coe(this.dV(), this.dA(), this.e(1.0), this.dG(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bJ() && !this.n_();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Type", ckd.a.d, this.t());
      $$0.b("stew_effects", ddc.c, this.bM);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckd.a>a("Type", ckd.a.d).orElse(ckd.a.c));
      this.bM = $$0.<ddc>a("stew_effects", ddc.c).orElse(null);
   }

   private Optional<ddc> j(daa $$0) {
      dvq $$1 = dvq.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   private void a(ckd.a $$0) {
      this.al.a(bI, $$0.h);
   }

   public ckd.a t() {
      return ckd.a.a(this.al.a(bI));
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aF ? c((kk<T>)$$0, this.t()) : super.a($$0);
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
   public ckd b(aru $$0, bwl $$1) {
      ckd $$2 = bxe.aF.a($$0, bxd.e);
      if ($$2 != null) {
         $$2.a(this.a((ckd)$$1));
      }

      return $$2;
   }

   private ckd.a a(ckd $$0) {
      ckd.a $$1 = this.t();
      ckd.a $$2 = $$0.t();
      ckd.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == ckd.a.b ? ckd.a.a : ckd.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements bao {
      a("red", 0, dng.cq.m()),
      b("brown", 1, dng.cp.m());

      public static final ckd.a c = a;
      public static final Codec<ckd.a> d = bao.a(ckd.a::values);
      private static final IntFunction<ckd.a> f = ayg.a(ckd.a::b, values(), ayg.a.c);
      public static final za<ByteBuf, ckd.a> e = yy.a(f, ckd.a::b);
      private final String g;
      final int h;
      private final ebg i;

      private a(final String $$0, final int $$1, final ebg $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public ebg a() {
         return this.i;
      }

      @Override
      public String c() {
         return this.g;
      }

      private int b() {
         return this.h;
      }

      static ckd.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
