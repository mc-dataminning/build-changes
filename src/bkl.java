import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bkl extends bkq<bjh> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bjh> g = $$0 -> $$0.ef() != null || $$0.dz() || $$0.bM();
   private final float h;
   private final Predicate<bjh> i;

   public bkl(float $$0) {
      this($$0, g);
   }

   public bkl(float $$0, Predicate<bjh> $$1) {
      super(ImmutableMap.of(bsa.Y, bsb.c, bsa.x, bsb.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(akk $$0, bjh $$1) {
      return this.i.test($$1);
   }

   protected boolean a(akk $$0, bjh $$1, long $$2) {
      return true;
   }

   protected void b(akk $$0, bjh $$1, long $$2) {
      $$1.dM().a(bsa.Y, true);
      $$1.dM().b(bsa.m);
   }

   protected void c(akk $$0, bjh $$1, long $$2) {
      bjz<?> $$3 = $$1.dM();
      $$3.b(bsa.Y);
   }

   protected void d(akk $$0, bjh $$1, long $$2) {
      if ($$1.H().l()) {
         ehe $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dM().a(bsa.m, new bsd($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ehe a(bjh $$0, akk $$1) {
      if ($$0.bM()) {
         Optional<ehe> $$2 = this.a((cos)$$1, (bii)$$0).map(ehe::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bts.a($$0, 5, 4);
   }

   private Optional<gu> a(cos $$0, bii $$1) {
      gu $$2 = $$1.dk();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<gu> $$3;
         if (arp.f($$1.df()) == 2) {
            $$3 = $$1x -> gu.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(apq.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(apq.a);
         }

         return gu.a($$2, 5, 1, $$3);
      }
   }
}
