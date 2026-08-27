import java.util.Optional;
import javax.annotation.Nullable;

public record aeu(il<dqm> a, ajg<cwz> b, long c, cww d, @Nullable cww e, boolean f, boolean g, Optional<ik> h, int i) {
   private static final xs<vf, il<dqm>> j = xq.b(kj.az);

   public aeu(vf $$0) {
      this(
         j.decode($$0), $$0.a(kj.aN), $$0.readLong(), cww.a($$0.readByte()), cww.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(uu::h), $$0.l()
      );
   }

   public void a(vf $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cww.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, uu::a);
      $$0.c(this.i);
   }
}
