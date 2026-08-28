import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adx(etn b, byte c, boolean d, Optional<List<etj>> e, Optional<etp.c> f) implements zq<acf> {
   public static final zh<wu, adx> a = zh.a(etn.b, adx::b, zf.c, adx::e, zf.b, adx::f, etj.a.a(zf.a()).a(zf::a), adx::g, etp.c.a, adx::h, adx::new);

   public adx(etn $$0, byte $$1, boolean $$2, @Nullable Collection<etj> $$3, @Nullable etp.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zs<adx> a() {
      return agu.P;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public void a(etp $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<etj>> g() {
      return this.e;
   }

   public Optional<etp.c> h() {
      return this.f;
   }
}
