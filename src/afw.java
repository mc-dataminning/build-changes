import java.util.Optional;
import javax.annotation.Nullable;

public record afw(jj<dwg> a, akj<dcg> b, long c, dcd d, @Nullable dcd e, boolean f, boolean g, Optional<ji> h, int i) {
   public afw(wf $$0) {
      this(
         dwg.i.decode($$0),
         $$0.a(lr.aZ),
         $$0.readLong(),
         dcd.a($$0.readByte()),
         dcd.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vr::h),
         $$0.l()
      );
   }

   public void a(wf $$0) {
      dwg.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dcd.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vr::a);
      $$0.c(this.i);
   }
}
