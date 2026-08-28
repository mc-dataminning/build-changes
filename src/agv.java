import java.util.Optional;
import javax.annotation.Nullable;

public record agv(jg<efn> a, alq<dkj> b, long c, dkg d, @Nullable dkg e, boolean f, boolean g, Optional<jf> h, int i, int j) {
   public agv(wp $$0) {
      this(
         efn.i.decode($$0),
         $$0.a(mi.bp),
         $$0.readLong(),
         dkg.a($$0.readByte()),
         dkg.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vy::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wp $$0) {
      efn.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dkg.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vy::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
