import java.util.Optional;
import javax.annotation.Nullable;

public record afz(ix<duv> a, akm<daz> b, long c, daw d, @Nullable daw e, boolean f, boolean g, Optional<iw> h, int i) {
   private static final yv<wi, ix<duv>> j = yt.b(lf.aE);

   public afz(wi $$0) {
      this(
         j.decode($$0), $$0.a(lf.aS), $$0.readLong(), daw.a($$0.readByte()), daw.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(vx::h), $$0.l()
      );
   }

   public void a(wi $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(daw.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vx::a);
      $$0.c(this.i);
   }
}
