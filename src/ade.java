import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ade(enn b, byte c, boolean d, Optional<List<enj>> e, Optional<enp.b> f) implements zb<abm> {
   public static final ys<wf, ade> a = ys.a(enn.b, ade::b, yq.c, ade::e, yq.b, ade::f, enj.a.a(yq.a()).a(yq::a), ade::g, enp.b.a, ade::h, ade::new);

   public ade(enn $$0, byte $$1, boolean $$2, @Nullable Collection<enj> $$3, @Nullable enp.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zd<ade> a() {
      return afx.P;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public void a(enp $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<enj>> g() {
      return this.e;
   }

   public Optional<enp.b> h() {
      return this.f;
   }
}
