import java.util.Optional;
import javax.annotation.Nullable;

public record ahh(jq<ebi> a, aly<dha> b, long c, dgx d, @Nullable dgx e, boolean f, boolean g, Optional<jp> h, int i, int j) {
   public ahh(xg $$0) {
      this(
         ebi.i.decode($$0),
         $$0.a(mb.bd),
         $$0.readLong(),
         dgx.a($$0.readByte()),
         dgx.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(ws::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(xg $$0) {
      ebi.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dgx.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, ws::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
