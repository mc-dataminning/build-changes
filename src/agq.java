import java.util.Optional;
import javax.annotation.Nullable;

public record agq(jq<dzf> a, alh<dfb> b, long c, dey d, @Nullable dey e, boolean f, boolean g, Optional<jp> h, int i, int j) {
   public agq(wt $$0) {
      this(
         dzf.i.decode($$0),
         $$0.a(lz.bb),
         $$0.readLong(),
         dey.a($$0.readByte()),
         dey.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(wf::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wt $$0) {
      dzf.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dey.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wf::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
