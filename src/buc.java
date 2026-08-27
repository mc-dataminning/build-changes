import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buc<E extends bsx> extends buh<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bsx> g = $$0 -> $$0.em() != null || $$0.dE() || $$0.bQ();
   private final float h;
   private final Predicate<E> i;

   public buc(float $$0) {
      this($$0, g::test);
   }

   public buc(float $$0, Predicate<E> $$1) {
      super(Map.of(cbs.Z, cbt.c, cbs.x, cbt.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aqm $$0, E $$1) {
      return this.i.test($$1) && ($$1.dS().a(cbs.x) || $$1.dS().a(cbs.Z));
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      $$1.dS().a(cbs.Z, true);
      $$1.dS().b(cbs.m);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      btq<?> $$3 = $$1.dS();
      $$3.b(cbs.Z);
   }

   protected void d(aqm $$0, E $$1, long $$2) {
      if ($$1.K().l()) {
         euk $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dS().a(cbs.m, new cbv($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private euk a(E $$0, aqm $$1) {
      if ($$0.bQ()) {
         Optional<euk> $$2 = this.a((dad)$$1, $$0).map(euk::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cdm.a($$0, 5, 4);
   }

   private Optional<io> a(dad $$0, bru $$1) {
      io $$2 = $$1.dp();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<io> $$3;
         if (ayd.f($$1.dj()) == 2) {
            $$3 = $$1x -> io.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awb.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awb.a);
         }

         return io.a($$2, 5, 1, $$3);
      }
   }
}
