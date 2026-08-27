import java.util.Optional;
import javax.annotation.Nullable;

public record afu(iw<dtz> a, akg<dad> b, long c, daa d, @Nullable daa e, boolean f, boolean g, Optional<iv> h, int i) {
   private static final ys<wf, iw<dtz>> j = yq.b(le.aE);

   public afu(wf $$0) {
      this(
         j.decode($$0), $$0.a(le.aS), $$0.readLong(), daa.a($$0.readByte()), daa.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(vu::h), $$0.l()
      );
   }

   public void a(wf $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(daa.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vu::a);
      $$0.c(this.i);
   }
}
