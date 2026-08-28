import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adm(eqp b, byte c, boolean d, Optional<List<eql>> e, Optional<eqr.b> f) implements zg<abu> {
   public static final yx<wk, adm> a = yx.a(eqp.b, adm::b, yv.c, adm::e, yv.b, adm::f, eql.a.a(yv.a()).a(yv::a), adm::g, eqr.b.a, adm::h, adm::new);

   public adm(eqp $$0, byte $$1, boolean $$2, @Nullable Collection<eql> $$3, @Nullable eqr.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zi<adm> a() {
      return agg.P;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public void a(eqr $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eql>> g() {
      return this.e;
   }

   public Optional<eqr.b> h() {
      return this.f;
   }
}
