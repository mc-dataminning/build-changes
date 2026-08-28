import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adw(etc b, byte c, boolean d, Optional<List<esy>> e, Optional<ete.c> f) implements zp<ace> {
   public static final zg<wt, adw> a = zg.a(etc.b, adw::b, ze.c, adw::e, ze.b, adw::f, esy.a.a(ze.a()).a(ze::a), adw::g, ete.c.a, adw::h, adw::new);

   public adw(etc $$0, byte $$1, boolean $$2, @Nullable Collection<esy> $$3, @Nullable ete.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zr<adw> a() {
      return agt.P;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public void a(ete $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<esy>> g() {
      return this.e;
   }

   public Optional<ete.c> h() {
      return this.f;
   }
}
