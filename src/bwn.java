import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwn extends bvd<btm> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eoe e;
   @Nullable
   private iz f;
   private float g;

   public bwn() {
      this(150, 250);
   }

   public bwn(int $$0, int $$1) {
      super(ImmutableMap.of(cco.E, ccp.c, cco.t, ccp.b, cco.m, ccp.a), $$0, $$1);
   }

   protected boolean a(arb $$0, btm $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bum<?> $$2 = $$1.dS();
         ccr $$3 = $$2.c(cco.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cco.m);
            if ($$4) {
               $$2.b(cco.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arb $$0, btm $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ccr> $$3 = $$1.dS().c(cco.m);
         boolean $$4 = $$3.<Boolean>map(bwn::a).orElse(false);
         ccw $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arb $$0, btm $$1, long $$2) {
      if ($$1.dS().a(cco.m) && !this.a($$1, $$1.dS().c(cco.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dS().b(cco.m);
      $$1.dS().b(cco.t);
      this.e = null;
   }

   protected void c(arb $$0, btm $$1, long $$2) {
      $$1.dS().a(cco.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(arb $$0, btm $$1, long $$2) {
      eoe $$3 = $$1.K().j();
      bum<?> $$4 = $$1.dS();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cco.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ccr $$5 = $$4.c(cco.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(btm $$0, ccr $$1, long $$2) {
      iz $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bum<?> $$4 = $$0.dS();
      if (this.a($$0, $$1)) {
         $$4.b(cco.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cco.E);
         } else if (!$$4.a(cco.E)) {
            $$4.a(cco.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         evm $$6 = cef.a((btt)$$0, 10, 7, evm.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(btm $$0, ccr $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(ccr $$0) {
      return $$0.a() instanceof bvo $$2 ? $$2.c().N_() : false;
   }
}
