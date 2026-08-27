import java.util.Optional;
import javax.annotation.Nullable;

public record aci(agh<dkr> a, agh<csa> b, long c, crx d, @Nullable crx e, boolean f, boolean g, Optional<ia> h, int i) {
   public aci(tu $$0) {
      this(
         $$0.a(jz.aw), $$0.a(jz.aJ), $$0.readLong(), crx.a($$0.readByte()), crx.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(tu::h), $$0.n()
      );
   }

   public void a(tu $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(crx.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, tu::a);
      $$0.c(this.i);
   }
}
