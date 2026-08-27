import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adi(eoh b, byte c, boolean d, Optional<List<eod>> e, Optional<eoj.b> f) implements ze<abq> {
   public static final yv<wi, adi> a = yv.a(eoh.b, adi::b, yt.c, adi::e, yt.b, adi::f, eod.a.a(yt.a()).a(yt::a), adi::g, eoj.b.a, adi::h, adi::new);

   public adi(eoh $$0, byte $$1, boolean $$2, @Nullable Collection<eod> $$3, @Nullable eoj.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zg<adi> a() {
      return agb.P;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public void a(eoj $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eod>> g() {
      return this.e;
   }

   public Optional<eoj.b> h() {
      return this.f;
   }
}
