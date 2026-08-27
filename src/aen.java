import java.util.Optional;
import javax.annotation.Nullable;

public record aen(ij<dov> a, aix<cvr> b, long c, cvo d, @Nullable cvo e, boolean f, boolean g, Optional<ii> h, int i) {
   private static final xo<vb, ij<dov>> j = xm.b(kg.ay);

   public aen(vb $$0) {
      this(
         j.decode($$0), $$0.a(kg.aM), $$0.readLong(), cvo.a($$0.readByte()), cvo.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(uq::h), $$0.n()
      );
   }

   public void a(vb $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cvo.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, uq::a);
      $$0.c(this.i);
   }
}
