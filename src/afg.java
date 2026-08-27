import java.util.Optional;
import javax.annotation.Nullable;

public record afg(il<dsr> a, ajs<cyx> b, long c, cyu d, @Nullable cyu e, boolean f, boolean g, Optional<ik> h, int i) {
   private static final ye<vr, il<dsr>> j = yc.b(ks.aA);

   public afg(vr $$0) {
      this(
         j.decode($$0), $$0.a(ks.aO), $$0.readLong(), cyu.a($$0.readByte()), cyu.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(vg::h), $$0.l()
      );
   }

   public void a(vr $$0) {
      j.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cyu.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vg::a);
      $$0.c(this.i);
   }
}
