import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bnr extends bnw<bmo> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bmo> g = $$0 -> $$0.eh() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<bmo> i;

   public bnr(float $$0) {
      this($$0, g);
   }

   public bnr(float $$0, Predicate<bmo> $$1) {
      super(ImmutableMap.of(bvh.Y, bvi.c, bvh.x, bvi.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(amz $$0, bmo $$1) {
      return this.i.test($$1);
   }

   protected boolean a(amz $$0, bmo $$1, long $$2) {
      return true;
   }

   protected void b(amz $$0, bmo $$1, long $$2) {
      $$1.dO().a(bvh.Y, true);
      $$1.dO().b(bvh.m);
   }

   protected void c(amz $$0, bmo $$1, long $$2) {
      bnf<?> $$3 = $$1.dO();
      $$3.b(bvh.Y);
   }

   protected void d(amz $$0, bmo $$1, long $$2) {
      if ($$1.N().l()) {
         elm $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dO().a(bvh.m, new bvk($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private elm a(bmo $$0, amz $$1) {
      if ($$0.bN()) {
         Optional<elm> $$2 = this.a((cso)$$1, (blp)$$0).map(elm::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bxa.a($$0, 5, 4);
   }

   private Optional<hx> a(cso $$0, blp $$1) {
      hx $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<hx> $$3;
         if (aui.f($$1.dg()) == 2) {
            $$3 = $$1x -> hx.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(asg.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(asg.a);
         }

         return hx.a($$2, 5, 1, $$3);
      }
   }
}
