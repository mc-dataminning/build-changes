import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bqk extends bqp<bpf> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bpf> g = $$0 -> $$0.eg() != null || $$0.dy() || $$0.bK();
   private final float h;
   private final Predicate<bpf> i;

   public bqk(float $$0) {
      this($$0, g);
   }

   public bqk(float $$0, Predicate<bpf> $$1) {
      super(ImmutableMap.of(bya.Z, byb.c, bya.x, byb.c), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(apa $$0, bpf $$1) {
      return this.i.test($$1) && ($$1.dM().a(bya.x) || $$1.dM().a(bya.Z));
   }

   protected boolean a(apa $$0, bpf $$1, long $$2) {
      return true;
   }

   protected void b(apa $$0, bpf $$1, long $$2) {
      $$1.dM().a(bya.Z, true);
      $$1.dM().b(bya.m);
   }

   protected void c(apa $$0, bpf $$1, long $$2) {
      bpy<?> $$3 = $$1.dM();
      $$3.b(bya.Z);
   }

   protected void d(apa $$0, bpf $$1, long $$2) {
      if ($$1.N().l()) {
         eov $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dM().a(bya.m, new byd($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private eov a(bpf $$0, apa $$1) {
      if ($$0.bK()) {
         Optional<eov> $$2 = this.a((cvk)$$1, (bof)$$0).map(eov::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bzu.a($$0, 5, 4);
   }

   private Optional<ib> a(cvk $$0, bof $$1) {
      ib $$2 = $$1.dj();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ib> $$3;
         if (awm.f($$1.dd()) == 2) {
            $$3 = $$1x -> ib.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(auj.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(auj.a);
         }

         return ib.a($$2, 5, 1, $$3);
      }
   }
}
