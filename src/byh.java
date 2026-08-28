import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class byh extends bwx<bvg> {
   private static final int c = 40;
   private int d;
   @Nullable
   private esc e;
   @Nullable
   private jh f;
   private float g;

   public byh() {
      this(150, 250);
   }

   public byh(int $$0, int $$1) {
      super(ImmutableMap.of(cei.E, cej.c, cei.t, cej.b, cei.m, cej.a), $$0, $$1);
   }

   protected boolean a(arq $$0, bvg $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bwg<?> $$2 = $$1.ee();
         cel $$3 = $$2.c(cei.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.aa())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cei.m);
            if ($$4) {
               $$2.b(cei.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arq $$0, bvg $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cel> $$3 = $$1.ee().c(cei.m);
         boolean $$4 = $$3.<Boolean>map(byh::a).orElse(false);
         ceq $$5 = $$1.P();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arq $$0, bvg $$1, long $$2) {
      if ($$1.ee().a(cei.m) && !this.a($$1, $$1.ee().c(cei.m).get()) && $$1.P().s()) {
         this.d = $$0.E_().a(40);
      }

      $$1.P().o();
      $$1.ee().b(cei.m);
      $$1.ee().b(cei.t);
      this.e = null;
   }

   protected void c(arq $$0, bvg $$1, long $$2) {
      $$1.ee().a(cei.t, this.e);
      $$1.P().a(this.e, (double)this.g);
   }

   protected void d(arq $$0, bvg $$1, long $$2) {
      esc $$3 = $$1.P().k();
      bwg<?> $$4 = $$1.ee();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cei.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cel $$5 = $$4.c(cei.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.aa())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bvg $$0, cel $$1, long $$2) {
      jh $$3 = $$1.a().b();
      this.e = $$0.P().a($$3, 0);
      this.g = $$1.b();
      bwg<?> $$4 = $$0.ee();
      if (this.a($$0, $$1)) {
         $$4.b(cei.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cei.E);
         } else if (!$$4.a(cei.E)) {
            $$4.a(cei.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ezr $$6 = cfz.a((bvm)$$0, 10, 7, ezr.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.P().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bvg $$0, cel $$1) {
      return $$1.a().b().k($$0.dy()) <= $$1.c();
   }

   private static boolean a(cel $$0) {
      return $$0.a() instanceof bxi $$2 ? $$2.c().R_() : false;
   }
}
