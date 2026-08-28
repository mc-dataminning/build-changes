import java.util.Optional;
import javax.annotation.Nullable;

public record agq(ji<dvt> a, ald<dbx> b, long c, dbu d, @Nullable dbu e, boolean f, boolean g, Optional<jh> h, int i) {
   private static final zm<wz, ji<dvt>> j = zk.b(lq.aE);

   public agq(wz $$0) {
      this(
         j.decode($$0), $$0.a(lq.aS), $$0.readLong(), dbu.a($$0.readByte()), dbu.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(wl::h), $$0.l()
      );
   }

   public void a(wz $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dbu.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wl::a);
      $$0.c(this.i);
   }
}
