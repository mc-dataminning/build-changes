import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record dqj(Optional<cui> d, Optional<cui> e, Optional<cui> f, Optional<cui> g) {
   public static final dqj a = new dqj(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
   public static final Codec<dqj> b = lp.h.q().sizeLimitedListOf(4).xmap(dqj::new, dqj::a);
   public static final zm<wz, dqj> c = zk.a(lq.G).a(zk.c(4)).a(dqj::new, dqj::a);

   private dqj(List<cui> $$0) {
      this(a($$0, 0), a($$0, 1), a($$0, 2), a($$0, 3));
   }

   public dqj(cui $$0, cui $$1, cui $$2, cui $$3) {
      this(List.of($$0, $$1, $$2, $$3));
   }

   private static Optional<cui> a(List<cui> $$0, int $$1) {
      if ($$1 >= $$0.size()) {
         return Optional.empty();
      } else {
         cui $$2 = $$0.get($$1);
         return $$2 == cuq.qL ? Optional.empty() : Optional.of($$2);
      }
   }

   public ur a(ur $$0) {
      if (this.equals(a)) {
         return $$0;
      } else {
         $$0.a("sherds", (vo)b.encodeStart(vf.a, this).getOrThrow());
         return $$0;
      }
   }

   public List<cui> a() {
      return Stream.of(this.d, this.e, this.f, this.g).map($$0 -> $$0.orElse(cuq.qL)).toList();
   }

   public static dqj b(@Nullable ur $$0) {
      return $$0 != null && $$0.e("sherds") ? b.parse(vf.a, $$0.c("sherds")).result().orElse(a) : a;
   }

   public Optional<cui> b() {
      return this.d;
   }

   public Optional<cui> c() {
      return this.e;
   }

   public Optional<cui> d() {
      return this.f;
   }

   public Optional<cui> e() {
      return this.g;
   }
}
