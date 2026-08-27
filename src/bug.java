import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bug extends bsw<brg> {
   private static final int c = 40;
   private int d;
   @Nullable
   private emf e;
   @Nullable
   private im f;
   private float g;

   public bug() {
      this(150, 250);
   }

   public bug(int $$0, int $$1) {
      super(ImmutableMap.of(cah.E, cai.c, cah.t, cai.b, cah.m, cai.a), $$0, $$1);
   }

   protected boolean a(aqe $$0, brg $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bsf<?> $$2 = $$1.dQ();
         cak $$3 = $$2.c(cah.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Y())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cah.m);
            if ($$4) {
               $$2.b(cah.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqe $$0, brg $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cak> $$3 = $$1.dQ().c(cah.m);
         boolean $$4 = $$3.<Boolean>map(bug::a).orElse(false);
         cap $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqe $$0, brg $$1, long $$2) {
      if ($$1.dQ().a(cah.m) && !this.a($$1, $$1.dQ().c(cah.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dQ().b(cah.m);
      $$1.dQ().b(cah.t);
      this.e = null;
   }

   protected void c(aqe $$0, brg $$1, long $$2) {
      $$1.dQ().a(cah.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(aqe $$0, brg $$1, long $$2) {
      emf $$3 = $$1.K().j();
      bsf<?> $$4 = $$1.dQ();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cah.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cak $$5 = $$4.c(cah.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Y())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(brg $$0, cak $$1, long $$2) {
      im $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bsf<?> $$4 = $$0.dQ();
      if (this.a($$0, $$1)) {
         $$4.b(cah.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cah.E);
         } else if (!$$4.a(cah.E)) {
            $$4.a(cah.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         etf $$6 = cby.a((brm)$$0, 10, 7, etf.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(brg $$0, cak $$1) {
      return $$1.a().b().k($$0.dn()) <= $$1.c();
   }

   private static boolean a(cak $$0) {
      return $$0.a() instanceof bth $$2 ? $$2.c().N_() : false;
   }
}
