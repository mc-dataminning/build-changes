import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bva<E extends btu> extends bvf<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<btu, awt<brl>> h;

   public bva(float $$0) {
      this($$0, $$0x -> awf.F);
   }

   public bva(float $$0, Function<btu, awt<brl>> $$1) {
      super(Map.of(ccq.Z, ccr.c, ccq.x, ccr.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(aqt $$0, E $$1) {
      return $$1.dU().c(ccq.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.dU().a(ccq.Z);
   }

   protected boolean a(aqt $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      $$1.dU().a(ccq.Z, true);
      $$1.dU().b(ccq.m);
   }

   protected void c(aqt $$0, E $$1, long $$2) {
      buo<?> $$3 = $$1.dU();
      $$3.b(ccq.Z);
   }

   protected void d(aqt $$0, E $$1, long $$2) {
      if ($$1.J().l()) {
         eww $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dU().a(ccq.m, new cct($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private eww a(E $$0, aqt $$1) {
      if ($$0.bR()) {
         Optional<eww> $$2 = this.a((dca)$$1, $$0).map(eww::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cek.a($$0, 5, 4);
   }

   private Optional<jd> a(dca $$0, bsq $$1) {
      jd $$2 = $$1.dq();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jd> $$3;
         if (ayn.f($$1.dk()) == 2) {
            $$3 = $$1x -> jd.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(awj.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(awj.a);
         }

         return jd.a($$2, 5, 1, $$3);
      }
   }
}
