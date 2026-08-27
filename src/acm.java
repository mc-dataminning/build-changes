import java.util.Optional;
import javax.annotation.Nullable;

public record acm(agl<dkw> a, agl<csf> b, long c, csc d, @Nullable csc e, boolean f, boolean g, Optional<ie> h, int i) {
   public acm(ty $$0) {
      this(
         $$0.a(kd.aw), $$0.a(kd.aJ), $$0.readLong(), csc.a($$0.readByte()), csc.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(ty::h), $$0.n()
      );
   }

   public void a(ty $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(csc.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, ty::a);
      $$0.c(this.i);
   }
}
