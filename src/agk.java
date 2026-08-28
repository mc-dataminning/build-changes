import java.util.Optional;
import javax.annotation.Nullable;

public record agk(je<eee> a, alf<dja> b, long c, dix d, @Nullable dix e, boolean f, boolean g, Optional<jd> h, int i, int j) {
   public agk(wj $$0) {
      this(
         eee.i.decode($$0),
         $$0.a(mg.bo),
         $$0.readLong(),
         dix.a($$0.readByte()),
         dix.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vu::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wj $$0) {
      eee.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dix.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vu::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
