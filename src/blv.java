import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class blv extends bma<bks> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bks> g = $$0 -> $$0.eg() != null || $$0.dA() || $$0.bM();
   private final float h;
   private final Predicate<bks> i;

   public blv(float $$0) {
      this($$0, g);
   }

   public blv(float $$0, Predicate<bks> $$1) {
      super(ImmutableMap.of(btk.Y, btl.c, btk.x, btl.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(alq $$0, bks $$1) {
      return this.i.test($$1);
   }

   protected boolean a(alq $$0, bks $$1, long $$2) {
      return true;
   }

   protected void b(alq $$0, bks $$1, long $$2) {
      $$1.dN().a(btk.Y, true);
      $$1.dN().b(btk.m);
   }

   protected void c(alq $$0, bks $$1, long $$2) {
      blj<?> $$3 = $$1.dN();
      $$3.b(btk.Y);
   }

   protected void d(alq $$0, bks $$1, long $$2) {
      if ($$1.L().l()) {
         eif $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dN().a(btk.m, new btn($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private eif a(bks $$0, alq $$1) {
      if ($$0.bM()) {
         Optional<eif> $$2 = this.a((cqf)$$1, (bjt)$$0).map(eif::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bvc.a($$0, 5, 4);
   }

   private Optional<ht> a(cqf $$0, bjt $$1) {
      ht $$2 = $$1.dl();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ht> $$3;
         if (asy.f($$1.df()) == 2) {
            $$3 = $$1x -> ht.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(aqx.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(aqx.a);
         }

         return ht.a($$2, 5, 1, $$3);
      }
   }
}
