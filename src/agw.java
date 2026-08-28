import java.util.Optional;
import javax.annotation.Nullable;

public record agw(jq<ebj> a, alo<dgz> b, long c, dgw d, @Nullable dgw e, boolean f, boolean g, Optional<jp> h, int i, int j) {
   public agw(wv $$0) {
      this(
         ebj.i.decode($$0),
         $$0.a(mb.be),
         $$0.readLong(),
         dgw.a($$0.readByte()),
         dgw.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(wh::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wv $$0) {
      ebj.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dgw.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wh::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
