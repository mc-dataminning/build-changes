import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ado(ezh b, byte c, boolean d, Optional<List<ezd>> e, Optional<ezj.c> f) implements zh<abw> {
   public static final yy<wl, ado> a = yy.a(ezh.b, ado::b, yw.c, ado::e, yw.b, ado::f, ezd.a.a(yw.a()).a(yw::a), ado::g, ezj.c.a, ado::h, ado::new);

   public ado(ezh $$0, byte $$1, boolean $$2, @Nullable Collection<ezd> $$3, @Nullable ezj.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zj<ado> a() {
      return agp.P;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public void a(ezj $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<ezd>> g() {
      return this.e;
   }

   public Optional<ezj.c> h() {
      return this.f;
   }
}
