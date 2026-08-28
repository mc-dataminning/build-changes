import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adv(esw b, byte c, boolean d, Optional<List<ess>> e, Optional<esy.c> f) implements zo<acd> {
   public static final zf<ws, adv> a = zf.a(esw.b, adv::b, zd.c, adv::e, zd.b, adv::f, ess.a.a(zd.a()).a(zd::a), adv::g, esy.c.a, adv::h, adv::new);

   public adv(esw $$0, byte $$1, boolean $$2, @Nullable Collection<ess> $$3, @Nullable esy.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zq<adv> a() {
      return ags.P;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public void a(esy $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<ess>> g() {
      return this.e;
   }

   public Optional<esy.c> h() {
      return this.f;
   }
}
