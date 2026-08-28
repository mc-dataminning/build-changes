import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class byd extends bwt<bvc> {
   private static final int c = 40;
   private int d;
   @Nullable
   private ery e;
   @Nullable
   private jh f;
   private float g;

   public byd() {
      this(150, 250);
   }

   public byd(int $$0, int $$1) {
      super(ImmutableMap.of(cee.E, cef.c, cee.t, cef.b, cee.m, cef.a), $$0, $$1);
   }

   protected boolean a(arn $$0, bvc $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bwc<?> $$2 = $$1.ed();
         ceh $$3 = $$2.c(cee.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.aa())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cee.m);
            if ($$4) {
               $$2.b(cee.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arn $$0, bvc $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ceh> $$3 = $$1.ed().c(cee.m);
         boolean $$4 = $$3.<Boolean>map(byd::a).orElse(false);
         cem $$5 = $$1.P();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arn $$0, bvc $$1, long $$2) {
      if ($$1.ed().a(cee.m) && !this.a($$1, $$1.ed().c(cee.m).get()) && $$1.P().s()) {
         this.d = $$0.E_().a(40);
      }

      $$1.P().o();
      $$1.ed().b(cee.m);
      $$1.ed().b(cee.t);
      this.e = null;
   }

   protected void c(arn $$0, bvc $$1, long $$2) {
      $$1.ed().a(cee.t, this.e);
      $$1.P().a(this.e, (double)this.g);
   }

   protected void d(arn $$0, bvc $$1, long $$2) {
      ery $$3 = $$1.P().k();
      bwc<?> $$4 = $$1.ed();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cee.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ceh $$5 = $$4.c(cee.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.aa())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bvc $$0, ceh $$1, long $$2) {
      jh $$3 = $$1.a().b();
      this.e = $$0.P().a($$3, 0);
      this.g = $$1.b();
      bwc<?> $$4 = $$0.ed();
      if (this.a($$0, $$1)) {
         $$4.b(cee.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cee.E);
         } else if (!$$4.a(cee.E)) {
            $$4.a(cee.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ezn $$6 = cfv.a((bvi)$$0, 10, 7, ezn.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.P().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bvc $$0, ceh $$1) {
      return $$1.a().b().k($$0.dx()) <= $$1.c();
   }

   private static boolean a(ceh $$0) {
      return $$0.a() instanceof bxe $$2 ? $$2.c().R_() : false;
   }
}
