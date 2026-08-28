import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bzj extends bxz<bwi> {
   private static final int c = 40;
   private int d;
   @Nullable
   private eul e;
   @Nullable
   private jh f;
   private float g;

   public bzj() {
      this(150, 250);
   }

   public bzj(int $$0, int $$1) {
      super(ImmutableMap.of(cfk.E, cfl.c, cfk.t, cfl.b, cfk.m, cfl.a), $$0, $$1);
   }

   protected boolean a(ash $$0, bwi $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bxi<?> $$2 = $$1.ec();
         cfn $$3 = $$2.c(cfk.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ac())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cfk.m);
            if ($$4) {
               $$2.b(cfk.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ash $$0, bwi $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cfn> $$3 = $$1.ec().c(cfk.m);
         boolean $$4 = $$3.<Boolean>map(bzj::a).orElse(false);
         cfs $$5 = $$1.L();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ash $$0, bwi $$1, long $$2) {
      if ($$1.ec().a(cfk.m) && !this.a($$1, $$1.ec().c(cfk.m).get()) && $$1.L().s()) {
         this.d = $$0.H_().a(40);
      }

      $$1.L().o();
      $$1.ec().b(cfk.m);
      $$1.ec().b(cfk.t);
      this.e = null;
   }

   protected void c(ash $$0, bwi $$1, long $$2) {
      $$1.ec().a(cfk.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(ash $$0, bwi $$1, long $$2) {
      eul $$3 = $$1.L().k();
      bxi<?> $$4 = $$1.ec();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cfk.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cfn $$5 = $$4.c(cfk.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ac())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bwi $$0, cfn $$1, long $$2) {
      jh $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bxi<?> $$4 = $$0.ec();
      if (this.a($$0, $$1)) {
         $$4.b(cfk.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cfk.E);
         } else if (!$$4.a(cfk.E)) {
            $$4.a(cfk.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fby $$6 = chb.a((bwo)$$0, 10, 7, fby.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bwi $$0, cfn $$1) {
      return $$1.a().b().k($$0.dw()) <= $$1.c();
   }

   private static boolean a(cfn $$0) {
      return $$0.a() instanceof byk $$2 ? $$2.c().aa_() : false;
   }
}
