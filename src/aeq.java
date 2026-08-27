import java.util.Optional;
import javax.annotation.Nullable;

public record aeq(il<dpq> a, ajb<cwe> b, long c, cwb d, @Nullable cwb e, boolean f, boolean g, Optional<ik> h, int i) {
   private static final xq<vd, il<dpq>> j = xo.b(ki.az);

   public aeq(vd $$0) {
      this(
         j.decode($$0), $$0.a(ki.aN), $$0.readLong(), cwb.a($$0.readByte()), cwb.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(us::h), $$0.l()
      );
   }

   public void a(vd $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cwb.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, us::a);
      $$0.c(this.i);
   }
}
