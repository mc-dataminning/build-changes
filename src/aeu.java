import java.util.Optional;
import javax.annotation.Nullable;

public record aeu(il<dqo> a, ajg<cxb> b, long c, cwy d, @Nullable cwy e, boolean f, boolean g, Optional<ik> h, int i) {
   private static final xs<vf, il<dqo>> j = xq.b(kj.az);

   public aeu(vf $$0) {
      this(
         j.decode($$0), $$0.a(kj.aN), $$0.readLong(), cwy.a($$0.readByte()), cwy.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(uu::h), $$0.l()
      );
   }

   public void a(vf $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cwy.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, uu::a);
      $$0.c(this.i);
   }
}
