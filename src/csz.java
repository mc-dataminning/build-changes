import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface csz extends csv {
   dky D_();

   @Nullable
   csv c(int var1, int var2);

   default boolean a(@Nullable blv $$0, emm $$1) {
      return true;
   }

   default boolean a(djh $$0, hx $$1, ely $$2) {
      emm $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(blv $$0) {
      return this.a($$0, emj.a($$0.cH()));
   }

   default boolean b(elo $$0) {
      return this.a(null, $$0);
   }

   default boolean g(blv $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable blv $$0, elo $$1) {
      for (emm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         emm $$3 = this.h($$0, $$1);
         return $$3 == null || !emj.c($$3, emj.a($$1), elx.i);
      }
   }

   default boolean b(@Nullable blv $$0, elo $$1) {
      for (emm $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<emm> c(@Nullable blv var1, elo var2);

   default Iterable<emm> d(@Nullable blv $$0, elo $$1) {
      List<emm> $$2 = this.c($$0, $$1);
      Iterable<emm> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<emm> e(@Nullable blv $$0, elo $$1) {
      return () -> new cst<emm>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private emm h(blv $$0, elo $$1) {
      dky $$2 = this.D_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable blv $$0, elo $$1) {
      cst<emm> $$2 = new cst<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((emm)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<hx> g(blv $$0, elo $$1) {
      hx $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cst<hx> $$4 = new cst<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

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

   default Optional<elt> a(@Nullable blv $$0, emm $$1, elt $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         elo $$6 = $$1.a().c($$3, $$4, $$5);
         emm $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.D_() == null || this.D_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(emj::a)
            .reduce(emj.a(), emj::a);
         emm $$8 = emj.a($$1, $$7, elx.e);
         return $$8.a($$2);
      }
   }
}
