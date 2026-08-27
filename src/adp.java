import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adp(eqr b, byte c, boolean d, Optional<List<eqn>> e, Optional<eqt.b> f) implements zl<abw> {
   public static final zc<wp, adp> a = zc.a(eqr.b, adp::b, za.c, adp::e, za.b, adp::f, eqn.a.a(za.a()).a(za::a), adp::g, eqt.b.a, adp::h, adp::new);

   public adp(eqr $$0, byte $$1, boolean $$2, @Nullable Collection<eqn> $$3, @Nullable eqt.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zn<adp> a() {
      return agj.Q;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public void a(eqt $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eqn>> g() {
      return this.e;
   }

   public Optional<eqt.b> h() {
      return this.f;
   }
}
