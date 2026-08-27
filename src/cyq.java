import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface cyq extends cym {
   dqz C_();

   @Nullable
   cym c(int var1, int var2);

   default boolean a(@Nullable bqa $$0, etc $$1) {
      return true;
   }

   default boolean a(dpi $$0, id $$1, eso $$2) {
      etc $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w()));
   }

   default boolean f(bqa $$0) {
      return this.a($$0, esz.a($$0.cH()));
   }

   default boolean b(ese $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bqa $$0) {
      return this.a($$0, $$0.cH());
   }

   default boolean a(@Nullable bqa $$0, ese $$1) {
      for (etc $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         etc $$3 = this.h($$0, $$1);
         return $$3 == null || !esz.c($$3, esz.a($$1), esn.i);
      }
   }

   default boolean b(@Nullable bqa $$0, ese $$1) {
      for (etc $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<etc> c(@Nullable bqa var1, ese var2);

   default Iterable<etc> d(@Nullable bqa $$0, ese $$1) {
      List<etc> $$2 = this.c($$0, $$1);
      Iterable<etc> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<etc> e(@Nullable bqa $$0, ese $$1) {
      return () -> new cyk<etc>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private etc h(bqa $$0, ese $$1) {
      dqz $$2 = this.C_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default boolean f(@Nullable bqa $$0, ese $$1) {
      cyk<etc> $$2 = new cyk<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((etc)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<id> g(bqa $$0, ese $$1) {
      id $$2 = null;
      double $$3 = Double.MAX_VALUE;
      cyk<id> $$4 = new cyk<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         id $$5 = (id)$$4.next();
         double $$6 = $$5.b($$0.dk());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.i();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<esj> a(@Nullable bqa $$0, etc $$1, esj $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         ese $$6 = $$1.a().c($$3, $$4, $$5);
         etc $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.C_() == null || this.C_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(esz::a)
            .reduce(esz.a(), esz::a);
         etc $$8 = esz.a($$1, $$7, esn.e);
         return $$8.a($$2);
      }
   }
}
