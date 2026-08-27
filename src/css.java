import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface css extends cso {
   dkr D_();

   @Nullable
   cso c(int var1, int var2);

   default boolean a(@Nullable blp $$0, emf $$1) {
      return true;
   }

   default boolean a(dja $$0, hx $$1, elr $$2) {
      emf $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(blp $$0) {
      return this.a($$0, emc.a($$0.cH()));
   }

   default boolean b(elh $$0) {
      return this.a(null, $$0);
   }

   default boolean g(blp $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable blp $$0, elh $$1) {
      for (emf $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         emf $$3 = this.h($$0, $$1);
         return $$3 == null || !emc.c($$3, emc.a($$1), elq.i);
      }
   }

   default boolean b(@Nullable blp $$0, elh $$1) {
      for (emf $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<emf> c(@Nullable blp var1, elh var2);

   default Iterable<emf> d(@Nullable blp $$0, elh $$1) {
      List<emf> $$2 = this.c($$0, $$1);
      Iterable<emf> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<emf> e(@Nullable blp $$0, elh $$1) {
      return () -> new csm<emf>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private emf h(blp $$0, elh $$1) {
      dkr $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable blp $$0, elh $$1) {
      csm<emf> $$2 = new csm<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((emf)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<hx> g(blp $$0, elh $$1) {
      hx $$2 = null;
      double $$3 = Double.MAX_VALUE;
      csm<hx> $$4 = new csm<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         hx $$5 = (hx)$$4.next();
         double $$6 = $$5.b($$0.dk());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<elm> a(@Nullable blp $$0, emf $$1, elm $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         elh $$6 = $$1.a().c($$3, $$4, $$5);
         emf $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(emc::a)
            .reduce(emc.a(), emc::a);
         emf $$8 = emc.a($$1, $$7, elq.e);
         return $$8.a($$2);
      }
   }
}
