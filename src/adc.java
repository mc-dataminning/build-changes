import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adc(enc b, byte c, boolean d, Optional<List<ena>> e, Optional<ene.b> f) implements yz<abk> {
   public static final yq<wd, adc> a = yq.a(enc.b, adc::b, yo.c, adc::e, yo.b, adc::f, ena.a.a(yo.a()).a(yo::a), adc::g, ene.b.a, adc::h, adc::new);

   public adc(enc $$0, byte $$1, boolean $$2, @Nullable Collection<ena> $$3, @Nullable ene.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zb<adc> a() {
      return afv.P;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public void a(ene $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<ena>> g() {
      return this.e;
   }

   public Optional<ene.b> h() {
      return this.f;
   }
}
