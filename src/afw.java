import java.util.Optional;
import javax.annotation.Nullable;

public record afw(jj<dvz> a, akj<dcd> b, long c, dca d, @Nullable dca e, boolean f, boolean g, Optional<ji> h, int i) {
   private static final ys<wf, jj<dvz>> j = yq.b(lr.aJ);

   public afw(wf $$0) {
      this(
         j.decode($$0), $$0.a(lr.aZ), $$0.readLong(), dca.a($$0.readByte()), dca.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(vr::h), $$0.l()
      );
   }

   public void a(wf $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dca.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vr::a);
      $$0.c(this.i);
   }
}
