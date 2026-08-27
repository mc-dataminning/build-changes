import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bpr extends bpw<boo> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<boo> g = $$0 -> $$0.ei() != null || $$0.dB() || $$0.bN();
   private final float h;
   private final Predicate<boo> i;

   public bpr(float $$0) {
      this($$0, g);
   }

   public bpr(float $$0, Predicate<boo> $$1) {
      super(ImmutableMap.of(bxh.Z, bxi.c, bxh.x, bxi.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aov $$0, boo $$1) {
      return this.i.test($$1) && ($$1.dO().a(bxh.x) || $$1.dO().a(bxh.Z));
   }

   protected boolean a(aov $$0, boo $$1, long $$2) {
      return true;
   }

   protected void b(aov $$0, boo $$1, long $$2) {
      $$1.dO().a(bxh.Z, true);
      $$1.dO().b(bxh.m);
   }

   protected void c(aov $$0, boo $$1, long $$2) {
      bpf<?> $$3 = $$1.dO();
      $$3.b(bxh.Z);
   }

   protected void d(aov $$0, boo $$1, long $$2) {
      if ($$1.N().l()) {
         ens $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dO().a(bxh.m, new bxk($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ens a(boo $$0, aov $$1) {
      if ($$0.bN()) {
         Optional<ens> $$2 = this.a((cut)$$1, (bno)$$0).map(ens::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bzb.a($$0, 5, 4);
   }

   private Optional<hz> a(cut $$0, bno $$1) {
      hz $$2 = $$1.dm();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<hz> $$3;
         if (awh.f($$1.dg()) == 2) {
            $$3 = $$1x -> hz.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(aue.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(aue.a);
         }

         return hz.a($$2, 5, 1, $$3);
      }
   }
}
