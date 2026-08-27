import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bhm extends bhr<bgi> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bgi> g = $$0 -> $$0.ed() != null || $$0.dx() || $$0.bL();
   private final float h;
   private final Predicate<bgi> i;

   public bhm(float $$0) {
      this($$0, g);
   }

   public bhm(float $$0, Predicate<bgi> $$1) {
      super(ImmutableMap.of(bpb.Y, bpc.c, bpb.x, bpc.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(aif $$0, bgi $$1) {
      return this.i.test($$1);
   }

   protected boolean a(aif $$0, bgi $$1, long $$2) {
      return true;
   }

   protected void b(aif $$0, bgi $$1, long $$2) {
      $$1.dK().a(bpb.Y, true);
      $$1.dK().b(bpb.m);
   }

   protected void c(aif $$0, bgi $$1, long $$2) {
      bha<?> $$3 = $$1.dK();
      $$3.b(bpb.Y);
   }

   protected void d(aif $$0, bgi $$1, long $$2) {
      if ($$1.J().l()) {
         eei $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dK().a(bpb.m, new bpe($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private eei a(bgi $$0, aif $$1) {
      if ($$0.bL()) {
         Optional<eei> $$2 = this.a((cls)$$1, (bfj)$$0).map(eei::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bqt.a($$0, 5, 4);
   }

   private Optional<gu> a(cls $$0, bfj $$1) {
      gu $$2 = $$1.di();
      if (!$$0.a_($$2).k($$0, $$2).b()) {
         return Optional.empty();
      } else {
         Predicate<gu> $$3;
         if (apa.f($$1.dd()) == 2) {
            $$3 = $$1x -> gu.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(anb.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(anb.a);
         }

         return gu.a($$2, 5, 1, $$3);
      }
   }
}
