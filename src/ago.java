import java.util.Optional;
import javax.annotation.Nullable;

public record ago(jg<efd> a, alj<djz> b, long c, djw d, @Nullable djw e, boolean f, boolean g, Optional<jf> h, int i, int j) {
   public ago(wn $$0) {
      this(
         efd.i.decode($$0),
         $$0.a(mi.bp),
         $$0.readLong(),
         djw.a($$0.readByte()),
         djw.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vy::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wn $$0) {
      efd.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(djw.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vy::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
