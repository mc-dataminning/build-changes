import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwu extends bvk<btt> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eol e;
   @Nullable
   private iz f;
   private float g;

   public bwu() {
      this(150, 250);
   }

   public bwu(int $$0, int $$1) {
      super(ImmutableMap.of(ccv.E, ccw.c, ccv.t, ccw.b, ccv.m, ccw.a), $$0, $$1);
   }

   protected boolean a(arf $$0, btt $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         but<?> $$2 = $$1.dS();
         ccy $$3 = $$2.c(ccv.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(ccv.m);
            if ($$4) {
               $$2.b(ccv.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arf $$0, btt $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ccy> $$3 = $$1.dS().c(ccv.m);
         boolean $$4 = $$3.<Boolean>map(bwu::a).orElse(false);
         cdd $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arf $$0, btt $$1, long $$2) {
      if ($$1.dS().a(ccv.m) && !this.a($$1, $$1.dS().c(ccv.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dS().b(ccv.m);
      $$1.dS().b(ccv.t);
      this.e = null;
   }

   protected void c(arf $$0, btt $$1, long $$2) {
      $$1.dS().a(ccv.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(arf $$0, btt $$1, long $$2) {
      eol $$3 = $$1.K().j();
      but<?> $$4 = $$1.dS();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(ccv.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ccy $$5 = $$4.c(ccv.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(btt $$0, ccy $$1, long $$2) {
      iz $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      but<?> $$4 = $$0.dS();
      if (this.a($$0, $$1)) {
         $$4.b(ccv.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(ccv.E);
         } else if (!$$4.a(ccv.E)) {
            $$4.a(ccv.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         evt $$6 = cem.a((bua)$$0, 10, 7, evt.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(btt $$0, ccy $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(ccy $$0) {
      return $$0.a() instanceof bvv $$2 ? $$2.c().N_() : false;
   }
}
