import java.util.Optional;
import javax.annotation.Nullable;

public record aba(aew<dis> a, aew<cpv> b, long c, cps d, @Nullable cps e, boolean f, boolean g, Optional<hf> h, int i) {
   public aba(so $$0) {
      this(
         $$0.a(je.au), $$0.a(je.aH), $$0.readLong(), cps.a($$0.readByte()), cps.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(so::h), $$0.m()
      );
   }

   public void a(so $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cps.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, so::a);
      $$0.c(this.i);
   }
}
