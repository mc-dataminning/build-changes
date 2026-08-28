import java.util.Optional;
import javax.annotation.Nullable;

public record agl(jn<dxw> a, ala<dds> b, long c, ddp d, @Nullable ddp e, boolean f, boolean g, Optional<jm> h, int i, int j) {
   public agl(wo $$0) {
      this(
         dxw.i.decode($$0),
         $$0.a(lv.ba),
         $$0.readLong(),
         ddp.a($$0.readByte()),
         ddp.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(wa::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(wo $$0) {
      dxw.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(ddp.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, wa::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
