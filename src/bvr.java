import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bvr extends buh<bsq> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eni e;
   @Nullable
   private io f;
   private float g;

   public bvr() {
      this(150, 250);
   }

   public bvr(int $$0, int $$1) {
      super(ImmutableMap.of(cbs.E, cbt.c, cbs.t, cbt.b, cbs.m, cbt.a), $$0, $$1);
   }

   protected boolean a(aqm $$0, bsq $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         btq<?> $$2 = $$1.dS();
         cbv $$3 = $$2.c(cbs.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.Y())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cbs.m);
            if ($$4) {
               $$2.b(cbs.E);
            }

            return false;
         }
      }
   }

   protected boolean a(aqm $$0, bsq $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cbv> $$3 = $$1.dS().c(cbs.m);
         boolean $$4 = $$3.<Boolean>map(bvr::a).orElse(false);
         cca $$5 = $$1.K();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aqm $$0, bsq $$1, long $$2) {
      if ($$1.dS().a(cbs.m) && !this.a($$1, $$1.dS().c(cbs.m).get()) && $$1.K().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.K().n();
      $$1.dS().b(cbs.m);
      $$1.dS().b(cbs.t);
      this.e = null;
   }

   protected void c(aqm $$0, bsq $$1, long $$2) {
      $$1.dS().a(cbs.t, this.e);
      $$1.K().a(this.e, (double)this.g);
   }

   protected void d(aqm $$0, bsq $$1, long $$2) {
      eni $$3 = $$1.K().j();
      btq<?> $$4 = $$1.dS();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cbs.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cbv $$5 = $$4.c(cbs.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.Y())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bsq $$0, cbv $$1, long $$2) {
      io $$3 = $$1.a().b();
      this.e = $$0.K().a($$3, 0);
      this.g = $$1.b();
      btq<?> $$4 = $$0.dS();
      if (this.a($$0, $$1)) {
         $$4.b(cbs.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cbs.E);
         } else if (!$$4.a(cbs.E)) {
            $$4.a(cbs.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         euk $$6 = cdj.a((bsx)$$0, 10, 7, euk.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.K().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bsq $$0, cbv $$1) {
      return $$1.a().b().k($$0.dp()) <= $$1.c();
   }

   private static boolean a(cbv $$0) {
      return $$0.a() instanceof bus $$2 ? $$2.c().N_() : false;
   }
}
