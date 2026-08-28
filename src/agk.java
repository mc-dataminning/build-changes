import java.util.Optional;
import javax.annotation.Nullable;

public record agk(je<edw> a, alf<div> b, long c, dis d, @Nullable dis e, boolean f, boolean g, Optional<jd> h, int i, int j) {
   public agk(wj $$0) {
      this(
         edw.i.decode($$0),
         $$0.a(mg.bn),
         $$0.readLong(),
         dis.a($$0.readByte()),
         dis.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vu::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wj $$0) {
      edw.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dis.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vu::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
