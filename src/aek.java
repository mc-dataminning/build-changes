import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record aek(evh b, byte c, boolean d, Optional<List<evd>> e, Optional<evj.c> f) implements aac<acr> {
   public static final zt<xg, aek> a = zt.a(evh.b, aek::b, zr.c, aek::e, zr.b, aek::f, evd.a.a(zr.a()).a(zr::a), aek::g, evj.c.a, aek::h, aek::new);

   public aek(evh $$0, byte $$1, boolean $$2, @Nullable Collection<evd> $$3, @Nullable evj.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public aae<aek> a() {
      return ahk.P;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public void a(evj $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<evd>> g() {
      return this.e;
   }

   public Optional<evj.c> h() {
      return this.f;
   }
}
