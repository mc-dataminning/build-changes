import java.util.Optional;
import javax.annotation.Nullable;

public record aaw(aet<din> a, aet<cpq> b, long c, cpn d, @Nullable cpn e, boolean f, boolean g, Optional<hf> h, int i) {
   public aaw(sl $$0) {
      this(
         $$0.a(je.au), $$0.a(je.aH), $$0.readLong(), cpn.a($$0.readByte()), cpn.b($$0.readByte()), $$0.readBoolean(), $$0.readBoolean(), $$0.b(sl::h), $$0.m()
      );
   }

   public void a(sl $$0) {
      $$0.b(this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(cpn.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, sl::a);
      $$0.c(this.i);
   }
}
