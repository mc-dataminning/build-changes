import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record adz(epg b, byte c, boolean d, Optional<List<epc>> e, Optional<epi.b> f) implements zv<ach> {
   public static final zm<wz, adz> a = zm.a(epg.b, adz::b, zk.c, adz::e, zk.b, adz::f, epc.a.a(zk.a()).a(zk::a), adz::g, epi.b.a, adz::h, adz::new);

   public adz(epg $$0, byte $$1, boolean $$2, @Nullable Collection<epc> $$3, @Nullable epi.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public zx<adz> a() {
      return agt.P;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public void a(epi $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<epc>> g() {
      return this.e;
   }

   public Optional<epi.b> h() {
      return this.f;
   }
}
