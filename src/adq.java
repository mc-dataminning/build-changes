import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adq(ezj b, byte c, boolean d, Optional<List<ezf>> e, Optional<ezl.c> f) implements zj<aby> {
   public static final za<wn, adq> a = za.a(ezj.b, adq::b, yy.c, adq::e, yy.b, adq::f, ezf.a.a(yy.a()).a(yy::a), adq::g, ezl.c.a, adq::h, adq::new);

   public adq(ezj $$0, byte $$1, boolean $$2, @Nullable Collection<ezf> $$3, @Nullable ezl.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zl<adq> a() {
      return agr.P;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public void a(ezl $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<ezf>> g() {
      return this.e;
   }

   public Optional<ezl.c> h() {
      return this.f;
   }
}
