import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bkj extends bko<bjf> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bjf> g = $$0 -> $$0.ef() != null || $$0.dz() || $$0.bM();
   private final float h;
   private final Predicate<bjf> i;

   public bkj(float $$0) {
      this($$0, g);
   }

   public bkj(float $$0, Predicate<bjf> $$1) {
      super(ImmutableMap.of(bry.Y, brz.c, bry.x, brz.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aki $$0, bjf $$1) {
      return this.i.test($$1);
   }

   protected boolean a(aki $$0, bjf $$1, long $$2) {
      return true;
   }

   protected void b(aki $$0, bjf $$1, long $$2) {
      $$1.dM().a(bry.Y, true);
      $$1.dM().b(bry.m);
   }

   protected void c(aki $$0, bjf $$1, long $$2) {
      bjx<?> $$3 = $$1.dM();
      $$3.b(bry.Y);
   }

   protected void d(aki $$0, bjf $$1, long $$2) {
      if ($$1.H().l()) {
         ehf $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dM().a(bry.m, new bsb($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ehf a(bjf $$0, aki $$1) {
      if ($$0.bM()) {
         Optional<ehf> $$2 = this.a((coq)$$1, (big)$$0).map(ehf::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return btq.a($$0, 5, 4);
   }

   private Optional<gv> a(coq $$0, big $$1) {
      gv $$2 = $$1.dk();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<gv> $$3;
         if (aro.f($$1.df()) == 2) {
            $$3 = $$1x -> gv.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(apo.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(apo.a);
         }

         return gv.a($$2, 5, 1, $$3);
      }
   }
}
