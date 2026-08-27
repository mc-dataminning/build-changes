import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bog extends bmx<bli> {
   private static final int c = 40;
   private int d;
   @Nullable
   private edh e;
   @Nullable
   private ht f;
   private float g;

   public bog() {
      this(150, 250);
   }

   public bog(int $$0, int $$1) {
      super(ImmutableMap.of(buh.E, bui.c, buh.t, bui.b, buh.m, bui.a), $$0, $$1);
   }

   protected boolean a(ame $$0, bli $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         bmg<?> $$2 = $$1.dP();
         buk $$3 = $$2.c(buh.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.W())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(buh.m);
            if ($$4) {
               $$2.b(buh.E);
            }

            return false;
         }
      }
   }

   protected boolean a(ame $$0, bli $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<buk> $$3 = $$1.dP().c(buh.m);
         boolean $$4 = $$3.<Boolean>map(bog::a).orElse(false);
         bup $$5 = $$1.N();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(ame $$0, bli $$1, long $$2) {
      if ($$1.dP().a(buh.m) && !this.a($$1, $$1.dP().c(buh.m).get()) && $$1.N().r()) {
         this.d = $$0.E_().a(40);
      }

      $$1.N().n();
      $$1.dP().b(buh.m);
      $$1.dP().b(buh.t);
      this.e = null;
   }

   protected void c(ame $$0, bli $$1, long $$2) {
      $$1.dP().a(buh.t, this.e);
      $$1.N().a(this.e, (double)this.g);
   }

   protected void d(ame $$0, bli $$1, long $$2) {
      edh $$3 = $$1.N().j();
      bmg<?> $$4 = $$1.dP();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(buh.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         buk $$5 = $$4.c(buh.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.W())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(bli $$0, buk $$1, long $$2) {
      ht $$3 = $$1.a().b();
      this.e = $$0.N().a($$3, 0);
      this.g = $$1.b();
      bmg<?> $$4 = $$0.dP();
      if (this.a($$0, $$1)) {
         $$4.b(buh.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(buh.E);
         } else if (!$$4.a(buh.E)) {
            $$4.a(buh.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         eju $$6 = bvw.a((blp)$$0, 10, 7, eju.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.N().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bli $$0, buk $$1) {
      return $$1.a().b().k($$0.dn()) <= $$1.c();
   }

   private static boolean a(buk $$0) {
      return $$0.a() instanceof bni $$2 ? $$2.c().O_() : false;
   }
}
