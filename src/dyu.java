import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record dyu(Optional<czg> d, Optional<czg> e, Optional<czg> f, Optional<czg> g) implements dcp {
   public static final dyu a = new dyu(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dyu> b = mg.g.q().sizeLimitedListOf(4).xmap(dyu::new, dyu::a);
   public static final yw<wj, dyu> c = yu.a(mh.K).a(yu.c(4)).a(dyu::new, dyu::a);

   private dyu(List<czg> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dyu(czg $$0, czg $$1, czg $$2, czg $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<czg> a(List<czg> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         czg $$2 = $$0.get($$1);
         return $$2 == czo.rB ? Optional.empty() : Optional.of($$2);
      }
   }

   public List<czg> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(czo.rB)).toList();
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      if (!this.equals(a)) {
         $$1.accept(wx.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<wy> $$0, Optional<czg> $$1) {
      $$0.accept(new czk($$1.orElse(czo.rB), 1).y().e().a(o.h));
   }

   public Optional<czg> b() {
      return this.d;
   }

   public Optional<czg> c() {
      return this.e;
   }

   public Optional<czg> d() {
      return this.f;
   }

   public Optional<czg> e() {
      return this.g;
   }
}
