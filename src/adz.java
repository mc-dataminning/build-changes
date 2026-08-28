import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adz(etg b, byte c, boolean d, Optional<List<etc>> e, Optional<eti.c> f) implements zs<ach> {
   public static final zj<ww, adz> a = zj.a(etg.b, adz::b, zh.c, adz::e, zh.b, adz::f, etc.a.a(zh.a()).a(zh::a), adz::g, eti.c.a, adz::h, adz::new);

   public adz(etg $$0, byte $$1, boolean $$2, @Nullable Collection<etc> $$3, @Nullable eti.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zu<adz> a() {
      return agw.P;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public void a(eti $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<etc>> g() {
      return this.e;
   }

   public Optional<eti.c> h() {
      return this.f;
   }
}
