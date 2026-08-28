import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record aek(evo b, byte c, boolean d, Optional<List<evk>> e, Optional<evq.c> f) implements aac<acr> {
   public static final zt<xg, aek> a = zt.a(evo.b, aek::b, zr.c, aek::e, zr.b, aek::f, evk.a.a(zr.a()).a(zr::a), aek::g, evq.c.a, aek::h, aek::new);

   public aek(evo $$0, byte $$1, boolean $$2, @Nullable Collection<evk> $$3, @Nullable evq.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public aae<aek> a() {
      return ahk.P;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public void a(evq $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<evk>> g() {
      return this.e;
   }

   public Optional<evq.c> h() {
      return this.f;
   }
}
