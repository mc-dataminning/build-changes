import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record acs(emm b, byte c, boolean d, Optional<List<emk>> e, Optional<emo.b> f) implements yp<aba> {
   public static final yg<vt, acs> a = yg.a(emm.b, acs::b, ye.c, acs::e, ye.b, acs::f, emk.a.a(ye.a()).a(ye::a), acs::g, emo.b.a, acs::h, acs::new);

   public acs(emm $$0, byte $$1, boolean $$2, @Nullable Collection<emk> $$3, @Nullable emo.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public yr<acs> a() {
      return afl.P;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public void a(emo $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<emk>> g() {
      return this.e;
   }

   public Optional<emo.b> h() {
      return this.f;
   }
}
