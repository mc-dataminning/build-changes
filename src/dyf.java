import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record dyf(Optional<cyu> d, Optional<cyu> e, Optional<cyu> f, Optional<cyu> g) implements dcd {
   public static final dyf a = new dyf(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dyf> b = mf.g.q().sizeLimitedListOf(4).xmap(dyf::new, dyf::a);
   public static final yw<wj, dyf> c = yu.a(mg.K).a(yu.c(4)).a(dyf::new, dyf::a);

   private dyf(List<cyu> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dyf(cyu $$0, cyu $$1, cyu $$2, cyu $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cyu> a(List<cyu> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cyu $$2 = $$0.get($$1);
         return $$2 == czc.ry ? Optional.empty() : Optional.of($$2);
      }
   }

   public List<cyu> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(czc.ry)).toList();
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      if (!this.equals(a)) {
         $$1.accept(wx.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<wy> $$0, Optional<cyu> $$1) {
      $$0.accept(new cyy($$1.orElse(czc.ry), 1).y().e().a(n.h));
   }

   public Optional<cyu> b() {
      return this.d;
   }

   public Optional<cyu> c() {
      return this.e;
   }

   public Optional<cyu> d() {
      return this.f;
   }

   public Optional<cyu> e() {
      return this.g;
   }
}
