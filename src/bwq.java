import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwq extends bvg<btp> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eoh e;
   @Nullable
   private iz f;
   private float g;

   public bwq() {
      this(150, 250);
   }

   public bwq(int $$0, int $$1) {
      super(ImmutableMap.of(ccr.E, ccs.c, ccr.t, ccs.b, ccr.m, ccs.a), $$0, $$1);
   }

   protected boolean a(are $$0, btp $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bup<?> $$2 = $$1.dS();
         ccu $$3 = $$2.c(ccr.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Z())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(ccr.m);
            if ($$4) {
               $$2.b(ccr.E);
            }

            return false;
         }
      }
   }

   protected boolean a(are $$0, btp $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ccu> $$3 = $$1.dS().c(ccr.m);
         boolean $$4 = $$3.<Boolean>map(bwq::a).orElse(false);
         ccz $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(are $$0, btp $$1, long $$2) {
      if ($$1.dS().a(ccr.m) && !this.a($$1, $$1.dS().c(ccr.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dS().b(ccr.m);
      $$1.dS().b(ccr.t);
      this.e = null;
   }

   protected void c(are $$0, btp $$1, long $$2) {
      $$1.dS().a(ccr.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(are $$0, btp $$1, long $$2) {
      eoh $$3 = $$1.K().j();
      bup<?> $$4 = $$1.dS();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(ccr.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ccu $$5 = $$4.c(ccr.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Z())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(btp $$0, ccu $$1, long $$2) {
      iz $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      bup<?> $$4 = $$0.dS();
      if (this.a($$0, $$1)) {
         $$4.b(ccr.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(ccr.E);
         } else if (!$$4.a(ccr.E)) {
            $$4.a(ccr.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         evp $$6 = cei.a((btw)$$0, 10, 7, evp.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(btp $$0, ccu $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(ccu $$0) {
      return $$0.a() instanceof bvr $$2 ? $$2.c().N_() : false;
   }
}
