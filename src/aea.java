import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record aea(epk b, byte c, boolean d, Optional<List<epg>> e, Optional<epm.b> f) implements zw<aci> {
   public static final zn<xa, aea> a = zn.a(epk.b, aea::b, zl.c, aea::e, zl.b, aea::f, epg.a.a(zl.a()).a(zl::a), aea::g, epm.b.a, aea::h, aea::new);

   public aea(epk $$0, byte $$1, boolean $$2, @Nullable Collection<epg> $$3, @Nullable epm.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zy<aea> a() {
      return agu.P;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public void a(epm $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<epg>> g() {
      return this.e;
   }

   public Optional<epm.b> h() {
      return this.f;
   }
}
