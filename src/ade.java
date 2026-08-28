import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record ade(eus b, byte c, boolean d, Optional<List<euo>> e, Optional<euu.c> f) implements yw<abl> {
   public static final yn<wa, ade> a = yn.a(eus.b, ade::b, yl.c, ade::e, yl.b, ade::f, euo.a.a(yl.a()).a(yl::a), ade::g, euu.c.a, ade::h, ade::new);

   public ade(eus $$0, byte $$1, boolean $$2, @Nullable Collection<euo> $$3, @Nullable euu.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public yy<ade> a() {
      return age.P;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public void a(euu $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<euo>> g() {
      return this.e;
   }

   public Optional<euu.c> h() {
      return this.f;
   }
}
