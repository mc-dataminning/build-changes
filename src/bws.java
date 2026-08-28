import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bws extends bvi<btr> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eoj e;
   @Nullable
   private iz f;
   private float g;

   public bws() {
      this(150, 250);
   }

   public bws(int $$0, int $$1) {
      super(ImmutableMap.of(cct.E, ccu.c, cct.t, ccu.b, cct.m, ccu.a), $$0, $$1);
   }

   protected boolean a(arf $$0, btr $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bur<?> $$2 = $$1.dS();
         ccw $$3 = $$2.c(cct.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cct.m);
            if ($$4) {
               $$2.b(cct.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arf $$0, btr $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ccw> $$3 = $$1.dS().c(cct.m);
         boolean $$4 = $$3.<Boolean>map(bws::a).orElse(false);
         cdb $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arf $$0, btr $$1, long $$2) {
      if ($$1.dS().a(cct.m) && !this.a($$1, $$1.dS().c(cct.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dS().b(cct.m);
      $$1.dS().b(cct.t);
      this.e = null;
   }

   protected void c(arf $$0, btr $$1, long $$2) {
      $$1.dS().a(cct.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(arf $$0, btr $$1, long $$2) {
      eoj $$3 = $$1.K().j();
      bur<?> $$4 = $$1.dS();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cct.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ccw $$5 = $$4.c(cct.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(btr $$0, ccw $$1, long $$2) {
      iz $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bur<?> $$4 = $$0.dS();
      if (this.a($$0, $$1)) {
         $$4.b(cct.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cct.E);
         } else if (!$$4.a(cct.E)) {
            $$4.a(cct.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         evr $$6 = cek.a((bty)$$0, 10, 7, evr.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(btr $$0, ccw $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(ccw $$0) {
      return $$0.a() instanceof bvt $$2 ? $$2.c().N_() : false;
   }
}
