import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bqs extends bqa {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private apv i;
   private final Set<bqa> j = Sets.newHashSet();
   private int k;

   public bqs(bqg<? extends bqs> $$0, czg $$1) {
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
   public aup db() {
      return aup.d;
   }

   @Nullable
   public apv p() {
      return this.i;
   }

   public void b(@Nullable apv $$0) {
      this.i = $$0;
   }

   private void v() {
      id $$0 = this.w();
      dpi $$1 = this.dM().a_($$0);
      if ($$1.a(dcj.ss)) {
         ((dgv)$$1.b()).d($$1, this.dM(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dM().x_()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), auo.nH, aup.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dM().a(this.dr(), this.dt(), this.dx(), auo.nG, aup.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            boc $$0 = this.dM().ak();
            if ($$0 == boc.c || $$0 == boc.d) {
               this.b(4);
            }

            this.v();
            b(this.dM(), this.w());
            this.a(dub.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dM() instanceof apu) {
               List<bqa> $$1 = this.dM()
                  .a(
                     this,
                     new ese(this.dr() - 15.0, this.dt() - 15.0, this.dx() - 15.0, this.dr() + 15.0, this.dt() + 6.0 + 15.0, this.dx() + 15.0),
                     $$0 -> $$0.bA() && !this.j.contains($$0)
                  );

               for (apv $$2 : ((apu)this.dM()).a($$0 -> $$0.f(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
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
         if (!(this.dM() instanceof apu)) {
            this.dM().c(2);
         } else if (!this.h) {
            List<bqa> $$3 = this.dM()
               .a(this, new ese(this.dr() - 3.0, this.dt() - 3.0, this.dx() - 3.0, this.dr() + 3.0, this.dt() + 6.0 + 3.0, this.dx() + 3.0), bqa::bA);

            for (bqa $$4 : $$3) {
               $$4.a((apu)this.dM(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private id w() {
      esj $$0 = this.dk();
      return id.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dM().B && this.dM().aa().b(czc.b)) {
         id $$1 = this.dm();
         dpi $$2 = dbu.a(this.dM(), $$1);
         if (this.dM().a_($$1).i() && $$2.a((czj)this.dM(), $$1)) {
            this.dM().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            id $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = dbu.a(this.dM(), $$4);
            if (this.dM().a_($$4).i() && $$2.a((czj)this.dM(), $$4)) {
               this.dM().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(czg $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      id $$3;
      dpi $$4;
      if ($$2.a(dcj.ss)) {
         $$3 = $$1.a($$2.c(dgv.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dll) {
         $$0.b($$3, dll.c($$0.a_($$3)));
         id.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(czg $$0, id $$1, id.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<id> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<id> c(czg $$0, id $$1) {
      for (id $$2 : id.a($$0.z, 10, $$1, 1)) {
         dpi $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dll) {
            dll.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(aje.a $$0) {
   }

   @Override
   protected void a(to $$0) {
   }

   @Override
   protected void b(to $$0) {
   }

   public int r() {
      return this.k;
   }

   public Stream<bqa> u() {
      return this.j.stream().filter(bqa::bA);
   }
}
