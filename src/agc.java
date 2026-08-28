import java.util.Optional;
import javax.annotation.Nullable;

public record agc(jm<dwv> a, akp<dcu> b, long c, dcr d, @Nullable dcr e, boolean f, boolean g, Optional<jl> h, int i) {
   public agc(wj $$0) {
      this(
         dwv.i.decode($$0),
         $$0.a(lu.ba),
         $$0.readLong(),
         dcr.a($$0.readByte()),
         dcr.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vv::h),
         $$0.l()
      );
   }

   public void a(wj $$0) {
      dwv.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dcr.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vv::a);
      $$0.c(this.i);
   }
}
