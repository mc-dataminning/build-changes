import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dsd extends dxa implements duv {
   public static final MapCodec<dsd> a = b(dsd::new);
   public static final eco<jc> b = ecg.T;
   private final Function<ebq, fgw> c;

   public dsd(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<ebq, fgw> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<dsd> a() {
      return a;
   }

   @Override
   public ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(ebq $$0, ded $$1) {
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jc.b);
   }

   @Override
   public fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.c.apply($$0);
   }

   @Override
   public ebq a(ded $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, this.c());
   }
}
