import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bvw extends bvb {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private ary h;
   private final Set<bvb> i = Sets.newHashSet();
   private int j;

   public bvw(bvi<? extends bvw> $$0, dgz $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public aww dn() {
      return aww.d;
   }

   @Nullable
   public ary l() {
      return this.h;
   }

   public void b(@Nullable ary $$0) {
      this.h = $$0;
   }

   private void s() {
      jh $$0 = this.t();
      dxo $$1 = this.dW().a_($$0);
      if ($$1.a(dkf.sU)) {
         ((dou)$$1.b()).e($$1, this.dW(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dW().B_()) {
            this.dW().a(this.dB(), this.dD(), this.dH(), awv.ou, aww.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dW().a(this.dB(), this.dD(), this.dH(), awv.ot, aww.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            bsx $$0 = this.dW().am();
            if ($$0 == bsx.c || $$0 == bsx.d) {
               this.b(4);
            }

            this.s();
            a(this.dW(), this.t());
            this.a(eck.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dW() instanceof arx) {
               List<bvb> $$1 = this.dW()
                  .a(
                     this,
                     new fbm(this.dB() - 15.0, this.dD() - 15.0, this.dH() - 15.0, this.dB() + 15.0, this.dD() + 6.0 + 15.0, this.dH() + 15.0),
                     $$0 -> $$0.bL() && !this.i.contains($$0)
                  );

               for (ary $$2 : ((arx)this.dW()).a($$0 -> $$0.f(this) < 256.0F)) {
                  ao.V.a($$2, this, $$1);
               }
            }

            this.at();
         } else if (this.e < -this.ae.a(10)) {
            this.f--;
            this.e = 1;
            this.a = this.ae.g();
            this.b(0);
         }
      }

      if (this.e >= 0) {
         if (!(this.dW() instanceof arx)) {
            this.dW().c(2);
         } else if (!this.g) {
            List<bvb> $$3 = this.dW()
               .a(this, new fbm(this.dB() - 3.0, this.dD() - 3.0, this.dH() - 3.0, this.dB() + 3.0, this.dD() + 6.0 + 3.0, this.dH() + 3.0), bvb::bL);

            for (bvb $$4 : $$3) {
               $$4.a((arx)this.dW(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               ao.F.a(this.h, $$3);
            }
         }
      }
   }

   private jh t() {
      fbr $$0 = this.du();
      return jh.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dW() instanceof arx $$1 && $$1.O().b(dgv.b)) {
         jh $$3 = this.dw();
         dxo $$4 = djq.a(this.dW(), $$3);
         if (this.dW().a_($$3).l() && $$4.a((dhc)this.dW(), $$3)) {
            this.dW().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            jh $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = djq.a(this.dW(), $$6);
            if (this.dW().a_($$6).l() && $$4.a((dhc)this.dW(), $$6)) {
               this.dW().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void a(dgz $$0, jh $$1) {
      dxo $$2 = $$0.a_($$1);
      jh $$3;
      dxo $$4;
      if ($$2.a(dkf.sU)) {
         $$3 = $$1.a($$2.c(dou.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dtn) {
         $$0.b($$3, dtn.c($$0.a_($$3)));
         jh.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dgz $$0, jh $$1, jh.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<jh> $$5 = b($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<jh> b(dgz $$0, jh $$1) {
      for (jh $$2 : jh.a($$0.A, 10, $$1, 1)) {
         dxo $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dtn) {
            dtn.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akw.a $$0) {
   }

   @Override
   protected void a(um $$0) {
   }

   @Override
   protected void b(um $$0) {
   }

   public int m() {
      return this.j;
   }

   public Stream<bvb> p() {
      return this.i.stream().filter(bvb::bL);
   }

   @Override
   public final boolean a(arx $$0, btr $$1, float $$2) {
      return false;
   }
}
