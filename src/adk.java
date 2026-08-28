import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adk(exn b, byte c, boolean d, Optional<List<exj>> e, Optional<exp.c> f) implements zd<abs> {
   public static final yu<wh, adk> a = yu.a(exn.b, adk::b, ys.c, adk::e, ys.b, adk::f, exj.a.a(ys.a()).a(ys::a), adk::g, exp.c.a, adk::h, adk::new);

   public adk(exn $$0, byte $$1, boolean $$2, @Nullable Collection<exj> $$3, @Nullable exp.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zf<adk> a() {
      return agl.P;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public void a(exp $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<exj>> g() {
      return this.e;
   }

   public Optional<exp.c> h() {
      return this.f;
   }
}
