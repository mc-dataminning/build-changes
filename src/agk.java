import java.util.Optional;
import javax.annotation.Nullable;

public record agk(jf<eeq> a, alf<djm> b, long c, djj d, @Nullable djj e, boolean f, boolean g, Optional<je> h, int i, int j) {
   public agk(wj $$0) {
      this(
         eeq.i.decode($$0),
         $$0.a(mh.bp),
         $$0.readLong(),
         djj.a($$0.readByte()),
         djj.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vu::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wj $$0) {
      eeq.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(djj.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vu::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
