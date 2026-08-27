import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ace(ejw b, byte c, boolean d, Optional<List<eju>> e, Optional<ejy.b> f) implements yb<aam> {
   public static final xs<vf, ace> a = xs.a(ejw.a, ace::b, xq.b, ace::e, xq.a, ace::f, eju.a.a(xq.a()).a(xq::a), ace::g, ejy.b.a, ace::h, ace::new);

   public ace(ejw $$0, byte $$1, boolean $$2, @Nullable Collection<eju> $$3, @Nullable ejy.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public yd<ace> a() {
      return aex.P;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public void a(ejy $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eju>> g() {
      return this.e;
   }

   public Optional<ejy.b> h() {
      return this.f;
   }
}
