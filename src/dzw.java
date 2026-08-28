import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record dzw(Optional<dag> d, Optional<dag> e, Optional<dag> f, Optional<dag> g) implements ddp {
   public static final dzw a = new dzw(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dzw> b = mh.g.q().sizeLimitedListOf(4).xmap(dzw::new, dzw::a);
   public static final ze<wp, dzw> c = zc.a(mi.K).a(zc.c(4)).a(dzw::new, dzw::a);

   private dzw(List<dag> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dzw(dag $$0, dag $$1, dag $$2, dag $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<dag> a(List<dag> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         dag $$2 = $$0.get($$1);
         return $$2 == dao.rB ? Optional.empty() : Optional.of($$2);
      }
   }

   public List<dag> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(dao.rB)).toList();
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      if (!this.equals(a)) {
         $$1.accept(xf.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<xg> $$0, Optional<dag> $$1) {
      $$0.accept(new dak($$1.orElse(dao.rB), 1).y().e().a(o.h));
   }

   public Optional<dag> b() {
      return this.d;
   }

   public Optional<dag> c() {
      return this.e;
   }

   public Optional<dag> d() {
      return this.f;
   }

   public Optional<dag> e() {
      return this.g;
   }
}
