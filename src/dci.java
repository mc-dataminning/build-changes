import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dci(dcj b, dch c, OptionalInt d, dbf e, Optional<List<day>> f) {
   public static final ym<vz, dci> a = ym.a(dcj.a, dci::a, dch.e, dci::b, yk.i, dci::c, yk.a(mc.aH), dci::d, day.a.a(yk.a()).a(yk::a), dci::e, dci::new);

   public List<cwn> a(baj $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cpa $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public dcj a() {
      return this.b;
   }

   public dch b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dbf d() {
      return this.e;
   }

   public Optional<List<day>> e() {
      return this.f;
   }
}
