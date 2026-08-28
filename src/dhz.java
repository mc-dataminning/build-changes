import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface dhz extends dhv {
   ebg A_();

   @Nullable
   dhv c(int var1, int var2);

   default boolean a(@Nullable bwa $$0, feq $$1) {
      return true;
   }

   default boolean a(dzo $$0, iu $$1, feb $$2) {
      feq $$3 = $$0.b(this, $$1, $$2);
      return $$3.c() || this.a(null, $$3.a($$1));
   }

   default boolean f(bwa $$0) {
      return this.a($$0, fen.a($$0.cR()));
   }

   default boolean b(fdr $$0) {
      return this.a(null, $$0);
   }

   default boolean g(bwa $$0) {
      return this.a($$0, $$0.cR());
   }

   default boolean a(@Nullable bwa $$0, fdr $$1) {
      return this.a($$0, $$1, false);
   }

   default boolean a(@Nullable bwa $$0, fdr $$1, boolean $$2) {
      for (feq $$4 : $$2 ? this.f($$0, $$1) : this.e($$0, $$1)) {
         if (!$$4.c()) {
            return false;
         }
      }

      if (!this.c($$0, $$1).isEmpty()) {
         return false;
      } else if ($$0 == null) {
         return true;
      } else {
         feq $$5 = this.i($$0, $$1);
         return $$5 == null || !fen.c($$5, fen.a($$1), fea.i);
      }
   }

   default boolean b(@Nullable bwa $$0, fdr $$1) {
      for (feq $$2 : this.e($$0, $$1)) {
         if (!$$2.c()) {
            return false;
         }
      }

      return true;
   }

   List<feq> c(@Nullable bwa var1, fdr var2);

   default Iterable<feq> d(@Nullable bwa $$0, fdr $$1) {
      List<feq> $$2 = this.c($$0, $$1);
      Iterable<feq> $$3 = this.e($$0, $$1);
      return $$2.isEmpty() ? $$3 : Iterables.concat($$2, $$3);
   }

   default Iterable<feq> e(@Nullable bwa $$0, fdr $$1) {
      return () -> new dht<feq>(this, $$0, $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   default Iterable<feq> f(@Nullable bwa $$0, fdr $$1) {
      return () -> new dht<feq>(this, feb.a($$0, true), $$1, false, ($$0xx, $$1xx) -> $$1xx);
   }

   @Nullable
   private feq i(bwa $$0, fdr $$1) {
      ebg $$2 = this.A_();
      return $$2.a($$0, $$1) ? $$2.c() : null;
   }

   default fds b(dhy $$0) {
      fds $$1 = this.a($$0);
      ebg $$2 = this.A_();
      if ($$2.a($$0.b()) && !$$2.a($$1.g())) {
         fdw $$3 = $$1.g().d($$0.b());
         ja $$4 = ja.a($$3.d, $$3.e, $$3.f);
         fdw $$5 = $$2.c($$1.g());
         return new fds($$5, $$4, iu.a((jo)$$5), false, true);
      } else {
         return $$1;
      }
   }

   default boolean g(@Nullable bwa $$0, fdr $$1) {
      dht<feq> $$2 = new dht<>(this, $$0, $$1, true, ($$0x, $$1x) -> $$1x);

      while ($$2.hasNext()) {
         if (!((feq)$$2.next()).c()) {
            return true;
         }
      }

      return false;
   }

   default Optional<iu> h(bwa $$0, fdr $$1) {
      iu $$2 = null;
      double $$3 = Double.MAX_VALUE;
      dht<iu> $$4 = new dht<>(this, $$0, $$1, false, ($$0x, $$1x) -> $$0x);

      while ($$4.hasNext()) {
         iu $$5 = (iu)$$4.next();
         double $$6 = $$5.b($$0.dt());
         if ($$6 < $$3 || $$6 == $$3 && ($$2 == null || $$2.i($$5) < 0)) {
            $$2 = $$5.j();
            $$3 = $$6;
         }
      }

      return Optional.ofNullable($$2);
   }

   default Optional<fdw> a(@Nullable bwa $$0, feq $$1, fdw $$2, double $$3, double $$4, double $$5) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         fdr $$6 = $$1.a().c($$3, $$4, $$5);
         feq $$7 = StreamSupport.stream(this.e($$0, $$6).spliterator(), false)
            .filter($$0x -> this.A_() == null || this.A_().a($$0x.a()))
            .flatMap($$0x -> $$0x.e().stream())
            .map($$3x -> $$3x.c($$3 / 2.0, $$4 / 2.0, $$5 / 2.0))
            .map(fen::a)
            .reduce(fen.a(), fen::a);
         feq $$8 = fen.a($$1, $$7, fea.e);
         return $$8.b($$2);
      }
   }
}
