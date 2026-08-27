import java.util.Optional;
import javax.annotation.Nullable;

public record aas(aeo<dih> a, aeo<cpk> b, long c, cph d, @Nullable cph e, boolean f, boolean g, Optional<he> h, int i) {
   public aas(sh $$0) {
      this(
         $$0.a(jd.au), $$0.a(jd.aH), $$0.readLong(), cph.a($$0.readByte()), cph.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(sh::h), $$0.m()
      );
   }

   public void a(sh $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cph.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, sh::a);
      $$0.c(this.i);
   }
}
