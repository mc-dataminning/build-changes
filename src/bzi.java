import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bzi extends bxy<bwh> {
   private static final int c = 40;
   private int d;
   @Nullable
   private euk e;
   @Nullable
   private jh f;
   private float g;

   public bzi() {
      this(150, 250);
   }

   public bzi(int $$0, int $$1) {
      super(ImmutableMap.of(cfj.E, cfk.c, cfj.t, cfk.b, cfj.m, cfk.a), $$0, $$1);
   }

   protected boolean a(ash $$0, bwh $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bxh<?> $$2 = $$1.eb();
         cfm $$3 = $$2.c(cfj.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ac())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cfj.m);
            if ($$4) {
               $$2.b(cfj.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ash $$0, bwh $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cfm> $$3 = $$1.eb().c(cfj.m);
         boolean $$4 = $$3.<Boolean>map(bzi::a).orElse(false);
         cfr $$5 = $$1.L();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ash $$0, bwh $$1, long $$2) {
      if ($$1.eb().a(cfj.m) && !this.a($$1, $$1.eb().c(cfj.m).get()) && $$1.L().s()) {
         this.d = $$0.H_().a(40);
      }

      $$1.L().o();
      $$1.eb().b(cfj.m);
      $$1.eb().b(cfj.t);
      this.e = null;
   }

   protected void c(ash $$0, bwh $$1, long $$2) {
      $$1.eb().a(cfj.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(ash $$0, bwh $$1, long $$2) {
      euk $$3 = $$1.L().k();
      bxh<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cfj.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cfm $$5 = $$4.c(cfj.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ac())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bwh $$0, cfm $$1, long $$2) {
      jh $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bxh<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cfj.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cfj.E);
         } else if (!$$4.a(cfj.E)) {
            $$4.a(cfj.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fbx $$6 = cha.a((bwn)$$0, 10, 7, fbx.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bwh $$0, cfm $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(cfm $$0) {
      return $$0.a() instanceof byj $$2 ? $$2.c().aa_() : false;
   }
}
