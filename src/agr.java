import java.util.Optional;
import javax.annotation.Nullable;

public record agr(jq<dzq> a, ali<dfm> b, long c, dfj d, @Nullable dfj e, boolean f, boolean g, Optional<jp> h, int i, int j) {
   public agr(wu $$0) {
      this(
         dzq.i.decode($$0),
         $$0.a(ma.bb),
         $$0.readLong(),
         dfj.a($$0.readByte()),
         dfj.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(wg::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wu $$0) {
      dzq.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dfj.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wg::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
