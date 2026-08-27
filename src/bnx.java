import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bnx extends boc<bmu> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bmu> g = $$0 -> $$0.eh() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<bmu> i;

   public bnx(float $$0) {
      this($$0, g);
   }

   public bnx(float $$0, Predicate<bmu> $$1) {
      super(ImmutableMap.of(bvn.Y, bvo.c, bvn.x, bvo.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(and $$0, bmu $$1) {
      return this.i.test($$1);
   }

   protected boolean a(and $$0, bmu $$1, long $$2) {
      return true;
   }

   protected void b(and $$0, bmu $$1, long $$2) {
      $$1.dO().a(bvn.Y, true);
      $$1.dO().b(bvn.m);
   }

   protected void c(and $$0, bmu $$1, long $$2) {
      bnl<?> $$3 = $$1.dO();
      $$3.b(bvn.Y);
   }

   protected void d(and $$0, bmu $$1, long $$2) {
      if ($$1.N().l()) {
         elt $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dO().a(bvn.m, new bvq($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private elt a(bmu $$0, and $$1) {
      if ($$0.bN()) {
         Optional<elt> $$2 = this.a((csv)$$1, (blv)$$0).map(elt::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bxg.a($$0, 5, 4);
   }

   private Optional<hx> a(csv $$0, blv $$1) {
      hx $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<hx> $$3;
         if (auo.f($$1.dg()) == 2) {
            $$3 = $$1x -> hx.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(asm.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(asm.a);
         }

         return hx.a($$2, 5, 1, $$3);
      }
   }
}
