import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adr(esh b, byte c, boolean d, Optional<List<esd>> e, Optional<esj.c> f) implements zk<abz> {
   public static final zb<wo, adr> a = zb.a(esh.b, adr::b, yz.c, adr::e, yz.b, adr::f, esd.a.a(yz.a()).a(yz::a), adr::g, esj.c.a, adr::h, adr::new);

   public adr(esh $$0, byte $$1, boolean $$2, @Nullable Collection<esd> $$3, @Nullable esj.c $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zm<adr> a() {
      return ago.P;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public void a(esj $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<esd>> g() {
      return this.e;
   }

   public Optional<esj.c> h() {
      return this.f;
   }
}
