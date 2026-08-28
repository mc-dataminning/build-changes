import java.util.Optional;
import javax.annotation.Nullable;

public record agi(je<edl> a, ald<dip> b, long c, dim d, @Nullable dim e, boolean f, boolean g, Optional<jd> h, int i, int j) {
   public agi(wh $$0) {
      this(
         edl.i.decode($$0),
         $$0.a(mg.bm),
         $$0.readLong(),
         dim.a($$0.readByte()),
         dim.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vs::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wh $$0) {
      edl.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dim.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vs::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
