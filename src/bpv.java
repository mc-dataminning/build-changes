import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bpv extends bqa<boq> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<boq> g = $$0 -> $$0.ei() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<boq> i;

   public bpv(float $$0) {
      this($$0, g);
   }

   public bpv(float $$0, Predicate<boq> $$1) {
      super(ImmutableMap.of(bxl.Z, bxm.c, bxl.x, bxm.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aow $$0, boq $$1) {
      return this.i.test($$1) && ($$1.dO().a(bxl.x) || $$1.dO().a(bxl.Z));
   }

   protected boolean a(aow $$0, boq $$1, long $$2) {
      return true;
   }

   protected void b(aow $$0, boq $$1, long $$2) {
      $$1.dO().a(bxl.Z, true);
      $$1.dO().b(bxl.m);
   }

   protected void c(aow $$0, boq $$1, long $$2) {
      bpj<?> $$3 = $$1.dO();
      $$3.b(bxl.Z);
   }

   protected void d(aow $$0, boq $$1, long $$2) {
      if ($$1.N().l()) {
         enz $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dO().a(bxl.m, new bxo($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private enz a(boq $$0, aow $$1) {
      if ($$0.bN()) {
         Optional<enz> $$2 = this.a((cux)$$1, (bnq)$$0).map(enz::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bzf.a($$0, 5, 4);
   }

   private Optional<hz> a(cux $$0, bnq $$1) {
      hz $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<hz> $$3;
         if (awi.f($$1.dg()) == 2) {
            $$3 = $$1x -> hz.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(auf.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(auf.a);
         }

         return hz.a($$2, 5, 1, $$3);
      }
   }
}
