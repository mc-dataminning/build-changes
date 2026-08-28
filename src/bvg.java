import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bvg extends bul {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private arq h;
   private final Set<bul> i = Sets.newHashSet();
   private int j;

   public bvg(bus<? extends bvg> $$0, dfm $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awo dm() {
      return awo.d;
   }

   @Nullable
   public arq j() {
      return this.h;
   }

   public void b(@Nullable arq $$0) {
      this.h = $$0;
   }

   private void q() {
      jh $$0 = this.s();
      dvv $$1 = this.dV().a_($$0);
      if ($$1.a(dis.ss)) {
         ((dne)$$1.b()).e($$1, this.dV(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dV().A_()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.nV, awo.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.nU, awo.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            bsh $$0 = this.dV().ak();
            if ($$0 == bsh.c || $$0 == bsh.d) {
               this.b(4);
            }

            this.q();
            a(this.dV(), this.s());
            this.a(ear.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dV() instanceof arp) {
               List<bul> $$1 = this.dV()
                  .a(
                     this,
                     new ezt(this.dA() - 15.0, this.dC() - 15.0, this.dG() - 15.0, this.dA() + 15.0, this.dC() + 6.0 + 15.0, this.dG() + 15.0),
                     $$0 -> $$0.bL() && !this.i.contains($$0)
                  );

               for (arq $$2 : ((arp)this.dV()).a($$0 -> $$0.f(this) < 256.0F)) {
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
         if (!(this.dV() instanceof arp)) {
            this.dV().c(2);
         } else if (!this.g) {
            List<bul> $$3 = this.dV()
               .a(this, new ezt(this.dA() - 3.0, this.dC() - 3.0, this.dG() - 3.0, this.dA() + 3.0, this.dC() + 6.0 + 3.0, this.dG() + 3.0), bul::bL);

            for (bul $$4 : $$3) {
               $$4.a((arp)this.dV(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               ao.F.a(this.h, $$3);
            }
         }
      }
   }

   private jh s() {
      ezy $$0 = this.dt();
      return jh.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dV() instanceof arp $$1 && $$1.N().b(dfi.b)) {
         jh $$3 = this.dv();
         dvv $$4 = did.a(this.dV(), $$3);
         if (this.dV().a_($$3).l() && $$4.a((dfp)this.dV(), $$3)) {
            this.dV().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            jh $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = did.a(this.dV(), $$6);
            if (this.dV().a_($$6).l() && $$4.a((dfp)this.dV(), $$6)) {
               this.dV().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void a(dfm $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      jh $$3;
      dvv $$4;
      if ($$2.a(dis.ss)) {
         $$3 = $$1.a($$2.c(dne.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof drv) {
         $$0.b($$3, drv.c($$0.a_($$3)));
         jh.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dfm $$0, jh $$1, jh.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<jh> $$5 = b($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<jh> b(dfm $$0, jh $$1) {
      for (jh $$2 : jh.a($$0.A, 10, $$1, 1)) {
         dvv $$3 = $$0.a_($$2);
         if ($$3.b() instanceof drv) {
            drv.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(akq.a $$0) {
   }

   @Override
   protected void a(ul $$0) {
   }

   @Override
   protected void b(ul $$0) {
   }

   public int l() {
      return this.j;
   }

   public Stream<bul> n() {
      return this.i.stream().filter(bul::bL);
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      return false;
   }
}
