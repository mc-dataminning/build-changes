import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxp extends bwf<bup> {
   private static final int c = 40;
   private int d;
   @Nullable
   private erh e;
   @Nullable
   private jf f;
   private float g;

   public bxp() {
      this(150, 250);
   }

   public bxp(int $$0, int $$1) {
      super(ImmutableMap.of(cdq.E, cdr.c, cdq.t, cdr.b, cdq.m, cdr.a), $$0, $$1);
   }

   protected boolean a(arj $$0, bup $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bvo<?> $$2 = $$1.dY();
         cdt $$3 = $$2.c(cdq.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.aa())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cdq.m);
            if ($$4) {
               $$2.b(cdq.E);
            }

            return false;
         }
      }
   }

   protected boolean a(arj $$0, bup $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cdt> $$3 = $$1.dY().c(cdq.m);
         boolean $$4 = $$3.<Boolean>map(bxp::a).orElse(false);
         cdy $$5 = $$1.P();
         return !$$5.m() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(arj $$0, bup $$1, long $$2) {
      if ($$1.dY().a(cdq.m) && !this.a($$1, $$1.dY().c(cdq.m).get()) && $$1.P().s()) {
         this.d = $$0.D_().a(40);
      }

      $$1.P().o();
      $$1.dY().b(cdq.m);
      $$1.dY().b(cdq.t);
      this.e = null;
   }

   protected void c(arj $$0, bup $$1, long $$2) {
      $$1.dY().a(cdq.t, this.e);
      $$1.P().a(this.e, (double)this.g);
   }

   protected void d(arj $$0, bup $$1, long $$2) {
      erh $$3 = $$1.P().k();
      bvo<?> $$4 = $$1.dY();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cdq.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         cdt $$5 = $$4.c(cdq.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.aa())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bup $$0, cdt $$1, long $$2) {
      jf $$3 = $$1.a().b();
      this.e = $$0.P().a($$3, 0);
      this.g = $$1.b();
      bvo<?> $$4 = $$0.dY();
      if (this.a($$0, $$1)) {
         $$4.b(cdq.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cdq.E);
         } else if (!$$4.a(cdq.E)) {
            $$4.a(cdq.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eyw $$6 = cfh.a((buv)$$0, 10, 7, eyw.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.P().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bup $$0, cdt $$1) {
      return $$1.a().b().k($$0.ds()) <= $$1.c();
   }

   private static boolean a(cdt $$0) {
      return $$0.a() instanceof bwq $$2 ? $$2.c().Q_() : false;
   }
}
