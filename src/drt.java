import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class drt extends dwq implements dul {
   public static final MapCodec<drt> a = b(drt::new);
   public static final ece<jc> b = ebw.T;
   private final Function<ebg, fgm> c;

   public drt(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<ebg, fgm> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<drt> a() {
      return a;
   }

   @Override
   public ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(ebg $$0, ddt $$1) {
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jc.b);
   }

   @Override
   public fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.c.apply($$0);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, this.c());
   }
}
