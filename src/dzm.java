import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record dzm(Optional<czw> d, Optional<czw> e, Optional<czw> f, Optional<czw> g) implements ddf {
   public static final dzm a = new dzm(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dzm> b = mh.g.q().sizeLimitedListOf(4).xmap(dzm::new, dzm::a);
   public static final za<wn, dzm> c = yy.a(mi.K).a(yy.c(4)).a(dzm::new, dzm::a);

   private dzm(List<czw> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dzm(czw $$0, czw $$1, czw $$2, czw $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<czw> a(List<czw> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         czw $$2 = $$0.get($$1);
         return $$2 == dae.rB ? Optional.empty() : Optional.of($$2);
      }
   }

   public List<czw> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(dae.rB)).toList();
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      if (!this.equals(a)) {
         $$1.accept(xb.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<xc> $$0, Optional<czw> $$1) {
      $$0.accept(new daa($$1.orElse(dae.rB), 1).y().e().a(o.h));
   }

   public Optional<czw> b() {
      return this.d;
   }

   public Optional<czw> c() {
      return this.e;
   }

   public Optional<czw> d() {
      return this.f;
   }

   public Optional<czw> e() {
      return this.g;
   }
}
