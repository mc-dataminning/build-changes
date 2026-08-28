import java.util.Optional;
import javax.annotation.Nullable;

public record agt(jq<dzj> a, alk<dff> b, long c, dfc d, @Nullable dfc e, boolean f, boolean g, Optional<jp> h, int i, int j) {
   public agt(ww $$0) {
      this(
         dzj.i.decode($$0),
         $$0.a(ma.bb),
         $$0.readLong(),
         dfc.a($$0.readByte()),
         dfc.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(wi::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(ww $$0) {
      dzj.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dfc.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wi::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
