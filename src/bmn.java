import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bmn extends blw {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private anf i;
   private final Set<blw> j = Sets.newHashSet();
   private int k;

   public bmn(bmc<? extends bmn> $$0, ctx $$1) {
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
   public aru db() {
      return aru.d;
   }

   @Nullable
   public anf q() {
      return this.i;
   }

   public void b(@Nullable anf $$0) {
      this.i = $$0;
   }

   private void w() {
      hx $$0 = this.x();
      djp $$1 = this.dL().a_($$0);
      if ($$1.a(cxa.ss)) {
         ((dbm)$$1.b()).d($$1, this.dL(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dL().y_()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), art.nx, aru.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dL().a(this.dq(), this.ds(), this.dw(), art.nw, aru.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bjz $$0 = this.dL().ak();
            if ($$0 == bjz.c || $$0 == bjz.d) {
               this.b(4);
            }

            this.w();
            b(this.dL(), this.x());
            this.b(dnz.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dL() instanceof ane) {
               List<blw> $$1 = this.dL()
                  .a(
                     this,
                     new elx(this.dq() - 15.0, this.ds() - 15.0, this.dw() - 15.0, this.dq() + 15.0, this.ds() + 6.0 + 15.0, this.dw() + 15.0),
                     $$0 -> $$0.bx() && !this.j.contains($$0)
                  );

               for (anf $$2 : ((ane)this.dL()).a($$0 -> $$0.e(this) < 256.0F)) {
                  am.T.a($$2, this, $$1);
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
         if (!(this.dL() instanceof ane)) {
            this.dL().c(2);
         } else if (!this.h) {
            List<blw> $$3 = this.dL()
               .a(this, new elx(this.dq() - 3.0, this.ds() - 3.0, this.dw() - 3.0, this.dq() + 3.0, this.ds() + 6.0 + 3.0, this.dw() + 3.0), blw::bx);

            for (blw $$4 : $$3) {
               $$4.a((ane)this.dL(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private hx x() {
      emc $$0 = this.dj();
      return hx.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dL().B && this.dL().Z().b(ctt.b)) {
         hx $$1 = this.dl();
         djp $$2 = cwl.a(this.dL(), $$1);
         if (this.dL().a_($$1).i() && $$2.a((cua)this.dL(), $$1)) {
            this.dL().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            hx $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = cwl.a(this.dL(), $$4);
            if (this.dL().a_($$4).i() && $$2.a((cua)this.dL(), $$4)) {
               this.dL().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(ctx $$0, hx $$1) {
      djp $$2 = $$0.a_($$1);
      hx $$3;
      djp $$4;
      if ($$2.a(cxa.ss)) {
         $$3 = $$1.a($$2.c(dbm.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dgb) {
         $$0.b($$3, dgb.c($$0.a_($$3)));
         hx.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(ctx $$0, hx $$1, hx.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<hx> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<hx> c(ctx $$0, hx $$1) {
      for (hx $$2 : hx.a($$0.z, 10, $$1, 1)) {
         djp $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dgb) {
            dgb.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(so $$0) {
   }

   @Override
   protected void b(so $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<blw> u() {
      return this.j.stream().filter(blw::bx);
   }
}
