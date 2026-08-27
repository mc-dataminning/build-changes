import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface csi extends cse {
   dkg D_();

   @Nullable
   cse c(int var1, int var2);

   default boolean a(@Nullable blf $$0, elu $$1) {
      return true;
   }

   default boolean a(dip $$0, hv $$1, elg $$2) {
      elu $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(blf $$0) {
      return this.a($$0, elr.a($$0.cH()));
   }

   default boolean b(ekw $$0) {
      return this.a(null, $$0);
   }

   default boolean g(blf $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable blf $$0, ekw $$1) {
      for (elu $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         elu $$3 = this.h($$0, $$1);
         return $$3 == null || !elr.c($$3, elr.a($$1), elf.i);
      }
   }

   default boolean b(@Nullable blf $$0, ekw $$1) {
      for (elu $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<elu> c(@Nullable blf var1, ekw var2);

   default Iterable<elu> d(@Nullable blf $$0, ekw $$1) {
      List<elu> $$2 = this.c($$0, $$1);
      Iterable<elu> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<elu> e(@Nullable blf $$0, ekw $$1) {
      return () -> new csc<elu>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private elu h(blf $$0, ekw $$1) {
      dkg $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable blf $$0, ekw $$1) {
      csc<elu> $$2 = new csc<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((elu)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<hv> g(blf $$0, ekw $$1) {
      hv $$2 = null;
      double $$3 = Double.MAX_VALUE;
      csc<hv> $$4 = new csc<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         hv $$5 = (hv)$$4.next();
         double $$6 = $$5.b($$0.dk());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<elb> a(@Nullable blf $$0, elu $$1, elb $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ekw $$6 = $$1.a().c($$3, $$4, $$5);
         elu $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(elr::a)
            .reduce(elr.a(), elr::a);
         elu $$8 = elr.a($$1, $$7, elf.e);
         return $$8.a($$2);
      }
   }
}
