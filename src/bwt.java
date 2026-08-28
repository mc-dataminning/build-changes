import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwt extends bvj<bts> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eok e;
   @Nullable
   private iz f;
   private float g;

   public bwt() {
      this(150, 250);
   }

   public bwt(int $$0, int $$1) {
      super(ImmutableMap.of(ccu.E, ccv.c, ccu.t, ccv.b, ccu.m, ccv.a), $$0, $$1);
   }

   protected boolean a(arf $$0, bts $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bus<?> $$2 = $$1.dS();
         ccx $$3 = $$2.c(ccu.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(ccu.m);
            if ($$4) {
               $$2.b(ccu.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arf $$0, bts $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ccx> $$3 = $$1.dS().c(ccu.m);
         boolean $$4 = $$3.<Boolean>map(bwt::a).orElse(false);
         cdc $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arf $$0, bts $$1, long $$2) {
      if ($$1.dS().a(ccu.m) && !this.a($$1, $$1.dS().c(ccu.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dS().b(ccu.m);
      $$1.dS().b(ccu.t);
      this.e = null;
   }

   protected void c(arf $$0, bts $$1, long $$2) {
      $$1.dS().a(ccu.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(arf $$0, bts $$1, long $$2) {
      eok $$3 = $$1.K().j();
      bus<?> $$4 = $$1.dS();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(ccu.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ccx $$5 = $$4.c(ccu.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bts $$0, ccx $$1, long $$2) {
      iz $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bus<?> $$4 = $$0.dS();
      if (this.a($$0, $$1)) {
         $$4.b(ccu.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(ccu.E);
         } else if (!$$4.a(ccu.E)) {
            $$4.a(ccu.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         evs $$6 = cel.a((btz)$$0, 10, 7, evs.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bts $$0, ccx $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(ccx $$0) {
      return $$0.a() instanceof bvu $$2 ? $$2.c().N_() : false;
   }
}
