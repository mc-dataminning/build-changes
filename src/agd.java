import java.util.Optional;
import javax.annotation.Nullable;

public record agd(jm<dwy> a, akq<dcw> b, long c, dct d, @Nullable dct e, boolean f, boolean g, Optional<jl> h, int i) {
   public agd(wk $$0) {
      this(
         dwy.i.decode($$0),
         $$0.a(lu.ba),
         $$0.readLong(),
         dct.a($$0.readByte()),
         dct.b($$0.readByte()),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.b(vw::h),
         $$0.l()
      );
   }

   public void a(wk $$0) {
      dwy.i.encode($$0, this.a);
      $$0.b(this.b);
      $$0.b(this.c);
      $$0.k(this.d.a());
      $$0.k(dct.a(this.e));
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h, vw::a);
      $$0.c(this.i);
   }
}
