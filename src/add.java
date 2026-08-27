import java.util.Optional;
import javax.annotation.Nullable;

public record add(ahc<dmj> a, ahc<cti> b, long c, ctf d, @Nullable ctf e, boolean f, boolean g, Optional<ig> h, int i) {
   public add(ug $$0) {
      this(
         $$0.a(ke.ay), $$0.a(ke.aM), $$0.readLong(), ctf.a($$0.readByte()), ctf.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(ug::h), $$0.n()
      );
   }

   public void a(ug $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(ctf.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, ug::a);
      $$0.c(this.i);
   }
}
