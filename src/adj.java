import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adj(ewl b, byte c, boolean d, Optional<List<ewh>> e, Optional<ewn.c> f) implements zc<abr> {
   public static final yt<wg, adj> a = yt.a(ewl.b, adj::b, yr.c, adj::e, yr.b, adj::f, ewh.a.a(yr.a()).a(yr::a), adj::g, ewn.c.a, adj::h, adj::new);

   public adj(ewl $$0, byte $$1, boolean $$2, @Nullable Collection<ewh> $$3, @Nullable ewn.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public ze<adj> a() {
      return agk.P;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public void a(ewn $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<ewh>> g() {
      return this.e;
   }

   public Optional<ewn.c> h() {
      return this.f;
   }
}
