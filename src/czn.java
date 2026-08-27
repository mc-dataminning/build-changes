import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface czn extends czj {
   dry C_();

   @Nullable
   czj c(int var1, int var2);

   default boolean a(@Nullable brh $$0, eui $$1) {
      return true;
   }

   default boolean a(dqh $$0, in $$1, etu $$2) {
      eui $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(brh $$0) {
      return this.a($$0, euf.a($$0.cI()));
   }

   default boolean b(etk $$0) {
      return this.a(null, $$0);
   }

   default boolean g(brh $$0) {
      return this.a($$0, $$0.cI());
   }

   default boolean a(@Nullable brh $$0, etk $$1) {
      for (eui $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         eui $$3 = this.h($$0, $$1);
         return $$3 == null || !euf.c($$3, euf.a($$1), ett.i);
      }
   }

   default boolean b(@Nullable brh $$0, etk $$1) {
      for (eui $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<eui> c(@Nullable brh var1, etk var2);

   default Iterable<eui> d(@Nullable brh $$0, etk $$1) {
      List<eui> $$2 = this.c($$0, $$1);
      Iterable<eui> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<eui> e(@Nullable brh $$0, etk $$1) {
      return () -> new czh<eui>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private eui h(brh $$0, etk $$1) {
      dry $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable brh $$0, etk $$1) {
      czh<eui> $$2 = new czh<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((eui)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<in> g(brh $$0, etk $$1) {
      in $$2 = null;
      double $$3 = Double.MAX_VALUE;
      czh<in> $$4 = new czh<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         in $$5 = (in)$$4.next();
         double $$6 = $$5.b($$0.dl());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<etp> a(@Nullable brh $$0, eui $$1, etp $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         etk $$6 = $$1.a().c($$3, $$4, $$5);
         eui $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(euf::a)
            .reduce(euf.a(), euf::a);
         eui $$8 = euf.a($$1, $$7, ett.e);
         return $$8.a($$2);
      }
   }
}
