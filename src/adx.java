import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adx(ezt b, byte c, boolean d, Optional<List<ezp>> e, Optional<ezv.c> f) implements zo<acf> {
   public static final ze<wp, adx> a = ze.a(ezt.b, adx::b, zc.c, adx::e, zc.b, adx::f, ezp.a.a(zc.a()).a(zc::a), adx::g, ezv.c.a, adx::h, adx::new);

   public adx(ezt $$0, byte $$1, boolean $$2, @Nullable Collection<ezp> $$3, @Nullable ezv.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zq<adx> a() {
      return agy.P;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public void a(ezv $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<ezp>> g() {
      return this.e;
   }

   public Optional<ezv.c> h() {
      return this.f;
   }
}
