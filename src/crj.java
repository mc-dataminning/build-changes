import java.util.List;
import javax.annotation.Nullable;

public class crj extends cqh implements cpo {
   public static final int a = 5;
   public static final float b = 3.0F;
   public static final String c = "Base";

   public crj(cqh.a $$0) {
      super($$0);
      dch.a(this, cny.a);
   }

   @Override
   public String j(cqm $$0) {
      return coh.a($$0) != null ? this.a() + "." + d($$0).b() : super.j($$0);
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      coe.a($$0, $$2);
   }

   @Override
   public csf c(cqm $$0) {
      return csf.d;
   }

   @Override
   public int b(cqm $$0) {
      return 72000;
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      $$1.c($$2);
      return bne.b($$3);
   }

   @Override
   public boolean a(cqm $$0, cqm $$1) {
      return $$1.a(auv.b) || super.a($$0, $$1);
   }

   public static cpd d(cqm $$0) {
      ta $$1 = coh.a($$0);
      return $$1 != null ? cpd.a($$1.h("Base")) : cpd.a;
   }

   @Override
   public bpe i() {
      return bpe.b;
   }
}
