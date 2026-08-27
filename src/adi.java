import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adi(eoj b, byte c, boolean d, Optional<List<eof>> e, Optional<eol.b> f) implements ze<abq> {
   public static final yv<wi, adi> a = yv.a(eoj.b, adi::b, yt.c, adi::e, yt.b, adi::f, eof.a.a(yt.a()).a(yt::a), adi::g, eol.b.a, adi::h, adi::new);

   public adi(eoj $$0, byte $$1, boolean $$2, @Nullable Collection<eof> $$3, @Nullable eol.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zg<adi> a() {
      return agc.P;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public void a(eol $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eof>> g() {
      return this.e;
   }

   public Optional<eol.b> h() {
      return this.f;
   }
}
