import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bki extends bjt {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private alr i;
   private final Set<bjt> j = Sets.newHashSet();
   private int k;

   public bki(bjx<? extends bki> $$0, cqz $$1) {
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
   public aqe da() {
      return aqe.d;
   }

   @Nullable
   public alr q() {
      return this.i;
   }

   public void b(@Nullable alr $$0) {
      this.i = $$0;
   }

   private void v() {
      ht $$0 = this.w();
      dgb $$1 = this.dL().a_($$0);
      if ($$1.a(cuc.rr)) {
         ((cyn)$$1.b()).d($$1, this.dL(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dL().x_()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), aqd.mw, aqe.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dL().a(this.dq(), this.ds(), this.dw(), aqd.mv, aqe.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bhy $$0 = this.dL().ai();
            if ($$0 == bhy.c || $$0 == bhy.d) {
               this.b(4);
            }

            this.v();
            b(this.dL(), this.w());
            this.a(dkl.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dL() instanceof alq) {
               List<bjt> $$1 = this.dL()
                  .a(
                     this,
                     new eia(this.dq() - 15.0, this.ds() - 15.0, this.dw() - 15.0, this.dq() + 15.0, this.ds() + 6.0 + 15.0, this.dw() + 15.0),
                     $$0 -> $$0.bv() && !this.j.contains($$0)
                  );

               for (alr $$2 : ((alq)this.dL()).a($$0 -> $$0.e(this) < 256.0F)) {
                  al.S.a($$2, this, $$1);
               }
            }

            this.ak();
         } else if (this.f < -this.ag.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ag.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dL() instanceof alq)) {
            this.dL().c(2);
         } else if (!this.h) {
            List<bjt> $$3 = this.dL()
               .a(this, new eia(this.dq() - 3.0, this.ds() - 3.0, this.dw() - 3.0, this.dq() + 3.0, this.ds() + 6.0 + 3.0, this.dw() + 3.0), bjt::bv);

            for (bjt $$4 : $$3) {
               $$4.a((alq)this.dL(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               al.E.a(this.i, $$3);
            }
         }
      }
   }

   private ht w() {
      eif $$0 = this.dj();
      return ht.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dL().B && this.dL().X().b(cqv.b)) {
         ht $$1 = this.dl();
         dgb $$2 = ctn.a(this.dL(), $$1);
         if (this.dL().a_($$1).i() && $$2.a((crc)this.dL(), $$1)) {
            this.dL().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ht $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = ctn.a(this.dL(), $$4);
            if (this.dL().a_($$4).i() && $$2.a((crc)this.dL(), $$4)) {
               this.dL().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cqz $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      ht $$3;
      dgb $$4;
      if ($$2.a(cuc.rr)) {
         $$3 = $$1.a($$2.c(cyn.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dcz) {
         $$0.b($$3, dcz.c($$0.a_($$3)));
         ht.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cqz $$0, ht $$1, ht.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ht> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ht> c(cqz $$0, ht $$1) {
      for (ht $$2 : ht.a($$0.z, 10, $$1, 1)) {
         dgb $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dcz) {
            dcz.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cz();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void b_() {
   }

   @Override
   protected void a(rt $$0) {
   }

   @Override
   protected void b(rt $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bjt> t() {
      return this.j.stream().filter(bjt::bv);
   }
}
