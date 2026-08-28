import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adr(ert b, byte c, boolean d, Optional<List<erp>> e, Optional<erv.c> f) implements zk<abz> {
   public static final zb<wo, adr> a = zb.a(ert.b, adr::b, yz.c, adr::e, yz.b, adr::f, erp.a.a(yz.a()).a(yz::a), adr::g, erv.c.a, adr::h, adr::new);

   public adr(ert $$0, byte $$1, boolean $$2, @Nullable Collection<erp> $$3, @Nullable erv.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zm<adr> a() {
      return ago.P;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public void a(erv $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<erp>> g() {
      return this.e;
   }

   public Optional<erv.c> h() {
      return this.f;
   }
}
