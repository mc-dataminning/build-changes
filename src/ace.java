import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ace(ejy b, byte c, boolean d, Optional<List<ejw>> e, Optional<eka.b> f) implements yb<aam> {
   public static final xs<vf, ace> a = xs.a(ejy.a, ace::b, xq.b, ace::e, xq.a, ace::f, ejw.a.a(xq.a()).a(xq::a), ace::g, eka.b.a, ace::h, ace::new);

   public ace(ejy $$0, byte $$1, boolean $$2, @Nullable Collection<ejw> $$3, @Nullable eka.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public yd<ace> a() {
      return aex.P;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public void a(eka $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<ejw>> g() {
      return this.e;
   }

   public Optional<eka.b> h() {
      return this.f;
   }
}
