import java.util.Optional;
import javax.annotation.Nullable;

public record afi(in<dta> a, aju<czg> b, long c, czd d, @Nullable czd e, boolean f, boolean g, Optional<im> h, int i) {
   private static final yg<vt, in<dta>> j = ye.b(ku.aB);

   public afi(vt $$0) {
      this(
         j.decode($$0), $$0.a(ku.aP), $$0.readLong(), czd.a($$0.readByte()), czd.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(vi::h), $$0.l()
      );
   }

   public void a(vt $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(czd.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vi::a);
      $$0.c(this.i);
   }
}
