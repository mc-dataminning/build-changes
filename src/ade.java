import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ade(euq b, byte c, boolean d, Optional<List<eum>> e, Optional<eus.c> f) implements yw<abl> {
   public static final yn<wa, ade> a = yn.a(euq.b, ade::b, yl.c, ade::e, yl.b, ade::f, eum.a.a(yl.a()).a(yl::a), ade::g, eus.c.a, ade::h, ade::new);

   public ade(euq $$0, byte $$1, boolean $$2, @Nullable Collection<eum> $$3, @Nullable eus.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public yy<ade> a() {
      return age.P;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public void a(eus $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<eum>> g() {
      return this.e;
   }

   public Optional<eus.c> h() {
      return this.f;
   }
}
