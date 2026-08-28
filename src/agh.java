import java.util.Optional;
import javax.annotation.Nullable;

public record agh(js<ecj> a, alc<dhp> b, long c, dhm d, @Nullable dhm e, boolean f, boolean g, Optional<jr> h, int i, int j) {
   public agh(wg $$0) {
      this(
         ecj.i.decode($$0),
         $$0.a(me.bl),
         $$0.readLong(),
         dhm.a($$0.readByte()),
         dhm.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vr::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wg $$0) {
      ecj.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dhm.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vr::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
