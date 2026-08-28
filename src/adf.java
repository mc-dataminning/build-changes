import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adf(epw b, byte c, boolean d, Optional<List<eps>> e, Optional<epy.b> f) implements zb<abn> {
   public static final ys<wf, adf> a = ys.a(epw.b, adf::b, yq.c, adf::e, yq.b, adf::f, eps.a.a(yq.a()).a(yq::a), adf::g, epy.b.a, adf::h, adf::new);

   public adf(epw $$0, byte $$1, boolean $$2, @Nullable Collection<eps> $$3, @Nullable epy.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zd<adf> a() {
      return afz.P;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public void a(epy $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eps>> g() {
      return this.e;
   }

   public Optional<epy.b> h() {
      return this.f;
   }
}
