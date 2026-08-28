import java.util.Optional;
import javax.annotation.Nullable;

public record agm(jo<dyo> a, ald<dej> b, long c, deg d, @Nullable deg e, boolean f, boolean g, Optional<jn> h, int i, int j) {
   public agm(wp $$0) {
      this(
         dyo.i.decode($$0),
         $$0.a(lw.bc),
         $$0.readLong(),
         deg.a($$0.readByte()),
         deg.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(wb::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wp $$0) {
      dyo.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(deg.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wb::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
