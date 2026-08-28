import java.util.Optional;
import javax.annotation.Nullable;

public record agb(jr<eat> a, aku<dgj> b, long c, dgg d, @Nullable dgg e, boolean f, boolean g, Optional<jq> h, int i, int j) {
   public agb(wa $$0) {
      this(
         eat.i.decode($$0),
         $$0.a(mc.be),
         $$0.readLong(),
         dgg.a($$0.readByte()),
         dgg.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vl::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wa $$0) {
      eat.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dgg.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vl::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
