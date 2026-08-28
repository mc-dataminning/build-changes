import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwf extends buv<bte> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eox e;
   @Nullable
   private ja f;
   private float g;

   public bwf() {
      this(150, 250);
   }

   public bwf(int $$0, int $$1) {
      super(ImmutableMap.of(ccg.E, cch.c, ccg.t, cch.b, ccg.m, cch.a), $$0, $$1);
   }

   protected boolean a(aqm $$0, bte $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bue<?> $$2 = $$1.dV();
         ccj $$3 = $$2.c(ccg.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(ccg.m);
            if ($$4) {
               $$2.b(ccg.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqm $$0, bte $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ccj> $$3 = $$1.dV().c(ccg.m);
         boolean $$4 = $$3.<Boolean>map(bwf::a).orElse(false);
         cco $$5 = $$1.J();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqm $$0, bte $$1, long $$2) {
      if ($$1.dV().a(ccg.m) && !this.a($$1, $$1.dV().c(ccg.m).get()) && $$1.J().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.J().n();
      $$1.dV().b(ccg.m);
      $$1.dV().b(ccg.t);
      this.e = null;
   }

   protected void c(aqm $$0, bte $$1, long $$2) {
      $$1.dV().a(ccg.t, this.e);
      $$1.J().a(this.e, (double)this.g);
   }

   protected void d(aqm $$0, bte $$1, long $$2) {
      eox $$3 = $$1.J().j();
      bue<?> $$4 = $$1.dV();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(ccg.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ccj $$5 = $$4.c(ccg.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bte $$0, ccj $$1, long $$2) {
      ja $$3 = $$1.a().b();
      this.e = $$0.J().a($$3, 0);
      this.g = $$1.b();
      bue<?> $$4 = $$0.dV();
      if (this.a($$0, $$1)) {
         $$4.b(ccg.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(ccg.E);
         } else if (!$$4.a(ccg.E)) {
            $$4.a(ccg.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ewh $$6 = cdx.a((btl)$$0, 10, 7, ewh.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.J().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bte $$0, ccj $$1) {
      return $$1.a().b().k($$0.dr()) <= $$1.c();
   }

   private static boolean a(ccj $$0) {
      return $$0.a() instanceof bvg $$2 ? $$2.c().N_() : false;
   }
}
