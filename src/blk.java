import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class blk extends bkv {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private amj i;
   private final Set<bkv> j = Sets.newHashSet();
   private int k;

   public blk(bkz<? extends blk> $$0, csf $$1) {
      super($$0, $$1);
      this.at = true;
      this.f = 2;
      this.b = this.ag.g();
      this.g = this.ag.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public aqw dc() {
      return aqw.d;
   }

   @Nullable
   public amj q() {
      return this.i;
   }

   public void b(@Nullable amj $$0) {
      this.i = $$0;
   }

   private void w() {
      hx $$0 = this.x();
      dhn $$1 = this.dN().a_($$0);
      if ($$1.a(cvh.ss)) {
         ((czt)$$1.b()).d($$1, this.dN(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dN().y_()) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqv.mO, aqw.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dN().a(this.ds(), this.du(), this.dy(), aqv.mN, aqw.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            biy $$0 = this.dN().aj();
            if ($$0 == biy.c || $$0 == biy.d) {
               this.b(4);
            }

            this.w();
            b(this.dN(), this.x());
            this.a(dlx.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dN() instanceof ami) {
               List<bkv> $$1 = this.dN()
                  .a(
                     this,
                     new eju(this.ds() - 15.0, this.du() - 15.0, this.dy() - 15.0, this.ds() + 15.0, this.du() + 6.0 + 15.0, this.dy() + 15.0),
                     $$0 -> $$0.bx() && !this.j.contains($$0)
                  );

               for (amj $$2 : ((ami)this.dN()).a($$0 -> $$0.e(this) < 256.0F)) {
                  al.S.a($$2, this, $$1);
               }
            }

            this.am();
         } else if (this.f < -this.ag.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ag.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dN() instanceof ami)) {
            this.dN().c(2);
         } else if (!this.h) {
            List<bkv> $$3 = this.dN()
               .a(this, new eju(this.ds() - 3.0, this.du() - 3.0, this.dy() - 3.0, this.ds() + 3.0, this.du() + 6.0 + 3.0, this.dy() + 3.0), bkv::bx);

            for (bkv $$4 : $$3) {
               $$4.a((ami)this.dN(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               al.E.a(this.i, $$3);
            }
         }
      }
   }

   private hx x() {
      ejz $$0 = this.dl();
      return hx.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dN().B && this.dN().Y().b(csb.b)) {
         hx $$1 = this.dn();
         dhn $$2 = cus.a(this.dN(), $$1);
         if (this.dN().a_($$1).i() && $$2.a((csi)this.dN(), $$1)) {
            this.dN().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            hx $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = cus.a(this.dN(), $$4);
            if (this.dN().a_($$4).i() && $$2.a((csi)this.dN(), $$4)) {
               this.dN().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(csf $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      hx $$3;
      dhn $$4;
      if ($$2.a(cvh.ss)) {
         $$3 = $$1.a($$2.c(czt.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof deg) {
         $$0.b($$3, deg.c($$0.a_($$3)));
         hx.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(csf $$0, hx $$1, hx.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<hx> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<hx> c(csf $$0, hx $$1) {
      for (hx $$2 : hx.a($$0.z, 10, $$1, 1)) {
         dhn $$3 = $$0.a_($$2);
         if ($$3.b() instanceof deg) {
            deg.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cA();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sd $$0) {
   }

   @Override
   protected void b(sd $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bkv> u() {
      return this.j.stream().filter(bkv::bx);
   }
}
