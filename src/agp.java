import java.util.Optional;
import javax.annotation.Nullable;

public record agp(jp<dyz> a, alg<dev> b, long c, des d, @Nullable des e, boolean f, boolean g, Optional<jo> h, int i, int j) {
   public agp(ws $$0) {
      this(
         dyz.i.decode($$0),
         $$0.a(ly.bb),
         $$0.readLong(),
         des.a($$0.readByte()),
         des.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(we::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(ws $$0) {
      dyz.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(des.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, we::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
