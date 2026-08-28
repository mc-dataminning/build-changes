import java.util.Optional;
import javax.annotation.Nullable;

public record agm(jf<efb> a, alh<djx> b, long c, dju d, @Nullable dju e, boolean f, boolean g, Optional<je> h, int i, int j) {
   public agm(wl $$0) {
      this(
         efb.i.decode($$0),
         $$0.a(mh.bp),
         $$0.readLong(),
         dju.a($$0.readByte()),
         dju.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vw::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wl $$0) {
      efb.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dju.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vw::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
