import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record dzk(Optional<czu> d, Optional<czu> e, Optional<czu> f, Optional<czu> g) implements ddd {
   public static final dzk a = new dzk(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dzk> b = mg.g.q().sizeLimitedListOf(4).xmap(dzk::new, dzk::a);
   public static final yy<wl, dzk> c = yw.a(mh.K).a(yw.c(4)).a(dzk::new, dzk::a);

   private dzk(List<czu> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dzk(czu $$0, czu $$1, czu $$2, czu $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<czu> a(List<czu> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         czu $$2 = $$0.get($$1);
         return $$2 == dac.rB ? Optional.empty() : Optional.of($$2);
      }
   }

   public List<czu> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(dac.rB)).toList();
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      if (!this.equals(a)) {
         $$1.accept(wz.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<xa> $$0, Optional<czu> $$1) {
      $$0.accept(new czy($$1.orElse(dac.rB), 1).y().e().a(o.h));
   }

   public Optional<czu> b() {
      return this.d;
   }

   public Optional<czu> c() {
      return this.e;
   }

   public Optional<czu> d() {
      return this.f;
   }

   public Optional<czu> e() {
      return this.g;
   }
}
