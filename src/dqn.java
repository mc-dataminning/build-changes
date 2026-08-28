import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dqn(Optional<cum> d, Optional<cum> e, Optional<cum> f, Optional<cum> g) {
   public static final dqn a = new dqn(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dqn> b = lp.h.q().sizeLimitedListOf(4).xmap(dqn::new, dqn::a);
   public static final zn<xa, dqn> c = zl.a(lq.G).a(zl.c(4)).a(dqn::new, dqn::a);

   private dqn(List<cum> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dqn(cum $$0, cum $$1, cum $$2, cum $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cum> a(List<cum> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cum $$2 = $$0.get($$1);
         return $$2 == cuu.qL ? Optional.empty() : Optional.of($$2);
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

   public List<cum> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cuu.qL)).toList();
   }

   public static dqn b(@Nullable us $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vg.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cum> b() {
      return this.d;
   }

   public Optional<cum> c() {
      return this.e;
   }

   public Optional<cum> d() {
      return this.f;
   }

   public Optional<cum> e() {
      return this.g;
   }
}
