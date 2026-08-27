import java.util.Optional;
import javax.annotation.Nullable;

public record aat(aeq<dij> a, aeq<cpm> b, long c, cpj d, @Nullable cpj e, boolean f, boolean g, Optional<hd> h, int i) {
   public aat(si $$0) {
      this(
         $$0.a(jc.au), $$0.a(jc.aH), $$0.readLong(), cpj.a($$0.readByte()), cpj.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(si::h), $$0.m()
      );
   }

   public void a(si $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cpj.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, si::a);
      $$0.c(this.i);
   }
}
