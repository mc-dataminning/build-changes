import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bkx extends bki {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private amb i;
   private final Set<bki> j = Sets.newHashSet();
   private int k;

   public bkx(bkm<? extends bkx> $$0, crs $$1) {
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
   public aqo da() {
      return aqo.d;
   }

   @Nullable
   public amb q() {
      return this.i;
   }

   public void b(@Nullable amb $$0) {
      this.i = $$0;
   }

   private void v() {
      ht $$0 = this.w();
      dgw $$1 = this.dL().a_($$0);
      if ($$1.a(cuv.rr)) {
         ((czh)$$1.b()).d($$1, this.dL(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dL().x_()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), aqn.my, aqo.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dL().a(this.dq(), this.ds(), this.dw(), aqn.mx, aqo.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bin $$0 = this.dL().ai();
            if ($$0 == bin.c || $$0 == bin.d) {
               this.b(4);
            }

            this.v();
            b(this.dL(), this.w());
            this.a(dlg.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dL() instanceof ama) {
               List<bki> $$1 = this.dL()
                  .a(
                     this,
                     new ejd(this.dq() - 15.0, this.ds() - 15.0, this.dw() - 15.0, this.dq() + 15.0, this.ds() + 6.0 + 15.0, this.dw() + 15.0),
                     $$0 -> $$0.bv() && !this.j.contains($$0)
                  );

               for (amb $$2 : ((ama)this.dL()).a($$0 -> $$0.e(this) < 256.0F)) {
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
         if (!(this.dL() instanceof ama)) {
            this.dL().c(2);
         } else if (!this.h) {
            List<bki> $$3 = this.dL()
               .a(this, new ejd(this.dq() - 3.0, this.ds() - 3.0, this.dw() - 3.0, this.dq() + 3.0, this.ds() + 6.0 + 3.0, this.dw() + 3.0), bki::bv);

            for (bki $$4 : $$3) {
               $$4.a((ama)this.dL(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               al.E.a(this.i, $$3);
            }
         }
      }
   }

   private ht w() {
      eji $$0 = this.dj();
      return ht.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dL().B && this.dL().X().b(cro.b)) {
         ht $$1 = this.dl();
         dgw $$2 = cug.a(this.dL(), $$1);
         if (this.dL().a_($$1).i() && $$2.a((crv)this.dL(), $$1)) {
            this.dL().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ht $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = cug.a(this.dL(), $$4);
            if (this.dL().a_($$4).i() && $$2.a((crv)this.dL(), $$4)) {
               this.dL().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(crs $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      ht $$3;
      dgw $$4;
      if ($$2.a(cuv.rr)) {
         $$3 = $$1.a($$2.c(czh.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof ddt) {
         $$0.b($$3, ddt.c($$0.a_($$3)));
         ht.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(crs $$0, ht $$1, ht.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ht> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ht> c(crs $$0, ht $$1) {
      for (ht $$2 : ht.a($$0.z, 10, $$1, 1)) {
         dgw $$3 = $$0.a_($$2);
         if ($$3.b() instanceof ddt) {
            ddt.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(rz $$0) {
   }

   @Override
   protected void b(rz $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bki> t() {
      return this.j.stream().filter(bki::bv);
   }
}
