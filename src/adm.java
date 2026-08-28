import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adm(eyh b, byte c, boolean d, Optional<List<eyd>> e, Optional<eyj.c> f) implements zf<abu> {
   public static final yw<wj, adm> a = yw.a(eyh.b, adm::b, yu.c, adm::e, yu.b, adm::f, eyd.a.a(yu.a()).a(yu::a), adm::g, eyj.c.a, adm::h, adm::new);

   public adm(eyh $$0, byte $$1, boolean $$2, @Nullable Collection<eyd> $$3, @Nullable eyj.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zh<adm> a() {
      return agn.P;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public void a(eyj $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eyd>> g() {
      return this.e;
   }

   public Optional<eyj.c> h() {
      return this.f;
   }
}
