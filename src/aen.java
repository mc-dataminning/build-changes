import java.util.Optional;
import javax.annotation.Nullable;

public record aen(aix<doo> a, aix<cvn> b, long c, cvk d, @Nullable cvk e, boolean f, boolean g, Optional<ii> h, int i) {
   public aen(uq $$0) {
      this(
         $$0.a(kg.ay), $$0.a(kg.aM), $$0.readLong(), cvk.a($$0.readByte()), cvk.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(uq::h), $$0.n()
      );
   }

   public void a(uq $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cvk.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, uq::a);
      $$0.c(this.i);
   }
}
