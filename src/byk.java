import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class byk extends bxa<bvj> {
   private static final int c = 40;
   private int d;
   @Nullable
   private esj e;
   @Nullable
   private jh f;
   private float g;

   public byk() {
      this(150, 250);
   }

   public byk(int $$0, int $$1) {
      super(ImmutableMap.of(cel.E, cem.c, cel.t, cem.b, cel.m, cem.a), $$0, $$1);
   }

   protected boolean a(arp $$0, bvj $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bwj<?> $$2 = $$1.eb();
         ceo $$3 = $$2.c(cel.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ab())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cel.m);
            if ($$4) {
               $$2.b(cel.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arp $$0, bvj $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<ceo> $$3 = $$1.eb().c(cel.m);
         boolean $$4 = $$3.<Boolean>map(byk::a).orElse(false);
         cet $$5 = $$1.L();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arp $$0, bvj $$1, long $$2) {
      if ($$1.eb().a(cel.m) && !this.a($$1, $$1.eb().c(cel.m).get()) && $$1.L().s()) {
         this.d = $$0.G_().a(40);
      }

      $$1.L().o();
      $$1.eb().b(cel.m);
      $$1.eb().b(cel.t);
      this.e = null;
   }

   protected void c(arp $$0, bvj $$1, long $$2) {
      $$1.eb().a(cel.t, this.e);
      $$1.L().a(this.e, (double)this.g);
   }

   protected void d(arp $$0, bvj $$1, long $$2) {
      esj $$3 = $$1.L().k();
      bwj<?> $$4 = $$1.eb();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cel.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         ceo $$5 = $$4.c(cel.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ab())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bvj $$0, ceo $$1, long $$2) {
      jh $$3 = $$1.a().b();
      this.e = $$0.L().a($$3, 0);
      this.g = $$1.b();
      bwj<?> $$4 = $$0.eb();
      if (this.a($$0, $$1)) {
         $$4.b(cel.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cel.E);
         } else if (!$$4.a(cel.E)) {
            $$4.a(cel.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         ezy $$6 = cgc.a((bvp)$$0, 10, 7, ezy.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.L().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bvj $$0, ceo $$1) {
      return $$1.a().b().k($$0.dv()) <= $$1.c();
   }

   private static boolean a(ceo $$0) {
      return $$0.a() instanceof bxl $$2 ? $$2.c().Y_() : false;
   }
}
