import java.util.Optional;
import javax.annotation.Nullable;

public record afy(ix<dut> a, akl<dax> b, long c, dau d, @Nullable dau e, boolean f, boolean g, Optional<iw> h, int i) {
   private static final yv<wi, ix<dut>> j = yt.b(lf.aE);

   public afy(wi $$0) {
      this(
         j.decode($$0), $$0.a(lf.aS), $$0.readLong(), dau.a($$0.readByte()), dau.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(vx::h), $$0.l()
      );
   }

   public void a(wi $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dau.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vx::a);
      $$0.c(this.i);
   }
}
