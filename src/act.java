import java.util.Optional;
import javax.annotation.Nullable;

public record act(ags<dly> a, ags<csy> b, long c, csv d, @Nullable csv e, boolean f, boolean g, Optional<id> h, int i) {
   public act(ue $$0) {
      this(
         $$0.a(kc.ax), $$0.a(kc.aL), $$0.readLong(), csv.a($$0.readByte()), csv.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(ue::h), $$0.n()
      );
   }

   public void a(ue $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(csv.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, ue::a);
      $$0.c(this.i);
   }
}
