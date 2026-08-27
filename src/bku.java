import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bku extends bkz<bjr> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bjr> g = $$0 -> $$0.eg() != null || $$0.dA() || $$0.bM();
   private final float h;
   private final Predicate<bjr> i;

   public bku(float $$0) {
      this($$0, g);
   }

   public bku(float $$0, Predicate<bjr> $$1) {
      super(ImmutableMap.of(bsj.Y, bsk.c, bsj.x, bsk.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aks $$0, bjr $$1) {
      return this.i.test($$1);
   }

   protected boolean a(aks $$0, bjr $$1, long $$2) {
      return true;
   }

   protected void b(aks $$0, bjr $$1, long $$2) {
      $$1.dN().a(bsj.Y, true);
      $$1.dN().b(bsj.m);
   }

   protected void c(aks $$0, bjr $$1, long $$2) {
      bki<?> $$3 = $$1.dN();
      $$3.b(bsj.Y);
   }

   protected void d(aks $$0, bjr $$1, long $$2) {
      if ($$1.L().l()) {
         ehp $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dN().a(bsj.m, new bsm($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ehp a(bjr $$0, aks $$1) {
      if ($$0.bM()) {
         Optional<ehp> $$2 = this.a((cpd)$$1, (bis)$$0).map(ehp::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bub.a($$0, 5, 4);
   }

   private Optional<gw> a(cpd $$0, bis $$1) {
      gw $$2 = $$1.dl();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<gw> $$3;
         if (ary.f($$1.df()) == 2) {
            $$3 = $$1x -> gw.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(apz.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(apz.a);
         }

         return gw.a($$2, 5, 1, $$3);
      }
   }
}
