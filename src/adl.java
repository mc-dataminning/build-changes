import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adl(eql b, byte c, boolean d, Optional<List<eqh>> e, Optional<eqn.b> f) implements zf<abt> {
   public static final yw<wj, adl> a = yw.a(eql.b, adl::b, yu.c, adl::e, yu.b, adl::f, eqh.a.a(yu.a()).a(yu::a), adl::g, eqn.b.a, adl::h, adl::new);

   public adl(eql $$0, byte $$1, boolean $$2, @Nullable Collection<eqh> $$3, @Nullable eqn.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zh<adl> a() {
      return agf.P;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public void a(eqn $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eqh>> g() {
      return this.e;
   }

   public Optional<eqn.b> h() {
      return this.f;
   }
}
