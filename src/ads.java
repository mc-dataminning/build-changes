import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ads(esl b, byte c, boolean d, Optional<List<esh>> e, Optional<esn.c> f) implements zl<aca> {
   public static final zc<wp, ads> a = zc.a(esl.b, ads::b, za.c, ads::e, za.b, ads::f, esh.a.a(za.a()).a(za::a), ads::g, esn.c.a, ads::h, ads::new);

   public ads(esl $$0, byte $$1, boolean $$2, @Nullable Collection<esh> $$3, @Nullable esn.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zn<ads> a() {
      return agp.P;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public void a(esn $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<esh>> g() {
      return this.e;
   }

   public Optional<esn.c> h() {
      return this.f;
   }
}
