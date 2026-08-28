import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record dyz(Optional<czj> d, Optional<czj> e, Optional<czj> f, Optional<czj> g) implements dcs {
   public static final dyz a = new dyz(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dyz> b = mg.g.q().sizeLimitedListOf(4).xmap(dyz::new, dyz::a);
   public static final yw<wj, dyz> c = yu.a(mh.K).a(yu.c(4)).a(dyz::new, dyz::a);

   private dyz(List<czj> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dyz(czj $$0, czj $$1, czj $$2, czj $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<czj> a(List<czj> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         czj $$2 = $$0.get($$1);
         return $$2 == czr.rB ? Optional.empty() : Optional.of($$2);
      }
   }

   public List<czj> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(czr.rB)).toList();
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      if (!this.equals(a)) {
         $$1.accept(wx.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<wy> $$0, Optional<czj> $$1) {
      $$0.accept(new czn($$1.orElse(czr.rB), 1).y().e().a(o.h));
   }

   public Optional<czj> b() {
      return this.d;
   }

   public Optional<czj> c() {
      return this.e;
   }

   public Optional<czj> d() {
      return this.f;
   }

   public Optional<czj> e() {
      return this.g;
   }
}
