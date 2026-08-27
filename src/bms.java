import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bms extends bmx<blp> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<blp> g = $$0 -> $$0.ei() != null || $$0.dC() || $$0.bN();
   private final float h;
   private final Predicate<blp> i;

   public bms(float $$0) {
      this($$0, g);
   }

   public bms(float $$0, Predicate<blp> $$1) {
      super(ImmutableMap.of(buh.Y, bui.c, buh.x, bui.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(ame $$0, blp $$1) {
      return this.i.test($$1);
   }

   protected boolean a(ame $$0, blp $$1, long $$2) {
      return true;
   }

   protected void b(ame $$0, blp $$1, long $$2) {
      $$1.dP().a(buh.Y, true);
      $$1.dP().b(buh.m);
   }

   protected void c(ame $$0, blp $$1, long $$2) {
      bmg<?> $$3 = $$1.dP();
      $$3.b(buh.Y);
   }

   protected void d(ame $$0, blp $$1, long $$2) {
      if ($$1.N().l()) {
         eju $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dP().a(buh.m, new buk($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private eju a(blp $$0, ame $$1) {
      if ($$0.bN()) {
         Optional<eju> $$2 = this.a((crg)$$1, (bkq)$$0).map(eju::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bvz.a($$0, 5, 4);
   }

   private Optional<ht> a(crg $$0, bkq $$1) {
      ht $$2 = $$1.dn();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ht> $$3;
         if (atm.f($$1.dh()) == 2) {
            $$3 = $$1x -> ht.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(arl.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(arl.a);
         }

         return ht.a($$2, 5, 1, $$3);
      }
   }
}
