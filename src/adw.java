import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adw(epd b, byte c, boolean d, Optional<List<eoz>> e, Optional<epf.b> f) implements zs<ace> {
   public static final zj<ww, adw> a = zj.a(epd.b, adw::b, zh.c, adw::e, zh.b, adw::f, eoz.a.a(zh.a()).a(zh::a), adw::g, epf.b.a, adw::h, adw::new);

   public adw(epd $$0, byte $$1, boolean $$2, @Nullable Collection<eoz> $$3, @Nullable epf.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zu<adw> a() {
      return agq.P;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public void a(epf $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eoz>> g() {
      return this.e;
   }

   public Optional<epf.b> h() {
      return this.f;
   }
}
