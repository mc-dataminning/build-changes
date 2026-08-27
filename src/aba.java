import java.util.Optional;
import javax.annotation.Nullable;

public record aba(aey<dim> a, aey<cqb> b, long c, cpy d, @Nullable cpy e, boolean f, boolean g, Optional<hd> h, int i) {
   public aba(so $$0) {
      this(
         $$0.a(jc.av), $$0.a(jc.aI), $$0.readLong(), cpy.a($$0.readByte()), cpy.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(so::h), $$0.n()
      );
   }

   public void a(so $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cpy.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, so::a);
      $$0.c(this.i);
   }
}
