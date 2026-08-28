import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adz(eph b, byte c, boolean d, Optional<List<epd>> e, Optional<epj.b> f) implements zv<ach> {
   public static final zm<wz, adz> a = zm.a(eph.b, adz::b, zk.c, adz::e, zk.b, adz::f, epd.a.a(zk.a()).a(zk::a), adz::g, epj.b.a, adz::h, adz::new);

   public adz(eph $$0, byte $$1, boolean $$2, @Nullable Collection<epd> $$3, @Nullable epj.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zx<adz> a() {
      return agt.P;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public void a(epj $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<epd>> g() {
      return this.e;
   }

   public Optional<epj.b> h() {
      return this.f;
   }
}
