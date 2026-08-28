import java.util.Optional;
import javax.annotation.Nullable;

public record agk(jf<eel> a, alf<djh> b, long c, dje d, @Nullable dje e, boolean f, boolean g, Optional<je> h, int i, int j) {
   public agk(wj $$0) {
      this(
         eel.i.decode($$0),
         $$0.a(mh.bo),
         $$0.readLong(),
         dje.a($$0.readByte()),
         dje.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vu::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wj $$0) {
      eel.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dje.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vu::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
