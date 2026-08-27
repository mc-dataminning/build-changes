import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bsp extends brw {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aqo i;
   private final Set<brw> j = Sets.newHashSet();
   private int k;

   public bsp(bsc<? extends bsp> $$0, daz $$1) {
      super($$0, $$1);
      this.au = true;
      this.f = 2;
      this.b = this.ah.g();
      this.g = this.ah.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public avj de() {
      return avj.d;
   }

   @Nullable
   public aqo p() {
      return this.i;
   }

   public void b(@Nullable aqo $$0) {
      this.i = $$0;
   }

   private void v() {
      io $$0 = this.w();
      drd $$1 = this.dP().a_($$0);
      if ($$1.a(dec.ss)) {
         ((dip)$$1.b()).d($$1, this.dP(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dP().x_()) {
            this.dP().a(this.du(), this.dw(), this.dA(), avi.nW, avj.d, 10000.0F, 0.8F + this.ah.i() * 0.2F, false);
            this.dP().a(this.du(), this.dw(), this.dA(), avi.nV, avj.d, 2.0F, 0.5F + this.ah.i() * 0.2F, false);
         } else {
            bpt $$0 = this.dP().ak();
            if ($$0 == bpt.c || $$0 == bpt.d) {
               this.b(4);
            }

            this.v();
            b(this.dP(), this.w());
            this.a(dvw.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dP() instanceof aqn) {
               List<brw> $$1 = this.dP()
                  .a(
                     this,
                     new euh(this.du() - 15.0, this.dw() - 15.0, this.dA() - 15.0, this.du() + 15.0, this.dw() + 6.0 + 15.0, this.dA() + 15.0),
                     $$0 -> $$0.bD() && !this.j.contains($$0)
                  );

               for (aqo $$2 : ((aqn)this.dP()).a($$0 -> $$0.f(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.ao();
         } else if (this.f < -this.ah.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ah.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dP() instanceof aqn)) {
            this.dP().c(2);
         } else if (!this.h) {
            List<brw> $$3 = this.dP()
               .a(this, new euh(this.du() - 3.0, this.dw() - 3.0, this.dA() - 3.0, this.du() + 3.0, this.dw() + 6.0 + 3.0, this.dA() + 3.0), brw::bD);

            for (brw $$4 : $$3) {
               $$4.a((aqn)this.dP(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private io w() {
      eum $$0 = this.dn();
      return io.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dP().B && this.dP().aa().b(dav.b)) {
         io $$1 = this.dp();
         drd $$2 = ddn.a(this.dP(), $$1);
         if (this.dP().a_($$1).i() && $$2.a((dbc)this.dP(), $$1)) {
            this.dP().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            io $$4 = $$1.b(this.ah.a(3) - 1, this.ah.a(3) - 1, this.ah.a(3) - 1);
            $$2 = ddn.a(this.dP(), $$4);
            if (this.dP().a_($$4).i() && $$2.a((dbc)this.dP(), $$4)) {
               this.dP().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(daz $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      io $$3;
      drd $$4;
      if ($$2.a(dec.ss)) {
         $$3 = $$1.a($$2.c(dip.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dnf) {
         $$0.b($$3, dnf.c($$0.a_($$3)));
         io.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(daz $$0, io $$1, io.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<io> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<io> c(daz $$0, io $$1) {
      for (io $$2 : io.a($$0.z, 10, $$1, 1)) {
         drd $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dnf) {
            dnf.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ajw.a $$0) {
   }

   @Override
   protected void a(ud $$0) {
   }

   @Override
   protected void b(ud $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<brw> u() {
      return this.j.stream().filter(brw::bD);
   }
}
