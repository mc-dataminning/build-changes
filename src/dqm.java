import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dqm(Optional<cul> d, Optional<cul> e, Optional<cul> f, Optional<cul> g) {
   public static final dqm a = new dqm(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dqm> b = lp.h.q().sizeLimitedListOf(4).xmap(dqm::new, dqm::a);
   public static final zn<xa, dqm> c = zl.a(lq.G).a(zl.c(4)).a(dqm::new, dqm::a);

   private dqm(List<cul> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dqm(cul $$0, cul $$1, cul $$2, cul $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cul> a(List<cul> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cul $$2 = $$0.get($$1);
         return $$2 == cut.qL ? Optional.empty() : Optional.of($$2);
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

   public List<cul> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cut.qL)).toList();
   }

   public static dqm b(@Nullable us $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vg.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cul> b() {
      return this.d;
   }

   public Optional<cul> c() {
      return this.e;
   }

   public Optional<cul> d() {
      return this.f;
   }

   public Optional<cul> e() {
      return this.g;
   }
}
