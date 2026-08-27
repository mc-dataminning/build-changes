import java.util.Optional;
import javax.annotation.Nullable;

public record adg(ahf<dmp> a, ahf<cto> b, long c, ctl d, @Nullable ctl e, boolean f, boolean g, Optional<ig> h, int i) {
   public adg(ui $$0) {
      this(
         $$0.a(ke.ay), $$0.a(ke.aM), $$0.readLong(), ctl.a($$0.readByte()), ctl.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(ui::h), $$0.n()
      );
   }

   public void a(ui $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(ctl.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, ui::a);
      $$0.c(this.i);
   }
}
