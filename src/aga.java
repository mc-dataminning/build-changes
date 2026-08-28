import java.util.Optional;
import javax.annotation.Nullable;

public record aga(jr<eaq> a, akt<dgg> b, long c, dgd d, @Nullable dgd e, boolean f, boolean g, Optional<jq> h, int i, int j) {
   public aga(vz $$0) {
      this(
         eaq.i.decode($$0),
         $$0.a(mc.be),
         $$0.readLong(),
         dgd.a($$0.readByte()),
         dgd.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vl::h),
         $$0.l(),
         $$0.l()
      );
   }

   public void a(vz $$0) {
      eaq.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.l(this.d.a());
      $$0.l(dgd.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vl::a);
      $$0.c(this.i);
      $$0.c(this.j);
   }
}
