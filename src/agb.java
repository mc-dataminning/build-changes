import java.util.Optional;
import javax.annotation.Nullable;

public record agb(jr<eas> a, aku<dgi> b, long c, dgf d, @Nullable dgf e, boolean f, boolean g, Optional<jq> h, int i, int j) {
   public agb(wa $$0) {
      this(
         eas.i.decode($$0),
         $$0.a(mc.be),
         $$0.readLong(),
         dgf.a($$0.readByte()),
         dgf.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vl::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wa $$0) {
      eas.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dgf.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vl::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
