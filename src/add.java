import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record add(eup b, byte c, boolean d, Optional<List<eul>> e, Optional<eur.c> f) implements yv<abk> {
   public static final ym<vz, add> a = ym.a(eup.b, add::b, yk.c, add::e, yk.b, add::f, eul.a.a(yk.a()).a(yk::a), add::g, eur.c.a, add::h, add::new);

   public add(eup $$0, byte $$1, boolean $$2, @Nullable Collection<eul> $$3, @Nullable eur.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public yx<add> a() {
      return agd.P;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public void a(eur $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eul>> g() {
      return this.e;
   }

   public Optional<eur.c> h() {
      return this.f;
   }
}
