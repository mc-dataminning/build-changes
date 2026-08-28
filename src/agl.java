import java.util.Optional;
import javax.annotation.Nullable;

public record agl(jn<dyk> a, alb<deg> b, long c, ded d, @Nullable ded e, boolean f, boolean g, Optional<jm> h, int i, int j) {
   public agl(wo $$0) {
      this(
         dyk.i.decode($$0),
         $$0.a(lv.bb),
         $$0.readLong(),
         ded.a($$0.readByte()),
         ded.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(wa::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wo $$0) {
      dyk.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(ded.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wa::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
