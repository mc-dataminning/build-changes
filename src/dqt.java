import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqt extends dxa implements dnr, duv {
   public static final MapCodec<dqt> a = b(dqt::new);
   public static final eco<jc> b = ecg.T;
   public static final ecq c = ecg.U;
   private final Function<ebq, fgw> g;

   @Override
   public MapCodec<dqt> a() {
      return a;
   }

   protected dqt(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<ebq, fgw> q() {
      return this.a(this.a(b, c));
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
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public ecq c() {
      return c;
   }

   @Override
   public ebq a(ded $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return true;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new dak(this));
      }
   }
}
