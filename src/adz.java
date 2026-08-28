import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adz(evi b, byte c, boolean d, Optional<List<eve>> e, Optional<evk.c> f) implements zr<acg> {
   public static final zi<wv, adz> a = zi.a(evi.b, adz::b, zg.c, adz::e, zg.b, adz::f, eve.a.a(zg.a()).a(zg::a), adz::g, evk.c.a, adz::h, adz::new);

   public adz(evi $$0, byte $$1, boolean $$2, @Nullable Collection<eve> $$3, @Nullable evk.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zt<adz> a() {
      return agz.P;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public void a(evk $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eve>> g() {
      return this.e;
   }

   public Optional<evk.c> h() {
      return this.f;
   }
}
