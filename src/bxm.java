import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxm extends bwc<bum> {
   private static final int c = 40;
   private int d;
   @Nullable
   private erd e;
   @Nullable
   private je f;
   private float g;

   public bxm() {
      this(150, 250);
   }

   public bxm(int $$0, int $$1) {
      super(ImmutableMap.of(cdn.E, cdo.c, cdn.t, cdo.b, cdn.m, cdo.a), $$0, $$1);
   }

   protected boolean a(arh $$0, bum $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bvl<?> $$2 = $$1.dX();
         cdq $$3 = $$2.c(cdn.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.aa())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cdn.m);
            if ($$4) {
               $$2.b(cdn.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arh $$0, bum $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cdq> $$3 = $$1.dX().c(cdn.m);
         boolean $$4 = $$3.<Boolean>map(bxm::a).orElse(false);
         cdv $$5 = $$1.P();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arh $$0, bum $$1, long $$2) {
      if ($$1.dX().a(cdn.m) && !this.a($$1, $$1.dX().c(cdn.m).get()) && $$1.P().s()) {
         this.d = $$0.C_().a(40);
      }

      $$1.P().o();
      $$1.dX().b(cdn.m);
      $$1.dX().b(cdn.t);
      this.e = null;
   }

   protected void c(arh $$0, bum $$1, long $$2) {
      $$1.dX().a(cdn.t, this.e);
      $$1.P().a(this.e, (double)this.g);
   }

   protected void d(arh $$0, bum $$1, long $$2) {
      erd $$3 = $$1.P().k();
      bvl<?> $$4 = $$1.dX();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cdn.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cdq $$5 = $$4.c(cdn.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.aa())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bum $$0, cdq $$1, long $$2) {
      je $$3 = $$1.a().b();
      this.e = $$0.P().a($$3, 0);
      this.g = $$1.b();
      bvl<?> $$4 = $$0.dX();
      if (this.a($$0, $$1)) {
         $$4.b(cdn.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cdn.E);
         } else if (!$$4.a(cdn.E)) {
            $$4.a(cdn.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eys $$6 = cfe.a((bus)$$0, 10, 7, eys.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.P().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bum $$0, cdq $$1) {
      return $$1.a().b().k($$0.ds()) <= $$1.c();
   }

   private static boolean a(cdq $$0) {
      return $$0.a() instanceof bwn $$2 ? $$2.c().P_() : false;
   }
}
