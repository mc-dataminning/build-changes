import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record acq(emd b, byte c, boolean d, Optional<List<emb>> e, Optional<emf.b> f) implements yn<aay> {
   public static final ye<vr, acq> a = ye.a(emd.b, acq::b, yc.c, acq::e, yc.b, acq::f, emb.a.a(yc.a()).a(yc::a), acq::g, emf.b.a, acq::h, acq::new);

   public acq(emd $$0, byte $$1, boolean $$2, @Nullable Collection<emb> $$3, @Nullable emf.b $$4) {
      this($$0, $$1, $$2, $$3 != null ? Optional.of(List.copyOf($$3)) : Optional.empty(), Optional.ofNullable($$4));
   }

   @Override
   public yp<acq> a() {
      return afj.P;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public void a(emf $$0) {
      this.e.ifPresent($$0::a);
      this.f.ifPresent($$1 -> $$1.a($$0));
   }

   public byte e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }

   public Optional<List<emb>> g() {
      return this.e;
   }

   public Optional<emf.b> h() {
      return this.f;
   }
}
