import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bny extends bmp<bla> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ecv e;
   @Nullable
   private ht f;
   private float g;

   public bny() {
      this(150, 250);
   }

   public bny(int $$0, int $$1) {
      super(ImmutableMap.of(btz.E, bua.c, btz.t, bua.b, btz.m, bua.a), $$0, $$1);
   }

   protected boolean a(ama $$0, bla $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bly<?> $$2 = $$1.dN();
         buc $$3 = $$2.c(btz.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.V())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(btz.m);
            if ($$4) {
               $$2.b(btz.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ama $$0, bla $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<buc> $$3 = $$1.dN().c(btz.m);
         boolean $$4 = $$3.<Boolean>map(bny::a).orElse(false);
         buh $$5 = $$1.L();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ama $$0, bla $$1, long $$2) {
      if ($$1.dN().a(btz.m) && !this.a($$1, $$1.dN().c(btz.m).get()) && $$1.L().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.L().n();
      $$1.dN().b(btz.m);
      $$1.dN().b(btz.t);
      this.e = null;
   }

   protected void c(ama $$0, bla $$1, long $$2) {
      $$1.dN().a(btz.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(ama $$0, bla $$1, long $$2) {
      ecv $$3 = $$1.L().j();
      bly<?> $$4 = $$1.dN();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(btz.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         buc $$5 = $$4.c(btz.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.V())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bla $$0, buc $$1, long $$2) {
      ht $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bly<?> $$4 = $$0.dN();
      if (this.a($$0, $$1)) {
         $$4.b(btz.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(btz.E);
         } else if (!$$4.a(btz.E)) {
            $$4.a(btz.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eji $$6 = bvo.a((blh)$$0, 10, 7, eji.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bla $$0, buc $$1) {
      return $$1.a().b().k($$0.dl()) <= $$1.c();
   }

   private static boolean a(buc $$0) {
      return $$0.a() instanceof bna $$2 ? $$2.c().N_() : false;
   }
}
