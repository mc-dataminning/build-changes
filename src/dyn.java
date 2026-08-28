import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public record dyn(Optional<cyz> d, Optional<cyz> e, Optional<cyz> f, Optional<cyz> g) implements dci {
   public static final dyn a = new dyn(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dyn> b = mf.g.q().sizeLimitedListOf(4).xmap(dyn::new, dyn::a);
   public static final yw<wj, dyn> c = yu.a(mg.K).a(yu.c(4)).a(dyn::new, dyn::a);

   private dyn(List<cyz> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dyn(cyz $$0, cyz $$1, cyz $$2, cyz $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cyz> a(List<cyz> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cyz $$2 = $$0.get($$1);
         return $$2 == czh.rB ? Optional.empty() : Optional.of($$2);
      }
   }

   public List<cyz> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(czh.rB)).toList();
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      if (!this.equals(a)) {
         $$1.accept(wx.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<wy> $$0, Optional<cyz> $$1) {
      $$0.accept(new czd($$1.orElse(czh.rB), 1).y().e().a(n.h));
   }

   public Optional<cyz> b() {
      return this.d;
   }

   public Optional<cyz> c() {
      return this.e;
   }

   public Optional<cyz> d() {
      return this.f;
   }

   public Optional<cyz> e() {
      return this.g;
   }
}
