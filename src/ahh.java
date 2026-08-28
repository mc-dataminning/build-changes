import java.util.Optional;
import javax.annotation.Nullable;

public record ahh(jq<ebp> a, aly<dhh> b, long c, dhe d, @Nullable dhe e, boolean f, boolean g, Optional<jp> h, int i, int j) {
   public ahh(xg $$0) {
      this(
         ebp.i.decode($$0),
         $$0.a(mb.be),
         $$0.readLong(),
         dhe.a($$0.readByte()),
         dhe.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(ws::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(xg $$0) {
      ebp.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dhe.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, ws::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
