import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record dds(ddt b, ddr c, OptionalInt d, dco e, Optional<List<dch>> f) {
   public static final yt<wg, dds> a = yt.a(ddt.a, dds::a, ddr.e, dds::b, yr.i, dds::c, yr.a(me.aH), dds::d, dch.a.a(yr.a()).a(yr::a), dds::e, dds::new);

   public List<cxy> a(bav $$0) {
      return this.c.d().a($$0);
   }

   public boolean a(cqn $$0) {
      return this.f.isEmpty() ? false : $$0.a(this.f.get(), null);
   }

   public ddt a() {
      return this.b;
   }

   public ddr b() {
      return this.c;
   }

   public OptionalInt c() {
      return this.d;
   }

   public dco d() {
      return this.e;
   }

   public Optional<List<dch>> e() {
      return this.f;
   }
}
