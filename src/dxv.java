import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dxv(Optional<cyo> d, Optional<cyo> e, Optional<cyo> f, Optional<cyo> g) implements dbx {
   public static final dxv a = new dxv(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dxv> b = mf.g.q().sizeLimitedListOf(4).xmap(dxv::new, dxv::a);
   public static final yu<wh, dxv> c = ys.a(mg.K).a(ys.c(4)).a(dxv::new, dxv::a);

   private dxv(List<cyo> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dxv(cyo $$0, cyo $$1, cyo $$2, cyo $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cyo> a(List<cyo> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cyo $$2 = $$0.get($$1);
         return $$2 == cyw.rw ? Optional.empty() : Optional.of($$2);
      }
   }

   public tx a(tx $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (uu)b.encodeStart(ul.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cyo> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cyw.rw)).toList();
   }

   public static dxv b(@Nullable tx $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(ul.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      if (!this.equals(a)) {
         $$1.accept(wv.a);
         a($$1, this.g);
         a($$1, this.e);
         a($$1, this.f);
         a($$1, this.d);
      }
   }

   private static void a(Consumer<ww> $$0, Optional<cyo> $$1) {
      $$0.accept(new cys($$1.orElse(cyw.rw), 1).y().e().a(n.h));
   }

   public Optional<cyo> b() {
      return this.d;
   }

   public Optional<cyo> c() {
      return this.e;
   }

   public Optional<cyo> d() {
      return this.f;
   }

   public Optional<cyo> e() {
      return this.g;
   }
}
