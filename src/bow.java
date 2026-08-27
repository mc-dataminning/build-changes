import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bow extends bnm<blx> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eeo e;
   @Nullable
   private hv f;
   private float g;

   public bow() {
      this(150, 250);
   }

   public bow(int $$0, int $$1) {
      super(ImmutableMap.of(bux.E, buy.c, bux.t, buy.b, bux.m, buy.a), $$0, $$1);
   }

   protected boolean a(amp $$0, blx $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bmv<?> $$2 = $$1.dO();
         bva $$3 = $$2.c(bux.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.W())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bux.m);
            if ($$4) {
               $$2.b(bux.E);
            }

            return false;
         }
      }
   }

   protected boolean a(amp $$0, blx $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bva> $$3 = $$1.dO().c(bux.m);
         boolean $$4 = $$3.<Boolean>map(bow::a).orElse(false);
         bvf $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(amp $$0, blx $$1, long $$2) {
      if ($$1.dO().a(bux.m) && !this.a($$1, $$1.dO().c(bux.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dO().b(bux.m);
      $$1.dO().b(bux.t);
      this.e = null;
   }

   protected void c(amp $$0, blx $$1, long $$2) {
      $$1.dO().a(bux.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(amp $$0, blx $$1, long $$2) {
      eeo $$3 = $$1.N().j();
      bmv<?> $$4 = $$1.dO();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bux.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bva $$5 = $$4.c(bux.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.W())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(blx $$0, bva $$1, long $$2) {
      hv $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bmv<?> $$4 = $$0.dO();
      if (this.a($$0, $$1)) {
         $$4.b(bux.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bux.E);
         } else if (!$$4.a(bux.E)) {
            $$4.a(bux.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         elb $$6 = bwn.a((bme)$$0, 10, 7, elb.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(blx $$0, bva $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(bva $$0) {
      return $$0.a() instanceof bnx $$2 ? $$2.c().P_() : false;
   }
}
