import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record aca(eja b, byte c, boolean d, Optional<List<eiy>> e, Optional<ejc.b> f) implements xz<aai> {
   public static final xq<vd, aca> a = xq.a(eja.a, aca::b, xo.b, aca::e, xo.a, aca::f, eiy.a.a(xo.a()).a(xo::a), aca::g, ejc.b.a, aca::h, aca::new);

   public aca(eja $$0, byte $$1, boolean $$2, @Nullable Collection<eiy> $$3, @Nullable ejc.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public yb<aca> a() {
      return aet.P;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public void a(ejc $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eiy>> g() {
      return this.e;
   }

   public Optional<ejc.b> h() {
      return this.f;
   }
}
