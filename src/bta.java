import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bta extends bsg {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aqn i;
   private final Set<bsg> j = Sets.newHashSet();
   private int k;

   public bta(bsm<? extends bta> $$0, dcf $$1) {
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
   public avi df() {
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
      dsk $$1 = this.dQ().a_($$0);
      if ($$1.a(dfj.ss)) {
         ((djw)$$1.b()).d($$1, this.dQ(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dQ().x_()) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avh.nW, avi.d, 10000.0F, 0.8F + this.ah.i() * 0.2F, false);
            this.dQ().a(this.dv(), this.dx(), this.dB(), avh.nV, avi.d, 2.0F, 0.5F + this.ah.i() * 0.2F, false);
         } else {
            bqd $$0 = this.dQ().al();
            if ($$0 == bqd.c || $$0 == bqd.d) {
               this.b(4);
            }

            this.v();
            b(this.dQ(), this.w());
            this.a(dxg.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dQ() instanceof aqm) {
               List<bsg> $$1 = this.dQ()
                  .a(
                     this,
                     new ewa(this.dv() - 15.0, this.dx() - 15.0, this.dB() - 15.0, this.dv() + 15.0, this.dx() + 6.0 + 15.0, this.dB() + 15.0),
                     $$0 -> $$0.bE() && !this.j.contains($$0)
                  );

               for (aqn $$2 : ((aqm)this.dQ()).a($$0 -> $$0.f(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.ap();
         } else if (this.f < -this.ah.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ah.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dQ() instanceof aqm)) {
            this.dQ().c(2);
         } else if (!this.h) {
            List<bsg> $$3 = this.dQ()
               .a(this, new ewa(this.dv() - 3.0, this.dx() - 3.0, this.dB() - 3.0, this.dv() + 3.0, this.dx() + 6.0 + 3.0, this.dB() + 3.0), bsg::bE);

            for (bsg $$4 : $$3) {
               $$4.a((aqm)this.dQ(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private ja w() {
      ewf $$0 = this.do();
      return ja.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dQ().B && this.dQ().ab().b(dcb.b)) {
         ja $$1 = this.dq();
         dsk $$2 = deu.a(this.dQ(), $$1);
         if (this.dQ().a_($$1).i() && $$2.a((dci)this.dQ(), $$1)) {
            this.dQ().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ja $$4 = $$1.b(this.ah.a(3) - 1, this.ah.a(3) - 1, this.ah.a(3) - 1);
            $$2 = deu.a(this.dQ(), $$4);
            if (this.dQ().a_($$4).i() && $$2.a((dci)this.dQ(), $$4)) {
               this.dQ().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(dcf $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      ja $$3;
      dsk $$4;
      if ($$2.a(dfj.ss)) {
         $$3 = $$1.a($$2.c(djw.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dom) {
         $$0.b($$3, dom.c($$0.a_($$3)));
         ja.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dcf $$0, ja $$1, ja.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ja> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ja> c(dcf $$0, ja $$1) {
      for (ja $$2 : ja.a($$0.z, 10, $$1, 1)) {
         dsk $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dom) {
            dom.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cE();
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

   public Stream<bsg> u() {
      return this.j.stream().filter(bsg::bE);
   }
}
