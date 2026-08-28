import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dql(Optional<cuk> d, Optional<cuk> e, Optional<cuk> f, Optional<cuk> g) {
   public static final dql a = new dql(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dql> b = lp.h.q().sizeLimitedListOf(4).xmap(dql::new, dql::a);
   public static final zn<xa, dql> c = zl.a(lq.G).a(zl.c(4)).a(dql::new, dql::a);

   private dql(List<cuk> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dql(cuk $$0, cuk $$1, cuk $$2, cuk $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cuk> a(List<cuk> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cuk $$2 = $$0.get($$1);
         return $$2 == cus.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public us a(us $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vp)b.encodeStart(vg.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cuk> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cus.qL)).toList();
   }

   public static dql b(@Nullable us $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vg.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cuk> b() {
      return this.d;
   }

   public Optional<cuk> c() {
      return this.e;
   }

   public Optional<cuk> d() {
      return this.f;
   }

   public Optional<cuk> e() {
      return this.g;
   }
}
