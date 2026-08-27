import java.util.Optional;
import javax.annotation.Nullable;

public record adh(ahg<dmy> a, ahg<ctx> b, long c, ctu d, @Nullable ctu e, boolean f, boolean g, Optional<ig> h, int i) {
   public adh(uj $$0) {
      this(
         $$0.a(ke.ay), $$0.a(ke.aM), $$0.readLong(), ctu.a($$0.readByte()), ctu.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(uj::h), $$0.n()
      );
   }

   public void a(uj $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(ctu.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, uj::a);
      $$0.c(this.i);
   }
}
