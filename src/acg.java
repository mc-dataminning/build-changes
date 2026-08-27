import java.util.Optional;
import javax.annotation.Nullable;

public record acg(agf<dkf> a, agf<crs> b, long c, crp d, @Nullable crp e, boolean f, boolean g, Optional<ia> h, int i) {
   public acg(tu $$0) {
      this(
         $$0.a(jz.aw), $$0.a(jz.aJ), $$0.readLong(), crp.a($$0.readByte()), crp.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(tu::h), $$0.n()
      );
   }

   public void a(tu $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(crp.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, tu::a);
      $$0.c(this.i);
   }
}
