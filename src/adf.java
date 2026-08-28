import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adf(epo b, byte c, boolean d, Optional<List<epk>> e, Optional<epq.b> f) implements zb<abn> {
   public static final ys<wf, adf> a = ys.a(epo.b, adf::b, yq.c, adf::e, yq.b, adf::f, epk.a.a(yq.a()).a(yq::a), adf::g, epq.b.a, adf::h, adf::new);

   public adf(epo $$0, byte $$1, boolean $$2, @Nullable Collection<epk> $$3, @Nullable epq.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zd<adf> a() {
      return afz.P;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public void a(epq $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<epk>> g() {
      return this.e;
   }

   public Optional<epq.b> h() {
      return this.f;
   }
}
