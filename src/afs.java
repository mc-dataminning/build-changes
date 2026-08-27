import java.util.Optional;
import javax.annotation.Nullable;

public record afs(iv<dtq> a, ake<czu> b, long c, czr d, @Nullable czr e, boolean f, boolean g, Optional<iu> h, int i) {
   private static final yq<wd, iv<dtq>> j = yo.b(ld.aD);

   public afs(wd $$0) {
      this(
         j.decode($$0), $$0.a(ld.aR), $$0.readLong(), czr.a($$0.readByte()), czr.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(vs::h), $$0.l()
      );
   }

   public void a(wd $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(czr.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vs::a);
      $$0.c(this.i);
   }
}
