import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bnh extends bnm<bme> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bme> g = $$0 -> $$0.eh() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<bme> i;

   public bnh(float $$0) {
      this($$0, g);
   }

   public bnh(float $$0, Predicate<bme> $$1) {
      super(ImmutableMap.of(bux.Y, buy.c, bux.x, buy.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(amp $$0, bme $$1) {
      return this.i.test($$1);
   }

   protected boolean a(amp $$0, bme $$1, long $$2) {
      return true;
   }

   protected void b(amp $$0, bme $$1, long $$2) {
      $$1.dO().a(bux.Y, true);
      $$1.dO().b(bux.m);
   }

   protected void c(amp $$0, bme $$1, long $$2) {
      bmv<?> $$3 = $$1.dO();
      $$3.b(bux.Y);
   }

   protected void d(amp $$0, bme $$1, long $$2) {
      if ($$1.N().l()) {
         elb $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dO().a(bux.m, new bva($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private elb a(bme $$0, amp $$1) {
      if ($$0.bN()) {
         Optional<elb> $$2 = this.a((cse)$$1, (blf)$$0).map(elb::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bwq.a($$0, 5, 4);
   }

   private Optional<hv> a(cse $$0, blf $$1) {
      hv $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<hv> $$3;
         if (aty.f($$1.dg()) == 2) {
            $$3 = $$1x -> hv.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(arw.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(arw.a);
         }

         return hv.a($$2, 5, 1, $$3);
      }
   }
}
