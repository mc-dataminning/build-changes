import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bnw extends bob<bmt> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bmt> g = $$0 -> $$0.eh() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<bmt> i;

   public bnw(float $$0) {
      this($$0, g);
   }

   public bnw(float $$0, Predicate<bmt> $$1) {
      super(ImmutableMap.of(bvm.Y, bvn.c, bvm.x, bvn.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(and $$0, bmt $$1) {
      return this.i.test($$1);
   }

   protected boolean a(and $$0, bmt $$1, long $$2) {
      return true;
   }

   protected void b(and $$0, bmt $$1, long $$2) {
      $$1.dO().a(bvm.Y, true);
      $$1.dO().b(bvm.m);
   }

   protected void c(and $$0, bmt $$1, long $$2) {
      bnk<?> $$3 = $$1.dO();
      $$3.b(bvm.Y);
   }

   protected void d(and $$0, bmt $$1, long $$2) {
      if ($$1.N().l()) {
         els $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dO().a(bvm.m, new bvp($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private els a(bmt $$0, and $$1) {
      if ($$0.bN()) {
         Optional<els> $$2 = this.a((csu)$$1, (blu)$$0).map(els::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bxf.a($$0, 5, 4);
   }

   private Optional<hx> a(csu $$0, blu $$1) {
      hx $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<hx> $$3;
         if (aun.f($$1.dg()) == 2) {
            $$3 = $$1x -> hx.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(asl.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(asl.a);
         }

         return hx.a($$2, 5, 1, $$3);
      }
   }
}
