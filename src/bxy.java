import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxy extends bwo<bux> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ers e;
   @Nullable
   private jg f;
   private float g;

   public bxy() {
      this(150, 250);
   }

   public bxy(int $$0, int $$1) {
      super(ImmutableMap.of(cdz.E, cea.c, cdz.t, cea.b, cdz.m, cea.a), $$0, $$1);
   }

   protected boolean a(arm $$0, bux $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bvx<?> $$2 = $$1.ed();
         cec $$3 = $$2.c(cdz.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.aa())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cdz.m);
            if ($$4) {
               $$2.b(cdz.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arm $$0, bux $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cec> $$3 = $$1.ed().c(cdz.m);
         boolean $$4 = $$3.<Boolean>map(bxy::a).orElse(false);
         ceh $$5 = $$1.P();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arm $$0, bux $$1, long $$2) {
      if ($$1.ed().a(cdz.m) && !this.a($$1, $$1.ed().c(cdz.m).get()) && $$1.P().s()) {
         this.d = $$0.E_().a(40);
      }

      $$1.P().o();
      $$1.ed().b(cdz.m);
      $$1.ed().b(cdz.t);
      this.e = null;
   }

   protected void c(arm $$0, bux $$1, long $$2) {
      $$1.ed().a(cdz.t, this.e);
      $$1.P().a(this.e, (double)this.g);
   }

   protected void d(arm $$0, bux $$1, long $$2) {
      ers $$3 = $$1.P().k();
      bvx<?> $$4 = $$1.ed();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cdz.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cec $$5 = $$4.c(cdz.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.aa())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bux $$0, cec $$1, long $$2) {
      jg $$3 = $$1.a().b();
      this.e = $$0.P().a($$3, 0);
      this.g = $$1.b();
      bvx<?> $$4 = $$0.ed();
      if (this.a($$0, $$1)) {
         $$4.b(cdz.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cdz.E);
         } else if (!$$4.a(cdz.E)) {
            $$4.a(cdz.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ezh $$6 = cfq.a((bvd)$$0, 10, 7, ezh.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.P().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bux $$0, cec $$1) {
      return $$1.a().b().k($$0.dx()) <= $$1.c();
   }

   private static boolean a(cec $$0) {
      return $$0.a() instanceof bwz $$2 ? $$2.c().R_() : false;
   }
}
