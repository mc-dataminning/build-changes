import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class btb extends bsh {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aqn i;
   private final Set<bsh> j = Sets.newHashSet();
   private int k;

   public btb(bsn<? extends btb> $$0, dcg $$1) {
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
   public avi dg() {
      return avi.d;
   }

   @Nullable
   public aqn p() {
      return this.i;
   }

   public void b(@Nullable aqn $$0) {
      this.i = $$0;
   }

   private void v() {
      ja $$0 = this.w();
      dsl $$1 = this.dR().a_($$0);
      if ($$1.a(dfk.ss)) {
         ((djx)$$1.b()).d($$1, this.dR(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dR().x_()) {
            this.dR().a(this.dw(), this.dy(), this.dC(), avh.nW, avi.d, 10000.0F, 0.8F + this.ah.i() * 0.2F, false);
            this.dR().a(this.dw(), this.dy(), this.dC(), avh.nV, avi.d, 2.0F, 0.5F + this.ah.i() * 0.2F, false);
         } else {
            bqe $$0 = this.dR().al();
            if ($$0 == bqe.c || $$0 == bqe.d) {
               this.b(4);
            }

            this.v();
            b(this.dR(), this.w());
            this.a(dxh.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dR() instanceof aqm) {
               List<bsh> $$1 = this.dR()
                  .a(
                     this,
                     new ewc(this.dw() - 15.0, this.dy() - 15.0, this.dC() - 15.0, this.dw() + 15.0, this.dy() + 6.0 + 15.0, this.dC() + 15.0),
                     $$0 -> $$0.bF() && !this.j.contains($$0)
                  );

               for (aqn $$2 : ((aqm)this.dR()).a($$0 -> $$0.f(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.aq();
         } else if (this.f < -this.ah.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ah.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dR() instanceof aqm)) {
            this.dR().c(2);
         } else if (!this.h) {
            List<bsh> $$3 = this.dR()
               .a(this, new ewc(this.dw() - 3.0, this.dy() - 3.0, this.dC() - 3.0, this.dw() + 3.0, this.dy() + 6.0 + 3.0, this.dC() + 3.0), bsh::bF);

            for (bsh $$4 : $$3) {
               $$4.a((aqm)this.dR(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private ja w() {
      ewh $$0 = this.dp();
      return ja.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dR().B && this.dR().ab().b(dcc.b)) {
         ja $$1 = this.dr();
         dsl $$2 = dev.a(this.dR(), $$1);
         if (this.dR().a_($$1).i() && $$2.a((dcj)this.dR(), $$1)) {
            this.dR().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ja $$4 = $$1.b(this.ah.a(3) - 1, this.ah.a(3) - 1, this.ah.a(3) - 1);
            $$2 = dev.a(this.dR(), $$4);
            if (this.dR().a_($$4).i() && $$2.a((dcj)this.dR(), $$4)) {
               this.dR().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(dcg $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      ja $$3;
      dsl $$4;
      if ($$2.a(dfk.ss)) {
         $$3 = $$1.a($$2.c(djx.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof don) {
         $$0.b($$3, don.c($$0.a_($$3)));
         ja.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dcg $$0, ja $$1, ja.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ja> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ja> c(dcg $$0, ja $$1) {
      for (ja $$2 : ja.a($$0.z, 10, $$1, 1)) {
         dsl $$3 = $$0.a_($$2);
         if ($$3.b() instanceof don) {
            don.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cF();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   protected void a(tx $$0) {
   }

   @Override
   protected void b(tx $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bsh> t() {
      return this.j.stream().filter(bsh::bF);
   }
}
