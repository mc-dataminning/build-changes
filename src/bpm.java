import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bpm extends boc<bmn> {
   private static final int c = 40;
   private int d;
   @Nullable
   private efg e;
   @Nullable
   private hx f;
   private float g;

   public bpm() {
      this(150, 250);
   }

   public bpm(int $$0, int $$1) {
      super(ImmutableMap.of(bvn.E, bvo.c, bvn.t, bvo.b, bvn.m, bvo.a), $$0, $$1);
   }

   protected boolean a(and $$0, bmn $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bnl<?> $$2 = $$1.dO();
         bvq $$3 = $$2.c(bvn.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.X())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bvn.m);
            if ($$4) {
               $$2.b(bvn.E);
            }

            return false;
         }
      }
   }

   protected boolean a(and $$0, bmn $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bvq> $$3 = $$1.dO().c(bvn.m);
         boolean $$4 = $$3.<Boolean>map(bpm::a).orElse(false);
         bvv $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(and $$0, bmn $$1, long $$2) {
      if ($$1.dO().a(bvn.m) && !this.a($$1, $$1.dO().c(bvn.m).get()) && $$1.N().r()) {
         this.d = $$0.F_().a(40);
      }

      $$1.N().n();
      $$1.dO().b(bvn.m);
      $$1.dO().b(bvn.t);
      this.e = null;
   }

   protected void c(and $$0, bmn $$1, long $$2) {
      $$1.dO().a(bvn.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(and $$0, bmn $$1, long $$2) {
      efg $$3 = $$1.N().j();
      bnl<?> $$4 = $$1.dO();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bvn.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bvq $$5 = $$4.c(bvn.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.X())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bmn $$0, bvq $$1, long $$2) {
      hx $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bnl<?> $$4 = $$0.dO();
      if (this.a($$0, $$1)) {
         $$4.b(bvn.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bvn.E);
         } else if (!$$4.a(bvn.E)) {
            $$4.a(bvn.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         elt $$6 = bxd.a((bmu)$$0, 10, 7, elt.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bmn $$0, bvq $$1) {
      return $$1.a().b().k($$0.dm()) <= $$1.c();
   }

   private static boolean a(bvq $$0) {
      return $$0.a() instanceof bon $$2 ? $$2.c().P_() : false;
   }
}
